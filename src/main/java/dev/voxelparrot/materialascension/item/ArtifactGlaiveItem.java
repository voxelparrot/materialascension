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

public class ArtifactGlaiveItem extends BasicWeaponItem {
  public ArtifactGlaiveItem(Tier tier, int damage, float attackSpeed, Properties properties) {
    super(tier, damage, attackSpeed, properties.rarity(Rarity.EPIC));
  }

  @Override
  public void appendHoverText(@NotNull ItemStack stack, @Nullable Level world, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
    super.appendHoverText(stack, world, tooltip, flag);

    tooltip.add(Component.translatable("item.materialascension.artifact").withStyle(ChatFormatting.LIGHT_PURPLE, ChatFormatting.ITALIC));
  }
}
