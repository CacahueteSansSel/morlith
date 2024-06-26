package dev.cacahuete.morlith.item;

import dev.cacahuete.morlith.Morlith;
import dev.cacahuete.morlith.block.ModBlocks;
import dev.cacahuete.morlith.entity.ModEntities;
import dev.cacahuete.morlith.tab.ModTabs;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Morlith.MODID);

    public static final DeferredItem<Item> RAW_URANIUM = ITEMS.registerSimpleItem("raw_uranium",
            new Item.Properties());
    public static final DeferredItem<Item> URANIUM = ITEMS.registerSimpleItem("uranium",
            new Item.Properties());
    public static final DeferredItem<BlockItem> URANIUM_BLOCK_ORE = ITEMS.registerSimpleBlockItem("uranium_block_ore", ModBlocks.URANIUM_BLOCK_ORE);
    public static final DeferredItem<BlockItem> URANIUM_BLOCK = ITEMS.registerSimpleBlockItem("uranium_block", ModBlocks.URANIUM_BLOCK);

    public static final DeferredItem<Item> RAW_PENCHBLENDE = ITEMS.registerSimpleItem("raw_penchblende",
            new Item.Properties());
    public static final DeferredItem<Item> PENCHBLENDE = ITEMS.registerSimpleItem("penchblende",
            new Item.Properties());
    public static final DeferredItem<BlockItem> PENCHBLENDE_BLOCK_ORE = ITEMS.registerSimpleBlockItem("penchblende_block_ore", ModBlocks.PENCHBLENDE_BLOCK_ORE);
    public static final DeferredItem<BlockItem> PENCHBLENDE_BLOCK = ITEMS.registerSimpleBlockItem("penchblende_block", ModBlocks.PENCHBLENDE_BLOCK);

    public static final DeferredItem<Item> RAW_URANOPHASE = ITEMS.registerSimpleItem("raw_uranophase",
            new Item.Properties());
    public static final DeferredItem<Item> URANOPHASE = ITEMS.registerSimpleItem("uranophase",
            new Item.Properties());
    public static final DeferredItem<BlockItem> URANOPHASE_BLOCK_ORE = ITEMS.registerSimpleBlockItem("uranophase_block_ore", ModBlocks.URANOPHASE_BLOCK_ORE);
    public static final DeferredItem<BlockItem> URANOPHASE_BLOCK = ITEMS.registerSimpleBlockItem("uranophase_block", ModBlocks.URANOPHASE_BLOCK);

    public static final DeferredItem<Item> RAW_TOBERNITE = ITEMS.registerSimpleItem("raw_tobernite",
            new Item.Properties());
    public static final DeferredItem<Item> TOBERNITE = ITEMS.registerSimpleItem("tobernite",
            new Item.Properties());
    public static final DeferredItem<BlockItem> TOBERNITE_BLOCK_ORE = ITEMS.registerSimpleBlockItem("tobernite_block_ore", ModBlocks.TOBERNITE_BLOCK_ORE);
    public static final DeferredItem<BlockItem> TOBERNITE_BLOCK = ITEMS.registerSimpleBlockItem("tobernite_block", ModBlocks.TOBERNITE_BLOCK);

    public static final DeferredItem<Item> RAW_AUTUNITE = ITEMS.registerSimpleItem("raw_autunite",
            new Item.Properties());
    public static final DeferredItem<Item> AUTUNITE = ITEMS.registerSimpleItem("autunite",
            new Item.Properties());
    public static final DeferredItem<BlockItem> AUTUNITE_BLOCK_ORE = ITEMS.registerSimpleBlockItem("autunite_block_ore", ModBlocks.AUTUNITE_BLOCK_ORE);
    public static final DeferredItem<BlockItem> AUTUNITE_BLOCK = ITEMS.registerSimpleBlockItem("autunite_block", ModBlocks.AUTUNITE_BLOCK);


    public static final DeferredItem<Item> RAW_THORIUM = ITEMS.registerSimpleItem("raw_thorium",
            new Item.Properties());
    public static final DeferredItem<Item> THORIUM = ITEMS.registerSimpleItem("thorium",
            new Item.Properties());
    public static final DeferredItem<BlockItem> THORIUM_BLOCK_ORE = ITEMS.registerSimpleBlockItem("thorium_block_ore", ModBlocks.THORIUM_BLOCK_ORE);
    public static final DeferredItem<BlockItem> THORIUM_BLOCK = ITEMS.registerSimpleBlockItem("thorium_block", ModBlocks.THORIUM_BLOCK);


    public static final DeferredItem<Item> RAW_THORITE = ITEMS.registerSimpleItem("raw_thorite",
            new Item.Properties());
    public static final DeferredItem<Item> THORITE = ITEMS.registerSimpleItem("thorite",
            new Item.Properties());
    public static final DeferredItem<BlockItem> THORITE_BLOCK_ORE = ITEMS.registerSimpleBlockItem("thorite_block_ore", ModBlocks.THORITE_BLOCK_ORE);
    public static final DeferredItem<BlockItem> THORITE_BLOCK = ITEMS.registerSimpleBlockItem("thorite_block", ModBlocks.THORITE_BLOCK);


    public static final DeferredItem<Item> RAW_THORIANITE = ITEMS.registerSimpleItem("raw_thorianite",
            new Item.Properties());
    public static final DeferredItem<Item> THORIANITE = ITEMS.registerSimpleItem("thorianite",
            new Item.Properties());
    public static final DeferredItem<BlockItem> THORIANITE_BLOCK_ORE = ITEMS.registerSimpleBlockItem("thorianite_block_ore", ModBlocks.THORIANITE_BLOCK_ORE);
    public static final DeferredItem<BlockItem> THORIANITE_BLOCK = ITEMS.registerSimpleBlockItem("thorianite_block", ModBlocks.THORIANITE_BLOCK);


    public static final DeferredItem<Item> RAW_BRANNERITE = ITEMS.registerSimpleItem("raw_brannerite",
            new Item.Properties());
    public static final DeferredItem<Item> BRANNERITE = ITEMS.registerSimpleItem("brannerite",
            new Item.Properties());
    public static final DeferredItem<BlockItem> BRANNERITE_BLOCK_ORE = ITEMS.registerSimpleBlockItem("brannerite_block_ore", ModBlocks.BRANNERITE_BLOCK_ORE);
    public static final DeferredItem<BlockItem> BRANNERITE_BLOCK = ITEMS.registerSimpleBlockItem("brannerite_block", ModBlocks.BRANNERITE_BLOCK);

    public static final DeferredItem<Item> BAYAN_SPAWN_EGG = ITEMS.register("bayan_spawn_egg",
        () -> new SpawnEggItem(ModEntities.BAYAN.get(), 0xFFAAFFFF, 0xFF000044, new Item.Properties()));
    public static final DeferredItem<Item> WHITE_HAND_SPAWN_EGG = ITEMS.register("white_hand_spawn_egg",
            () -> new SpawnEggItem(ModEntities.WHITE_HAND.get(), 0xFFFFFFFF, 0xFF000000, new Item.Properties()));

    public static void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == ModTabs.MAIN_TAB.getKey()) {
            for (DeferredHolder<Item, ? extends Item> item : ITEMS.getEntries()) {
                event.accept(item.get());
            }

            return;
        }

        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            for (DeferredHolder<Item, ? extends Item> item : ITEMS.getEntries()) {
                if (item.get() instanceof SpawnEggItem) event.accept(item.get());
            }
        }
    }
}
