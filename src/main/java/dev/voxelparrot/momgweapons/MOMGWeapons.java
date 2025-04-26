package dev.voxelparrot.momgweapons;

import dev.voxelparrot.momgweapons.registry.MOMGWItems;
import dev.voxelparrot.momgweapons.registry.MainRegistry;
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

import static dev.voxelparrot.momgweapons.Constants.BW_ID;
import static dev.voxelparrot.momgweapons.Constants.BW_LOG;
import static dev.voxelparrot.momgweapons.registry.MainRegistry.registeredItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BW_ID)
public class MOMGWeapons {
  private static final CreativeModeTab.TabVisibility DEFAULT_VISIBILITY = CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;

  public MOMGWeapons() {
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    MinecraftForge.EVENT_BUS.register(this);
    Constants.BW_LOG.info("You have my mysticrain quartz greatsword.");

    MOMGWItems.init();
    MainRegistry.preInit();
    MainRegistry.init(modEventBus);

    modEventBus.addListener(this::addCreative);
    ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
  }

  private void addCreative(BuildCreativeModeTabContentsEvent event) {
    List<Item> registeredItemRefs = new LinkedList<>();
    for (RegistryObject<Item> registeredItem : registeredItems) {
      registeredItemRefs.add(registeredItem.get());
    }
    if (event.getTabKey() == CreativeModeTabs.COMBAT) {
      List<Item> addWeapons = new ArrayList<Item>(registeredItems.size() + 1);
      addWeapons.add(Items.NETHERITE_AXE);
      addWeapons.addAll(registeredItemRefs);

      for (int i = 1; i < addWeapons.size(); i++) {
        event.getEntries().putAfter(
            new ItemStack(addWeapons.get(i - 1)),
            new ItemStack(addWeapons.get(i)),
            DEFAULT_VISIBILITY);
      }
    }
  }

  private void commonSetup(final FMLCommonSetupEvent event) {
    BW_LOG.info("Mod loading..");
  }

  @SubscribeEvent
  public void onServerStarting(ServerStartingEvent event) {
    BW_LOG.info("Mod loading on server side..");
  }

  @Mod.EventBusSubscriber(modid = BW_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
  public static class ClientModEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
      BW_LOG.info("Mod loading on client side..");
    }
  }
}
