package dev.voxelparrot.materialascension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UncommonComponentItem extends Item {
	public UncommonComponentItem() {
		super(new Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
