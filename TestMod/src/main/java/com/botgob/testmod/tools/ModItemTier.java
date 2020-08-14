package com.botgob.testmod.tools;

import com.botgob.testmod.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    RUBY(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.RUBY_SWORD.get());
    }),
    COMPRESSED_COBBLESTONE(1, 1179, 4.0f, 2.0f, 5, () -> {
        return Ingredient.fromItems(RegistryHandler.COMPRESSED_COBBLESTONE_PICKAXE.get());
    }),
    IRON_BLOCK(2, 2250, 6.0f, 3.0f, 14, () -> {
        return Ingredient.fromItems(RegistryHandler.IRON_BLOCK_PICKAXE.get());
    }),
    GOLD_BLOCK(2, 288, 10.0f, 3.0f, 22, () -> {
        return Ingredient.fromItems(RegistryHandler.GOLD_BLOCK_PICKAXE.get());
    }),
    DIAMOND_BLOCK(3, 14049, 8.0f, 4.0f, 10, () -> {
        return Ingredient.fromItems(RegistryHandler.DIAMOND_BLOCK_PICKAXE.get());
    });
    /* To add more tiers
    RUBY(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.RUBY_SWORD.get());
    }),
    EXAMPLE_MAT(3, 800, 7.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.RUBY_SWORD.get());
    });
     */
    private final int harvestLevel;
    private final int maxUses;
    private final float effiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float effiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.effiency = effiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return effiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
