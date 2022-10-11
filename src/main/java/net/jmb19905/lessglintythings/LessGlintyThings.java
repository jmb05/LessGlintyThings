package net.jmb19905.lessglintythings;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ClientModInitializer;

public class LessGlintyThings implements ClientModInitializer {

    public static final String MOD_ID = "lessglintythings";

    public static ModConfig config = null;

    @Override
    public void onInitializeClient() {
        AutoConfig.register(ModConfig.class, Toml4jConfigSerializer::new);
        config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }
}
