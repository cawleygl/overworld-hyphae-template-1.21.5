package bluesteel42.overworldhyphae.item;

import bluesteel42.overworldhyphae.OverworldHyphae;
import bluesteel42.overworldhyphae.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item MUSHROOM_SIGN = registerSignItem(OverworldHyphae.plainDyeColor, ModBlocks.MUSHROOM_STANDING_SIGN, ModBlocks.MUSHROOM_WALL_SIGN);
    public static final Item MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.plainDyeColor, ModBlocks.MUSHROOM_HANGING_SIGN, ModBlocks.MUSHROOM_WALL_HANGING_SIGN);

    public static final Item WHITE_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.whiteDyeColor, ModBlocks.WHITE_MUSHROOM_STANDING_SIGN, ModBlocks.WHITE_MUSHROOM_WALL_SIGN);
    public static final Item WHITE_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.whiteDyeColor, ModBlocks.WHITE_MUSHROOM_HANGING_SIGN, ModBlocks.WHITE_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item LIGHT_GRAY_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.lightGrayDyeColor, ModBlocks.LIGHT_GRAY_MUSHROOM_STANDING_SIGN, ModBlocks.LIGHT_GRAY_MUSHROOM_WALL_SIGN);
    public static final Item LIGHT_GRAY_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.lightGrayDyeColor, ModBlocks.LIGHT_GRAY_MUSHROOM_HANGING_SIGN, ModBlocks.LIGHT_GRAY_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item GRAY_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.grayDyeColor, ModBlocks.GRAY_MUSHROOM_STANDING_SIGN, ModBlocks.GRAY_MUSHROOM_WALL_SIGN);
    public static final Item GRAY_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.grayDyeColor, ModBlocks.GRAY_MUSHROOM_HANGING_SIGN, ModBlocks.GRAY_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item BLACK_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.blackDyeColor, ModBlocks.BLACK_MUSHROOM_STANDING_SIGN, ModBlocks.BLACK_MUSHROOM_WALL_SIGN);
    public static final Item BLACK_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.blackDyeColor, ModBlocks.BLACK_MUSHROOM_HANGING_SIGN, ModBlocks.BLACK_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item BROWN_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.brownDyeColor, ModBlocks.BROWN_MUSHROOM_STANDING_SIGN, ModBlocks.BROWN_MUSHROOM_WALL_SIGN);
    public static final Item BROWN_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.brownDyeColor, ModBlocks.BROWN_MUSHROOM_HANGING_SIGN, ModBlocks.BROWN_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item RED_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.redDyeColor, ModBlocks.RED_MUSHROOM_STANDING_SIGN, ModBlocks.RED_MUSHROOM_WALL_SIGN);
    public static final Item RED_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.redDyeColor, ModBlocks.RED_MUSHROOM_HANGING_SIGN, ModBlocks.RED_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item ORANGE_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.orangeDyeColor, ModBlocks.ORANGE_MUSHROOM_STANDING_SIGN, ModBlocks.ORANGE_MUSHROOM_WALL_SIGN);
    public static final Item ORANGE_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.orangeDyeColor, ModBlocks.ORANGE_MUSHROOM_HANGING_SIGN, ModBlocks.ORANGE_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item YELLOW_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.yellowDyeColor, ModBlocks.YELLOW_MUSHROOM_STANDING_SIGN, ModBlocks.YELLOW_MUSHROOM_WALL_SIGN);
    public static final Item YELLOW_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.yellowDyeColor, ModBlocks.YELLOW_MUSHROOM_HANGING_SIGN, ModBlocks.YELLOW_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item LIME_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.limeDyeColor, ModBlocks.LIME_MUSHROOM_STANDING_SIGN, ModBlocks.LIME_MUSHROOM_WALL_SIGN);
    public static final Item LIME_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.limeDyeColor, ModBlocks.LIME_MUSHROOM_HANGING_SIGN, ModBlocks.LIME_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item GREEN_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.greenDyeColor, ModBlocks.GREEN_MUSHROOM_STANDING_SIGN, ModBlocks.GREEN_MUSHROOM_WALL_SIGN);
    public static final Item GREEN_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.greenDyeColor, ModBlocks.GREEN_MUSHROOM_HANGING_SIGN, ModBlocks.GREEN_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item CYAN_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.cyanDyeColor, ModBlocks.CYAN_MUSHROOM_STANDING_SIGN, ModBlocks.CYAN_MUSHROOM_WALL_SIGN);
    public static final Item CYAN_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.cyanDyeColor, ModBlocks.CYAN_MUSHROOM_HANGING_SIGN, ModBlocks.CYAN_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item LIGHT_BLUE_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.lightBlueDyeColor, ModBlocks.LIGHT_BLUE_MUSHROOM_STANDING_SIGN, ModBlocks.LIGHT_BLUE_MUSHROOM_WALL_SIGN);
    public static final Item LIGHT_BLUE_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.lightBlueDyeColor, ModBlocks.LIGHT_BLUE_MUSHROOM_HANGING_SIGN, ModBlocks.LIGHT_BLUE_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item BLUE_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.blueDyeColor, ModBlocks.BLUE_MUSHROOM_STANDING_SIGN, ModBlocks.BLUE_MUSHROOM_WALL_SIGN);
    public static final Item BLUE_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.blueDyeColor, ModBlocks.BLUE_MUSHROOM_HANGING_SIGN, ModBlocks.BLUE_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item PURPLE_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.purpleDyeColor, ModBlocks.PURPLE_MUSHROOM_STANDING_SIGN, ModBlocks.PURPLE_MUSHROOM_WALL_SIGN);
    public static final Item PURPLE_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.purpleDyeColor, ModBlocks.PURPLE_MUSHROOM_HANGING_SIGN, ModBlocks.PURPLE_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item MAGENTA_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.magentaDyeColor, ModBlocks.MAGENTA_MUSHROOM_STANDING_SIGN, ModBlocks.MAGENTA_MUSHROOM_WALL_SIGN);
    public static final Item MAGENTA_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.magentaDyeColor, ModBlocks.MAGENTA_MUSHROOM_HANGING_SIGN, ModBlocks.MAGENTA_MUSHROOM_WALL_HANGING_SIGN);

    public static final Item PINK_MUSHROOM_SIGN = registerSignItem(OverworldHyphae.pinkDyeColor, ModBlocks.PINK_MUSHROOM_STANDING_SIGN, ModBlocks.PINK_MUSHROOM_WALL_SIGN);
    public static final Item PINK_MUSHROOM_HANGING_SIGN = registerHangingSignItem(OverworldHyphae.pinkDyeColor, ModBlocks.PINK_MUSHROOM_HANGING_SIGN, ModBlocks.PINK_MUSHROOM_WALL_HANGING_SIGN);

    public static Item registerSignItem(String dyeColor, Block standingSignBlock, Block wallSignBlock) {
        String path = dyeColor + "mushroom_sign";

        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverworldHyphae.MOD_ID, path));
        final Item item = new SignItem(
                standingSignBlock,
                wallSignBlock,
                new Item.Settings().registryKey(registryKey).maxCount(16));

        return Registry.register(Registries.ITEM, registryKey.getValue(), item);
    }

    public static Item registerHangingSignItem(String dyeColor, Block hangingSignBlock, Block wallHangingSignBlock) {
        String path = dyeColor + "mushroom_hanging_sign";

        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverworldHyphae.MOD_ID, path));
        final Item item = new HangingSignItem(
                hangingSignBlock,
                wallHangingSignBlock,
                new Item.Settings().registryKey(registryKey).maxCount(16));

        return Registry.register(Registries.ITEM, registryKey.getValue(), item);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL)
                .register((itemGroup) -> {
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.WHITE_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.WHITE_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.LIGHT_GRAY_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.LIGHT_GRAY_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.GRAY_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.GRAY_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.BLACK_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.BLACK_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.BROWN_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.BROWN_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.RED_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.RED_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.ORANGE_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.ORANGE_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.YELLOW_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.YELLOW_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.LIME_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.LIME_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.GREEN_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.GREEN_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.CYAN_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.CYAN_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.LIGHT_BLUE_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.LIGHT_BLUE_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.BLUE_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.BLUE_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.PURPLE_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.PURPLE_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.MAGENTA_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.MAGENTA_MUSHROOM_HANGING_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.PINK_MUSHROOM_SIGN);
                    itemGroup.addBefore(Items.CRIMSON_SIGN, ModItems.PINK_MUSHROOM_HANGING_SIGN);
                });
    }
}
