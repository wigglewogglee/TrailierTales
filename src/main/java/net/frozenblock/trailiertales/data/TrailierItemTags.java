package net.frozenblock.trailiertales.data;

import net.frozenblock.trailiertales.TrailierTalesSharedConstants;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

public class TrailierItemTags {

	public static final TagKey<Item> COPYABLE_SHERDS = bind("copyable_sherds");
	public static final TagKey<Item> POT_BASES = bind("pot_bases");

	@NotNull
	private static TagKey<Item> bind(@NotNull String path) {
		return TagKey.create(Registries.ITEM, TrailierTalesSharedConstants.id(path));
	}

}
