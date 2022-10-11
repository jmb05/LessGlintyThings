package net.jmb19905.lessglintythings;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = LessGlintyThings.MOD_ID)
public class ModConfig implements ConfigData {
    public boolean removeBookGlint = true;
    public boolean removePotionGlint = false;
}
