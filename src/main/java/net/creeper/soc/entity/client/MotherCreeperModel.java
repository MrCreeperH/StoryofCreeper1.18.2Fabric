package net.creeper.soc.entity.client;

import net.creeper.soc.StoryOfCreeper;
import net.creeper.soc.entity.custom.MotherCreeperEntity;
import net.creeper.soc.entity.custom.MutantCreeperEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class MotherCreeperModel extends AnimatedGeoModel<MotherCreeperEntity> {
    @Override
    public Identifier getModelLocation(MotherCreeperEntity object) {
        return new Identifier(StoryOfCreeper.MOD_ID, "geo/mothercreeper.geo.json");
    }

    @Override
    public Identifier getTextureLocation(MotherCreeperEntity object) {
        return new Identifier(StoryOfCreeper.MOD_ID, "textures/entity/mothercreeper/mothercreepertexture.png");
    }

    @Override
    public Identifier getAnimationFileLocation(MotherCreeperEntity animatable) {
        return new Identifier(StoryOfCreeper.MOD_ID, "animations/mothercreeper.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(MotherCreeperEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}