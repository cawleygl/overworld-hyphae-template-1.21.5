package bluesteel42.overworldhyphae;

import bluesteel42.overworldhyphae.block.ModBlocks;
import bluesteel42.overworldhyphae.entity.ModBoats;
import bluesteel42.overworldhyphae.item.ModItems;
import bluesteel42.overworldhyphae.registries.ModRegistries;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.MapColor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OverworldHyphae implements ModInitializer {
	// Mod ID
	public static final String MOD_ID = "overworld-hyphae";

	// Global variables
	public static final float blockHardness = 0.5F;
	public static final float blockResistence = 0.6F;
	public static final float itemStrength = 0.2F;

	public static final String plainDyeColor = "";
	public static final MapColor plainMapColor = MapColor.TERRACOTTA_WHITE;
	public static final String whiteDyeColor = "white_";
	public static final MapColor whiteMapColor = MapColor.WHITE;
	public static final String lightGrayDyeColor = "light_gray_";
	public static final MapColor lightGrayMapColor = MapColor.LIGHT_GRAY;
	public static final String grayDyeColor = "gray_";
	public static final MapColor grayMapColor = MapColor.GRAY;
	public static final String blackDyeColor = "black_";
	public static final MapColor blackMapColor = MapColor.BLACK;
	public static final String brownDyeColor = "brown_";
	public static final MapColor brownMapColor = MapColor.BROWN;
	public static final String redDyeColor = "red_";
	public static final MapColor redMapColor = MapColor.RED;
	public static final String orangeDyeColor = "orange_";
	public static final MapColor orangeMapColor = MapColor.ORANGE;
	public static final String yellowDyeColor = "yellow_";
	public static final MapColor yellowMapColor = MapColor.YELLOW;
	public static final String limeDyeColor = "lime_";
	public static final MapColor limeMapColor = MapColor.LIME;
	public static final String greenDyeColor = "green_";
	public static final MapColor greenMapColor = MapColor.GREEN;
	public static final String cyanDyeColor = "cyan_";
	public static final MapColor cyanMapColor = MapColor.CYAN;
	public static final String lightBlueDyeColor = "light_blue_";
	public static final MapColor lightBlueMapColor = MapColor.LIGHT_BLUE;
	public static final String blueDyeColor = "blue_";
	public static final MapColor blueMapColor = MapColor.BLUE;
	public static final String purpleDyeColor = "purple_";
	public static final MapColor purpleMapColor = MapColor.PURPLE;
	public static final String magentaDyeColor = "magenta_";
	public static final MapColor magentaMapColor = MapColor.MAGENTA;
	public static final String pinkDyeColor = "pink_";
	public static final MapColor pinkMapColor = MapColor.PINK;

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModBlocks.initialize();
		ModItems.initialize();
		ModBoats.initialize();
		ModRegistries.registerStrippables();
		ModRegistries.registerCompostables();
		ModRegistries.registerTrades();

		LOGGER.info("Hello Fabric world!");
	}
}