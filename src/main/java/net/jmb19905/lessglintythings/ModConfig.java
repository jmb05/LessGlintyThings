package net.jmb19905.lessglintythings;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = LessGlintyThings.MOD_ID)
public class ModConfig implements ConfigData {
    @ConfigEntry.Gui.Tooltip
    public boolean removeBookGlint = true;
    @ConfigEntry.Gui.Tooltip
    public boolean removePotionGlint = false;
}
