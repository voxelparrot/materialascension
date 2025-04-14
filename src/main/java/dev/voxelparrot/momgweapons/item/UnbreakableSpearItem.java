package dev.voxelparrot.momgweapons.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class UnbreakableSpearItem extends BasicWeaponSweeplessItem {
  public UnbreakableSpearItem(Tier tier, int damage, float attackSpeed, Properties properties) {
    super(tier, damage, attackSpeed, properties);
  }

  @Override
  public boolean isDamageable(ItemStack stack) {
    return false; // Item is unbreakable, so no damage can be applied
  }

  @Override
  public boolean canBeDepleted() {
    return false; // No durability loss (unbreakable)
  }
}
