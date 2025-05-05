package dev.voxelparrot.materialascension;

import dev.voxelparrot.materialascension.registry.MAItems;
import dev.voxelparrot.materialascension.registry.MainRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static dev.voxelparrot.materialascension.Constants.MA_ID;
import static dev.voxelparrot.materialascension.Constants.MA_LOG;
import static dev.voxelparrot.materialascension.registry.MainRegistry.registeredItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MA_ID)
public class MaterialAscension {
  private static final CreativeModeTab.TabVisibility DEFAULT_VISIBILITY = CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;

  public MaterialAscension() {
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    MinecraftForge.EVENT_BUS.register(this);
    Constants.MA_LOG.info("You have my steel-handled mysticrain quartz greatsword.");

    MAItems.init();
    MainRegistry.preInit();
    MainRegistry.init(modEventBus);

    modEventBus.addListener(this::addCreative);
    ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
  }

  private void addCreative(BuildCreativeModeTabContentsEvent event) {
    for (RegistryObject<Item> reg : registeredItems) {
      Item item = reg.get();
      if (!(item instanceof TieredItem tieredItem)) continue;

      // Infer weaponType from the class name or add a field if needed
      String name = reg.getId().getPath(); // e.g. "dagger_bronze"
      String lower = name.toLowerCase();

      boolean isWeapon = lower.contains("dagger")
              || lower.contains("spear")
              || lower.contains("glaive")
              || lower.contains("hammer")
              || lower.contains("club")
              || lower.contains("quarterstaff");

      boolean isComponent = lower.contains("component")
              || lower.contains("sheet")
              || lower.contains("plate")
              || lower.contains("handle");

      if (isWeapon) {
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
          event.accept(item, DEFAULT_VISIBILITY);
        }
      } else if (isComponent) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
          event.accept(item, DEFAULT_VISIBILITY);
        }
      }

    }
  }


  private void commonSetup(final FMLCommonSetupEvent event) {
    MA_LOG.info("Mod loading..");
  }

  @SubscribeEvent
  public void onServerStarting(ServerStartingEvent event) {
    MA_LOG.info("Mod loading on server side..");
  }

  @Mod.EventBusSubscriber(modid = MA_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
  public static class ClientModEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
      MA_LOG.info("Mod loading on client side..");
    }
  }
}
