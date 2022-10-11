package net.jmb19905.noglintybooky.mixin;

import net.jmb19905.noglintybooky.NoGlintyBooky;
import net.minecraft.item.ItemStack;
import net.minecraft.item.WrittenBookItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = WrittenBookItem.class)
public class WrittenBookMixin {
    @Inject(method = "hasGlint", at = @At("HEAD"), cancellable = true)
    private void hasGlint(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (NoGlintyBooky.config.removeBookGlint) {
            cir.setReturnValue(false);
        }
    }
}
