package bluesteel42.overworldhyphae.entity;

import bluesteel42.overworldhyphae.OverworldHyphae;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBoats {
    public static final Identifier MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.plainDyeColor + "mushroom");
    public static final Identifier WHITE_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.whiteDyeColor + "mushroom");
    public static final Identifier LIGHT_GRAY_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.lightGrayDyeColor + "mushroom");
    public static final Identifier GRAY_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.grayDyeColor + "mushroom");
    public static final Identifier BLACK_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.blackDyeColor + "mushroom");
    public static final Identifier BROWN_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.brownDyeColor + "mushroom");
    public static final Identifier RED_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.redDyeColor + "mushroom");
    public static final Identifier ORANGE_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.orangeDyeColor + "mushroom");
    public static final Identifier YELLOW_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.yellowDyeColor + "mushroom");
    public static final Identifier LIME_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.limeDyeColor + "mushroom");
    public static final Identifier GREEN_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.greenDyeColor + "mushroom");
    public static final Identifier CYAN_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.cyanDyeColor + "mushroom");
    public static final Identifier LIGHT_BLUE_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.lightBlueDyeColor + "mushroom");
    public static final Identifier BLUE_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.blueDyeColor + "mushroom");
    public static final Identifier PURPLE_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.purpleDyeColor + "mushroom");
    public static final Identifier MAGENTA_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.magentaDyeColor + "mushroom");
    public static final Identifier PINK_MUSHROOM_BOATS_ID = Identifier.of(OverworldHyphae.MOD_ID, OverworldHyphae.pinkDyeColor + "mushroom");

    public static final Item MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.plainDyeColor, ModBoats.MUSHROOM_BOATS_ID, false, false);
    public static final Item MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.plainDyeColor, ModBoats.MUSHROOM_BOATS_ID, true, false);

    public static final Item WHITE_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.whiteDyeColor, ModBoats.WHITE_MUSHROOM_BOATS_ID, false, false);
    public static final Item WHITE_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.whiteDyeColor, ModBoats.WHITE_MUSHROOM_BOATS_ID, true, false);

    public static final Item LIGHT_GRAY_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.lightGrayDyeColor, ModBoats.LIGHT_GRAY_MUSHROOM_BOATS_ID, false, false);
    public static final Item LIGHT_GRAY_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.lightGrayDyeColor, ModBoats.LIGHT_GRAY_MUSHROOM_BOATS_ID, true, false);

    public static final Item GRAY_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.grayDyeColor, ModBoats.GRAY_MUSHROOM_BOATS_ID, false, false);
    public static final Item GRAY_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.grayDyeColor, ModBoats.GRAY_MUSHROOM_BOATS_ID, true, false);

    public static final Item BLACK_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.blackDyeColor, ModBoats.BLACK_MUSHROOM_BOATS_ID, false, false);
    public static final Item BLACK_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.blackDyeColor, ModBoats.BLACK_MUSHROOM_BOATS_ID, true, false);

    public static final Item BROWN_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.brownDyeColor, ModBoats.BROWN_MUSHROOM_BOATS_ID, false, false);
    public static final Item BROWN_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.brownDyeColor, ModBoats.BROWN_MUSHROOM_BOATS_ID, true, false);

    public static final Item RED_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.redDyeColor, ModBoats.RED_MUSHROOM_BOATS_ID, false, false);
    public static final Item RED_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.redDyeColor, ModBoats.RED_MUSHROOM_BOATS_ID, true, false);

    public static final Item ORANGE_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.orangeDyeColor, ModBoats.ORANGE_MUSHROOM_BOATS_ID, false, false);
    public static final Item ORANGE_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.orangeDyeColor, ModBoats.ORANGE_MUSHROOM_BOATS_ID, true, false);

    public static final Item YELLOW_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.yellowDyeColor, ModBoats.YELLOW_MUSHROOM_BOATS_ID, false, false);
    public static final Item YELLOW_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.yellowDyeColor, ModBoats.YELLOW_MUSHROOM_BOATS_ID, true, false);

    public static final Item LIME_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.limeDyeColor, ModBoats.LIME_MUSHROOM_BOATS_ID, false, false);
    public static final Item LIME_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.limeDyeColor, ModBoats.LIME_MUSHROOM_BOATS_ID, true, false);

    public static final Item GREEN_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.greenDyeColor, ModBoats.GREEN_MUSHROOM_BOATS_ID, false, false);
    public static final Item GREEN_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.greenDyeColor, ModBoats.GREEN_MUSHROOM_BOATS_ID, true, false);

    public static final Item CYAN_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.cyanDyeColor, ModBoats.CYAN_MUSHROOM_BOATS_ID, false, false);
    public static final Item CYAN_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.cyanDyeColor, ModBoats.CYAN_MUSHROOM_BOATS_ID, true, false);

    public static final Item LIGHT_BLUE_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.lightBlueDyeColor, ModBoats.LIGHT_BLUE_MUSHROOM_BOATS_ID, false, false);
    public static final Item LIGHT_BLUE_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.lightBlueDyeColor, ModBoats.LIGHT_BLUE_MUSHROOM_BOATS_ID, true, false);

    public static final Item BLUE_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.blueDyeColor, ModBoats.BLUE_MUSHROOM_BOATS_ID, false, false);
    public static final Item BLUE_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.blueDyeColor, ModBoats.BLUE_MUSHROOM_BOATS_ID, true, false);

    public static final Item PURPLE_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.purpleDyeColor, ModBoats.PURPLE_MUSHROOM_BOATS_ID, false, false);
    public static final Item PURPLE_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.purpleDyeColor, ModBoats.PURPLE_MUSHROOM_BOATS_ID, true, false);

    public static final Item MAGENTA_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.magentaDyeColor, ModBoats.MAGENTA_MUSHROOM_BOATS_ID, false, false);
    public static final Item MAGENTA_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.magentaDyeColor, ModBoats.MAGENTA_MUSHROOM_BOATS_ID, true, false);

    public static final Item PINK_MUSHROOM_BOAT = registerBoatItem(OverworldHyphae.pinkDyeColor, ModBoats.PINK_MUSHROOM_BOATS_ID, false, false);
    public static final Item PINK_MUSHROOM_CHEST_BOAT = registerBoatItem(OverworldHyphae.pinkDyeColor, ModBoats.PINK_MUSHROOM_BOATS_ID, true, false);

    public static Item registerBoatItem(String dyeColor, Identifier boatId, boolean chest, boolean raft) {
        String path = dyeColor + "mushroom";

        if (chest) {
            path = path + "_chest_boat";
        } else {
            path = path + "_boat";
        }

        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(OverworldHyphae.MOD_ID, path));
        return TerraformBoatItemHelper.registerBoatItem(
                boatId,
                new Item.Settings().maxCount(1).registryKey(registryKey),
                chest,
                raft
        );
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> {
                    itemGroup.addBefore(Items.RAIL, ModBoats.MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.WHITE_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.WHITE_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.LIGHT_GRAY_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.LIGHT_GRAY_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.GRAY_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.GRAY_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.BLACK_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.BLACK_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.BROWN_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.BROWN_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.RED_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.RED_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.ORANGE_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.ORANGE_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.YELLOW_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.YELLOW_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.LIME_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.LIME_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.GREEN_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.GREEN_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.CYAN_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.CYAN_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.LIGHT_BLUE_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.LIGHT_BLUE_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.BLUE_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.BLUE_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.PURPLE_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.PURPLE_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.MAGENTA_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.MAGENTA_MUSHROOM_CHEST_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.PINK_MUSHROOM_BOAT);
                    itemGroup.addBefore(Items.RAIL, ModBoats.PINK_MUSHROOM_CHEST_BOAT);

//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.PINK_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.PINK_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.MAGENTA_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.MAGENTA_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.PURPLE_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.PURPLE_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.BLUE_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.BLUE_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.LIGHT_BLUE_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.LIGHT_BLUE_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.CYAN_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.CYAN_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.GREEN_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.GREEN_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.LIME_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.LIME_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.YELLOW_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.YELLOW_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.ORANGE_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.ORANGE_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.RED_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.RED_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.BROWN_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.BROWN_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.BLACK_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.BLACK_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.GRAY_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.GRAY_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.LIGHT_GRAY_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.LIGHT_GRAY_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.WHITE_MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.WHITE_MUSHROOM_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.MUSHROOM_CHEST_BOAT);
//                    itemGroup.addAfter(Items.BAMBOO_CHEST_RAFT, ModBoats.MUSHROOM_BOAT);
                });
    }
}
