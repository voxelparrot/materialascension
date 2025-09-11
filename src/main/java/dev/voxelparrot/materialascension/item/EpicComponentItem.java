package dev.voxelparrot.materialascension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EpicComponentItem extends Item {
	public BasicComponentItem() {
		super(new Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
