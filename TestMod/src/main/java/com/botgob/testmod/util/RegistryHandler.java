package com.botgob.testmod.util;

import com.botgob.testmod.TestMod;
import com.botgob.testmod.blocks.BlockItemBase;
import com.botgob.testmod.blocks.CompIronBlock;
import com.botgob.testmod.blocks.CompressedCobblestoneBlock;
import com.botgob.testmod.blocks.RubyBlock;
import com.botgob.testmod.items.ItemBase;
import com.botgob.testmod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TestMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, TestMod.MOD_ID);
    public static void init(){
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items only
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> MELTED_RUBY = ITEMS.register("melted_ruby", ItemBase::new);

    //Blocks only
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE_BLOCK = BLOCKS.register("compressed_cobblestone_block", CompressedCobblestoneBlock::new);
    public static final RegistryObject<Block> COMP_IRON_BLOCK = BLOCKS.register("comp_iron_block", CompIronBlock::new);

    //Block items only
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",
            () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> COMPRESSED_COBBLESTONE_BLOCK_ITEM = ITEMS.register("compressed_cobblestone_block",
            () -> new BlockItemBase(COMPRESSED_COBBLESTONE_BLOCK.get()));
    public static final RegistryObject<Item> COMP_IRON_BLOCK_ITEM = ITEMS.register("comp_iron_block",
            () -> new BlockItemBase(COMP_IRON_BLOCK.get()));

    //Tools only
    // 1 + baseDamage + addedDamage
    // attackSpeed = 4 - setSpeed
    //Swords
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 4, -2.4f, new Item.Properties().group(TestMod.TAB)));

    //Shovels
    public static final RegistryObject<ShovelItem> IRON_BLOCK_SHOVEL = ITEMS.register("iron_block_shovel", () ->
            new ShovelItem(ModItemTier.IRON_BLOCK, 0, -3.0f, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<ShovelItem> GOLD_BLOCK_SHOVEL = ITEMS.register("gold_block_shovel", () ->
            new ShovelItem(ModItemTier.GOLD_BLOCK, 0, -3.0f, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<ShovelItem> DIAMOND_BLOCK_SHOVEL = ITEMS.register("diamond_block_shovel", () ->
            new ShovelItem(ModItemTier.DIAMOND_BLOCK, 0, -3.0f, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ModItemTier.RUBY, 0, -3.0f, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<ShovelItem> COMPRESSED_COBBLESTONE_SHOVEL = ITEMS.register("compressed_cobblestone_shovel", () ->
            new ShovelItem(ModItemTier.COMPRESSED_COBBLESTONE, 0, -3.0f, new Item.Properties().group(TestMod.TAB)));

    //Axes
    public static final RegistryObject<AxeItem> IRON_BLOCK_AXE = ITEMS.register("iron_block_axe", () ->
            new AxeItem(ModItemTier.IRON_BLOCK, 1.0f, -3.1f, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<AxeItem> GOLD_BLOCK_AXE = ITEMS.register("gold_block_axe", () ->
            new AxeItem(ModItemTier.GOLD_BLOCK, 0f, -3.0f, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<AxeItem> DIAMOND_BLOCK_AXE = ITEMS.register("diamond_block_axe", () ->
            new AxeItem(ModItemTier.DIAMOND_BLOCK, 2.0f, -3.0f, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ModItemTier.RUBY, 1.0f, -3.0f, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<AxeItem> COMPRESSED_COBBLESTONE_AXE = ITEMS.register("compressed_cobblestone_axe", () ->
            new AxeItem(ModItemTier.COMPRESSED_COBBLESTONE, 0f, -3.1f, new Item.Properties().group(TestMod.TAB)));

    //Pickaxes
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 0, -2.8f, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<PickaxeItem> COMPRESSED_COBBLESTONE_PICKAXE = ITEMS.register("compressed_cobblestone_pickaxe", () ->
            new PickaxeItem(ModItemTier.COMPRESSED_COBBLESTONE, 0, -2.8f, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<PickaxeItem> IRON_BLOCK_PICKAXE = ITEMS.register("iron_block_pickaxe", () ->
            new PickaxeItem(ModItemTier.IRON_BLOCK, 0, -2.8f, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<PickaxeItem> GOLD_BLOCK_PICKAXE = ITEMS.register("gold_block_pickaxe", () ->
            new PickaxeItem(ModItemTier.GOLD_BLOCK, 0, -2.8f, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<PickaxeItem> DIAMOND_BLOCK_PICKAXE = ITEMS.register("diamond_block_pickaxe", () ->
            new PickaxeItem(ModItemTier.DIAMOND_BLOCK, 0, -2.8f, new Item.Properties().group(TestMod.TAB)));

    //Hoes
    public static final RegistryObject<HoeItem> IRON_BLOCK_HOE = ITEMS.register("iron_block_hoe", () ->
            new HoeItem(ModItemTier.IRON_BLOCK, 0, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<HoeItem> GOLD_BLOCK_HOE = ITEMS.register("gold_block_hoe", () ->
            new HoeItem(ModItemTier.GOLD_BLOCK, 0, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<HoeItem> DIAMOND_BLOCK_HOE = ITEMS.register("diamond_block_hoe", () ->
            new HoeItem(ModItemTier.DIAMOND_BLOCK, 0, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(ModItemTier.RUBY, 0, new Item.Properties().group(TestMod.TAB)));

    public static final RegistryObject<HoeItem> COMPRESSED_COBBLESTONE_HOE = ITEMS.register("compressed_cobblestone_hoe", () ->
            new HoeItem(ModItemTier.COMPRESSED_COBBLESTONE, 0, new Item.Properties().group(TestMod.TAB)));

}
