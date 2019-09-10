package com.terraformersmc.traverse.biome;

import com.terraformersmc.traverse.Traverse;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

import java.util.HashMap;
import java.util.Map;

public class TraverseBiomes {

	private static final Map<Identifier, Biome> BIOMES = new HashMap<>();

	public static final Biome ARID_HIGHLANDS = add("arid_highlands", new AridHighlandsBiome());
	public static final Biome ARID_SLOPES = add("arid_slopes", new AridSlopesBiome());
	public static final Biome AUTUMNAL_WOODED_HILLS = add("autumnal_wooded_hills", new AutumnalWoodedHillsBiome());
	public static final Biome AUTUMNAL_WOODS = add("autumnal_woods", new AutumnalWoodsBiome());
	public static final Biome CLIFFS = add("cliffs", new CliffsBiome());
	public static final Biome CONIFEROUS_FOREST = add("coniferous_forest", new ConiferousForestBiome());
	public static final Biome CONIFEROUS_WOODED_HILLS = add("coniferous_wooded_hills", new ConiferousWoodedHillsBiome());
	public static final Biome DESERT_SHRUBLAND = add("desert_shrubland", new DesertShrublandBiome());
	public static final Biome HIGH_CONIFEROUS_FOREST = add("high_coniferous_forest", new HighConiferousForestBiome());
	public static final Biome LUSH_SWAMP = add("lush_swamp", new LushSwampBiome());
	public static final Biome MEADOW = add("meadow", new MeadowBiome());
	public static final Biome MINI_JUNGLE = add("mini_jungle", new MiniJungleBiome());
	public static final Biome PARCHED_PLATEAU = add("parched_plateau", new ParchedPlateauBiome());
	public static final Biome PLAINS_PLATEAU = add("plains_plateau", new PlainsPlateauBiome());
	public static final Biome ROCKY_EDGE = add("rocky_edge", new RockyEdgeBiome());
	public static final Biome ROLLING_HILLS = add("rolling_hills", new RollingHillsBiome());
	public static final Biome SNOWY_CONIFEROUS_FOREST = add("snowy_coniferous_forest", new SnowyConiferousForestBiome());
	public static final Biome SNOWY_CONIFEROUS_WOODED_HILLS = add("snowy_coniferous_wooded_hills", new SnowyConiferousWoodedHillsBiome());
	public static final Biome SNOWY_HIGH_CONIFEROUS_FOREST = add("snowy_high_coniferous_forest", new SnowyHighConiferousForestBiome());
	public static final Biome WOODED_ISLAND = add("wooded_island", new WoodedIslandBiome());
	public static final Biome WOODED_PLATEAU = add("wooded_plateau", new WoodedPlateauBiome());
	public static final Biome WOODLANDS = add("woodlands", new WoodlandsBiome());

	public static <B extends Biome> B add(String name, B biome) {
		BIOMES.put(new Identifier(Traverse.MOD_ID, name), biome);
		return biome;
	}

	public static void register() {
		for (Identifier id : BIOMES.keySet()) {
			Registry.register(Registry.BIOME, id, BIOMES.get(id));
		}
	}

}
