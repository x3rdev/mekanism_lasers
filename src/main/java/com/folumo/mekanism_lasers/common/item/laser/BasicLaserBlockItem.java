package com.folumo.mekanism_lasers.common.item.laser;

import com.folumo.mekanism_lasers.common.block_entity.laser.BasicLaserBlockEntity;
import mekanism.api.text.TextComponentUtil;
import mekanism.common.block.prefab.BlockTile;
import mekanism.common.content.blocktype.BlockTypeTile;
import mekanism.common.item.block.ItemBlockTooltip;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;
import net.minecraft.util.FastColor;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;


public class BasicLaserBlockItem extends ItemBlockTooltip<BlockTile.BlockTileModel<BasicLaserBlockEntity, BlockTypeTile<BasicLaserBlockEntity>>> {

    public BasicLaserBlockItem(BlockTile.BlockTileModel<BasicLaserBlockEntity, BlockTypeTile<BasicLaserBlockEntity>> block, Properties properties) {
        super(block, properties);
    }

    @Override
    public @NotNull Component getName(@NotNull ItemStack stack) {
        return TextComponentUtil.build(TextColor.fromRgb(FastColor.ARGB32.color(95, 255, 184)), super.getName(stack));
    }
}
