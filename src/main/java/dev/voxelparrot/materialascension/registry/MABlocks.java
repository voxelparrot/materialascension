package dev.voxelparrot.materialascension.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class MABlocks {
    public static List<BlockInfo> blocks = new LinkedList<>();

    public static void init() {
        blocks.add(new MABlocks.BlockInfo("component", "creative_dust_block",
                () -> new Block(Block.Properties.copy(Blocks.SAND).mapColor(MapColor.COLOR_PINK))));



    }

    /*** This class holds information about all items.
     It is accessed by forge & fabric methods
     for automatic registration ***/
    public static class BlockInfo {
        public final String type;
        public final String name;
        public final Supplier<Block> blockSupplier;

        public BlockInfo(String type, String name, Supplier<Block> blockSupplier) {
            this.type = type;
            this.name = name;
            this.blockSupplier = blockSupplier;
        }
    }

}
