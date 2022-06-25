package net.rum.sagdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.api.ModInitializer;
import net.rum.sagdi.item.ModItems;

public class Sagdi implements ModInitializer {
    public static final String MOD_ID = "sagdi"; 
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModItems.registerModItems();
    }
    
}
