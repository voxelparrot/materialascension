package dev.voxelparrot.materialascension;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static dev.voxelparrot.materialascension.Constants.MA_ID;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = MA_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    public static final ForgeConfigSpec GENERAL_SPEC;

    static {
        ForgeConfigSpec.Builder configBuilder = new ForgeConfigSpec.Builder();
        setupConfig(configBuilder);
        GENERAL_SPEC = configBuilder.build();
    }

    public static ForgeConfigSpec.BooleanValue includeArtifacts;
    public static ForgeConfigSpec.BooleanValue includeUniqueWeapons;
    public static ForgeConfigSpec.BooleanValue includeQitqiastWeapons;

    private static void setupConfig(ForgeConfigSpec.Builder builder) {

        includeArtifacts = builder
                .comment("Whether to include the artifact class weapons (default = true)")
                .define("include_artifacts", true);

        includeUniqueWeapons = builder
                .comment("Whether to include the unique rarity weapons (default = false)")
                .define("include_unique_weapons", false);

        includeQitqiastWeapons = builder
                .comment("Whether to include the special qitqiast weapons (default = true) (if you are akaash please keep this as true)")
                .define("include_qitqiast_weapons", true);
    }

    private static boolean validateItemName(final Object obj)
    {
        return obj instanceof final String itemName && ForgeRegistries.ITEMS.containsKey(new ResourceLocation(itemName));
    }

}
