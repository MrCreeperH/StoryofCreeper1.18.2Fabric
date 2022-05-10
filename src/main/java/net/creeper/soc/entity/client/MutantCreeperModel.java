package net.creeper.soc.entity.client;

import net.creeper.soc.StoryOfCreeper;
import net.creeper.soc.entity.custom.MutantCreeperEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class MutantCreeperModel extends AnimatedGeoModel<MutantCreeperEntity> {
    @Override
    public Identifier getModelLocation(MutantCreeperEntity object) {
        return new Identifier(StoryOfCreeper.MOD_ID, "geo/mutantcreeper.geo.json");
    }

    @Override
    public Identifier getTextureLocation(MutantCreeperEntity object) {
        return new Identifier(StoryOfCreeper.MOD_ID, "textures/entity/mutantcreeper/mutantcreepertexture.png");
    }

    @Override
    public Identifier getAnimationFileLocation(MutantCreeperEntity animatable) {
        return new Identifier(StoryOfCreeper.MOD_ID, "animations/creeper.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(MutantCreeperEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}