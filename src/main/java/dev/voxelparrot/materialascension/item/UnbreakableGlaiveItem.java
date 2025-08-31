package dev.voxelparrot.materialascension.item;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class UnbreakableGlaiveItem extends BasicWeaponItem {
  public UnbreakableGlaiveItem(Tier tier, int damage, float attackSpeed, Properties properties) {
    super(tier, damage, attackSpeed, properties.rarity(Rarity.EPIC));
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
  public void appendHoverText(@NotNull ItemStack stack, @Nullable Level world, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
    super.appendHoverText(stack, world, tooltip, flag);

    // Add the "Unbreakable" tooltip
    tooltip.add(Component.translatable("item.unbreakable").withStyle(ChatFormatting.GRAY, ChatFormatting.ITALIC));
    tooltip.add(Component.translatable("item.materialascension.artifact").withStyle(ChatFormatting.LIGHT_PURPLE, ChatFormatting.ITALIC));
  }

  @Override
  public boolean mineBlock(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity entity) {
    return true; // No durability loss
  }
}
