package dev.voxelparrot.materialascension.registry;

import dev.voxelparrot.materialascension.Config;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import static dev.voxelparrot.materialascension.Constants.MA_ID;

public class MainRegistry {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MA_ID);
  public static final List<RegistryObject<Item>> registeredItems = new LinkedList<>();
  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MA_ID);
  public static final List<RegistryObject<Block>> registeredBlocks = new LinkedList<>();

  public static void preInit() {
    for (MAItems.ItemInfo item : MAItems.items
    ) {
      RegistryObject<Item> i = ITEMS.register(item.name, item.itemSupplier);
      /*if (Objects.equals(item.type, "artifact")) {
        if (Config.includeArtifacts.get()) {
          registeredItems.add(i);
        }
      } else if (Objects.equals(item.type, "unique")) {
        if (Config.includeUniqueWeapons.get()) {
          registeredItems.add(i);
        }
      } else if (Objects.equals(item.type, "qitqiast")) {
        if (Config.includeQitqiastWeapons.get()) {
          registeredItems.add(i);
        }
      } else {
        registeredItems.add(i);
      }*/
      registeredItems.add(i);
    }
    for (MABlocks.BlockInfo info : MABlocks.blocks) {
      // Step 1: Register block and store the registry object
      RegistryObject<Block> blockReg = BLOCKS.register(info.name, info.blockSupplier);
      registeredBlocks.add(blockReg);

      // Step 2: Register BlockItem using a lambda that accesses blockReg.get()
      RegistryObject<Item> blockItemReg = ITEMS.register(info.name, () ->
              new BlockItem(blockReg.get(), new Item.Properties()));
      registeredItems.add(blockItemReg);
    }
  }

  public static void init(IEventBus eventBus) {
    ITEMS.register(eventBus);
    BLOCKS.register(eventBus);
  }
}

