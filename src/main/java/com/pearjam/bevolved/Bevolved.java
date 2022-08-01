package com.pearjam.bevolved;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bevolved implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("bevolved");

    @Override
    public void onInitialize() {
        LOGGER.info("Behold! Bevolved Begins!");
    }
}
