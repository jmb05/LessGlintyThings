package net.jmb19905.noglintybooky.mixin;

import net.jmb19905.noglintybooky.NoGlintyBooky;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = PotionItem.class)
public class PotionItemMixin {
    @Inject(method = "hasGlint", at = @At("HEAD"), cancellable = true)
    private void hasGlint(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (NoGlintyBooky.config.removePotionGlint) {
            cir.setReturnValue(false);
        }
    }
}
