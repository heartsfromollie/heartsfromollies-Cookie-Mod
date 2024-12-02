package heartsfromollie.hcm.item;

import heartsfromollie.hcm.HeartsfromolliesCookieMod;
import heartsfromollie.hcm.custom.ModFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WHITE_CHOCOLATE_COOKIE = registerItem("white_chocolate_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.WHITE_CHOCOLATE_COOKIE)));
    public static final Item COCOA_POWDER = registerItem("cocoa_powder", new Item(new FabricItemSettings()));
    public static final Item WHITE_COCOA_POWDER = registerItem("white_cocoa_powder", new Item(new FabricItemSettings()));
    public static final Item WHITE_COCOA_BEANS = registerItem("white_cocoa_beans", new Item(new FabricItemSettings()));
    public static final Item OATMEAL_COOKIE = registerItem("oatmeal_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.OATMEAL_COOKIE)));
    public static final Item PILE_OF_OATS = registerItem("pile_of_oats", new Item(new FabricItemSettings()));
    public static final Item BERRY_JAM = registerItem("berry_jam", new Item(new FabricItemSettings()));
    public static final Item BERRY_JAM_COOKIE = registerItem("berry_jam_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.BERRY_JAM_COOKIE)));
    public static final Item RED_SPRINKLE_COOKIE = registerItem("red_sprinkle_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.SPRINKLE_COOKIE)));
    public static final Item ORANGE_SPRINKLE_COOKIE = registerItem("orange_sprinkle_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.SPRINKLE_COOKIE)));
    public static final Item YELLOW_SPRINKLE_COOKIE = registerItem("yellow_sprinkle_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.SPRINKLE_COOKIE)));
    public static final Item GREEN_SPRINKLE_COOKIE = registerItem("green_sprinkle_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.SPRINKLE_COOKIE)));
    public static final Item BLUE_SPRINKLE_COOKIE = registerItem("blue_sprinkle_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.SPRINKLE_COOKIE)));
    public static final Item PURPLE_SPRINKLE_COOKIE = registerItem("purple_sprinkle_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.SPRINKLE_COOKIE)));
    public static final Item PINK_SPRINKLE_COOKIE = registerItem("pink_sprinkle_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.SPRINKLE_COOKIE)));




    private static void  addItemsToNumNumGroup(FabricItemGroupEntries entries) {
        entries.add(WHITE_CHOCOLATE_COOKIE);
        entries.add(OATMEAL_COOKIE);
        entries.add(BERRY_JAM_COOKIE);
        entries.add(RED_SPRINKLE_COOKIE);
        entries.add(ORANGE_SPRINKLE_COOKIE);
        entries.add(YELLOW_SPRINKLE_COOKIE);
        entries.add(GREEN_SPRINKLE_COOKIE);
        entries.add(BLUE_SPRINKLE_COOKIE);
        entries.add(PURPLE_SPRINKLE_COOKIE);
        entries.add(PINK_SPRINKLE_COOKIE);
    }

    private static void  addItemsToNaturalBlocksGroup(FabricItemGroupEntries entries) {
        entries.add(WHITE_COCOA_BEANS);
    }

    private static void  addItemsToIngredientGroup(FabricItemGroupEntries entries) {
        entries.add(COCOA_POWDER);
        entries.add(WHITE_COCOA_POWDER);
        entries.add(PILE_OF_OATS);
        entries.add(BERRY_JAM);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HeartsfromolliesCookieMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        HeartsfromolliesCookieMod.LOGGER.info("Registering Mod Items for" + HeartsfromolliesCookieMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToNumNumGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalBlocksGroup);
    }
}
