package dev.voxelparrot.materialascension.registry;

import dev.voxelparrot.materialascension.MaterialAscension;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static dev.voxelparrot.materialascension.Constants.MA_ID;

public class MATabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MA_ID);

    public static final RegistryObject<CreativeModeTab> MATERIALASCENSIONTAB = CREATIVE_MODE_TABS.register("materialascensiontab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(MAItems.getItemByName("mysticrain_hammer"))) // Icon of the tab
                    .title(Component.translatable("creativetab.materialascension.materialascensiontab")) // Translation key
                    .displayItems((parameters, output) -> {
                        // add every item in MAItems.items to the tab
                        for (MAItems.ItemInfo info : MAItems.items) {
                            output.accept(info.itemSupplier.get());
                        }
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
