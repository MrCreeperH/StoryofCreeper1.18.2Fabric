package net.creeper.soc.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    SCEPTER(MiningLevels.NETHERITE, 20, 10.0f, 1f, 30, () -> Ingredient.ofItems(ModItems.UNKNOWSHARD)),
    WHAT(MiningLevels.NETHERITE, 99999, 50f, 1f, 30, () -> Ingredient.ofItems(ModItems.WHAT)),
    POISON_SWORD(MiningLevels.HAND, 250, 1f,1f, 30, () -> Ingredient.ofItems(ModItems.POISON_SWORD, ModItems.UNKNOWSHARD)),
    CREEPERITE_SWORD(MiningLevels.HAND, 110, 1f, 1f, 30, () -> Ingredient.ofItems(ModItems.CREEPERITE_SWORD, ModItems.CREEPERITE_INGOT));


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}