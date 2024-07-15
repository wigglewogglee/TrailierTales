package net.frozenblock.trailiertales.datagen.loot;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.frozenblock.trailiertales.registry.RegisterItems;
import net.frozenblock.trailiertales.registry.RegisterLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.jetbrains.annotations.NotNull;

public class TTArchaeologyLootProvider extends SimpleFabricLootTableProvider {

	private final CompletableFuture<HolderLookup.Provider> registryLookup;

	public TTArchaeologyLootProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
		super(output, registryLookup, LootContextParamSets.ARCHAEOLOGY);
		this.registryLookup = registryLookup;
	}

	@Override
	public void generate(@NotNull BiConsumer<ResourceKey<LootTable>, LootTable.Builder> registry) {
		HolderLookup.Provider registries = registryLookup.join();

		registry.accept(
			RegisterLootTables.CATACOMBS_ARCHAEOLOGY_CORRIDOR,
			LootTable.lootTable()
				.withPool(
					LootPool.lootPool()
						.add(LootItem.lootTableItem(Items.SKULL_POTTERY_SHERD).setWeight(4))
						.add(LootItem.lootTableItem(Items.HEART_POTTERY_SHERD).setWeight(4))
						.add(LootItem.lootTableItem(Items.ARCHER_POTTERY_SHERD).setWeight(4))
						.add(LootItem.lootTableItem(Items.ARMS_UP_POTTERY_SHERD).setWeight(4))
						.add(LootItem.lootTableItem(Items.BLADE_POTTERY_SHERD).setWeight(4))
						.add(LootItem.lootTableItem(RegisterItems.WITHER_POTTERY_SHERD).setWeight(4))
						.add(LootItem.lootTableItem(Items.GOLD_NUGGET).setWeight(4))
						.add(LootItem.lootTableItem(Items.GOLD_INGOT).setWeight(1))
						.add(LootItem.lootTableItem(Items.EMERALD).setWeight(2))
						.add(LootItem.lootTableItem(Items.SOUL_LANTERN).setWeight(10))
						.add(LootItem.lootTableItem(Items.SKELETON_SKULL).setWeight(2))
						.add(LootItem.lootTableItem(Items.BONE).setWeight(40))
						.add(LootItem.lootTableItem(Items.ROTTEN_FLESH).setWeight(35))
						.add(LootItem.lootTableItem(Items.COAL).setWeight(20))
						.add(LootItem.lootTableItem(Items.BOOK).setWeight(10))
						.add(LootItem.lootTableItem(Items.CANDLE).setWeight(20))
				)
		);

		registry.accept(
			RegisterLootTables.CATACOMBS_ARCHAEOLOGY_CORRIDOR_RARE,
			LootTable.lootTable()
				.withPool(
					LootPool.lootPool()
						.add(LootItem.lootTableItem(Items.SKULL_POTTERY_SHERD).setWeight(5))
						.add(LootItem.lootTableItem(Items.HEART_POTTERY_SHERD).setWeight(5))
						.add(LootItem.lootTableItem(RegisterItems.WITHER_POTTERY_SHERD).setWeight(2))
						.add(LootItem.lootTableItem(RegisterItems.BULLSEYE_POTTERY_SHERD).setWeight(2))
						.add(LootItem.lootTableItem(Items.BLADE_POTTERY_SHERD).setWeight(5))
						.add(LootItem.lootTableItem(Items.ARMS_UP_POTTERY_SHERD).setWeight(5))
						.add(LootItem.lootTableItem(Items.BLADE_POTTERY_SHERD).setWeight(5))
						.add(LootItem.lootTableItem(Items.GOLD_NUGGET).setWeight(4))
						.add(LootItem.lootTableItem(Items.GOLD_INGOT).setWeight(1))
						.add(LootItem.lootTableItem(Items.EMERALD).setWeight(6))
						.add(LootItem.lootTableItem(Items.BOOK).setWeight(1).apply(EnchantRandomlyFunction.randomApplicableEnchantment(registries)))
						.add(LootItem.lootTableItem(Items.SOUL_LANTERN).setWeight(5))
						.add(LootItem.lootTableItem(Items.SKELETON_SKULL).setWeight(1))
						.add(LootItem.lootTableItem(Items.BONE).setWeight(15))
						.add(LootItem.lootTableItem(Items.ROTTEN_FLESH).setWeight(12))
						.add(LootItem.lootTableItem(Items.COAL).setWeight(10))
						.add(LootItem.lootTableItem(Items.BOOK).setWeight(8))
						.add(LootItem.lootTableItem(Items.CANDLE).setWeight(8))
				)
		);

		registry.accept(
			RegisterLootTables.CATACOMBS_ARCHAEOLOGY_TOMB,
			LootTable.lootTable()
				.withPool(
					LootPool.lootPool()
						.add(LootItem.lootTableItem(Items.SKULL_POTTERY_SHERD).setWeight(3))
						.add(LootItem.lootTableItem(Items.HEART_POTTERY_SHERD).setWeight(2))
						.add(LootItem.lootTableItem(RegisterItems.WITHER_POTTERY_SHERD).setWeight(3))
						.add(LootItem.lootTableItem(RegisterItems.BULLSEYE_POTTERY_SHERD).setWeight(3))
						.add(LootItem.lootTableItem(Items.BLADE_POTTERY_SHERD).setWeight(2))
						.add(LootItem.lootTableItem(Items.ARMS_UP_POTTERY_SHERD).setWeight(2))
						.add(LootItem.lootTableItem(Items.BLADE_POTTERY_SHERD).setWeight(2))
						.add(LootItem.lootTableItem(Items.BOOK).setWeight(1).apply(EnchantRandomlyFunction.randomApplicableEnchantment(registries)))
						.add(LootItem.lootTableItem(Items.SOUL_LANTERN).setWeight(3))
						.add(LootItem.lootTableItem(Items.SKELETON_SKULL).setWeight(1))
						.add(LootItem.lootTableItem(Items.BONE).setWeight(20))
						.add(LootItem.lootTableItem(Items.GOLD_NUGGET).setWeight(4))
						.add(LootItem.lootTableItem(Items.GOLD_INGOT).setWeight(1))
						.add(LootItem.lootTableItem(Items.EMERALD).setWeight(5))
						.add(LootItem.lootTableItem(Items.ROTTEN_FLESH).setWeight(18))
						.add(LootItem.lootTableItem(Items.COAL).setWeight(7))
						.add(LootItem.lootTableItem(Items.BOOK).setWeight(5))
						.add(LootItem.lootTableItem(Items.CANDLE).setWeight(10))
				)
		);

		registry.accept(
			RegisterLootTables.DESERT_RUINS_ARCHAEOLOGY,
			LootTable.lootTable()
				.withPool(
					LootPool.lootPool()
						.add(LootItem.lootTableItem(Items.BLUE_DYE).setWeight(20))
						.add(LootItem.lootTableItem(Items.YELLOW_DYE).setWeight(20))
						.add(LootItem.lootTableItem(Items.WHEAT).setWeight(20))
						.add(LootItem.lootTableItem(Items.BLUE_CANDLE).setWeight(20))
						.add(LootItem.lootTableItem(Items.EMERALD).setWeight(20))
						.add(LootItem.lootTableItem(Items.WHEAT_SEEDS).setWeight(10))
						.add(LootItem.lootTableItem(Items.GOLD_NUGGET).setWeight(10))
						.add(LootItem.lootTableItem(Items.COAL).setWeight(10))
						.add(LootItem.lootTableItem(Items.DEAD_BUSH).setWeight(10))
						.add(LootItem.lootTableItem(Items.BRICK).setWeight(10))
						.add(LootItem.lootTableItem(Items.CLAY).setWeight(7))
						.add(LootItem.lootTableItem(Items.FLOWER_POT).setWeight(10))
						.add(LootItem.lootTableItem(Items.STICK).setWeight(10))
						.add(LootItem.lootTableItem(Items.ARMS_UP_POTTERY_SHERD).setWeight(6))
						.add(LootItem.lootTableItem(Items.ARCHER_POTTERY_SHERD).setWeight(6))
						.add(LootItem.lootTableItem(Items.BREWER_POTTERY_SHERD).setWeight(6))
						.add(LootItem.lootTableItem(Items.MINER_POTTERY_SHERD).setWeight(6))
						.add(LootItem.lootTableItem(Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE))
				)
		);

		registry.accept(
			RegisterLootTables.DESERT_RUINS_ARCHAEOLOGY_FOSSIl,
			LootTable.lootTable()
				.withPool(
					LootPool.lootPool()
						.add(LootItem.lootTableItem(Items.BONE).setWeight(2))
						.add(LootItem.lootTableItem(Items.COAL))
						.add(LootItem.lootTableItem(Items.DEAD_BUSH))
						.add(LootItem.lootTableItem(Items.ROTTEN_FLESH))
						.add(LootItem.lootTableItem(Items.STICK))
				)
		);

		registry.accept(
			RegisterLootTables.DESERT_RUINS_ARCHAEOLOGY_SURFACE,
			LootTable.lootTable()
				.withPool(
					LootPool.lootPool()
						.add(LootItem.lootTableItem(Items.BLUE_DYE).setWeight(30))
						.add(LootItem.lootTableItem(Items.YELLOW_DYE).setWeight(30))
						.add(LootItem.lootTableItem(Items.BLUE_CANDLE).setWeight(30))
						.add(LootItem.lootTableItem(Items.GOLD_NUGGET).setWeight(20))
						.add(LootItem.lootTableItem(Items.COAL).setWeight(20))
						.add(LootItem.lootTableItem(Items.DEAD_BUSH).setWeight(20))
						.add(LootItem.lootTableItem(Items.BRICK).setWeight(20))
						.add(LootItem.lootTableItem(Items.FLOWER_POT).setWeight(20))
						.add(LootItem.lootTableItem(Items.STICK).setWeight(20))
						.add(LootItem.lootTableItem(Items.ARMS_UP_POTTERY_SHERD).setWeight(6))
						.add(LootItem.lootTableItem(Items.ARCHER_POTTERY_SHERD).setWeight(6))
						.add(LootItem.lootTableItem(Items.BREWER_POTTERY_SHERD).setWeight(4))
						.add(LootItem.lootTableItem(Items.MINER_POTTERY_SHERD).setWeight(4))
				)
		);

		registry.accept(
			RegisterLootTables.DESERT_RUINS_ARCHAEOLOGY_POTS,
			LootTable.lootTable()
				.withPool(
					LootPool.lootPool()
						.add(LootItem.lootTableItem(Items.BLUE_DYE).setWeight(2))
						.add(LootItem.lootTableItem(Items.YELLOW_DYE).setWeight(2))
						.add(LootItem.lootTableItem(Items.BLUE_CANDLE).setWeight(2))
						.add(LootItem.lootTableItem(Items.EMERALD).setWeight(2))
						.add(LootItem.lootTableItem(Items.GOLD_NUGGET))
						.add(LootItem.lootTableItem(Items.COAL))
						.add(LootItem.lootTableItem(Items.DEAD_BUSH))
						.add(LootItem.lootTableItem(Items.BRICK))
						.add(LootItem.lootTableItem(Items.CLAY))
						.add(LootItem.lootTableItem(Items.COAL))
						.add(LootItem.lootTableItem(Items.FLOWER_POT))
						.add(LootItem.lootTableItem(Items.ARMS_UP_POTTERY_SHERD))
						.add(LootItem.lootTableItem(Items.ARCHER_POTTERY_SHERD))
						.add(LootItem.lootTableItem(Items.BREWER_POTTERY_SHERD))
						.add(LootItem.lootTableItem(Items.MINER_POTTERY_SHERD))
						.add(LootItem.lootTableItem(Items.SKULL_POTTERY_SHERD))
						.add(LootItem.lootTableItem(Items.PRIZE_POTTERY_SHERD))
				)
		);

		registry.accept(
			RegisterLootTables.JUNGLE_RUINS_ARCHAEOLOGY,
			LootTable.lootTable()
				.withPool(
					LootPool.lootPool()
						.add(LootItem.lootTableItem(Items.BROWN_DYE).setWeight(20))
						.add(LootItem.lootTableItem(Items.WHITE_DYE).setWeight(20))
						.add(LootItem.lootTableItem(Items.GRAY_DYE).setWeight(10))
						.add(LootItem.lootTableItem(Items.BROWN_CANDLE).setWeight(20))
						.add(LootItem.lootTableItem(Items.WHITE_CANDLE).setWeight(20))
						.add(LootItem.lootTableItem(Items.GREEN_CANDLE).setWeight(20))
						.add(LootItem.lootTableItem(Items.EMERALD).setWeight(20))
						.add(LootItem.lootTableItem(Items.WHEAT).setWeight(20))
						.add(LootItem.lootTableItem(Items.WHEAT_SEEDS).setWeight(10))
						.add(LootItem.lootTableItem(Items.COCOA_BEANS).setWeight(10))
						.add(LootItem.lootTableItem(Items.PUMPKIN_SEEDS).setWeight(8))
						.add(LootItem.lootTableItem(Items.MELON_SEEDS).setWeight(8))
						.add(LootItem.lootTableItem(Items.GOLD_NUGGET).setWeight(10))
						.add(LootItem.lootTableItem(Items.COAL).setWeight(10))
						.add(LootItem.lootTableItem(Items.DEAD_BUSH).setWeight(10))
						.add(LootItem.lootTableItem(Items.BRICK).setWeight(10))
						.add(LootItem.lootTableItem(Items.CLAY).setWeight(7))
						.add(LootItem.lootTableItem(Items.FLOWER_POT).setWeight(10))
						.add(LootItem.lootTableItem(Items.STICK).setWeight(10))
						.add(LootItem.lootTableItem(Items.STRING).setWeight(10))
						.add(LootItem.lootTableItem(Items.JUNGLE_HANGING_SIGN).setWeight(10))
						.add(LootItem.lootTableItem(Items.ARCHER_POTTERY_SHERD).setWeight(7))
						.add(LootItem.lootTableItem(Items.EXPLORER_POTTERY_SHERD).setWeight(7))
						.add(LootItem.lootTableItem(RegisterItems.BLOOM_POTTERY_SHERD).setWeight(7))
						.add(LootItem.lootTableItem(Items.SCRAPE_POTTERY_SHERD).setWeight(7))
						.add(LootItem.lootTableItem(Items.WILD_ARMOR_TRIM_SMITHING_TEMPLATE))
				)
		);

		registry.accept(
			RegisterLootTables.JUNGLE_RUINS_ARCHAEOLOGY_SURFACE,
			LootTable.lootTable()
				.withPool(
					LootPool.lootPool()
						.add(LootItem.lootTableItem(Items.BROWN_DYE).setWeight(20))
						.add(LootItem.lootTableItem(Items.WHITE_DYE).setWeight(20))
						.add(LootItem.lootTableItem(Items.GRAY_DYE).setWeight(8))
						.add(LootItem.lootTableItem(Items.BROWN_CANDLE).setWeight(20))
						.add(LootItem.lootTableItem(Items.WHITE_CANDLE).setWeight(20))
						.add(LootItem.lootTableItem(Items.GREEN_CANDLE).setWeight(20))
						.add(LootItem.lootTableItem(Items.EMERALD).setWeight(13))
						.add(LootItem.lootTableItem(Items.WHEAT_SEEDS).setWeight(10))
						.add(LootItem.lootTableItem(Items.COCOA_BEANS).setWeight(10))
						.add(LootItem.lootTableItem(Items.PUMPKIN_SEEDS).setWeight(6))
						.add(LootItem.lootTableItem(Items.MELON_SEEDS).setWeight(6))
						.add(LootItem.lootTableItem(Items.GOLD_NUGGET).setWeight(10))
						.add(LootItem.lootTableItem(Items.COAL).setWeight(10))
						.add(LootItem.lootTableItem(Items.DEAD_BUSH).setWeight(10))
						.add(LootItem.lootTableItem(Items.BRICK).setWeight(10))
						.add(LootItem.lootTableItem(Items.CLAY).setWeight(6))
						.add(LootItem.lootTableItem(Items.FLOWER_POT).setWeight(10))
						.add(LootItem.lootTableItem(Items.STICK).setWeight(10))
						.add(LootItem.lootTableItem(Items.STRING).setWeight(10))
						.add(LootItem.lootTableItem(Items.ARCHER_POTTERY_SHERD).setWeight(7))
						.add(LootItem.lootTableItem(Items.EXPLORER_POTTERY_SHERD).setWeight(7))
						.add(LootItem.lootTableItem(RegisterItems.BLOOM_POTTERY_SHERD).setWeight(7))
						.add(LootItem.lootTableItem(Items.SCRAPE_POTTERY_SHERD).setWeight(7))
				)
		);

		registry.accept(
			RegisterLootTables.SAVANNA_RUINS_ARCHAEOLOGY,
			LootTable.lootTable()
				.withPool(
					LootPool.lootPool()
						.add(LootItem.lootTableItem(Items.RED_DYE).setWeight(20))
						.add(LootItem.lootTableItem(Items.YELLOW_DYE).setWeight(20))
						.add(LootItem.lootTableItem(Items.PURPLE_DYE).setWeight(20))
						.add(LootItem.lootTableItem(Items.RED_CANDLE).setWeight(20))
						.add(LootItem.lootTableItem(Items.YELLOW_CANDLE).setWeight(20))
						.add(LootItem.lootTableItem(Items.PURPLE_DYE).setWeight(20))
						.add(LootItem.lootTableItem(Items.EMERALD).setWeight(20))
						.add(LootItem.lootTableItem(Items.WHEAT).setWeight(20))
						.add(LootItem.lootTableItem(Items.WHEAT_SEEDS).setWeight(10))
						.add(LootItem.lootTableItem(Items.BEETROOT_SEEDS).setWeight(10))
						.add(LootItem.lootTableItem(Items.GOLD_NUGGET).setWeight(10))
						.add(LootItem.lootTableItem(Items.COAL).setWeight(10))
						.add(LootItem.lootTableItem(Items.DEAD_BUSH).setWeight(10))
						.add(LootItem.lootTableItem(Items.BRICK).setWeight(10))
						.add(LootItem.lootTableItem(Items.CLAY).setWeight(7))
						.add(LootItem.lootTableItem(Items.FLOWER_POT).setWeight(10))
						.add(LootItem.lootTableItem(Items.STICK).setWeight(10))
						.add(LootItem.lootTableItem(Items.STRING).setWeight(10))
						.add(LootItem.lootTableItem(Items.LEATHER).setWeight(10))
						.add(LootItem.lootTableItem(Items.LEAD).setWeight(10))
						.add(LootItem.lootTableItem(Items.ACACIA_HANGING_SIGN).setWeight(10))
						.add(LootItem.lootTableItem(Items.OAK_HANGING_SIGN).setWeight(10))
						.add(LootItem.lootTableItem(Items.SHEAF_POTTERY_SHERD).setWeight(7))
						.add(LootItem.lootTableItem(Items.HOWL_POTTERY_SHERD).setWeight(7))
						.add(LootItem.lootTableItem(RegisterItems.WITHER_POTTERY_SHERD).setWeight(6))
						.add(LootItem.lootTableItem(Items.SHELTER_POTTERY_SHERD).setWeight(10))
				)
		);

		registry.accept(
			RegisterLootTables.SAVANNA_RUINS_ARCHAEOLOGY_SURFACE,
			LootTable.lootTable()
				.withPool(
					LootPool.lootPool()
						.add(LootItem.lootTableItem(Items.RED_DYE).setWeight(20))
						.add(LootItem.lootTableItem(Items.YELLOW_DYE).setWeight(20))
						.add(LootItem.lootTableItem(Items.PURPLE_DYE).setWeight(20))
						.add(LootItem.lootTableItem(Items.RED_CANDLE).setWeight(20))
						.add(LootItem.lootTableItem(Items.YELLOW_CANDLE).setWeight(20))
						.add(LootItem.lootTableItem(Items.PURPLE_DYE).setWeight(20))
						.add(LootItem.lootTableItem(Items.EMERALD).setWeight(20))
						.add(LootItem.lootTableItem(Items.WHEAT_SEEDS).setWeight(10))
						.add(LootItem.lootTableItem(Items.BEETROOT_SEEDS).setWeight(10))
						.add(LootItem.lootTableItem(Items.GOLD_NUGGET).setWeight(10))
						.add(LootItem.lootTableItem(Items.COAL).setWeight(10))
						.add(LootItem.lootTableItem(Items.DEAD_BUSH).setWeight(10))
						.add(LootItem.lootTableItem(Items.BRICK).setWeight(10))
						.add(LootItem.lootTableItem(Items.CLAY).setWeight(6))
						.add(LootItem.lootTableItem(Items.FLOWER_POT).setWeight(10))
						.add(LootItem.lootTableItem(Items.STICK).setWeight(10))
						.add(LootItem.lootTableItem(Items.STRING).setWeight(10))
						.add(LootItem.lootTableItem(Items.ACACIA_HANGING_SIGN).setWeight(10))
						.add(LootItem.lootTableItem(Items.OAK_HANGING_SIGN).setWeight(10))
						.add(LootItem.lootTableItem(Items.SHEAF_POTTERY_SHERD).setWeight(7))
						.add(LootItem.lootTableItem(Items.HOWL_POTTERY_SHERD).setWeight(7))
						.add(LootItem.lootTableItem(RegisterItems.WITHER_POTTERY_SHERD).setWeight(6))
						.add(LootItem.lootTableItem(Items.SHELTER_POTTERY_SHERD).setWeight(10))
				)
		);
	}
}
