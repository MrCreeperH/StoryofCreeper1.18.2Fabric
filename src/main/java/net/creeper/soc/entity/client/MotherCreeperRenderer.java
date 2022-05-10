package net.creeper.soc.entity.client;

import net.creeper.soc.StoryOfCreeper;
import net.creeper.soc.entity.custom.MotherCreeperEntity;
import net.creeper.soc.entity.custom.MutantCreeperEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MotherCreeperRenderer extends GeoEntityRenderer<MotherCreeperEntity> {
    public MotherCreeperRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MotherCreeperModel());
    }

    @Override
    public Identifier getTextureLocation(MotherCreeperEntity instance) {
        return new Identifier(StoryOfCreeper.MOD_ID, "textures/entity/mothercreeper/mothercreepertexture.png");
    }
}