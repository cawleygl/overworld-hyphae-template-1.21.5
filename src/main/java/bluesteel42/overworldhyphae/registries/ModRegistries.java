package bluesteel42.overworldhyphae.registries;

import bluesteel42.overworldhyphae.block.ModBlocks;
import bluesteel42.overworldhyphae.entity.ModBoats;
import bluesteel42.overworldhyphae.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

public class ModRegistries {

    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.MUSHROOM_HYPHAE, ModBlocks.STRIPPED_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.MUSHROOM_STEM, ModBlocks.STRIPPED_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.WHITE_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_WHITE_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.WHITE_MUSHROOM_STEM, ModBlocks.STRIPPED_WHITE_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.LIGHT_GRAY_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_LIGHT_GRAY_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.LIGHT_GRAY_MUSHROOM_STEM, ModBlocks.STRIPPED_LIGHT_GRAY_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.GRAY_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_GRAY_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.GRAY_MUSHROOM_STEM, ModBlocks.STRIPPED_GRAY_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.BLACK_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_BLACK_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.BLACK_MUSHROOM_STEM, ModBlocks.STRIPPED_BLACK_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.BROWN_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_BROWN_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.BROWN_MUSHROOM_STEM, ModBlocks.STRIPPED_BROWN_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.RED_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_RED_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.RED_MUSHROOM_STEM, ModBlocks.STRIPPED_RED_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.ORANGE_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_ORANGE_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.ORANGE_MUSHROOM_STEM, ModBlocks.STRIPPED_ORANGE_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.YELLOW_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_YELLOW_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.YELLOW_MUSHROOM_STEM, ModBlocks.STRIPPED_YELLOW_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.LIME_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_LIME_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.LIME_MUSHROOM_STEM, ModBlocks.STRIPPED_LIME_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.GREEN_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_GREEN_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.GREEN_MUSHROOM_STEM, ModBlocks.STRIPPED_GREEN_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.CYAN_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_CYAN_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.CYAN_MUSHROOM_STEM, ModBlocks.STRIPPED_CYAN_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.LIGHT_BLUE_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_LIGHT_BLUE_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.LIGHT_BLUE_MUSHROOM_STEM, ModBlocks.STRIPPED_LIGHT_BLUE_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.BLUE_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_BLUE_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.BLUE_MUSHROOM_STEM, ModBlocks.STRIPPED_BLUE_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.PURPLE_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_PURPLE_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.PURPLE_MUSHROOM_STEM, ModBlocks.STRIPPED_PURPLE_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.MAGENTA_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_MAGENTA_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.MAGENTA_MUSHROOM_STEM, ModBlocks.STRIPPED_MAGENTA_MUSHROOM_STEM);

        StrippableBlockRegistry.register(ModBlocks.PINK_MUSHROOM_HYPHAE, ModBlocks.STRIPPED_PINK_MUSHROOM_HYPHAE);
        StrippableBlockRegistry.register(ModBlocks.PINK_MUSHROOM_STEM, ModBlocks.STRIPPED_PINK_MUSHROOM_STEM);
    }

    private static final float compostChance = 0.65F;

    public static void registerCompostables() {
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_WHITE_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_WHITE_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.WHITE_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.WHITE_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.WHITE_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.WHITE_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_LIGHT_GRAY_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_LIGHT_GRAY_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.LIGHT_GRAY_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.LIGHT_GRAY_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.LIGHT_GRAY_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.LIGHT_GRAY_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_GRAY_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_GRAY_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.GRAY_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.GRAY_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.GRAY_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.GRAY_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_BLACK_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_BLACK_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.BLACK_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.BLACK_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.BLACK_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.BLACK_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_BROWN_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_BROWN_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.BROWN_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.BROWN_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.BROWN_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.BROWN_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_RED_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_RED_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.RED_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.RED_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.RED_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.RED_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_ORANGE_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_ORANGE_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.ORANGE_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.ORANGE_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.ORANGE_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.ORANGE_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_YELLOW_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_YELLOW_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.YELLOW_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.YELLOW_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.YELLOW_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.YELLOW_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_LIME_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_LIME_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.LIME_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.LIME_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.LIME_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.LIME_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_CYAN_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_CYAN_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.GREEN_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.GREEN_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.GREEN_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.GREEN_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_CYAN_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_CYAN_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.CYAN_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.CYAN_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.CYAN_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.CYAN_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_LIGHT_BLUE_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_LIGHT_BLUE_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.LIGHT_BLUE_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.LIGHT_BLUE_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.LIGHT_BLUE_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.LIGHT_BLUE_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_BLUE_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_BLUE_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.BLUE_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.BLUE_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.BLUE_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.BLUE_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_PURPLE_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_PURPLE_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.PURPLE_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.PURPLE_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.PURPLE_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.PURPLE_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_MAGENTA_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_MAGENTA_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.MAGENTA_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.MAGENTA_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.MAGENTA_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.MAGENTA_MUSHROOM_CHEST_BOAT, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_PINK_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_PINK_MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_TRAPDOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.PINK_MUSHROOM_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModItems.PINK_MUSHROOM_HANGING_SIGN, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.PINK_MUSHROOM_BOAT, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBoats.PINK_MUSHROOM_CHEST_BOAT, compostChance);
    }

    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.WHITE_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.LIGHT_GRAY_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.GRAY_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.BLACK_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.BROWN_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.RED_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.ORANGE_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.YELLOW_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.LIME_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.GREEN_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.CYAN_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.LIGHT_BLUE_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.BLUE_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.PURPLE_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.MAGENTA_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(ModBoats.PINK_MUSHROOM_BOAT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05f));
                });
    }
}
