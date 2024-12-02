package heartsfromollie.hcm.item;

import heartsfromollie.hcm.HeartsfromolliesCookieMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup HCM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HeartsfromolliesCookieMod.MOD_ID, "hcm"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.hcm"))
                    .icon(() -> new ItemStack(ModItems.BERRY_JAM_COOKIE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COCOA_POWDER);
                        entries.add(ModItems.WHITE_COCOA_POWDER);
                        entries.add(ModItems.WHITE_CHOCOLATE_COOKIE);
                        entries.add(ModItems.WHITE_COCOA_BEANS);
                        entries.add(ModItems.PILE_OF_OATS);
                        entries.add(ModItems.OATMEAL_COOKIE);
                        entries.add(ModItems.BERRY_JAM);
                        entries.add(ModItems.BERRY_JAM_COOKIE);
                        entries.add(ModItems.RED_SPRINKLE_COOKIE);
                        entries.add(ModItems.ORANGE_SPRINKLE_COOKIE);
                        entries.add(ModItems.YELLOW_SPRINKLE_COOKIE);
                        entries.add(ModItems.GREEN_SPRINKLE_COOKIE);
                        entries.add(ModItems.BLUE_SPRINKLE_COOKIE);
                        entries.add(ModItems.PURPLE_SPRINKLE_COOKIE);
                        entries.add(ModItems.PINK_SPRINKLE_COOKIE);




                    }).build());


    public static void registerItemGroups() {
        HeartsfromolliesCookieMod.LOGGER.info("Registering Item Groups for " + HeartsfromolliesCookieMod.MOD_ID);
    }
}