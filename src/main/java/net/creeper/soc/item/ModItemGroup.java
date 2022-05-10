package net.creeper.soc.item;

import net.creeper.soc.StoryOfCreeper;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup STORYOFCREEPER = FabricItemGroupBuilder.build(new Identifier(StoryOfCreeper.MOD_ID, "storyofcreeper"),
            () -> new ItemStack(ModItems.SCEPTER));

    public static final ItemGroup NEWSECRETTHINGS = FabricItemGroupBuilder.build(new Identifier(StoryOfCreeper.MOD_ID, "newsecretthings"),
            () -> new ItemStack(ModItems.WHAT));
}
