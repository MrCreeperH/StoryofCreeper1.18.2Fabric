package net.creeper.soc.block;

import net.creeper.soc.StoryOfCreeper;
import net.creeper.soc.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    /////Руды
    public static final Block SHARD_ORE = registerBlock("shard_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool()), ModItemGroup.STORYOFCREEPER);
    public static final Block CREEPERITE_ORE = registerBlock("creeperite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.9f).requiresTool()), ModItemGroup.STORYOFCREEPER);



    /////Полные блоки
    public static final Block SHARD_BLOCK = registerBlock("shard_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(7f).requiresTool()),ModItemGroup.STORYOFCREEPER);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(StoryOfCreeper.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(StoryOfCreeper.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void RegisterModBlocks() {
        StoryOfCreeper.LOGGER.info("Registering ModBlocks for" + StoryOfCreeper.MOD_ID);
    }
}
