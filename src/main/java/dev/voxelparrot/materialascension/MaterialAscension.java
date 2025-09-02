package dev.voxelparrot.materialascension;

import dev.voxelparrot.materialascension.registry.MABlocks;
import dev.voxelparrot.materialascension.registry.MAItems;
import dev.voxelparrot.materialascension.registry.MainRegistry;
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
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;

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
    Constants.MA_LOG.info("You have my steel-handled shadow blade.");



    MAItems.init();
    MABlocks.init();
    MainRegistry.preInit();
    MainRegistry.init(modEventBus);

    modEventBus.addListener(this::addCreative);
    modEventBus.addListener(this::commonSetup);

    ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.GENERAL_SPEC, "materialascension.toml");
  }

  private void addCreative(BuildCreativeModeTabContentsEvent event) {
    for (RegistryObject<Item> reg : registeredItems) {
      Item item = reg.get();
      //if (!(item instanceof TieredItem)) continue;

      String name = reg.getId().getPath().toLowerCase();

      boolean isWeapon = name.contains("dagger")
              || name.contains("spear")
              || name.contains("glaive")
              || name.contains("hammer")
              || name.contains("club")
              || name.contains("quarterstaff")
              || name.contains("destroyer")
              || name.contains("katana")
              || name.contains("blade")
              || name.contains("broadsword")
              || name.contains("sword");

      boolean isComponent = name.contains("dust")
              || name.contains("sheet")
              || name.contains("plate")
              || name.contains("handle")
              || name.contains("rod")
              || name.contains("ingot")
              || name.contains("nugget");

      if (isWeapon && event.getTabKey().equals(CreativeModeTabs.COMBAT)) {
        event.accept(item, DEFAULT_VISIBILITY);
      } else if (isComponent && event.getTabKey().equals(CreativeModeTabs.INGREDIENTS)) {
        event.accept(item, DEFAULT_VISIBILITY);
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

