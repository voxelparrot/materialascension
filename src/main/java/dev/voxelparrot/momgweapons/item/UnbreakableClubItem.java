package dev.voxelparrot.momgweapons.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class UnbreakableClubItem extends BasicWeaponSweeplessItem {
  public UnbreakableClubItem(Tier tier, int damage, float attackSpeed, Properties properties) {
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
  public boolean hurtEnemy(ItemStack itemStack, LivingEntity target, LivingEntity attacker) {
    Player player = (Player) attacker;
    float f2 = player.getAttackStrengthScale(0.5f);
    if (f2 > 0.9F) {
      target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 15)); // Apply slowdown effect
    }
    // Since we want the item to be unbreakable, we don't call hurtAndBreak here
    return true; // No durability loss
  }
}
