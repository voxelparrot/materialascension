package dev.voxelparrot.materialascension.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class UnbreakableScytheItem extends BasicWeaponItem {
  public UnbreakableScytheItem(Tier tier, int damage, float attackSpeed, Properties properties) {
    super(tier, damage, attackSpeed, properties.rarity(Rarity.EPIC));
  }

  @Override
  public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
    super.appendHoverText(stack, world, tooltip, flag);

    // Add the "Unbreakable" tooltip
    tooltip.add(Component.translatable("item.unbreakable").withStyle(ChatFormatting.GRAY, ChatFormatting.ITALIC));
    tooltip.add(Component.translatable("item.materialascension.artifact").withStyle(ChatFormatting.LIGHT_PURPLE, ChatFormatting.ITALIC));
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
