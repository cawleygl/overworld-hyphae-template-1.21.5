package bluesteel42.overworldhyphae.datagen;

import bluesteel42.overworldhyphae.block.ModBlocks;
import bluesteel42.overworldhyphae.entity.ModBoats;
import bluesteel42.overworldhyphae.item.ModItems;
import bluesteel42.overworldhyphae.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_STEMS)
                .add(ModBlocks.MUSHROOM_STEM.asItem())
                .add(ModBlocks.MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.WHITE_MUSHROOM_STEMS)
                .add(ModBlocks.WHITE_MUSHROOM_STEM.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_WHITE_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_WHITE_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.LIGHT_GRAY_MUSHROOM_STEMS)
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_STEM.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_LIGHT_GRAY_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_LIGHT_GRAY_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.GRAY_MUSHROOM_STEMS)
                .add(ModBlocks.GRAY_MUSHROOM_STEM.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_GRAY_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_GRAY_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.BLACK_MUSHROOM_STEMS)
                .add(ModBlocks.BLACK_MUSHROOM_STEM.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_BLACK_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_BLACK_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.BROWN_MUSHROOM_STEMS)
                .add(ModBlocks.BROWN_MUSHROOM_STEM.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_BROWN_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_BROWN_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.RED_MUSHROOM_STEMS)
                .add(ModBlocks.RED_MUSHROOM_STEM.asItem())
                .add(ModBlocks.RED_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_RED_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_RED_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.ORANGE_MUSHROOM_STEMS)
                .add(ModBlocks.ORANGE_MUSHROOM_STEM.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_ORANGE_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_ORANGE_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.YELLOW_MUSHROOM_STEMS)
                .add(ModBlocks.YELLOW_MUSHROOM_STEM.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_YELLOW_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_YELLOW_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.LIME_MUSHROOM_STEMS)
                .add(ModBlocks.LIME_MUSHROOM_STEM.asItem())
                .add(ModBlocks.LIME_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_LIME_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_LIME_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.GREEN_MUSHROOM_STEMS)
                .add(ModBlocks.GREEN_MUSHROOM_STEM.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_GREEN_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_GREEN_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.CYAN_MUSHROOM_STEMS)
                .add(ModBlocks.CYAN_MUSHROOM_STEM.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_CYAN_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_CYAN_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.LIGHT_BLUE_MUSHROOM_STEMS)
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_STEM.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_LIGHT_BLUE_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_LIGHT_BLUE_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.BLUE_MUSHROOM_STEMS)
                .add(ModBlocks.BLUE_MUSHROOM_STEM.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_BLUE_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_BLUE_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.PURPLE_MUSHROOM_STEMS)
                .add(ModBlocks.PURPLE_MUSHROOM_STEM.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_PURPLE_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_PURPLE_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.MAGENTA_MUSHROOM_STEMS)
                .add(ModBlocks.MAGENTA_MUSHROOM_STEM.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_MAGENTA_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_MAGENTA_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.PINK_MUSHROOM_STEMS)
                .add(ModBlocks.PINK_MUSHROOM_STEM.asItem())
                .add(ModBlocks.PINK_MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_PINK_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_PINK_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ModTags.Items.ALL_MUSHROOM_STEMS)
                .addTag(ModTags.Items.MUSHROOM_STEMS)
                .addTag(ModTags.Items.WHITE_MUSHROOM_STEMS)
                .addTag(ModTags.Items.LIGHT_GRAY_MUSHROOM_STEMS)
                .addTag(ModTags.Items.GRAY_MUSHROOM_STEMS)
                .addTag(ModTags.Items.BLACK_MUSHROOM_STEMS)
                .addTag(ModTags.Items.BROWN_MUSHROOM_STEMS)
                .addTag(ModTags.Items.RED_MUSHROOM_STEMS)
                .addTag(ModTags.Items.ORANGE_MUSHROOM_STEMS)
                .addTag(ModTags.Items.YELLOW_MUSHROOM_STEMS)
                .addTag(ModTags.Items.LIME_MUSHROOM_STEMS)
                .addTag(ModTags.Items.GREEN_MUSHROOM_STEMS)
                .addTag(ModTags.Items.CYAN_MUSHROOM_STEMS)
                .addTag(ModTags.Items.LIGHT_BLUE_MUSHROOM_STEMS)
                .addTag(ModTags.Items.BLUE_MUSHROOM_STEMS)
                .addTag(ModTags.Items.PURPLE_MUSHROOM_STEMS)
                .addTag(ModTags.Items.MAGENTA_MUSHROOM_STEMS)
                .addTag(ModTags.Items.PINK_MUSHROOM_STEMS);

        getOrCreateTagBuilder(ItemTags.LOGS).addTag(ModTags.Items.ALL_MUSHROOM_STEMS);

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_PLANKS)
                .add(ModBlocks.MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.RED_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.LIME_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.PINK_MUSHROOM_PLANKS.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_STAIRS)
                .add(ModBlocks.MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.RED_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.LIME_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.PINK_MUSHROOM_STAIRS.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_SLABS)
                .add(ModBlocks.MUSHROOM_SLAB.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.RED_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.LIME_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.PINK_MUSHROOM_SLAB.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_DOORS)
                .add(ModBlocks.MUSHROOM_DOOR.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.RED_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.LIME_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.PINK_MUSHROOM_DOOR.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_TRAPDOORS)
                .add(ModBlocks.MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.RED_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.LIME_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.PINK_MUSHROOM_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_FENCES)
                .add(ModBlocks.MUSHROOM_FENCE.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.RED_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.LIME_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.PINK_MUSHROOM_FENCE.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_FENCE_GATES)
                .add(ModBlocks.MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.RED_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.LIME_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.PINK_MUSHROOM_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_BUTTONS)
                .add(ModBlocks.MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.RED_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.LIME_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.PINK_MUSHROOM_BUTTON.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_PRESSURE_PLATES)
                .add(ModBlocks.MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.RED_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.LIME_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.PINK_MUSHROOM_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_SIGNS)
                .add(ModItems.MUSHROOM_SIGN)
                .add(ModItems.WHITE_MUSHROOM_SIGN)
                .add(ModItems.LIGHT_GRAY_MUSHROOM_SIGN)
                .add(ModItems.GRAY_MUSHROOM_SIGN)
                .add(ModItems.BLACK_MUSHROOM_SIGN)
                .add(ModItems.BROWN_MUSHROOM_SIGN)
                .add(ModItems.RED_MUSHROOM_SIGN)
                .add(ModItems.ORANGE_MUSHROOM_SIGN)
                .add(ModItems.YELLOW_MUSHROOM_SIGN)
                .add(ModItems.LIME_MUSHROOM_SIGN)
                .add(ModItems.GREEN_MUSHROOM_SIGN)
                .add(ModItems.CYAN_MUSHROOM_SIGN)
                .add(ModItems.LIGHT_BLUE_MUSHROOM_SIGN)
                .add(ModItems.BLUE_MUSHROOM_SIGN)
                .add(ModItems.PURPLE_MUSHROOM_SIGN)
                .add(ModItems.MAGENTA_MUSHROOM_SIGN)
                .add(ModItems.PINK_MUSHROOM_SIGN);

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_HANGING_SIGNS)
                .add(ModItems.MUSHROOM_HANGING_SIGN)
                .add(ModItems.WHITE_MUSHROOM_HANGING_SIGN)
                .add(ModItems.LIGHT_GRAY_MUSHROOM_HANGING_SIGN)
                .add(ModItems.GRAY_MUSHROOM_HANGING_SIGN)
                .add(ModItems.BLACK_MUSHROOM_HANGING_SIGN)
                .add(ModItems.BROWN_MUSHROOM_HANGING_SIGN)
                .add(ModItems.RED_MUSHROOM_HANGING_SIGN)
                .add(ModItems.ORANGE_MUSHROOM_HANGING_SIGN)
                .add(ModItems.YELLOW_MUSHROOM_HANGING_SIGN)
                .add(ModItems.LIME_MUSHROOM_HANGING_SIGN)
                .add(ModItems.GREEN_MUSHROOM_HANGING_SIGN)
                .add(ModItems.CYAN_MUSHROOM_HANGING_SIGN)
                .add(ModItems.LIGHT_BLUE_MUSHROOM_HANGING_SIGN)
                .add(ModItems.BLUE_MUSHROOM_HANGING_SIGN)
                .add(ModItems.PURPLE_MUSHROOM_HANGING_SIGN)
                .add(ModItems.MAGENTA_MUSHROOM_HANGING_SIGN)
                .add(ModItems.PINK_MUSHROOM_HANGING_SIGN);

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_BOATS)
                .add(ModBoats.MUSHROOM_BOAT.asItem())
                .add(ModBoats.WHITE_MUSHROOM_BOAT.asItem())
                .add(ModBoats.LIGHT_GRAY_MUSHROOM_BOAT.asItem())
                .add(ModBoats.GRAY_MUSHROOM_BOAT.asItem())
                .add(ModBoats.BLACK_MUSHROOM_BOAT.asItem())
                .add(ModBoats.BROWN_MUSHROOM_BOAT.asItem())
                .add(ModBoats.RED_MUSHROOM_BOAT.asItem())
                .add(ModBoats.ORANGE_MUSHROOM_BOAT.asItem())
                .add(ModBoats.YELLOW_MUSHROOM_BOAT.asItem())
                .add(ModBoats.LIME_MUSHROOM_BOAT.asItem())
                .add(ModBoats.GREEN_MUSHROOM_BOAT.asItem())
                .add(ModBoats.CYAN_MUSHROOM_BOAT.asItem())
                .add(ModBoats.LIGHT_BLUE_MUSHROOM_BOAT.asItem())
                .add(ModBoats.BLUE_MUSHROOM_BOAT.asItem())
                .add(ModBoats.PURPLE_MUSHROOM_BOAT.asItem())
                .add(ModBoats.MAGENTA_MUSHROOM_BOAT.asItem())
                .add(ModBoats.PINK_MUSHROOM_BOAT.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_CHEST_BOATS)
                .add(ModBoats.MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.WHITE_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.LIGHT_GRAY_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.GRAY_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.BLACK_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.BROWN_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.RED_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.ORANGE_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.YELLOW_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.LIME_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.GREEN_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.CYAN_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.LIGHT_BLUE_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.BLUE_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.PURPLE_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.MAGENTA_MUSHROOM_CHEST_BOAT.asItem())
                .add(ModBoats.PINK_MUSHROOM_CHEST_BOAT.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS).addTag(ModTags.Items.MUSHROOM_PLANKS);
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS).addTag(ModTags.Items.MUSHROOM_STAIRS);
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS).addTag(ModTags.Items.MUSHROOM_SLABS);
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS).addTag(ModTags.Items.MUSHROOM_DOORS);
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS).addTag(ModTags.Items.MUSHROOM_TRAPDOORS);
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES).addTag(ModTags.Items.MUSHROOM_FENCES);
        getOrCreateTagBuilder(ItemTags.FENCE_GATES).addTag(ModTags.Items.MUSHROOM_FENCE_GATES);
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS).addTag(ModTags.Items.MUSHROOM_BUTTONS);
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES).addTag(ModTags.Items.MUSHROOM_PRESSURE_PLATES);
        getOrCreateTagBuilder(ItemTags.SIGNS).addTag(ModTags.Items.MUSHROOM_SIGNS);
        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS).addTag(ModTags.Items.MUSHROOM_HANGING_SIGNS);

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                .addTag(ModTags.Items.ALL_MUSHROOM_STEMS)
                .addTag(ModTags.Items.MUSHROOM_PLANKS)
                .addTag(ModTags.Items.MUSHROOM_STAIRS)
                .addTag(ModTags.Items.MUSHROOM_SLABS)
                .addTag(ModTags.Items.MUSHROOM_DOORS)
                .addTag(ModTags.Items.MUSHROOM_TRAPDOORS)
                .addTag(ModTags.Items.MUSHROOM_FENCES)
                .addTag(ModTags.Items.MUSHROOM_FENCE_GATES)
                .addTag(ModTags.Items.MUSHROOM_BUTTONS)
                .addTag(ModTags.Items.MUSHROOM_PRESSURE_PLATES)
                .addTag(ModTags.Items.MUSHROOM_SIGNS)
                .addTag(ModTags.Items.MUSHROOM_HANGING_SIGNS);
    }
}
