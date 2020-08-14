package com.botgob.testmod.blocks;

import com.botgob.testmod.TestMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block blockIn) {
        super(blockIn, new Item.Properties().group(TestMod.TAB));
    }
}
