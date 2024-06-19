package net.datar.tutorialmod.item;

import net.datar.tutorialmod.ExampleMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<Item> SWORD = ITEMS.register("swordofgod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOD_INGOT = ITEMS.register("god_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOD_ORE = ITEMS.register("god_ore",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOD_AXE = ITEMS.register("god_axe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOD_PICKAXE = ITEMS.register("god_pickaxe",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
