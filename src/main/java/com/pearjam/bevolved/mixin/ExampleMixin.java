package com.pearjam.bevolved.mixin;

import com.pearjam.bevolved.Bevolved;
import net.minecraft.src.GuiMainMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = GuiMainMenu.class, remap = false) // Remap must be set to false in ANY Mixin classes because BTA is distributed WITHOUT being obfuscated!
public class ExampleMixin {
    @Inject(method = "<clinit>", at = @At("HEAD"))
    private static void onClinit(CallbackInfo ci) {
        Bevolved.LOGGER.info("This line is printed by an example Mixin :^)!");
    }
}
