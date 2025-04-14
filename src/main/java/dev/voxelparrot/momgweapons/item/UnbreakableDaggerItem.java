package dev.voxelparrot.momgweapons.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class UnbreakableDaggerItem extends BasicWeaponSweeplessItem {
  public UnbreakableDaggerItem(Tier tier, int damage, float attackSpeed, Properties properties) {
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

  @Override
  public float getDestroySpeed(ItemStack itemStack, BlockState state) {
    if (state.is(Blocks.COBWEB)) {
      return 15.0F;
    } else {
      return state.is(BlockTags.SWORD_EFFICIENT) ? 1.5F : 1.0F;
    }
  }

  @Override
  public boolean isCorrectToolForDrops(BlockState state) {
    return state.is(Blocks.COBWEB); // This dagger is effective against cobwebs
  }
}
