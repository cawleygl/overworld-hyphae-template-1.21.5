package bluesteel42.overworldhyphae;

import bluesteel42.overworldhyphae.entity.ModBoats;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;

public class OverworldHyphaeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Register Boat Models
        TerraformBoatClientHelper.registerModelLayers(ModBoats.MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.WHITE_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.LIGHT_GRAY_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.GRAY_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.BLACK_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.BROWN_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.RED_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.ORANGE_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.YELLOW_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.LIME_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.GREEN_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.CYAN_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.LIGHT_BLUE_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.BLUE_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.PURPLE_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.MAGENTA_MUSHROOM_BOATS_ID);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.PINK_MUSHROOM_BOATS_ID);
    }
}
