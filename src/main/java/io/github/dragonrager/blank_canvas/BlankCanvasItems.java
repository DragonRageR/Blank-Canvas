package io.github.dragonrager.blank_canvas;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;


public class BlankCanvasItems {
	public static final Item Smt = new Item(new Item.Settings());

	public static void registerItems(ModContainer mod) {
		Registry.register(Registries.ITEM, new Identifier("dragonrager", "smt"), Smt);
	}
}
