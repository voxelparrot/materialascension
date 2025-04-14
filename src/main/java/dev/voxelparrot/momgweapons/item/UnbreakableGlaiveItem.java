package dev.voxelparrot.momgweapons.item;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;
import java.util.List;

public class UnbreakableGlaiveItem extends BasicWeaponItem {
  public UnbreakableGlaiveItem(Tier tier, int damage, float attackSpeed, Properties properties) {
    super(tier, damage, attackSpeed, properties);
  }

  @Override
  public boolean isDamageable(ItemStack stack) {
    return false; // Item is unbreakable
  }

  @Override
  public boolean canBeDepleted() {
    return false; // No depletion (i.e., no durability loss)
  }

  @Override
  public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
    super.appendHoverText(stack, world, tooltip, flag);

    // Add the "Unbreakable" tooltip
    tooltip.add(Component.translatable("item.unbreakable").withStyle(ChatFormatting.GRAY, ChatFormatting.ITALIC));
    tooltip.add(Component.translatable("item.momgweapons.burning").withStyle(ChatFormatting.RED, ChatFormatting.ITALIC));
    tooltip.add(Component.translatable("item.momgweapons.artifact").withStyle(ChatFormatting.GOLD, ChatFormatting.ITALIC));
  }

  @Override
  public boolean hurtEnemy(ItemStack itemStack, LivingEntity target, LivingEntity attacker) {
    if (attacker instanceof Player player) {
      // Example: Adding custom behavior based on attack strength
      float attackStrength = player.getAttackStrengthScale(0.5f);
      if (attackStrength > 0.9F) {
        // Apply custom effects if needed
      }

      // Light the target (enemy) on fire when hit
      target.setSecondsOnFire(5); // Set the target on fire for 5 seconds (you can adjust this time as needed)
    }

    return true; // No durability loss
  }

  @Override
  public boolean mineBlock(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity entity) {
    return true; // No durability loss
  }
}
