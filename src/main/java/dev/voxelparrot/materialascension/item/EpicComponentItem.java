package dev.voxelparrot.materialascension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EpicComponentItem extends Item {
	public EpicComponentItem() {
		super(new Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
