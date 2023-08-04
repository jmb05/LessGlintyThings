package net.jmb19905.lessglintythings;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = LessGlintyThings.MOD_ID)
public class ModConfig implements ConfigData {
    public boolean removeBookGlint = true;
    public boolean removeEnchantedBookGlint = false;
    public boolean removeEnchantedGoldenAppleGlint = false;

    public boolean removeEndCrystalGlint = false;

    public boolean removeExperienceBottleGlint = false;

    public boolean removeNetherStarGlint = false;
    public boolean removeArmorGlint = false;
    public boolean removeToolGlint = false;
    public boolean removeLodestoneCompassGlint = false;
}
