package net.creeper.soc.item.custom;

import net.creeper.soc.block.ModBlocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ModPoisoningSwordItem extends SwordItem {
    public ModPoisoningSwordItem(ToolMaterial toolMaterial, int AttackDamage,float AttackSpeed, Settings settings) {
        super(toolMaterial, AttackDamage, AttackSpeed, settings);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 120, 4), attacker);
        return super.postHit(stack, target, attacker);
    }
}
