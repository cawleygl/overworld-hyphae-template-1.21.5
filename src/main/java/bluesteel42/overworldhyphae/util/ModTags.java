package bluesteel42.overworldhyphae.util;

import bluesteel42.overworldhyphae.OverworldHyphae;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ALL_MUSHROOM_STEMS = createTag("all_mushroom_stems");

        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(OverworldHyphae.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ALL_MUSHROOM_STEMS = createTag("all_mushroom_stems");
        public static final TagKey<Item> MUSHROOM_STEMS = createTag("mushroom_stems");
        public static final TagKey<Item> WHITE_MUSHROOM_STEMS = createTag("white_mushroom_stems");
        public static final TagKey<Item> LIGHT_GRAY_MUSHROOM_STEMS = createTag("light_gray_mushroom_stems");
        public static final TagKey<Item> GRAY_MUSHROOM_STEMS = createTag("gray_mushroom_stems");
        public static final TagKey<Item> BLACK_MUSHROOM_STEMS = createTag("black_mushroom_stems");
        public static final TagKey<Item> BROWN_MUSHROOM_STEMS = createTag("brown_mushroom_stems");
        public static final TagKey<Item> RED_MUSHROOM_STEMS = createTag("red_mushroom_stems");
        public static final TagKey<Item> ORANGE_MUSHROOM_STEMS = createTag("orange_mushroom_stems");
        public static final TagKey<Item> YELLOW_MUSHROOM_STEMS = createTag("yellow_mushroom_stems");
        public static final TagKey<Item> LIME_MUSHROOM_STEMS = createTag("lime_mushroom_stems");
        public static final TagKey<Item> GREEN_MUSHROOM_STEMS = createTag("green_mushroom_stems");
        public static final TagKey<Item> CYAN_MUSHROOM_STEMS = createTag("cyan_mushroom_stems");
        public static final TagKey<Item> LIGHT_BLUE_MUSHROOM_STEMS = createTag("light_blue_mushroom_stems");
        public static final TagKey<Item> BLUE_MUSHROOM_STEMS = createTag("blue_mushroom_stems");
        public static final TagKey<Item> PURPLE_MUSHROOM_STEMS = createTag("purple_mushroom_stems");
        public static final TagKey<Item> MAGENTA_MUSHROOM_STEMS = createTag("magenta_mushroom_stems");
        public static final TagKey<Item> PINK_MUSHROOM_STEMS = createTag("pink_mushroom_stems");

        public static final TagKey<Item> MUSHROOM_PLANKS = createTag("mushroom_planks");
        public static final TagKey<Item> MUSHROOM_SLABS = createTag("mushroom_slabs");
        public static final TagKey<Item> MUSHROOM_PRESSURE_PLATES = createTag("mushroom_pressure_plates");
        public static final TagKey<Item> MUSHROOM_FENCES = createTag("mushroom_fences");
        public static final TagKey<Item> MUSHROOM_TRAPDOORS = createTag("mushroom_trapdoors");
        public static final TagKey<Item> MUSHROOM_FENCE_GATES = createTag("mushroom_fence_gates");
        public static final TagKey<Item> MUSHROOM_STAIRS = createTag("mushroom_stairs");
        public static final TagKey<Item> MUSHROOM_BUTTONS = createTag("mushroom_buttons");
        public static final TagKey<Item> MUSHROOM_DOORS = createTag("mushroom_doors");
        public static final TagKey<Item> MUSHROOM_SIGNS = createTag("mushroom_signs");
        public static final TagKey<Item> MUSHROOM_HANGING_SIGNS = createTag("mushroom_hanging_signs");
        public static final TagKey<Item> MUSHROOM_BOATS = createTag("mushroom_boats");
        public static final TagKey<Item> MUSHROOM_CHEST_BOATS = createTag("mushroom_chest_boats");

        public static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(OverworldHyphae.MOD_ID, name));
        }
    }
}
