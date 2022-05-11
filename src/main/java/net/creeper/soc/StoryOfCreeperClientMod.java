package net.creeper.soc;

import net.creeper.soc.entity.ModEntities;
import net.creeper.soc.entity.client.BabyCreeperRenderer;
import net.creeper.soc.entity.client.MotherCreeperRenderer;
import net.creeper.soc.entity.client.MutantCreeperRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class StoryOfCreeperClientMod implements ClientModInitializer {
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MUTANT_CREEPER, MutantCreeperRenderer::new);
        EntityRendererRegistry.register(ModEntities.BABY_CREEPER, BabyCreeperRenderer::new);
        EntityRendererRegistry.register(ModEntities.MOTHER_CREEPER, MotherCreeperRenderer::new);
    }
}
