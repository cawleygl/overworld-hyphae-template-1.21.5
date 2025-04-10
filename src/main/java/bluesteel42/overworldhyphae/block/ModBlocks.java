package bluesteel42.overworldhyphae.block;

import bluesteel42.overworldhyphae.OverworldHyphae;
import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import java.util.function.Function;

public class ModBlocks {

    public static final Block MUSHROOM_STEM = registerStem(OverworldHyphae.plainDyeColor, OverworldHyphae.plainMapColor);
    public static final Block MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.plainDyeColor);
    public static final Block STRIPPED_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.plainDyeColor, OverworldHyphae.plainMapColor);
    public static final Block STRIPPED_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.plainDyeColor, OverworldHyphae.plainMapColor);
    public static final Block MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.plainDyeColor, OverworldHyphae.plainMapColor);
    public static final Block MUSHROOM_STAIRS = registerStairs(OverworldHyphae.plainDyeColor, MUSHROOM_PLANKS);
    public static final Block MUSHROOM_SLAB = registerSlab(OverworldHyphae.plainDyeColor, MUSHROOM_PLANKS);
    public static final Block MUSHROOM_BUTTON = registerButton(OverworldHyphae.plainDyeColor);
    public static final Block MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.plainDyeColor, OverworldHyphae.plainMapColor);
    public static final Block MUSHROOM_FENCE = registerFence(OverworldHyphae.plainDyeColor, OverworldHyphae.plainMapColor);
    public static final Block MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.plainDyeColor, OverworldHyphae.plainMapColor);
    public static final Block MUSHROOM_DOOR = registerDoor(OverworldHyphae.plainDyeColor, OverworldHyphae.plainMapColor);
    public static final Block MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.plainDyeColor, OverworldHyphae.plainMapColor);
    public static final Identifier MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.plainDyeColor);
    public static final Identifier MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.plainDyeColor);
    public static final Identifier MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.plainDyeColor);
    public static final Block MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.plainDyeColor, OverworldHyphae.plainMapColor, MUSHROOM_SIGN_TEXTURE);
    public static final Block MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.plainDyeColor, OverworldHyphae.plainMapColor, MUSHROOM_SIGN_TEXTURE, MUSHROOM_STANDING_SIGN);
    public static final Block MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.plainDyeColor, OverworldHyphae.plainMapColor, MUSHROOM_HANGING_SIGN_TEXTURE, MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.plainDyeColor, OverworldHyphae.plainMapColor, MUSHROOM_HANGING_SIGN_TEXTURE, MUSHROOM_HANGING_GUI_SIGN_TEXTURE, MUSHROOM_HANGING_SIGN);
    public static final BlockFamily MUSHROOM_SIGN_FAMILY = registerSignFamily(MUSHROOM_PLANKS, MUSHROOM_STANDING_SIGN, MUSHROOM_WALL_SIGN);
    public static final BlockFamily MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_MUSHROOM_STEM, MUSHROOM_HANGING_SIGN, MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block WHITE_MUSHROOM_STEM = registerStem(OverworldHyphae.whiteDyeColor, OverworldHyphae.whiteMapColor);
    public static final Block WHITE_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.whiteDyeColor);
    public static final Block STRIPPED_WHITE_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.whiteDyeColor, OverworldHyphae.whiteMapColor);
    public static final Block STRIPPED_WHITE_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.whiteDyeColor, OverworldHyphae.whiteMapColor);
    public static final Block WHITE_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.whiteDyeColor, OverworldHyphae.whiteMapColor);
    public static final Block WHITE_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.whiteDyeColor, WHITE_MUSHROOM_PLANKS);
    public static final Block WHITE_MUSHROOM_SLAB = registerSlab(OverworldHyphae.whiteDyeColor, WHITE_MUSHROOM_PLANKS);
    public static final Block WHITE_MUSHROOM_BUTTON = registerButton(OverworldHyphae.whiteDyeColor);
    public static final Block WHITE_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.whiteDyeColor, OverworldHyphae.whiteMapColor);
    public static final Block WHITE_MUSHROOM_FENCE = registerFence(OverworldHyphae.whiteDyeColor, OverworldHyphae.whiteMapColor);
    public static final Block WHITE_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.whiteDyeColor, OverworldHyphae.whiteMapColor);
    public static final Block WHITE_MUSHROOM_DOOR = registerDoor(OverworldHyphae.whiteDyeColor, OverworldHyphae.whiteMapColor);
    public static final Block WHITE_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.whiteDyeColor, OverworldHyphae.whiteMapColor);
    public static final Identifier WHITE_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.whiteDyeColor);
    public static final Identifier WHITE_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.whiteDyeColor);
    public static final Identifier WHITE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.whiteDyeColor);
    public static final Block WHITE_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.whiteDyeColor, OverworldHyphae.whiteMapColor, WHITE_MUSHROOM_SIGN_TEXTURE);
    public static final Block WHITE_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.whiteDyeColor, OverworldHyphae.whiteMapColor, WHITE_MUSHROOM_SIGN_TEXTURE, WHITE_MUSHROOM_STANDING_SIGN);
    public static final Block WHITE_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.whiteDyeColor, OverworldHyphae.whiteMapColor, WHITE_MUSHROOM_HANGING_SIGN_TEXTURE, WHITE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block WHITE_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.whiteDyeColor, OverworldHyphae.whiteMapColor, WHITE_MUSHROOM_HANGING_SIGN_TEXTURE, WHITE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, WHITE_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily WHITE_MUSHROOM_SIGN_FAMILY = registerSignFamily(WHITE_MUSHROOM_PLANKS, WHITE_MUSHROOM_STANDING_SIGN, WHITE_MUSHROOM_WALL_SIGN);
    public static final BlockFamily WHITE_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_WHITE_MUSHROOM_STEM, WHITE_MUSHROOM_HANGING_SIGN, WHITE_MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block LIGHT_GRAY_MUSHROOM_STEM = registerStem(OverworldHyphae.lightGrayDyeColor, OverworldHyphae.lightGrayMapColor);
    public static final Block LIGHT_GRAY_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.lightGrayDyeColor);
    public static final Block STRIPPED_LIGHT_GRAY_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.lightGrayDyeColor, OverworldHyphae.lightGrayMapColor);
    public static final Block STRIPPED_LIGHT_GRAY_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.lightGrayDyeColor, OverworldHyphae.lightGrayMapColor);
    public static final Block LIGHT_GRAY_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.lightGrayDyeColor, OverworldHyphae.lightGrayMapColor);
    public static final Block LIGHT_GRAY_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.lightGrayDyeColor, LIGHT_GRAY_MUSHROOM_PLANKS);
    public static final Block LIGHT_GRAY_MUSHROOM_SLAB = registerSlab(OverworldHyphae.lightGrayDyeColor, LIGHT_GRAY_MUSHROOM_PLANKS);
    public static final Block LIGHT_GRAY_MUSHROOM_BUTTON = registerButton(OverworldHyphae.lightGrayDyeColor);
    public static final Block LIGHT_GRAY_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.lightGrayDyeColor, OverworldHyphae.lightGrayMapColor);
    public static final Block LIGHT_GRAY_MUSHROOM_FENCE = registerFence(OverworldHyphae.lightGrayDyeColor, OverworldHyphae.lightGrayMapColor);
    public static final Block LIGHT_GRAY_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.lightGrayDyeColor, OverworldHyphae.lightGrayMapColor);
    public static final Block LIGHT_GRAY_MUSHROOM_DOOR = registerDoor(OverworldHyphae.lightGrayDyeColor, OverworldHyphae.lightGrayMapColor);
    public static final Block LIGHT_GRAY_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.lightGrayDyeColor, OverworldHyphae.lightGrayMapColor);
    public static final Identifier LIGHT_GRAY_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.lightGrayDyeColor);
    public static final Identifier LIGHT_GRAY_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.lightGrayDyeColor);
    public static final Identifier LIGHT_GRAY_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.lightGrayDyeColor);
    public static final Block LIGHT_GRAY_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.lightGrayDyeColor, OverworldHyphae.lightGrayMapColor, LIGHT_GRAY_MUSHROOM_SIGN_TEXTURE);
    public static final Block LIGHT_GRAY_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.lightGrayDyeColor, OverworldHyphae.lightGrayMapColor, LIGHT_GRAY_MUSHROOM_SIGN_TEXTURE, LIGHT_GRAY_MUSHROOM_STANDING_SIGN);
    public static final Block LIGHT_GRAY_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.lightGrayDyeColor, OverworldHyphae.lightGrayMapColor, LIGHT_GRAY_MUSHROOM_HANGING_SIGN_TEXTURE, LIGHT_GRAY_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block LIGHT_GRAY_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.lightGrayDyeColor, OverworldHyphae.lightGrayMapColor, LIGHT_GRAY_MUSHROOM_HANGING_SIGN_TEXTURE, LIGHT_GRAY_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, LIGHT_GRAY_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily LIGHT_GRAY_MUSHROOM_SIGN_FAMILY = registerSignFamily(LIGHT_GRAY_MUSHROOM_PLANKS, LIGHT_GRAY_MUSHROOM_STANDING_SIGN, LIGHT_GRAY_MUSHROOM_WALL_SIGN);
    public static final BlockFamily LIGHT_GRAY_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_LIGHT_GRAY_MUSHROOM_STEM, LIGHT_GRAY_MUSHROOM_HANGING_SIGN, LIGHT_GRAY_MUSHROOM_WALL_HANGING_SIGN);

    public static final Block GRAY_MUSHROOM_STEM = registerStem(OverworldHyphae.grayDyeColor, OverworldHyphae.grayMapColor);
    public static final Block GRAY_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.grayDyeColor);
    public static final Block STRIPPED_GRAY_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.grayDyeColor, OverworldHyphae.grayMapColor);
    public static final Block STRIPPED_GRAY_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.grayDyeColor, OverworldHyphae.grayMapColor);
    public static final Block GRAY_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.grayDyeColor, OverworldHyphae.grayMapColor);
    public static final Block GRAY_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.grayDyeColor, GRAY_MUSHROOM_PLANKS);
    public static final Block GRAY_MUSHROOM_SLAB = registerSlab(OverworldHyphae.grayDyeColor, GRAY_MUSHROOM_PLANKS);
    public static final Block GRAY_MUSHROOM_BUTTON = registerButton(OverworldHyphae.grayDyeColor);
    public static final Block GRAY_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.grayDyeColor, OverworldHyphae.grayMapColor);
    public static final Block GRAY_MUSHROOM_FENCE = registerFence(OverworldHyphae.grayDyeColor, OverworldHyphae.grayMapColor);
    public static final Block GRAY_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.grayDyeColor, OverworldHyphae.grayMapColor);
    public static final Block GRAY_MUSHROOM_DOOR = registerDoor(OverworldHyphae.grayDyeColor, OverworldHyphae.grayMapColor);
    public static final Block GRAY_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.grayDyeColor, OverworldHyphae.grayMapColor);
    public static final Identifier GRAY_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.grayDyeColor);
    public static final Identifier GRAY_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.grayDyeColor);
    public static final Identifier GRAY_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.grayDyeColor);
    public static final Block GRAY_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.grayDyeColor, OverworldHyphae.grayMapColor, GRAY_MUSHROOM_SIGN_TEXTURE);
    public static final Block GRAY_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.grayDyeColor, OverworldHyphae.grayMapColor, GRAY_MUSHROOM_SIGN_TEXTURE, GRAY_MUSHROOM_STANDING_SIGN);
    public static final Block GRAY_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.grayDyeColor, OverworldHyphae.grayMapColor, GRAY_MUSHROOM_HANGING_SIGN_TEXTURE, GRAY_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block GRAY_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.grayDyeColor, OverworldHyphae.grayMapColor, GRAY_MUSHROOM_HANGING_SIGN_TEXTURE, GRAY_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, GRAY_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily GRAY_MUSHROOM_SIGN_FAMILY = registerSignFamily(GRAY_MUSHROOM_PLANKS, GRAY_MUSHROOM_STANDING_SIGN, GRAY_MUSHROOM_WALL_SIGN);
    public static final BlockFamily GRAY_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_GRAY_MUSHROOM_STEM, GRAY_MUSHROOM_HANGING_SIGN, GRAY_MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block BLACK_MUSHROOM_STEM = registerStem(OverworldHyphae.blackDyeColor, OverworldHyphae.blackMapColor);
    public static final Block BLACK_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.blackDyeColor);
    public static final Block STRIPPED_BLACK_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.blackDyeColor, OverworldHyphae.blackMapColor);
    public static final Block STRIPPED_BLACK_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.blackDyeColor, OverworldHyphae.blackMapColor);
    public static final Block BLACK_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.blackDyeColor, OverworldHyphae.blackMapColor);
    public static final Block BLACK_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.blackDyeColor, BLACK_MUSHROOM_PLANKS);
    public static final Block BLACK_MUSHROOM_SLAB = registerSlab(OverworldHyphae.blackDyeColor, BLACK_MUSHROOM_PLANKS);
    public static final Block BLACK_MUSHROOM_BUTTON = registerButton(OverworldHyphae.blackDyeColor);
    public static final Block BLACK_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.blackDyeColor, OverworldHyphae.blackMapColor);
    public static final Block BLACK_MUSHROOM_FENCE = registerFence(OverworldHyphae.blackDyeColor, OverworldHyphae.blackMapColor);
    public static final Block BLACK_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.blackDyeColor, OverworldHyphae.blackMapColor);
    public static final Block BLACK_MUSHROOM_DOOR = registerDoor(OverworldHyphae.blackDyeColor, OverworldHyphae.blackMapColor);
    public static final Block BLACK_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.blackDyeColor, OverworldHyphae.blackMapColor);
    public static final Identifier BLACK_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.blackDyeColor);
    public static final Identifier BLACK_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.blackDyeColor);
    public static final Identifier BLACK_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.blackDyeColor);
    public static final Block BLACK_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.blackDyeColor, OverworldHyphae.blackMapColor, BLACK_MUSHROOM_SIGN_TEXTURE);
    public static final Block BLACK_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.blackDyeColor, OverworldHyphae.blackMapColor, BLACK_MUSHROOM_SIGN_TEXTURE, BLACK_MUSHROOM_STANDING_SIGN);
    public static final Block BLACK_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.blackDyeColor, OverworldHyphae.blackMapColor, BLACK_MUSHROOM_HANGING_SIGN_TEXTURE, BLACK_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block BLACK_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.blackDyeColor, OverworldHyphae.blackMapColor, BLACK_MUSHROOM_HANGING_SIGN_TEXTURE, BLACK_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, BLACK_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily BLACK_MUSHROOM_SIGN_FAMILY = registerSignFamily(BLACK_MUSHROOM_PLANKS, BLACK_MUSHROOM_STANDING_SIGN, BLACK_MUSHROOM_WALL_SIGN);
    public static final BlockFamily BLACK_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_BLACK_MUSHROOM_STEM, BLACK_MUSHROOM_HANGING_SIGN, BLACK_MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block BROWN_MUSHROOM_STEM = registerStem(OverworldHyphae.brownDyeColor, OverworldHyphae.brownMapColor);
    public static final Block BROWN_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.brownDyeColor);
    public static final Block STRIPPED_BROWN_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.brownDyeColor, OverworldHyphae.brownMapColor);
    public static final Block STRIPPED_BROWN_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.brownDyeColor, OverworldHyphae.brownMapColor);
    public static final Block BROWN_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.brownDyeColor, OverworldHyphae.brownMapColor);
    public static final Block BROWN_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.brownDyeColor, BROWN_MUSHROOM_PLANKS);
    public static final Block BROWN_MUSHROOM_SLAB = registerSlab(OverworldHyphae.brownDyeColor, BROWN_MUSHROOM_PLANKS);
    public static final Block BROWN_MUSHROOM_BUTTON = registerButton(OverworldHyphae.brownDyeColor);
    public static final Block BROWN_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.brownDyeColor, OverworldHyphae.brownMapColor);
    public static final Block BROWN_MUSHROOM_FENCE = registerFence(OverworldHyphae.brownDyeColor, OverworldHyphae.brownMapColor);
    public static final Block BROWN_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.brownDyeColor, OverworldHyphae.brownMapColor);
    public static final Block BROWN_MUSHROOM_DOOR = registerDoor(OverworldHyphae.brownDyeColor, OverworldHyphae.brownMapColor);
    public static final Block BROWN_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.brownDyeColor, OverworldHyphae.brownMapColor);
    public static final Identifier BROWN_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.brownDyeColor);
    public static final Identifier BROWN_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.brownDyeColor);
    public static final Identifier BROWN_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.brownDyeColor);
    public static final Block BROWN_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.brownDyeColor, OverworldHyphae.brownMapColor, BROWN_MUSHROOM_SIGN_TEXTURE);
    public static final Block BROWN_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.brownDyeColor, OverworldHyphae.brownMapColor, BROWN_MUSHROOM_SIGN_TEXTURE, BROWN_MUSHROOM_STANDING_SIGN);
    public static final Block BROWN_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.brownDyeColor, OverworldHyphae.brownMapColor, BROWN_MUSHROOM_HANGING_SIGN_TEXTURE, BROWN_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block BROWN_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.brownDyeColor, OverworldHyphae.brownMapColor, BROWN_MUSHROOM_HANGING_SIGN_TEXTURE, BROWN_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, BROWN_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily BROWN_MUSHROOM_SIGN_FAMILY = registerSignFamily(BROWN_MUSHROOM_PLANKS, BROWN_MUSHROOM_STANDING_SIGN, BROWN_MUSHROOM_WALL_SIGN);
    public static final BlockFamily BROWN_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_BROWN_MUSHROOM_STEM, BROWN_MUSHROOM_HANGING_SIGN, BROWN_MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block RED_MUSHROOM_STEM = registerStem(OverworldHyphae.redDyeColor, OverworldHyphae.redMapColor);
    public static final Block RED_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.redDyeColor);
    public static final Block STRIPPED_RED_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.redDyeColor, OverworldHyphae.redMapColor);
    public static final Block STRIPPED_RED_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.redDyeColor, OverworldHyphae.redMapColor);
    public static final Block RED_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.redDyeColor, OverworldHyphae.redMapColor);
    public static final Block RED_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.redDyeColor, RED_MUSHROOM_PLANKS);
    public static final Block RED_MUSHROOM_SLAB = registerSlab(OverworldHyphae.redDyeColor, RED_MUSHROOM_PLANKS);
    public static final Block RED_MUSHROOM_BUTTON = registerButton(OverworldHyphae.redDyeColor);
    public static final Block RED_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.redDyeColor, OverworldHyphae.redMapColor);
    public static final Block RED_MUSHROOM_FENCE = registerFence(OverworldHyphae.redDyeColor, OverworldHyphae.redMapColor);
    public static final Block RED_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.redDyeColor, OverworldHyphae.redMapColor);
    public static final Block RED_MUSHROOM_DOOR = registerDoor(OverworldHyphae.redDyeColor, OverworldHyphae.redMapColor);
    public static final Block RED_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.redDyeColor, OverworldHyphae.redMapColor);
    public static final Identifier RED_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.redDyeColor);
    public static final Identifier RED_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.redDyeColor);
    public static final Identifier RED_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.redDyeColor);
    public static final Block RED_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.redDyeColor, OverworldHyphae.redMapColor, RED_MUSHROOM_SIGN_TEXTURE);
    public static final Block RED_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.redDyeColor, OverworldHyphae.redMapColor, RED_MUSHROOM_SIGN_TEXTURE, RED_MUSHROOM_STANDING_SIGN);
    public static final Block RED_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.redDyeColor, OverworldHyphae.redMapColor, RED_MUSHROOM_HANGING_SIGN_TEXTURE, RED_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block RED_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.redDyeColor, OverworldHyphae.redMapColor, RED_MUSHROOM_HANGING_SIGN_TEXTURE, RED_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, RED_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily RED_MUSHROOM_SIGN_FAMILY = registerSignFamily(RED_MUSHROOM_PLANKS, RED_MUSHROOM_STANDING_SIGN, RED_MUSHROOM_WALL_SIGN);
    public static final BlockFamily RED_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_RED_MUSHROOM_STEM, RED_MUSHROOM_HANGING_SIGN, RED_MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block ORANGE_MUSHROOM_STEM = registerStem(OverworldHyphae.orangeDyeColor, OverworldHyphae.orangeMapColor);
    public static final Block ORANGE_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.orangeDyeColor);
    public static final Block STRIPPED_ORANGE_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.orangeDyeColor, OverworldHyphae.orangeMapColor);
    public static final Block STRIPPED_ORANGE_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.orangeDyeColor, OverworldHyphae.orangeMapColor);
    public static final Block ORANGE_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.orangeDyeColor, OverworldHyphae.orangeMapColor);
    public static final Block ORANGE_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.orangeDyeColor, ORANGE_MUSHROOM_PLANKS);
    public static final Block ORANGE_MUSHROOM_SLAB = registerSlab(OverworldHyphae.orangeDyeColor, ORANGE_MUSHROOM_PLANKS);
    public static final Block ORANGE_MUSHROOM_BUTTON = registerButton(OverworldHyphae.orangeDyeColor);
    public static final Block ORANGE_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.orangeDyeColor, OverworldHyphae.orangeMapColor);
    public static final Block ORANGE_MUSHROOM_FENCE = registerFence(OverworldHyphae.orangeDyeColor, OverworldHyphae.orangeMapColor);
    public static final Block ORANGE_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.orangeDyeColor, OverworldHyphae.orangeMapColor);
    public static final Block ORANGE_MUSHROOM_DOOR = registerDoor(OverworldHyphae.orangeDyeColor, OverworldHyphae.orangeMapColor);
    public static final Block ORANGE_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.orangeDyeColor, OverworldHyphae.orangeMapColor);
    public static final Identifier ORANGE_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.orangeDyeColor);
    public static final Identifier ORANGE_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.orangeDyeColor);
    public static final Identifier ORANGE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.orangeDyeColor);
    public static final Block ORANGE_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.orangeDyeColor, OverworldHyphae.orangeMapColor, ORANGE_MUSHROOM_SIGN_TEXTURE);
    public static final Block ORANGE_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.orangeDyeColor, OverworldHyphae.orangeMapColor, ORANGE_MUSHROOM_SIGN_TEXTURE, ORANGE_MUSHROOM_STANDING_SIGN);
    public static final Block ORANGE_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.orangeDyeColor, OverworldHyphae.orangeMapColor, ORANGE_MUSHROOM_HANGING_SIGN_TEXTURE, ORANGE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block ORANGE_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.orangeDyeColor, OverworldHyphae.orangeMapColor, ORANGE_MUSHROOM_HANGING_SIGN_TEXTURE, ORANGE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, ORANGE_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily ORANGE_MUSHROOM_SIGN_FAMILY = registerSignFamily(ORANGE_MUSHROOM_PLANKS, ORANGE_MUSHROOM_STANDING_SIGN, ORANGE_MUSHROOM_WALL_SIGN);
    public static final BlockFamily ORANGE_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_ORANGE_MUSHROOM_STEM, ORANGE_MUSHROOM_HANGING_SIGN, ORANGE_MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block YELLOW_MUSHROOM_STEM = registerStem(OverworldHyphae.yellowDyeColor, OverworldHyphae.yellowMapColor);
    public static final Block YELLOW_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.yellowDyeColor);
    public static final Block STRIPPED_YELLOW_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.yellowDyeColor, OverworldHyphae.yellowMapColor);
    public static final Block STRIPPED_YELLOW_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.yellowDyeColor, OverworldHyphae.yellowMapColor);
    public static final Block YELLOW_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.yellowDyeColor, OverworldHyphae.yellowMapColor);
    public static final Block YELLOW_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.yellowDyeColor, YELLOW_MUSHROOM_PLANKS);
    public static final Block YELLOW_MUSHROOM_SLAB = registerSlab(OverworldHyphae.yellowDyeColor, YELLOW_MUSHROOM_PLANKS);
    public static final Block YELLOW_MUSHROOM_BUTTON = registerButton(OverworldHyphae.yellowDyeColor);
    public static final Block YELLOW_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.yellowDyeColor, OverworldHyphae.yellowMapColor);
    public static final Block YELLOW_MUSHROOM_FENCE = registerFence(OverworldHyphae.yellowDyeColor, OverworldHyphae.yellowMapColor);
    public static final Block YELLOW_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.yellowDyeColor, OverworldHyphae.yellowMapColor);
    public static final Block YELLOW_MUSHROOM_DOOR = registerDoor(OverworldHyphae.yellowDyeColor, OverworldHyphae.yellowMapColor);
    public static final Block YELLOW_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.yellowDyeColor, OverworldHyphae.yellowMapColor);
    public static final Identifier YELLOW_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.yellowDyeColor);
    public static final Identifier YELLOW_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.yellowDyeColor);
    public static final Identifier YELLOW_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.yellowDyeColor);
    public static final Block YELLOW_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.yellowDyeColor, OverworldHyphae.yellowMapColor, YELLOW_MUSHROOM_SIGN_TEXTURE);
    public static final Block YELLOW_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.yellowDyeColor, OverworldHyphae.yellowMapColor, YELLOW_MUSHROOM_SIGN_TEXTURE, YELLOW_MUSHROOM_STANDING_SIGN);
    public static final Block YELLOW_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.yellowDyeColor, OverworldHyphae.yellowMapColor, YELLOW_MUSHROOM_HANGING_SIGN_TEXTURE, YELLOW_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block YELLOW_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.yellowDyeColor, OverworldHyphae.yellowMapColor, YELLOW_MUSHROOM_HANGING_SIGN_TEXTURE, YELLOW_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, YELLOW_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily YELLOW_MUSHROOM_SIGN_FAMILY = registerSignFamily(YELLOW_MUSHROOM_PLANKS, YELLOW_MUSHROOM_STANDING_SIGN, YELLOW_MUSHROOM_WALL_SIGN);
    public static final BlockFamily YELLOW_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_YELLOW_MUSHROOM_STEM, YELLOW_MUSHROOM_HANGING_SIGN, YELLOW_MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block LIME_MUSHROOM_STEM = registerStem(OverworldHyphae.limeDyeColor, OverworldHyphae.limeMapColor);
    public static final Block LIME_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.limeDyeColor);
    public static final Block STRIPPED_LIME_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.limeDyeColor, OverworldHyphae.limeMapColor);
    public static final Block STRIPPED_LIME_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.limeDyeColor, OverworldHyphae.limeMapColor);
    public static final Block LIME_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.limeDyeColor, OverworldHyphae.limeMapColor);
    public static final Block LIME_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.limeDyeColor, LIME_MUSHROOM_PLANKS);
    public static final Block LIME_MUSHROOM_SLAB = registerSlab(OverworldHyphae.limeDyeColor, LIME_MUSHROOM_PLANKS);
    public static final Block LIME_MUSHROOM_BUTTON = registerButton(OverworldHyphae.limeDyeColor);
    public static final Block LIME_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.limeDyeColor, OverworldHyphae.limeMapColor);
    public static final Block LIME_MUSHROOM_FENCE = registerFence(OverworldHyphae.limeDyeColor, OverworldHyphae.limeMapColor);
    public static final Block LIME_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.limeDyeColor, OverworldHyphae.limeMapColor);
    public static final Block LIME_MUSHROOM_DOOR = registerDoor(OverworldHyphae.limeDyeColor, OverworldHyphae.limeMapColor);
    public static final Block LIME_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.limeDyeColor, OverworldHyphae.limeMapColor);
    public static final Identifier LIME_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.limeDyeColor);
    public static final Identifier LIME_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.limeDyeColor);
    public static final Identifier LIME_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.limeDyeColor);
    public static final Block LIME_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.limeDyeColor, OverworldHyphae.limeMapColor, LIME_MUSHROOM_SIGN_TEXTURE);
    public static final Block LIME_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.limeDyeColor, OverworldHyphae.limeMapColor, LIME_MUSHROOM_SIGN_TEXTURE, LIME_MUSHROOM_STANDING_SIGN);
    public static final Block LIME_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.limeDyeColor, OverworldHyphae.limeMapColor, LIME_MUSHROOM_HANGING_SIGN_TEXTURE, LIME_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block LIME_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.limeDyeColor, OverworldHyphae.limeMapColor, LIME_MUSHROOM_HANGING_SIGN_TEXTURE, LIME_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, LIME_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily LIME_MUSHROOM_SIGN_FAMILY = registerSignFamily(LIME_MUSHROOM_PLANKS, LIME_MUSHROOM_STANDING_SIGN, LIME_MUSHROOM_WALL_SIGN);
    public static final BlockFamily LIME_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_LIME_MUSHROOM_STEM, LIME_MUSHROOM_HANGING_SIGN, LIME_MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block GREEN_MUSHROOM_STEM = registerStem(OverworldHyphae.greenDyeColor, OverworldHyphae.greenMapColor);
    public static final Block GREEN_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.greenDyeColor);
    public static final Block STRIPPED_GREEN_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.greenDyeColor, OverworldHyphae.greenMapColor);
    public static final Block STRIPPED_GREEN_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.greenDyeColor, OverworldHyphae.greenMapColor);
    public static final Block GREEN_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.greenDyeColor, OverworldHyphae.greenMapColor);
    public static final Block GREEN_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.greenDyeColor, GREEN_MUSHROOM_PLANKS);
    public static final Block GREEN_MUSHROOM_SLAB = registerSlab(OverworldHyphae.greenDyeColor, GREEN_MUSHROOM_PLANKS);
    public static final Block GREEN_MUSHROOM_BUTTON = registerButton(OverworldHyphae.greenDyeColor);
    public static final Block GREEN_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.greenDyeColor, OverworldHyphae.greenMapColor);
    public static final Block GREEN_MUSHROOM_FENCE = registerFence(OverworldHyphae.greenDyeColor, OverworldHyphae.greenMapColor);
    public static final Block GREEN_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.greenDyeColor, OverworldHyphae.greenMapColor);
    public static final Block GREEN_MUSHROOM_DOOR = registerDoor(OverworldHyphae.greenDyeColor, OverworldHyphae.greenMapColor);
    public static final Block GREEN_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.greenDyeColor, OverworldHyphae.greenMapColor);
    public static final Identifier GREEN_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.greenDyeColor);
    public static final Identifier GREEN_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.greenDyeColor);
    public static final Identifier GREEN_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.greenDyeColor);
    public static final Block GREEN_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.greenDyeColor, OverworldHyphae.greenMapColor, GREEN_MUSHROOM_SIGN_TEXTURE);
    public static final Block GREEN_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.greenDyeColor, OverworldHyphae.greenMapColor, GREEN_MUSHROOM_SIGN_TEXTURE, GREEN_MUSHROOM_STANDING_SIGN);
    public static final Block GREEN_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.greenDyeColor, OverworldHyphae.greenMapColor, GREEN_MUSHROOM_HANGING_SIGN_TEXTURE, GREEN_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block GREEN_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.greenDyeColor, OverworldHyphae.greenMapColor, GREEN_MUSHROOM_HANGING_SIGN_TEXTURE, GREEN_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, GREEN_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily GREEN_MUSHROOM_SIGN_FAMILY = registerSignFamily(GREEN_MUSHROOM_PLANKS, GREEN_MUSHROOM_STANDING_SIGN, GREEN_MUSHROOM_WALL_SIGN);
    public static final BlockFamily GREEN_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_GREEN_MUSHROOM_STEM, GREEN_MUSHROOM_HANGING_SIGN, GREEN_MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block CYAN_MUSHROOM_STEM = registerStem(OverworldHyphae.cyanDyeColor, OverworldHyphae.cyanMapColor);
    public static final Block CYAN_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.cyanDyeColor);
    public static final Block STRIPPED_CYAN_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.cyanDyeColor, OverworldHyphae.cyanMapColor);
    public static final Block STRIPPED_CYAN_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.cyanDyeColor, OverworldHyphae.cyanMapColor);
    public static final Block CYAN_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.cyanDyeColor, OverworldHyphae.cyanMapColor);
    public static final Block CYAN_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.cyanDyeColor, CYAN_MUSHROOM_PLANKS);
    public static final Block CYAN_MUSHROOM_SLAB = registerSlab(OverworldHyphae.cyanDyeColor, CYAN_MUSHROOM_PLANKS);
    public static final Block CYAN_MUSHROOM_BUTTON = registerButton(OverworldHyphae.cyanDyeColor);
    public static final Block CYAN_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.cyanDyeColor, OverworldHyphae.cyanMapColor);
    public static final Block CYAN_MUSHROOM_FENCE = registerFence(OverworldHyphae.cyanDyeColor, OverworldHyphae.cyanMapColor);
    public static final Block CYAN_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.cyanDyeColor, OverworldHyphae.cyanMapColor);
    public static final Block CYAN_MUSHROOM_DOOR = registerDoor(OverworldHyphae.cyanDyeColor, OverworldHyphae.cyanMapColor);
    public static final Block CYAN_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.cyanDyeColor, OverworldHyphae.cyanMapColor);
    public static final Identifier CYAN_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.cyanDyeColor);
    public static final Identifier CYAN_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.cyanDyeColor);
    public static final Identifier CYAN_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.cyanDyeColor);
    public static final Block CYAN_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.cyanDyeColor, OverworldHyphae.cyanMapColor, CYAN_MUSHROOM_SIGN_TEXTURE);
    public static final Block CYAN_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.cyanDyeColor, OverworldHyphae.cyanMapColor, CYAN_MUSHROOM_SIGN_TEXTURE, CYAN_MUSHROOM_STANDING_SIGN);
    public static final Block CYAN_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.cyanDyeColor, OverworldHyphae.cyanMapColor, CYAN_MUSHROOM_HANGING_SIGN_TEXTURE, CYAN_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block CYAN_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.cyanDyeColor, OverworldHyphae.cyanMapColor, CYAN_MUSHROOM_HANGING_SIGN_TEXTURE, CYAN_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, CYAN_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily CYAN_MUSHROOM_SIGN_FAMILY = registerSignFamily(CYAN_MUSHROOM_PLANKS, CYAN_MUSHROOM_STANDING_SIGN, CYAN_MUSHROOM_WALL_SIGN);
    public static final BlockFamily CYAN_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_CYAN_MUSHROOM_STEM, CYAN_MUSHROOM_HANGING_SIGN, CYAN_MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block LIGHT_BLUE_MUSHROOM_STEM = registerStem(OverworldHyphae.lightBlueDyeColor, OverworldHyphae.lightBlueMapColor);
    public static final Block LIGHT_BLUE_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.lightBlueDyeColor);
    public static final Block STRIPPED_LIGHT_BLUE_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.lightBlueDyeColor, OverworldHyphae.lightBlueMapColor);
    public static final Block STRIPPED_LIGHT_BLUE_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.lightBlueDyeColor, OverworldHyphae.lightBlueMapColor);
    public static final Block LIGHT_BLUE_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.lightBlueDyeColor, OverworldHyphae.lightBlueMapColor);
    public static final Block LIGHT_BLUE_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.lightBlueDyeColor, LIGHT_BLUE_MUSHROOM_PLANKS);
    public static final Block LIGHT_BLUE_MUSHROOM_SLAB = registerSlab(OverworldHyphae.lightBlueDyeColor, LIGHT_BLUE_MUSHROOM_PLANKS);
    public static final Block LIGHT_BLUE_MUSHROOM_BUTTON = registerButton(OverworldHyphae.lightBlueDyeColor);
    public static final Block LIGHT_BLUE_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.lightBlueDyeColor, OverworldHyphae.lightBlueMapColor);
    public static final Block LIGHT_BLUE_MUSHROOM_FENCE = registerFence(OverworldHyphae.lightBlueDyeColor, OverworldHyphae.lightBlueMapColor);
    public static final Block LIGHT_BLUE_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.lightBlueDyeColor, OverworldHyphae.lightBlueMapColor);
    public static final Block LIGHT_BLUE_MUSHROOM_DOOR = registerDoor(OverworldHyphae.lightBlueDyeColor, OverworldHyphae.lightBlueMapColor);
    public static final Block LIGHT_BLUE_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.lightBlueDyeColor, OverworldHyphae.lightBlueMapColor);
    public static final Identifier LIGHT_BLUE_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.lightBlueDyeColor);
    public static final Identifier LIGHT_BLUE_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.lightBlueDyeColor);
    public static final Identifier LIGHT_BLUE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.lightBlueDyeColor);
    public static final Block LIGHT_BLUE_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.lightBlueDyeColor, OverworldHyphae.lightBlueMapColor, LIGHT_BLUE_MUSHROOM_SIGN_TEXTURE);
    public static final Block LIGHT_BLUE_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.lightBlueDyeColor, OverworldHyphae.lightBlueMapColor, LIGHT_BLUE_MUSHROOM_SIGN_TEXTURE, LIGHT_BLUE_MUSHROOM_STANDING_SIGN);
    public static final Block LIGHT_BLUE_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.lightBlueDyeColor, OverworldHyphae.lightBlueMapColor, LIGHT_BLUE_MUSHROOM_HANGING_SIGN_TEXTURE, LIGHT_BLUE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block LIGHT_BLUE_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.lightBlueDyeColor, OverworldHyphae.lightBlueMapColor, LIGHT_BLUE_MUSHROOM_HANGING_SIGN_TEXTURE, LIGHT_BLUE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, LIGHT_BLUE_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily LIGHT_BLUE_MUSHROOM_SIGN_FAMILY = registerSignFamily(LIGHT_BLUE_MUSHROOM_PLANKS, LIGHT_BLUE_MUSHROOM_STANDING_SIGN, LIGHT_BLUE_MUSHROOM_WALL_SIGN);
    public static final BlockFamily LIGHT_BLUE_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_LIGHT_BLUE_MUSHROOM_STEM, LIGHT_BLUE_MUSHROOM_HANGING_SIGN, LIGHT_BLUE_MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block BLUE_MUSHROOM_STEM = registerStem(OverworldHyphae.blueDyeColor, OverworldHyphae.blueMapColor);
    public static final Block BLUE_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.blueDyeColor);
    public static final Block STRIPPED_BLUE_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.blueDyeColor, OverworldHyphae.blueMapColor);
    public static final Block STRIPPED_BLUE_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.blueDyeColor, OverworldHyphae.blueMapColor);
    public static final Block BLUE_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.blueDyeColor, OverworldHyphae.blueMapColor);
    public static final Block BLUE_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.blueDyeColor, BLUE_MUSHROOM_PLANKS);
    public static final Block BLUE_MUSHROOM_SLAB = registerSlab(OverworldHyphae.blueDyeColor, BLUE_MUSHROOM_PLANKS);
    public static final Block BLUE_MUSHROOM_BUTTON = registerButton(OverworldHyphae.blueDyeColor);
    public static final Block BLUE_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.blueDyeColor, OverworldHyphae.blueMapColor);
    public static final Block BLUE_MUSHROOM_FENCE = registerFence(OverworldHyphae.blueDyeColor, OverworldHyphae.blueMapColor);
    public static final Block BLUE_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.blueDyeColor, OverworldHyphae.blueMapColor);
    public static final Block BLUE_MUSHROOM_DOOR = registerDoor(OverworldHyphae.blueDyeColor, OverworldHyphae.blueMapColor);
    public static final Block BLUE_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.blueDyeColor, OverworldHyphae.blueMapColor);
    public static final Identifier BLUE_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.blueDyeColor);
    public static final Identifier BLUE_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.blueDyeColor);
    public static final Identifier BLUE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.blueDyeColor);
    public static final Block BLUE_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.blueDyeColor, OverworldHyphae.blueMapColor, BLUE_MUSHROOM_SIGN_TEXTURE);
    public static final Block BLUE_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.blueDyeColor, OverworldHyphae.blueMapColor, BLUE_MUSHROOM_SIGN_TEXTURE, BLUE_MUSHROOM_STANDING_SIGN);
    public static final Block BLUE_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.blueDyeColor, OverworldHyphae.blueMapColor, BLUE_MUSHROOM_HANGING_SIGN_TEXTURE, BLUE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block BLUE_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.blueDyeColor, OverworldHyphae.blueMapColor, BLUE_MUSHROOM_HANGING_SIGN_TEXTURE, BLUE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, BLUE_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily BLUE_MUSHROOM_SIGN_FAMILY = registerSignFamily(BLUE_MUSHROOM_PLANKS, BLUE_MUSHROOM_STANDING_SIGN, BLUE_MUSHROOM_WALL_SIGN);
    public static final BlockFamily BLUE_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_BLUE_MUSHROOM_STEM, BLUE_MUSHROOM_HANGING_SIGN, BLUE_MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block PURPLE_MUSHROOM_STEM = registerStem(OverworldHyphae.purpleDyeColor, OverworldHyphae.purpleMapColor);
    public static final Block PURPLE_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.purpleDyeColor);
    public static final Block STRIPPED_PURPLE_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.purpleDyeColor, OverworldHyphae.purpleMapColor);
    public static final Block STRIPPED_PURPLE_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.purpleDyeColor, OverworldHyphae.purpleMapColor);
    public static final Block PURPLE_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.purpleDyeColor, OverworldHyphae.purpleMapColor);
    public static final Block PURPLE_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.purpleDyeColor, PURPLE_MUSHROOM_PLANKS);
    public static final Block PURPLE_MUSHROOM_SLAB = registerSlab(OverworldHyphae.purpleDyeColor, PURPLE_MUSHROOM_PLANKS);
    public static final Block PURPLE_MUSHROOM_BUTTON = registerButton(OverworldHyphae.purpleDyeColor);
    public static final Block PURPLE_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.purpleDyeColor, OverworldHyphae.purpleMapColor);
    public static final Block PURPLE_MUSHROOM_FENCE = registerFence(OverworldHyphae.purpleDyeColor, OverworldHyphae.purpleMapColor);
    public static final Block PURPLE_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.purpleDyeColor, OverworldHyphae.purpleMapColor);
    public static final Block PURPLE_MUSHROOM_DOOR = registerDoor(OverworldHyphae.purpleDyeColor, OverworldHyphae.purpleMapColor);
    public static final Block PURPLE_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.purpleDyeColor, OverworldHyphae.purpleMapColor);
    public static final Identifier PURPLE_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.purpleDyeColor);
    public static final Identifier PURPLE_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.purpleDyeColor);
    public static final Identifier PURPLE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.purpleDyeColor);
    public static final Block PURPLE_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.purpleDyeColor, OverworldHyphae.purpleMapColor, PURPLE_MUSHROOM_SIGN_TEXTURE);
    public static final Block PURPLE_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.purpleDyeColor, OverworldHyphae.purpleMapColor, PURPLE_MUSHROOM_SIGN_TEXTURE, PURPLE_MUSHROOM_STANDING_SIGN);
    public static final Block PURPLE_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.purpleDyeColor, OverworldHyphae.purpleMapColor, PURPLE_MUSHROOM_HANGING_SIGN_TEXTURE, PURPLE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block PURPLE_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.purpleDyeColor, OverworldHyphae.purpleMapColor, PURPLE_MUSHROOM_HANGING_SIGN_TEXTURE, PURPLE_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, PURPLE_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily PURPLE_MUSHROOM_SIGN_FAMILY = registerSignFamily(PURPLE_MUSHROOM_PLANKS, PURPLE_MUSHROOM_STANDING_SIGN, PURPLE_MUSHROOM_WALL_SIGN);
    public static final BlockFamily PURPLE_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_PURPLE_MUSHROOM_STEM, PURPLE_MUSHROOM_HANGING_SIGN, PURPLE_MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block MAGENTA_MUSHROOM_STEM = registerStem(OverworldHyphae.magentaDyeColor, OverworldHyphae.magentaMapColor);
    public static final Block MAGENTA_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.magentaDyeColor);
    public static final Block STRIPPED_MAGENTA_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.magentaDyeColor, OverworldHyphae.magentaMapColor);
    public static final Block STRIPPED_MAGENTA_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.magentaDyeColor, OverworldHyphae.magentaMapColor);
    public static final Block MAGENTA_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.magentaDyeColor, OverworldHyphae.magentaMapColor);
    public static final Block MAGENTA_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.magentaDyeColor, MAGENTA_MUSHROOM_PLANKS);
    public static final Block MAGENTA_MUSHROOM_SLAB = registerSlab(OverworldHyphae.magentaDyeColor, MAGENTA_MUSHROOM_PLANKS);
    public static final Block MAGENTA_MUSHROOM_BUTTON = registerButton(OverworldHyphae.magentaDyeColor);
    public static final Block MAGENTA_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.magentaDyeColor, OverworldHyphae.magentaMapColor);
    public static final Block MAGENTA_MUSHROOM_FENCE = registerFence(OverworldHyphae.magentaDyeColor, OverworldHyphae.magentaMapColor);
    public static final Block MAGENTA_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.magentaDyeColor, OverworldHyphae.magentaMapColor);
    public static final Block MAGENTA_MUSHROOM_DOOR = registerDoor(OverworldHyphae.magentaDyeColor, OverworldHyphae.magentaMapColor);
    public static final Block MAGENTA_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.magentaDyeColor, OverworldHyphae.magentaMapColor);
    public static final Identifier MAGENTA_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.magentaDyeColor);
    public static final Identifier MAGENTA_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.magentaDyeColor);
    public static final Identifier MAGENTA_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.magentaDyeColor);
    public static final Block MAGENTA_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.magentaDyeColor, OverworldHyphae.magentaMapColor, MAGENTA_MUSHROOM_SIGN_TEXTURE);
    public static final Block MAGENTA_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.magentaDyeColor, OverworldHyphae.magentaMapColor, MAGENTA_MUSHROOM_SIGN_TEXTURE, MAGENTA_MUSHROOM_STANDING_SIGN);
    public static final Block MAGENTA_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.magentaDyeColor, OverworldHyphae.magentaMapColor, MAGENTA_MUSHROOM_HANGING_SIGN_TEXTURE, MAGENTA_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block MAGENTA_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.magentaDyeColor, OverworldHyphae.magentaMapColor, MAGENTA_MUSHROOM_HANGING_SIGN_TEXTURE, MAGENTA_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, MAGENTA_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily MAGENTA_MUSHROOM_SIGN_FAMILY = registerSignFamily(MAGENTA_MUSHROOM_PLANKS, MAGENTA_MUSHROOM_STANDING_SIGN, MAGENTA_MUSHROOM_WALL_SIGN);
    public static final BlockFamily MAGENTA_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_MAGENTA_MUSHROOM_STEM, MAGENTA_MUSHROOM_HANGING_SIGN, MAGENTA_MUSHROOM_WALL_HANGING_SIGN);
    
    public static final Block PINK_MUSHROOM_STEM = registerStem(OverworldHyphae.pinkDyeColor, OverworldHyphae.pinkMapColor);
    public static final Block PINK_MUSHROOM_HYPHAE = registerHyphae(OverworldHyphae.pinkDyeColor);
    public static final Block STRIPPED_PINK_MUSHROOM_HYPHAE = registerStrippedHyphae(OverworldHyphae.pinkDyeColor, OverworldHyphae.pinkMapColor);
    public static final Block STRIPPED_PINK_MUSHROOM_STEM = registerStrippedStem(OverworldHyphae.pinkDyeColor, OverworldHyphae.pinkMapColor);
    public static final Block PINK_MUSHROOM_PLANKS = registerPlanks(OverworldHyphae.pinkDyeColor, OverworldHyphae.pinkMapColor);
    public static final Block PINK_MUSHROOM_STAIRS = registerStairs(OverworldHyphae.pinkDyeColor, PINK_MUSHROOM_PLANKS);
    public static final Block PINK_MUSHROOM_SLAB = registerSlab(OverworldHyphae.pinkDyeColor, PINK_MUSHROOM_PLANKS);
    public static final Block PINK_MUSHROOM_BUTTON = registerButton(OverworldHyphae.pinkDyeColor);
    public static final Block PINK_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(OverworldHyphae.pinkDyeColor, OverworldHyphae.pinkMapColor);
    public static final Block PINK_MUSHROOM_FENCE = registerFence(OverworldHyphae.pinkDyeColor, OverworldHyphae.pinkMapColor);
    public static final Block PINK_MUSHROOM_FENCE_GATE = registerFenceGate(OverworldHyphae.pinkDyeColor, OverworldHyphae.pinkMapColor);
    public static final Block PINK_MUSHROOM_DOOR = registerDoor(OverworldHyphae.pinkDyeColor, OverworldHyphae.pinkMapColor);
    public static final Block PINK_MUSHROOM_TRAPDOOR = registerTrapdoor(OverworldHyphae.pinkDyeColor, OverworldHyphae.pinkMapColor);
    public static final Identifier PINK_MUSHROOM_SIGN_TEXTURE = createSignTextureId(OverworldHyphae.pinkDyeColor);
    public static final Identifier PINK_MUSHROOM_HANGING_SIGN_TEXTURE = createHangingSignTextureId(OverworldHyphae.pinkDyeColor);
    public static final Identifier PINK_MUSHROOM_HANGING_GUI_SIGN_TEXTURE = createHangingSignGUITextureId(OverworldHyphae.pinkDyeColor);
    public static final Block PINK_MUSHROOM_STANDING_SIGN = registerStandingSign(OverworldHyphae.pinkDyeColor, OverworldHyphae.pinkMapColor, PINK_MUSHROOM_SIGN_TEXTURE);
    public static final Block PINK_MUSHROOM_WALL_SIGN = registerWallSign(OverworldHyphae.pinkDyeColor, OverworldHyphae.pinkMapColor, PINK_MUSHROOM_SIGN_TEXTURE, PINK_MUSHROOM_STANDING_SIGN);
    public static final Block PINK_MUSHROOM_HANGING_SIGN = registerHangingSign(OverworldHyphae.pinkDyeColor, OverworldHyphae.pinkMapColor, PINK_MUSHROOM_HANGING_SIGN_TEXTURE, PINK_MUSHROOM_HANGING_GUI_SIGN_TEXTURE);
    public static final Block PINK_MUSHROOM_WALL_HANGING_SIGN = registerWallHangingSign(OverworldHyphae.pinkDyeColor, OverworldHyphae.pinkMapColor, PINK_MUSHROOM_HANGING_SIGN_TEXTURE, PINK_MUSHROOM_HANGING_GUI_SIGN_TEXTURE, PINK_MUSHROOM_HANGING_SIGN);
    public static final BlockFamily PINK_MUSHROOM_SIGN_FAMILY = registerSignFamily(PINK_MUSHROOM_PLANKS, PINK_MUSHROOM_STANDING_SIGN, PINK_MUSHROOM_WALL_SIGN);
    public static final BlockFamily PINK_MUSHROOM_HANGING_SIGN_FAMILY = registerSignFamily(STRIPPED_PINK_MUSHROOM_STEM, PINK_MUSHROOM_HANGING_SIGN, PINK_MUSHROOM_WALL_HANGING_SIGN);

    private static Identifier generateID(String path) {
        return Identifier.of(OverworldHyphae.MOD_ID, path);
    }

    private static RegistryKey<Block> generateRegistryKey(Identifier identifier) {
        return RegistryKey.of(RegistryKeys.BLOCK, identifier);
    }

    private static Block registerBlock(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(OverworldHyphae.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);

        return block;

    }

    private static Block registerStem(String dyeColor, MapColor mapColor) {
        String path = dyeColor + "mushroom_stem";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                PillarBlock::new,
                AbstractBlock.Settings.create()
                        .mapColor(state -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? mapColor : MapColor.WHITE_GRAY)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(OverworldHyphae.blockHardness)
                        .sounds(BlockSoundGroup.WOOD)
                        .burnable());
        Items.register(block);
        return block;
    }

    private static Block registerHyphae(String dyeColor) {
        String path = dyeColor + "mushroom_hyphae";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                PillarBlock::new,
                AbstractBlock.Settings.create()
                        .mapColor(MapColor.WHITE_GRAY)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(OverworldHyphae.blockHardness)
                        .sounds(BlockSoundGroup.WOOD)
                        .burnable());
        Items.register(block);
        return block;
    }

    private static Block registerStrippedStem(String dyeColor, MapColor mapColor) {
        String path = "stripped_" + dyeColor + "mushroom_stem";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                PillarBlock::new,
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(OverworldHyphae.blockHardness)
                        .sounds(BlockSoundGroup.WOOD)
                        .burnable());
        Items.register(block);
        return block;
    }

    private static Block registerStrippedHyphae(String dyeColor, MapColor mapColor) {
        String path = "stripped_" + dyeColor + "mushroom_hyphae";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                PillarBlock::new,
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(OverworldHyphae.blockHardness)
                        .sounds(BlockSoundGroup.WOOD)
                        .burnable());
        Items.register(block);
        return block;
    }

    private static Block registerPlanks(String dyeColor, MapColor mapColor) {
        String path = dyeColor + "mushroom_planks";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)), Block::new, AbstractBlock.Settings.create()
                .mapColor(mapColor)
                .instrument(NoteBlockInstrument.BASS)
                .strength(OverworldHyphae.blockHardness, OverworldHyphae.blockResistence)
                .sounds(BlockSoundGroup.WOOD)
                .burnable());

        Items.register(block);

        return block;

    }

    private static Block registerStairs(String dyeColor, Block plankBlock) {
        String path = dyeColor + "mushroom_stairs";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new StairsBlock(plankBlock.getDefaultState(), settings),
                AbstractBlock.Settings.copy(plankBlock));

        Items.register(block);

        return block;

    }

    private static Block registerSlab(String dyeColor, Block plankBlock) {
        String path = dyeColor + "mushroom_slab";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                SlabBlock::new,
                AbstractBlock.Settings.copy(plankBlock));
        Items.register(block);

        return block;

    }
    private static Block registerButton(String dyeColor) {
        String path = dyeColor + "mushroom_button";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new ButtonBlock(BlockSetType.OAK, 30, settings),
                AbstractBlock.Settings.create()
                        .noCollision()
                        .strength(OverworldHyphae.itemStrength)
                        .pistonBehavior(PistonBehavior.DESTROY));

        Items.register(block);

        return block;

    }

    private static Block registerPressurePlate(String dyeColor, MapColor mapColor) {
        String path = dyeColor + "mushroom_pressure_plate";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new PressurePlateBlock(BlockSetType.OAK, settings),
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .solid()
                        .instrument(NoteBlockInstrument.BASS)
                        .noCollision()
                        .strength(OverworldHyphae.itemStrength)
                        .burnable()
                        .pistonBehavior(PistonBehavior.DESTROY));

        Items.register(block);

        return block;

    }

    private static Block registerFence(String dyeColor, MapColor mapColor) {
        String path = dyeColor + "mushroom_fence";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                FenceBlock::new,
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .solid()
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(OverworldHyphae.blockHardness, OverworldHyphae.blockResistence)
                        .sounds(BlockSoundGroup.WOOD)
                        .burnable());
        Items.register(block);

        return block;

    }

    private static Block registerFenceGate(String dyeColor, MapColor mapColor) {
        String path = dyeColor + "mushroom_fence_gate";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new FenceGateBlock(WoodType.OAK, settings),
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .solid()
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(OverworldHyphae.blockHardness, OverworldHyphae.blockResistence)
                        .burnable());

        Items.register(block);

        return block;

    }

    private static Block registerDoor(String dyeColor, MapColor mapColor) {
        String path = dyeColor + "mushroom_door";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new DoorBlock(BlockSetType.OAK, settings),
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(OverworldHyphae.blockResistence)
                        .nonOpaque()
                        .burnable()
                        .pistonBehavior(PistonBehavior.DESTROY)
        );
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());

        Items.register(block);

        return block;

    }

    private static Block registerTrapdoor(String dyeColor, MapColor mapColor) {
        String path = dyeColor + "mushroom_trapdoor";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new TrapdoorBlock(BlockSetType.OAK, settings),
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(OverworldHyphae.blockResistence)
                        .nonOpaque()
                        .allowsSpawning(Blocks::never)
                        .burnable());
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());

        Items.register(block);

        return block;

    }

    private static Identifier createSignTextureId(String dyeColor) {
        return Identifier.of(OverworldHyphae.MOD_ID,"entity/signs/" + dyeColor + "mushroom");
    }

    private static Identifier createHangingSignTextureId(String dyeColor) {
        return Identifier.of(OverworldHyphae.MOD_ID,"entity/signs/hanging/" + dyeColor + "mushroom");
    }

    private static Identifier createHangingSignGUITextureId(String dyeColor) {
        return Identifier.of(OverworldHyphae.MOD_ID,"textures/gui/hanging_signs/" + dyeColor + "mushroom");
    }

    private static Block registerStandingSign(String dyeColor, MapColor mapColor, Identifier signTextureId) {
        String path = dyeColor + "mushroom_standing_sign";

        return Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new TerraformSignBlock(signTextureId, settings),
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .solid()
                        .instrument(NoteBlockInstrument.BASS)
                        .noCollision()
                        .strength(OverworldHyphae.itemStrength)
                        .sounds(WoodType.OAK.soundType())
                        .burnable()
        );
    }

    private static Block registerWallSign(String dyeColor, MapColor mapColor, Identifier signTextureId, Block standingSignBlock) {
        String path = dyeColor + "mushroom_wall_sign";

        return Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new TerraformWallSignBlock(signTextureId, settings),
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .solid()
                        .instrument(NoteBlockInstrument.BASS)
                        .noCollision()
                        .strength(OverworldHyphae.itemStrength)
                        .sounds(WoodType.OAK.soundType())
                        .burnable()
                        .lootTable(standingSignBlock.getLootTableKey())
                        .overrideTranslationKey(standingSignBlock.getTranslationKey())
        );
    }

    private static Block registerHangingSign(String dyeColor, MapColor mapColor, Identifier hangingSignTextureId, Identifier hangingGUISignTextureId) {
        String path = dyeColor + "mushroom_hanging_sign";

        return Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new TerraformHangingSignBlock(hangingSignTextureId, hangingGUISignTextureId, settings),
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .solid()
                        .instrument(NoteBlockInstrument.BASS)
                        .noCollision()
                        .strength(OverworldHyphae.itemStrength)
                        .sounds(BlockSoundGroup.HANGING_SIGN)
                        .burnable()
        );
    }

    private static Block registerWallHangingSign(String dyeColor, MapColor mapColor, Identifier hangingSignTextureId, Identifier hangingGUISignTextureId, Block hangingSign) {
        String path = dyeColor + "mushroom_hanging_wall_sign";

        return Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new TerraformWallHangingSignBlock(hangingSignTextureId, hangingGUISignTextureId, settings),
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .solid()
                        .instrument(NoteBlockInstrument.BASS)
                        .noCollision()
                        .strength(OverworldHyphae.itemStrength)
                        .sounds(BlockSoundGroup.HANGING_SIGN)
                        .burnable()
                        .lootTable(hangingSign.getLootTableKey())
                        .overrideTranslationKey(hangingSign.getTranslationKey())
        );
    }

    private static BlockFamily registerSignFamily(Block plankBlock, Block standingSignBlock, Block wallSignBlock) {
        return BlockFamilies.register(plankBlock)
                .sign(standingSignBlock, wallSignBlock)
                .group("wooden").unlockCriterionName("has_planks").build();
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> itemGroup.addBefore(Items.MUSHROOM_STEM, ModBlocks.MUSHROOM_STEM));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS)
                .register((itemGroup) -> {
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.WHITE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.LIGHT_GRAY_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.GRAY_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.BLACK_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.BROWN_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.RED_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.ORANGE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.YELLOW_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.LIME_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.GREEN_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.CYAN_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.LIGHT_BLUE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.BLUE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.PURPLE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.MAGENTA_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.PINK_MUSHROOM_STEM);

                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_WHITE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_LIGHT_GRAY_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_GRAY_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_BLACK_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_BROWN_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_RED_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_ORANGE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_YELLOW_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_LIME_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_GREEN_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_CYAN_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_LIGHT_BLUE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_BLUE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_PURPLE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_MAGENTA_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.STRIPPED_PINK_MUSHROOM_STEM);

                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.WHITE_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.LIGHT_GRAY_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.GRAY_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.BLACK_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.BROWN_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.RED_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.ORANGE_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.YELLOW_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.LIME_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.GREEN_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.CYAN_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.LIGHT_BLUE_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.BLUE_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.PURPLE_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.MAGENTA_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.TERRACOTTA, ModBlocks.PINK_MUSHROOM_PLANKS);
                    }
                );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> {
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.WHITE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.WHITE_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_WHITE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_WHITE_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.WHITE_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.WHITE_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.WHITE_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.WHITE_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.WHITE_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.WHITE_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.WHITE_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.WHITE_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.WHITE_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_GRAY_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_GRAY_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_LIGHT_GRAY_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_LIGHT_GRAY_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_GRAY_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_GRAY_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_GRAY_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_GRAY_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_GRAY_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_GRAY_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_GRAY_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GRAY_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GRAY_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_GRAY_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_GRAY_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GRAY_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GRAY_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GRAY_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GRAY_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GRAY_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GRAY_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GRAY_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GRAY_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GRAY_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLACK_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLACK_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_BLACK_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_BLACK_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLACK_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLACK_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLACK_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLACK_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLACK_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLACK_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLACK_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLACK_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLACK_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BROWN_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BROWN_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_BROWN_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_BROWN_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BROWN_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BROWN_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BROWN_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BROWN_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BROWN_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BROWN_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BROWN_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BROWN_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BROWN_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.RED_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.RED_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_RED_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_RED_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.RED_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.RED_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.RED_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.RED_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.RED_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.RED_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.RED_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.RED_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.RED_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.ORANGE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.ORANGE_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_ORANGE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_ORANGE_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.ORANGE_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.ORANGE_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.ORANGE_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.ORANGE_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.ORANGE_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.ORANGE_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.ORANGE_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.ORANGE_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.ORANGE_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.YELLOW_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.YELLOW_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_YELLOW_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_YELLOW_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.YELLOW_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.YELLOW_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.YELLOW_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.YELLOW_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.YELLOW_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.YELLOW_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.YELLOW_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.YELLOW_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.YELLOW_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIME_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIME_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_LIME_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_LIME_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIME_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIME_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIME_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIME_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIME_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIME_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIME_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIME_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIME_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GREEN_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GREEN_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_GREEN_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_GREEN_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GREEN_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GREEN_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GREEN_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GREEN_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GREEN_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GREEN_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GREEN_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GREEN_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.GREEN_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.CYAN_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.CYAN_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_CYAN_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_CYAN_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.CYAN_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.CYAN_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.CYAN_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.CYAN_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.CYAN_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.CYAN_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.CYAN_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.CYAN_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.CYAN_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_BLUE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_BLUE_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_LIGHT_BLUE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_LIGHT_BLUE_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_BLUE_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_BLUE_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_BLUE_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_BLUE_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_BLUE_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_BLUE_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.LIGHT_BLUE_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLUE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLUE_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_BLUE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_BLUE_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLUE_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLUE_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLUE_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLUE_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLUE_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLUE_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLUE_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLUE_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.BLUE_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PURPLE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PURPLE_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_PURPLE_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_PURPLE_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PURPLE_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PURPLE_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PURPLE_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PURPLE_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PURPLE_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PURPLE_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PURPLE_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PURPLE_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PURPLE_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MAGENTA_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MAGENTA_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_MAGENTA_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_MAGENTA_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MAGENTA_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MAGENTA_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MAGENTA_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MAGENTA_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MAGENTA_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MAGENTA_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MAGENTA_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MAGENTA_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.MAGENTA_MUSHROOM_BUTTON);

                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PINK_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PINK_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_PINK_MUSHROOM_STEM);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.STRIPPED_PINK_MUSHROOM_HYPHAE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PINK_MUSHROOM_PLANKS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PINK_MUSHROOM_STAIRS);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PINK_MUSHROOM_SLAB);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PINK_MUSHROOM_FENCE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PINK_MUSHROOM_FENCE_GATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PINK_MUSHROOM_DOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PINK_MUSHROOM_TRAPDOOR);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PINK_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addBefore(Items.CRIMSON_STEM, ModBlocks.PINK_MUSHROOM_BUTTON);

                });
    }
}
