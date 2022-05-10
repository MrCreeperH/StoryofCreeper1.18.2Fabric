package net.creeper.soc.item;

import net.creeper.soc.StoryOfCreeper;
import net.creeper.soc.entity.ModEntities;
import net.creeper.soc.item.custom.ModCreeperiteSword;
import net.creeper.soc.item.custom.ModMusicDiscItem;
import net.creeper.soc.item.custom.ModPickaxeItem;
import net.creeper.soc.item.custom.ModPoisoningSwordItem;
import net.creeper.soc.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    /////Вещи из шарда
    public static final Item UNKNOWSHARD = registerItem("unknown_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.STORYOFCREEPER).maxCount(12))); //Создание предмета

    public static final Item SCEPTER = registerItem("scepter_shard",
            new ModPickaxeItem(ModToolMaterials.SCEPTER, 12, 5f,
                    new FabricItemSettings().group(ModItemGroup.STORYOFCREEPER)));

    public static final Item POISON_SWORD = registerItem("poison_sword",
            new ModPoisoningSwordItem(ModToolMaterials.POISON_SWORD, 8, 1.3f,
                    new FabricItemSettings().group(ModItemGroup.STORYOFCREEPER).maxCount(1)));

    /////Яйца призыва
    public static final Item MUTANT_CREEPER_SPAWN_EGG = registerItem("mutant_creeper_spawn_egg",
            new SpawnEggItem(ModEntities.MUTANT_CREEPER,0x1A8D2C, 0x067017,
                    new FabricItemSettings().group(ModItemGroup.STORYOFCREEPER).maxCount(64)));
    /////Материалы для брони
    public static final Item CREEPERITE_INGOT = registerItem("creeperite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.STORYOFCREEPER).maxCount(64).rarity(Rarity.EPIC).fireproof()));

    public static final Item CREEPERITE_RAW = registerItem("creeperite_raw",
            new Item(new FabricItemSettings().group(ModItemGroup.STORYOFCREEPER).maxCount(64).rarity(Rarity.RARE)));


    /////Вещи из криперита
    public static final Item CREEPERITE_NUGGET = registerItem("creeperite_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.STORYOFCREEPER).maxCount(64).fireproof()));
    public static final Item CREEPERITE_FRAGMENT = registerItem("creeperite_fragment",
            new Item(new FabricItemSettings().group(ModItemGroup.STORYOFCREEPER).maxCount(64).fireproof()));

    /////Броня
    public static final Item CREEPERITE_HELMET = registerItem("creeperite_helmet",
            new ArmorItem(ModArmorMaterials.CREEPERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.STORYOFCREEPER).fireproof()));
    public static final Item CREEPERITE_CHESTPLATE = registerItem("creeperite_chestplate",
            new ArmorItem(ModArmorMaterials.CREEPERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.STORYOFCREEPER).fireproof()));
    public static final Item CREEPERITE_LEGGINGS = registerItem("creeperite_leggings",
            new ArmorItem(ModArmorMaterials.CREEPERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.STORYOFCREEPER).fireproof()));
    public static final Item CREEPERITE_BOOTS = registerItem("creeperite_boots",
            new ArmorItem(ModArmorMaterials.CREEPERITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.STORYOFCREEPER).fireproof()));


    /////Предметы
    public static final Item CREEPERITE_SWORD = registerItem("creeperite_sword",
            new ModCreeperiteSword(ModToolMaterials.CREEPERITE_SWORD, 9, 1.8f,
                    new FabricItemSettings().group(ModItemGroup.STORYOFCREEPER)));
    /////Еда
    public static final Item CREEPERITE_APPLE = registerItem("creeperite_apple",
            new Item(new FabricItemSettings().group(ModItemGroup.STORYOFCREEPER).food(ModFoodComponents.CREEPERITE_APPLE)));

    /////Мем-предметы
    public static final Item WHAT = registerItem("what",
            new ModPoisoningSwordItem(ModToolMaterials.WHAT, 50, 50f,
                    new FabricItemSettings().group(ModItemGroup.NEWSECRETTHINGS).rarity(Rarity.EPIC).fireproof()));

    public static final Item MORGEN_MUSIC_DISK = registerItem("morgen_music_disk",
            new ModMusicDiscItem(7, ModSounds.MORGEN_MUSIC,
                    new FabricItemSettings().group(ModItemGroup.NEWSECRETTHINGS).maxCount(1).rarity(Rarity.EPIC).fireproof()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(StoryOfCreeper.MOD_ID, name), item); //Настройка предметов, задавание параметров для них
    }

    public static void registerModItems() {
        StoryOfCreeper.LOGGER.info("Regestering Mod Items for " + StoryOfCreeper.MOD_ID); //Регистрирование предметов для того чтобы они появлялись в майнкрафте
    }
}
