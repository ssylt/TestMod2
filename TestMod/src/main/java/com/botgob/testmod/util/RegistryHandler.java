package com.botgob.testmod.util;

import com.botgob.testmod.TestMod;
import com.botgob.testmod.blocks.BlockItemBase;
import com.botgob.testmod.blocks.CompressedCobblestoneBlock;
import com.botgob.testmod.blocks.RubyBlock;
import com.botgob.testmod.items.ItemBase;
import com.botgob.testmod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

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

    //Block items only
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> COMPRESSED_COBBLESTONE_BLOCK_ITEM = ITEMS.register("compressed_cobblestone_block",
            () -> new BlockItemBase(COMPRESSED_COBBLESTONE_BLOCK.get()));

    //Tools only
    // 1 + baseDamage + addedDamage
    // attackSpeed = 4 - setSpeed
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 4, -2.4f, new Item.Properties().group(TestMod.TAB))
            );
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 0, -2.8f, new Item.Properties().group(TestMod.TAB))
    );
    public static final RegistryObject<PickaxeItem> COMPRESSED_COBBLESTONE_PICKAXE = ITEMS.register("compressed_cobblestone_pickaxe", () ->
            new PickaxeItem(ModItemTier.COMPRESSED_COBBLESTONE, 0, -2.8f, new Item.Properties().group(TestMod.TAB)));

}
