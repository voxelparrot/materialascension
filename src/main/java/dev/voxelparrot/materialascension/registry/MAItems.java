package dev.voxelparrot.materialascension.registry;

import dev.voxelparrot.materialascension.Config;
import dev.voxelparrot.materialascension.item.*;
import dev.voxelparrot.materialascension.material.*;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class MAItems {
  public static final int daggerDamage = 1;
  public static final float daggerSpeed = -2.0f;
  public static final int hammerDamage = 7;
  public static final float hammerSpeed = -3.4f;
  public static final int clubDamage = 5;
  public static final float clubSpeed = -3.0f;
  public static final int spearDamage = 2;
  public static final float spearSpeed = -2.8f;
  public static final int quarterstaffDamage = 1;
  public static final float quarterstaffSpeed = -2.3f;
  public static final int glaiveDamage = 5;
  public static final float glaiveSpeed = -3.2f;
  public static List<ItemInfo> items = new LinkedList<>();

  public static void init() {
    System.out.println("includeArtifacts: " + Config.includeArtifacts.get());
    System.out.println("includeUniqueWeapons: " + Config.includeUniqueWeapons.get());
    System.out.println("includeQitqiastWeapons: " + Config.includeQitqiastWeapons.get());
    /* Daggers */
    items.add(new ItemInfo("dagger", "skysteel_dagger", () -> new DaggerItem(ToolMaterials.SKYSTEEL, daggerDamage, daggerSpeed, new Item.Properties())));
    items.add(new ItemInfo("dagger", "mysticrain_dagger", () -> new DaggerItem(ToolMaterials.MYSTICRAIN, daggerDamage, daggerSpeed, new Item.Properties())));
    items.add(new ItemInfo("dagger", "aetherium_dagger", () -> new DaggerItem(ToolMaterials.AETHERIUM, daggerDamage, daggerSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("dagger", "shadowsteel_dagger", () -> new DaggerItem(ToolMaterials.SHADOWSTEEL, daggerDamage, daggerSpeed, new Item.Properties())));
    items.add(new ItemInfo("dagger", "titanium_quartz_dagger", () -> new DaggerItem(ToolMaterials.TITANIUM_QUARTZ, daggerDamage, daggerSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("dagger", "steel_dagger", () -> new DaggerItem(ToolMaterials.STEEL, daggerDamage, daggerSpeed, new Item.Properties())));
    items.add(new ItemInfo("dagger", "titanium_dagger", () -> new DaggerItem(ToolMaterials.TITANIUM, daggerDamage, daggerSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("dagger", "crimsonite_dagger", () -> new DaggerItem(ToolMaterials.CRIMSONITE, daggerDamage, daggerSpeed, new Item.Properties())));
    items.add(new ItemInfo("dagger", "sliver_dagger", () -> new DaggerItem(ToolMaterials.SLIVER, daggerDamage, daggerSpeed + 0.4f, new Item.Properties())));
    items.add(new ItemInfo("dagger", "shadowite_dagger", () -> new DaggerItem(ToolMaterials.SHADOWITE, daggerDamage, daggerSpeed, new Item.Properties())));
    items.add(new ItemInfo("dagger", "sapphire_dagger", () -> new DaggerItem(ToolMaterials.SAPPHIRE, daggerDamage, daggerSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("dagger", "topaz_dagger", () -> new DaggerItem(ToolMaterials.TOPAZ, daggerDamage, daggerSpeed, new Item.Properties())));
    items.add(new ItemInfo("dagger", "ruby_dagger", () -> new DaggerItem(ToolMaterials.RUBY, daggerDamage, daggerSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("dagger", "citrine_dagger", () -> new DaggerItem(ToolMaterials.CITRINE, daggerDamage, daggerSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("dagger", "jade_dagger", () -> new DaggerItem(ToolMaterials.JADE, daggerDamage, daggerSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("dagger", "white_dagger", () -> new DaggerItem(ToolMaterials.WHITE, daggerDamage, daggerSpeed, new Item.Properties())));
    /* Hammers */
    items.add(new ItemInfo("hammer", "skysteel_hammer", () -> new HammerItem(ToolMaterials.SKYSTEEL, hammerDamage, hammerSpeed, new Item.Properties())));
    items.add(new ItemInfo("hammer", "mysticrain_hammer", () -> new HammerItem(ToolMaterials.MYSTICRAIN, hammerDamage, hammerSpeed, new Item.Properties())));
    items.add(new ItemInfo("hammer", "aetherium_hammer", () -> new HammerItem(ToolMaterials.AETHERIUM, hammerDamage, hammerSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("hammer", "shadowsteel_hammer", () -> new HammerItem(ToolMaterials.SHADOWSTEEL, hammerDamage, hammerSpeed, new Item.Properties())));
    items.add(new ItemInfo("hammer", "titanium_quartz_hammer", () -> new HammerItem(ToolMaterials.TITANIUM_QUARTZ, hammerDamage, hammerSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("hammer", "steel_hammer", () -> new HammerItem(ToolMaterials.STEEL, hammerDamage, hammerSpeed, new Item.Properties())));
    items.add(new ItemInfo("hammer", "titanium_hammer", () -> new HammerItem(ToolMaterials.TITANIUM, hammerDamage, hammerSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("hammer", "crimsonite_hammer", () -> new HammerItem(ToolMaterials.CRIMSONITE, hammerDamage, hammerSpeed, new Item.Properties())));
    items.add(new ItemInfo("hammer", "sliver_hammer", () -> new HammerItem(ToolMaterials.SLIVER, hammerDamage, hammerSpeed + 0.4f, new Item.Properties())));
    items.add(new ItemInfo("hammer", "shadowite_hammer", () -> new HammerItem(ToolMaterials.SHADOWITE, hammerDamage, hammerSpeed, new Item.Properties())));
    items.add(new ItemInfo("hammer", "sapphire_hammer", () -> new HammerItem(ToolMaterials.SAPPHIRE, hammerDamage, hammerSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("hammer", "topaz_hammer", () -> new HammerItem(ToolMaterials.TOPAZ, hammerDamage, hammerSpeed, new Item.Properties())));
    items.add(new ItemInfo("hammer", "ruby_hammer", () -> new HammerItem(ToolMaterials.RUBY, hammerDamage, hammerSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("hammer", "citrine_hammer", () -> new HammerItem(ToolMaterials.CITRINE, hammerDamage, hammerSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("hammer", "jade_hammer", () -> new HammerItem(ToolMaterials.JADE, hammerDamage, hammerSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("hammer", "white_hammer", () -> new HammerItem(ToolMaterials.WHITE, hammerDamage, hammerSpeed, new Item.Properties())));
    /* Batons */
    items.add(new ItemInfo("club", "skysteel_club", () -> new ClubItem(ToolMaterials.SKYSTEEL, clubDamage, clubSpeed, new Item.Properties())));
    items.add(new ItemInfo("club", "mysticrain_club", () -> new ClubItem(ToolMaterials.MYSTICRAIN, clubDamage, clubSpeed, new Item.Properties())));
    items.add(new ItemInfo("club", "aetherium_club", () -> new ClubItem(ToolMaterials.AETHERIUM, clubDamage, clubSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("club", "shadowsteel_club", () -> new ClubItem(ToolMaterials.SHADOWSTEEL, clubDamage, clubSpeed, new Item.Properties())));
    items.add(new ItemInfo("club", "titanium_quartz_club", () -> new ClubItem(ToolMaterials.TITANIUM_QUARTZ, clubDamage, clubSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("club", "steel_club", () -> new ClubItem(ToolMaterials.STEEL, clubDamage, clubSpeed, new Item.Properties())));
    items.add(new ItemInfo("club", "titanium_club", () -> new ClubItem(ToolMaterials.TITANIUM, clubDamage, clubSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("club", "crimsonite_club", () -> new ClubItem(ToolMaterials.CRIMSONITE, clubDamage, clubSpeed, new Item.Properties())));
    items.add(new ItemInfo("club", "sliver_club", () -> new ClubItem(ToolMaterials.SLIVER, clubDamage, clubSpeed + 0.4f, new Item.Properties())));
    items.add(new ItemInfo("club", "shadowite_club", () -> new ClubItem(ToolMaterials.SHADOWITE, clubDamage, clubSpeed, new Item.Properties())));
    items.add(new ItemInfo("club", "sapphire_club", () -> new ClubItem(ToolMaterials.SAPPHIRE, clubDamage, clubSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("club", "topaz_club", () -> new ClubItem(ToolMaterials.TOPAZ, clubDamage, clubSpeed, new Item.Properties())));
    items.add(new ItemInfo("club", "ruby_club", () -> new ClubItem(ToolMaterials.RUBY, clubDamage, clubSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("club", "citrine_club", () -> new ClubItem(ToolMaterials.CITRINE, clubDamage, clubSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("club", "jade_club", () -> new ClubItem(ToolMaterials.JADE, clubDamage, clubSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("club", "white_club", () -> new ClubItem(ToolMaterials.WHITE, clubDamage, clubSpeed, new Item.Properties())));
    /* Spears */
    items.add(new ItemInfo("spear", "skysteel_spear", () -> new SpearItem(ToolMaterials.SKYSTEEL, spearDamage, spearSpeed, new Item.Properties())));
    items.add(new ItemInfo("spear", "mysticrain_spear", () -> new SpearItem(ToolMaterials.MYSTICRAIN, spearDamage, spearSpeed, new Item.Properties())));
    items.add(new ItemInfo("spear", "aetherium_spear", () -> new SpearItem(ToolMaterials.AETHERIUM, spearDamage, spearSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("spear", "shadowsteel_spear", () -> new SpearItem(ToolMaterials.SHADOWSTEEL, spearDamage, spearSpeed, new Item.Properties())));
    items.add(new ItemInfo("spear", "titanium_quartz_spear", () -> new SpearItem(ToolMaterials.TITANIUM_QUARTZ, spearDamage, spearSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("spear", "steel_spear", () -> new SpearItem(ToolMaterials.STEEL, spearDamage, spearSpeed, new Item.Properties())));
    items.add(new ItemInfo("spear", "titanium_spear", () -> new SpearItem(ToolMaterials.TITANIUM, spearDamage, spearSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("spear", "crimsonite_spear", () -> new SpearItem(ToolMaterials.CRIMSONITE, spearDamage, spearSpeed, new Item.Properties())));
    items.add(new ItemInfo("spear", "sliver_spear", () -> new SpearItem(ToolMaterials.SLIVER, spearDamage, spearSpeed + 0.4f, new Item.Properties())));
    items.add(new ItemInfo("spear", "shadowite_spear", () -> new SpearItem(ToolMaterials.SHADOWITE, spearDamage, spearSpeed, new Item.Properties())));
    items.add(new ItemInfo("spear", "sapphire_spear", () -> new SpearItem(ToolMaterials.SAPPHIRE, spearDamage, spearSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("spear", "topaz_spear", () -> new SpearItem(ToolMaterials.TOPAZ, spearDamage, spearSpeed, new Item.Properties())));
    items.add(new ItemInfo("spear", "ruby_spear", () -> new SpearItem(ToolMaterials.RUBY, spearDamage, spearSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("spear", "citrine_spear", () -> new SpearItem(ToolMaterials.CITRINE, spearDamage, spearSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("spear", "jade_spear", () -> new SpearItem(ToolMaterials.JADE, spearDamage, spearSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("spear", "white_spear", () -> new SpearItem(ToolMaterials.WHITE, spearDamage, spearSpeed, new Item.Properties())));
    /* Quarterstaves */
    items.add(new ItemInfo("quarterstaff", "skysteel_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.SKYSTEEL, quarterstaffDamage, quarterstaffSpeed, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "mysticrain_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.MYSTICRAIN, quarterstaffDamage, quarterstaffSpeed, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "aetherium_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.AETHERIUM, quarterstaffDamage, quarterstaffSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "shadowsteel_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.SHADOWSTEEL, quarterstaffDamage, quarterstaffSpeed, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "titanium_quartz_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.TITANIUM_QUARTZ, quarterstaffDamage, quarterstaffSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "steel_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.STEEL, quarterstaffDamage, quarterstaffSpeed, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "titanium_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.TITANIUM, quarterstaffDamage, quarterstaffSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "crimsonite_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.CRIMSONITE, quarterstaffDamage, quarterstaffSpeed, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "sliver_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.SLIVER, quarterstaffDamage, quarterstaffSpeed + 0.4f, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "shadowite_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.SHADOWITE, quarterstaffDamage, quarterstaffSpeed, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "sapphire_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.SAPPHIRE, quarterstaffDamage, quarterstaffSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "topaz_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.TOPAZ, quarterstaffDamage, quarterstaffSpeed, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "ruby_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.RUBY, quarterstaffDamage, quarterstaffSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "citrine_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.CITRINE, quarterstaffDamage, quarterstaffSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "jade_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.JADE, quarterstaffDamage, quarterstaffSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("quarterstaff", "white_quarterstaff", () -> new QuarterstaffItem(ToolMaterials.WHITE, quarterstaffDamage, quarterstaffSpeed, new Item.Properties())));
    /* Glaives */
    items.add(new ItemInfo("glaive", "skysteel_glaive", () -> new GlaiveItem(ToolMaterials.SKYSTEEL, glaiveDamage, glaiveSpeed, new Item.Properties())));
    items.add(new ItemInfo("glaive", "mysticrain_glaive", () -> new GlaiveItem(ToolMaterials.MYSTICRAIN, glaiveDamage, glaiveSpeed, new Item.Properties())));
    items.add(new ItemInfo("glaive", "aetherium_glaive", () -> new GlaiveItem(ToolMaterials.AETHERIUM, glaiveDamage, glaiveSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("glaive", "shadowsteel_glaive", () -> new GlaiveItem(ToolMaterials.SHADOWSTEEL, glaiveDamage, glaiveSpeed, new Item.Properties())));
    items.add(new ItemInfo("glaive", "titanium_quartz_glaive", () -> new GlaiveItem(ToolMaterials.TITANIUM_QUARTZ, glaiveDamage, glaiveSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("glaive", "steel_glaive", () -> new GlaiveItem(ToolMaterials.STEEL, glaiveDamage, glaiveSpeed, new Item.Properties())));
    items.add(new ItemInfo("glaive", "titanium_glaive", () -> new GlaiveItem(ToolMaterials.TITANIUM, glaiveDamage, glaiveSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("glaive", "crimsonite_glaive", () -> new GlaiveItem(ToolMaterials.CRIMSONITE, glaiveDamage, glaiveSpeed, new Item.Properties())));
    items.add(new ItemInfo("glaive", "sliver_glaive", () -> new GlaiveItem(ToolMaterials.SLIVER, glaiveDamage, glaiveSpeed + 0.4f, new Item.Properties())));
    items.add(new ItemInfo("glaive", "shadowite_glaive", () -> new GlaiveItem(ToolMaterials.SHADOWITE, glaiveDamage, glaiveSpeed, new Item.Properties())));
    items.add(new ItemInfo("glaive", "sapphire_glaive", () -> new GlaiveItem(ToolMaterials.SAPPHIRE, glaiveDamage, glaiveSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("glaive", "topaz_glaive", () -> new GlaiveItem(ToolMaterials.TOPAZ, glaiveDamage, glaiveSpeed, new Item.Properties())));
    items.add(new ItemInfo("glaive", "ruby_glaive", () -> new GlaiveItem(ToolMaterials.RUBY, glaiveDamage, glaiveSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("glaive", "citrine_glaive", () -> new GlaiveItem(ToolMaterials.CITRINE, glaiveDamage, glaiveSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("glaive", "jade_glaive", () -> new GlaiveItem(ToolMaterials.JADE, glaiveDamage, glaiveSpeed + 0.2f, new Item.Properties())));
    items.add(new ItemInfo("glaive", "white_glaive", () -> new GlaiveItem(ToolMaterials.WHITE, glaiveDamage, glaiveSpeed, new Item.Properties())));
    /* Special Weapons (Unbreakable)
     *  ARTIFACTS                          */

    /* Zebasi Glaive:
     *  Lights enemies on fire           */
    items.add(new ItemInfo("artifact", "zebasi_glaive", () -> new UnbreakableGlaiveItem(ToolMaterials.ARTIFACT, glaiveDamage + 3, glaiveSpeed - 0.4f, new Item.Properties())));
    items.add(new ItemInfo("artifact", "diamond_destroyer", () -> new UnbreakableGlaiveItem(ToolMaterials.ARTIFACT, hammerDamage + 3, hammerSpeed + 0.4f, new Item.Properties())));
    /* Bread Club
     *  bread  */
    /* Abyssal Dagger
     *  darkness  */
    /* Sunrise Spear
     *  Lights enemies on fire           */
    /* Uniques */
    items.add(new ItemInfo("unique", "royal_scythe", () -> new UnbreakableScytheItem(ToolMaterials.ARTIFACT, 5, -3.2f, new Item.Properties())));
    items.add(new ItemInfo("unique", "charged_scythe", () -> new UnbreakableScytheItem(ToolMaterials.ARTIFACT, 5, -3.2f, new Item.Properties())));
    /* Qitqiast Trvyshmaodozrt htrrm */
    items.add(new ItemInfo("qitqiast", "purpular_dagger", () -> new UnbreakableDaggerItem(ToolMaterials.ARTIFACT, daggerDamage + 3, daggerSpeed - 0.4f, new Item.Properties())));
    items.add(new ItemInfo("qitqiast", "rectanglisimer_hammer", () -> new UnbreakableHammerItem(ToolMaterials.ARTIFACT, hammerDamage + 3, hammerSpeed - 0.4f, new Item.Properties())));
    items.add(new ItemInfo("qitqiast", "green_spear", () -> new UnbreakableSpearItem(ToolMaterials.ARTIFACT, spearDamage + 3, spearSpeed - 0.4f, new Item.Properties())));
    /* Components */
    items.add(new ItemInfo("sheet", "aetherium_sheet", BasicComponentItem::new));
    items.add(new ItemInfo("sheet", "sliver_sheet", BasicComponentItem::new));
    items.add(new ItemInfo("sheet", "titanium_quartz_sheet", BasicComponentItem::new));
    items.add(new ItemInfo("sheet", "titanium_sheet", BasicComponentItem::new));
    items.add(new ItemInfo("sheet", "steel_sheet", BasicComponentItem::new));
    items.add(new ItemInfo("sheet", "jade_sheet", BasicComponentItem::new));
    items.add(new ItemInfo("sheet", "skysteel_sheet", BasicComponentItem::new));
    items.add(new ItemInfo("sheet", "shadowsteel_sheet", BasicComponentItem::new));
    items.add(new ItemInfo("sheet", "crimsonite_sheet", BasicComponentItem::new));
    items.add(new ItemInfo("sheet", "shadowite_sheet", BasicComponentItem::new));
    items.add(new ItemInfo("plate", "topaz_plate", BasicComponentItem::new));
    items.add(new ItemInfo("plate", "citrine_plate", BasicComponentItem::new));
    items.add(new ItemInfo("plate", "sapphire_plate", BasicComponentItem::new));
    items.add(new ItemInfo("plate", "white_crystal_plate", BasicComponentItem::new));
    items.add(new ItemInfo("plate", "sunflare_plate", BasicComponentItem::new));
    items.add(new ItemInfo("plate", "diamond_plate", BasicComponentItem::new));
    items.add(new ItemInfo("plate", "ruby_plate", BasicComponentItem::new));
    items.add(new ItemInfo("handle", "tool_handle", BasicComponentItem::new));
    items.add(new ItemInfo("component", "creative_dust", BasicComponentItem::new));



  }

  /*** This class holds information about all items.
   It is accessed by forge & fabric methods
   for automatic registration ***/
  public static class ItemInfo {
    public final String type;
    public final String name;
    public final Supplier<Item> itemSupplier;

    public ItemInfo(String type, String name, Supplier<Item> itemSupplier) {
      this.type = type;
      this.name = name;
      this.itemSupplier = itemSupplier;
    }
  }

}
