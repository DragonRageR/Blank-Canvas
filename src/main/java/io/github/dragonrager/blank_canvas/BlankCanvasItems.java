package io.github.dragonrager.blank_canvas;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.quiltmc.loader.api.ModContainer;


public class BlankCanvasItems {
	public static final Item BC_ITEM = new Item(new Item.Settings());

	public static void registerItems(ModContainer mod) {
		Registry.register(Registries.ITEM, "blank_canvas:bc_item", BC_ITEM);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.addItem(BlankCanvasItems.BC_ITEM));
	}


}
