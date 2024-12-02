package heartsfromollie.hcm;

import heartsfromollie.hcm.item.ModItemGroups;
import heartsfromollie.hcm.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeartsfromolliesCookieMod implements ModInitializer {
	public static final String MOD_ID = "hcm";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		LOGGER.info("Turning on the oven...");

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}