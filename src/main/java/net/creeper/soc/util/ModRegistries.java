package net.creeper.soc.util;

import net.creeper.soc.entity.ModEntities;
import net.creeper.soc.entity.custom.BabyCreeperEntity;
import net.creeper.soc.entity.custom.MotherCreeperEntity;
import net.creeper.soc.entity.custom.MutantCreeperEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerAttributes();
    }
    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.MUTANT_CREEPER, MutantCreeperEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.BABY_CREEPER, BabyCreeperEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.MOTHER_CREEPER, MotherCreeperEntity.createZombieAttributes());
    }
}
