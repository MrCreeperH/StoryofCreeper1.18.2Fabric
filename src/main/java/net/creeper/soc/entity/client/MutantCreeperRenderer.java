package net.creeper.soc.entity.client;

import com.google.common.collect.Maps;
import net.creeper.soc.StoryOfCreeper;
import net.creeper.soc.entity.custom.MutantCreeperEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class MutantCreeperRenderer extends GeoEntityRenderer<MutantCreeperEntity> {
    public MutantCreeperRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MutantCreeperModel());
    }

    @Override
    public Identifier getTextureLocation(MutantCreeperEntity instance) {
        return new Identifier(StoryOfCreeper.MOD_ID, "textures/entity/mutantcreeper/mutantcreepertexture.png");
    }
}