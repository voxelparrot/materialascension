package dev.voxelparrot.materialascension.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class UnbreakableClubItem extends BasicWeaponSweeplessItem {
  public UnbreakableClubItem(Tier tier, int damage, float attackSpeed, Properties properties) {
    super(tier, damage, attackSpeed, properties.rarity(Rarity.EPIC));
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
  public boolean hurtEnemy(ItemStack itemStack, LivingEntity target, LivingEntity attacker) {
    Player player = (Player) attacker;
    float f2 = player.getAttackStrengthScale(0.5f);
    if (f2 > 0.9F) {
      target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 15)); // Apply slowdown effect
    }
    // Since we want the item to be unbreakable, we don't call hurtAndBreak here
    return true; // No durability loss
  }

  @Override
  public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
    super.appendHoverText(stack, world, tooltip, flag);

    // Add the "Unbreakable" tooltip
    tooltip.add(Component.translatable("item.unbreakable").withStyle(ChatFormatting.GRAY, ChatFormatting.ITALIC));
    tooltip.add(Component.translatable("item.materialascension.artifact").withStyle(ChatFormatting.LIGHT_PURPLE, ChatFormatting.ITALIC));
  }
}
