package net.creeper.soc.entity.client;

import net.creeper.soc.StoryOfCreeper;
import net.creeper.soc.entity.custom.BabyCreeperEntity;
import net.creeper.soc.entity.custom.MutantCreeperEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class BabyCreeperModel extends AnimatedGeoModel<BabyCreeperEntity> {
    @Override
    public Identifier getModelLocation(BabyCreeperEntity object) {
        return new Identifier(StoryOfCreeper.MOD_ID, "geo/babycreeper.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BabyCreeperEntity object) {
        return new Identifier(StoryOfCreeper.MOD_ID, "textures/entity/babycreeper/babycreepertexture.png");
    }

    @Override
    public Identifier getAnimationFileLocation(BabyCreeperEntity animatable) {
        return new Identifier(StoryOfCreeper.MOD_ID, "animations/babycreeper.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(BabyCreeperEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
