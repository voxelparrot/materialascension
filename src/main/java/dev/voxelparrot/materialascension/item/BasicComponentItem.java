
package dev.voxelparrot.materialascension.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BasicComponentItem extends Item {
	public BasicComponentItem() {
		super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
