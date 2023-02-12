package net.jmb19905.lessglintythings.mixin;

import net.jmb19905.lessglintythings.LessGlintyThings;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = Item.class)
public class ArmorAndToolsMixin {
    @Inject(method = "hasGlint", at = @At("HEAD"), cancellable = true)
    private void hasGlint(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (stack.getItem() instanceof Wearable && LessGlintyThings.config.removeArmorGlint) {
            cir.setReturnValue(false);
        } else if (stack.getItem() instanceof ToolItem && LessGlintyThings.config.removeToolGlint) {
            cir.setReturnValue(false);
        }
    }
}