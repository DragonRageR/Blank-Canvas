package io.github.dragonrager.blank_canvas.mixin;

import net.minecraft.client.render.item.ItemModels;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemModels.class)
public abstract class ItemModelsMixin {
	@Shadow
	public abstract void putModel(Item item, ModelIdentifier modelId);

	@Inject(method = "reloadModels", at = @At("HEAD"))
	private void onReloadModels(CallbackInfo ci) {
		for (Item item : Registries.ITEM) {
			this.putModel(item, new ModelIdentifier(Registries.ITEM.getId(item), "inventory"));
		}
	}
}
