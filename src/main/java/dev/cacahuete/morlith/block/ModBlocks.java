package dev.cacahuete.morlith.block;

import dev.cacahuete.morlith.Morlith;
import dev.cacahuete.morlith.tab.ModTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks
{
    public static final DeferredRegister.Blocks BLOCKS =
        DeferredRegister.createBlocks(Morlith.MODID);

    public static final DeferredBlock<Block> URANIUM_BLOCK_ORE = BLOCKS.register("uranium_block_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final DeferredBlock<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.METAL)));
    public static final DeferredBlock<Block> PENCHBLENDE_BLOCK_ORE = BLOCKS.register("penchblende_block_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final DeferredBlock<Block> PENCHBLENDE_BLOCK = BLOCKS.register("penchblende_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.METAL)));
    public static final DeferredBlock<Block> URANOPHASE_BLOCK_ORE = BLOCKS.register("uranophase_block_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final DeferredBlock<Block> URANOPHASE_BLOCK = BLOCKS.register("uranophase_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.METAL)));
    public static final DeferredBlock<Block> TOBERNITE_BLOCK_ORE = BLOCKS.register("tobernite_block_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final DeferredBlock<Block> TOBERNITE_BLOCK = BLOCKS.register("tobernite_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.METAL)));
    public static final DeferredBlock<Block> AUTUNITE_BLOCK_ORE = BLOCKS.register("autunite_block_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final DeferredBlock<Block> AUTUNITE_BLOCK = BLOCKS.register("autunite_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.METAL)));
    public static final DeferredBlock<Block> THORIUM_BLOCK_ORE = BLOCKS.register("thorium_block_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final DeferredBlock<Block> THORIUM_BLOCK = BLOCKS.register("thorium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.METAL)));
    public static final DeferredBlock<Block> THORITE_BLOCK_ORE = BLOCKS.register("thorite_block_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final DeferredBlock<Block> THORITE_BLOCK = BLOCKS.register("thorite_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.METAL)));
    public static final DeferredBlock<Block> THORIANITE_BLOCK_ORE = BLOCKS.register("thorianite_block_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final DeferredBlock<Block> THORIANITE_BLOCK = BLOCKS.register("thorianite_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.METAL)));
    public static final DeferredBlock<Block> BRANNERITE_BLOCK_ORE = BLOCKS.register("brannerite_block_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final DeferredBlock<Block> BRANNERITE_BLOCK = BLOCKS.register("brannerite_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.METAL)));

}
