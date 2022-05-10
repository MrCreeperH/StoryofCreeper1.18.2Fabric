package net.creeper.soc.entity.client;

import net.creeper.soc.StoryOfCreeper;
import net.creeper.soc.entity.custom.BabyCreeperEntity;
import net.creeper.soc.entity.custom.MutantCreeperEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BabyCreeperRenderer extends GeoEntityRenderer<BabyCreeperEntity> {
    public BabyCreeperRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BabyCreeperModel());
    }

    @Override
    public Identifier getTextureLocation(BabyCreeperEntity instance) {
        return new Identifier(StoryOfCreeper.MOD_ID, "textures/entity/babycreeper/babycreepertexture.png");
    }
}