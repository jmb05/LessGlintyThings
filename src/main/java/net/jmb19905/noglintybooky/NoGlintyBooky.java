package net.jmb19905.noglintybooky;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoGlintyBooky implements ClientModInitializer {

    private static final Logger LOGGER = LoggerFactory.getLogger("noglintybooky");

    @Override
    public void onInitializeClient() {
        LOGGER.info("NoGlintyBooky");
    }
}
