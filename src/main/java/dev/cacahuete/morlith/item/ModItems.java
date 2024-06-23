package dev.cacahuete.morlith.item;

import dev.cacahuete.morlith.Morlith;
import dev.cacahuete.morlith.tab.ModTabs;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
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
    public static final DeferredItem<Item> RAW_PENCHBLENDE = ITEMS.registerSimpleItem("raw_penchblende",
            new Item.Properties());
    public static final DeferredItem<Item> PENCHBLENDE = ITEMS.registerSimpleItem("penchblende",
            new Item.Properties());
    public static final DeferredItem<Item> RAW_URANOPHASE = ITEMS.registerSimpleItem("raw_uranophase",
            new Item.Properties());
    public static final DeferredItem<Item> URANOPHASE = ITEMS.registerSimpleItem("uranophase",
            new Item.Properties());
    public static final DeferredItem<Item> RAW_TOBERNITE = ITEMS.registerSimpleItem("raw_tobernite",
            new Item.Properties());
    public static final DeferredItem<Item> TOBERNITE = ITEMS.registerSimpleItem("tobernite",
            new Item.Properties());
    public static final DeferredItem<Item> RAW_AUTUNITE = ITEMS.registerSimpleItem("raw_autunite",
            new Item.Properties());
    public static final DeferredItem<Item> AUTUNITE = ITEMS.registerSimpleItem("autunite",
            new Item.Properties());
    public static final DeferredItem<Item> RAW_THORIUM = ITEMS.registerSimpleItem("raw_thorium",
            new Item.Properties());
    public static final DeferredItem<Item> THORIUM = ITEMS.registerSimpleItem("thorium",
            new Item.Properties());
    public static final DeferredItem<Item> RAW_THORITE = ITEMS.registerSimpleItem("raw_thorite",
            new Item.Properties());
    public static final DeferredItem<Item> THORITE = ITEMS.registerSimpleItem("thorite",
            new Item.Properties());
    public static final DeferredItem<Item> RAW_THORIANITE = ITEMS.registerSimpleItem("raw_thorianite",
            new Item.Properties());
    public static final DeferredItem<Item> THORIANITE = ITEMS.registerSimpleItem("thorianite",
            new Item.Properties());
    public static final DeferredItem<Item> RAW_BRANNERITE = ITEMS.registerSimpleItem("raw_brannerite",
            new Item.Properties());
    public static final DeferredItem<Item> BRANNERITE = ITEMS.registerSimpleItem("brannerite",
            new Item.Properties());

    public static void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() != ModTabs.MAIN_TAB.getKey()) return;

        for (DeferredHolder<Item, ? extends Item> item : ITEMS.getEntries()) {
            event.accept(item.get());
        }
    }

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
