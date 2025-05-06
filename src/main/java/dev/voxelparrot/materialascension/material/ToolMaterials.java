package dev.voxelparrot.materialascension.material;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class ToolMaterials {

    public static final Tier AETHERIUM = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 1758;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 8.5F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 4.0F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 3;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 14;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "ingots/aetherium")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_DIAMOND_TOOL;
        }
    };

    public static final Tier STEEL = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 1425;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 7.0F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 2.8F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 2;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 16;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "ingots/steel")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_IRON_TOOL;
        }
    };

    public static final Tier SKYSTEEL = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 3400;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 9.0F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 4.4F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 4;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 20;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "ingots/skysteel")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_DIAMOND_TOOL;
        }
    };

    public static final Tier MYSTICRAIN = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 1800;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 8.5F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 3.5F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 3;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 20;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "gems/mysticrain_quartz")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_DIAMOND_TOOL;
        }
    };

    public static final Tier SHADOWSTEEL = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 1682;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 8.5F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 4.2F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 3;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 18;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "ingots/shadowsteel")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_DIAMOND_TOOL;
        }
    };

    public static final Tier TITANIUM_QUARTZ = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 1500;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 7.0F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 2.2F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 3;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 17;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "ingots/titanium_quartz")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_DIAMOND_TOOL;
        }
    };

    public static final Tier TITANIUM = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 1255;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 7.0F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 2.0F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 2;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 14;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "ingots/titanium")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_IRON_TOOL;
        }
    };

    public static final Tier CRIMSONITE = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 879;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 6.5F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 2.2F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 2;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 12;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "ingots/crimsonite")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_IRON_TOOL;
        }
    };

    public static final Tier SLIVER = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 852;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 7.5F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 2.0F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 2;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 14;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "ingots/sliver")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_IRON_TOOL;
        }

    };
    public static final Tier SHADOWITE = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 768;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 6.0F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 2.5F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 2;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 12;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "ingots/shadowite")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_IRON_TOOL;
        }
    };

    public static final Tier WHITE = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 125;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 6.0F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 1.5F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 2;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 14;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "gems/white_crystal")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_IRON_TOOL;
        }
    };

    public static final Tier SAPPHIRE = new Tier() { /* UNFINISHED */
        /* Durability */
        @Override
        public int getUses() {
            return 775;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 7.5F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 3.0F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 2;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 14;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "gems/sapphire")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_IRON_TOOL;
        }
    };

    public static final Tier TOPAZ = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 675;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 8.5F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 2.0F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 2;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 15;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "gems/topaz")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_IRON_TOOL;
        }
    };

    public static final Tier RUBY = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 520;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 6.0F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 1.5F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 2;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 14;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "gems/ruby")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_IRON_TOOL;
        }
    };

    public static final Tier CITRINE = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 450;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 6.0F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 2.0F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 2;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 16;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "gems/citrine")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_IRON_TOOL;
        }
    };

    public static final Tier JADE = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 400;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 7.0F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 3.5F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 2;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 12;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "ingots/jade")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_IRON_TOOL;
        }
    };

    public static final Tier ARTIFACT = new Tier() { /* DONE */
        /* Durability */
        @Override
        public int getUses() {
            return 4800;
        }

        /* Mining Speed */
        @Override
        public float getSpeed() {
            return 12.0F;
        }

        /* Damage Bonus */
        @Override
        public float getAttackDamageBonus() {
            return 5.0F;
        }

        /* Mining Tier
         * 0 = wood
         * 1 = stone
         * 2 = iron
         * 3 = diamond
         * 4 = netherite
         * 5+ = custom super-tier */
        @Override
        public int getLevel() {
            return 5;
        }

        /* Enchantability */
        @Override
        public int getEnchantmentValue() {
            return 22;
        }

        /* Repair Ingredient */
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "ingots/netherite")));
        }

        @Override
        public TagKey<Block> getTag() {
            return BlockTags.NEEDS_DIAMOND_TOOL;
        }
    };
}