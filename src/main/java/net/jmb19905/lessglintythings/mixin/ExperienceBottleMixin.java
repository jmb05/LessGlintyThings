package net.jmb19905.lessglintythings.mixin;

import net.jmb19905.lessglintythings.LessGlintyThings;
import net.minecraft.item.ExperienceBottleItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ExperienceBottleItem.class)
public class ExperienceBottleMixin {
    @Inject(method = "hasGlint", at = @At("HEAD"), cancellable = true)
    private void hasGlint(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (LessGlintyThings.config.removeExperienceBottleGlint) {
            cir.setReturnValue(false);
        }
    }
}