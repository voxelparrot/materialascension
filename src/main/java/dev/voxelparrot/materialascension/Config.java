package dev.voxelparrot.materialascension;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.registries.ForgeRegistries;

import static dev.voxelparrot.materialascension.Constants.MA_ID;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = MA_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.BooleanValue INCLUDE_ARTIFACTS = BUILDER
            .comment("None of these configs work yet they're just placeholders (you can assume that their values are the defaults)")
            .comment("Whether to include the artifact class weapons (default = true)")
            .define("includeArtifacts", true);

    private static final ForgeConfigSpec.BooleanValue INCLUDE_UNIQUES = BUILDER
            .comment("Whether to include the unique rarity weapons (default = false)")
            .define("includeUniqueWeapons", false);

    private static final ForgeConfigSpec.BooleanValue INCLUDE_QITQIAST = BUILDER
            .comment("Whether to include the special qitqiast weapons (default = true) (if you are akaash please keep this as true)")
            .define("includeQitqiastWeapons", true);

    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static boolean includeArtifacts;
    public static boolean includeUniqueWeapons;
    public static boolean includeQitqiastWeapons;

    private static boolean validateItemName(final Object obj)
    {
        return obj instanceof final String itemName && ForgeRegistries.ITEMS.containsKey(new ResourceLocation(itemName));
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        includeArtifacts = INCLUDE_ARTIFACTS.get();
        includeUniqueWeapons = INCLUDE_UNIQUES.get();
        includeQitqiastWeapons = INCLUDE_QITQIAST.get();
    }
}
