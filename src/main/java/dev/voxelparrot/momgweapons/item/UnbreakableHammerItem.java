package dev.voxelparrot.momgweapons.item;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;
import java.util.List;

public class UnbreakableHammerItem extends BasicWeaponSweeplessItem {
  public UnbreakableHammerItem(Tier tier, int damage, float attackSpeed, Properties properties) {
    super(tier, damage, attackSpeed, properties);
  }

  @Override
  public boolean isDamageable(ItemStack stack) {
    return false;
  }

  @Override
  public boolean canBeDepleted() {
    return false;
  }

  @Override
  public boolean hurtEnemy(ItemStack itemStack, LivingEntity target, LivingEntity attacker) {
    if (attacker instanceof Player player) {
      float f2 = player.getAttackStrengthScale(0.5f);
      if (f2 > 0.9F) {
        if (target.isAlwaysTicking()) {
          Vec3 currentMovement = target.getDeltaMovement();
          target.setDeltaMovement(currentMovement.x, currentMovement.y + 0.8, currentMovement.z);
          target.hurtMarked = true;
        } else {
          target.addDeltaMovement(new Vec3(0, 0.45, 0));
        }
      }
    }
    return true; // No durability loss
  }

  @Override
  public boolean mineBlock(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity entity) {
    return true; // No durability loss
  }

  @Override
  public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
    super.appendHoverText(stack, world, tooltip, flag);

    // Show vanilla-style "Unbreakable" tooltip
    tooltip.add(Component.translatable("item.unbreakable").withStyle(ChatFormatting.GRAY, ChatFormatting.ITALIC));
    tooltip.add(Component.translatable("item.momgweapons.artifact").withStyle(ChatFormatting.AQUA, ChatFormatting.ITALIC));
  }
}
