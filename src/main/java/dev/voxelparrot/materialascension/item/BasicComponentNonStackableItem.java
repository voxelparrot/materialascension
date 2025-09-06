
package dev.voxelparrot.materialascension.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class BasicComponentNonStackableItem extends Item {
	public BasicComponentNonStackableItem() {
		super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
