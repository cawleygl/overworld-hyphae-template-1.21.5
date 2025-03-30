package bluesteel42.overworldhyphae;

import bluesteel42.overworldhyphae.datagen.ModBlockTagProvider;
import bluesteel42.overworldhyphae.datagen.ModItemTagProvider;
import bluesteel42.overworldhyphae.datagen.ModLootTableProvider;
import bluesteel42.overworldhyphae.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class OverworldHyphaeDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator generator) {
		FabricDataGenerator.Pack pack = generator.createPack();
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
