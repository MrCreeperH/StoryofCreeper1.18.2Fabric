package net.creeper.soc.entity;

import net.creeper.soc.StoryOfCreeper;
import net.creeper.soc.entity.custom.MutantCreeperEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<MutantCreeperEntity> MUTANT_CREEPER = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(StoryOfCreeper.MOD_ID, "mutantcreeper"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MutantCreeperEntity::new)
                    .dimensions(EntityDimensions.fixed(0.45f, 1.6f)).build());
}