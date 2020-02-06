package com.terraformersmc.traverse.biome;

import com.terraformersmc.terraform.biome.builder.BuilderBiomeSettings;
import com.terraformersmc.terraform.util.TerraformBiomeSets;
import com.terraformersmc.traverse.feature.TraverseBiomeFeatures;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.DecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

public class LushSwampBiome extends Biome {

	static final ConfiguredSurfaceBuilder SURFACE_BUILDER = new ConfiguredSurfaceBuilder<>(SurfaceBuilder.SWAMP, SurfaceBuilder.GRASS_CONFIG);
	static final Precipitation PRECIPITATION = Precipitation.RAIN;
	static final Category CATEGORY = Category.SWAMP;
	static final float DEPTH = -0.2F;
	static final float SCALE = 0.1F;
	static final float TEMPERATURE = 0.8F;
	static final float DOWNFALL = 0.9F;
	static final int WATER_COLOR = 0x617B64;
	static final int WATER_FOG_COLOR = 0x232317;
	static final int GRASS_COLOR = 0x7FE03E;
	static final int FOLIAGE_COLOR = 0x58EA33;
	static final String PARENT = null;

	public LushSwampBiome() {
		super(new BuilderBiomeSettings().surfaceBuilder(SURFACE_BUILDER).precipitation(PRECIPITATION).category(CATEGORY).depth(DEPTH).scale(SCALE).temperature(TEMPERATURE).downfall(DOWNFALL).waterColor(WATER_COLOR).waterFogColor(WATER_FOG_COLOR).parent(PARENT));
		this.addStructureFeature(Feature.SWAMP_HUT.configure(FeatureConfig.DEFAULT));
		this.addStructureFeature(Feature.MINESHAFT.configure(new MineshaftFeatureConfig(0.004D, MineshaftFeature.Type.NORMAL)));
		DefaultBiomeFeatures.addLandCarvers(this);
		DefaultBiomeFeatures.addDefaultStructures(this);
		DefaultBiomeFeatures.addDefaultLakes(this);
		DefaultBiomeFeatures.addDungeons(this);
		DefaultBiomeFeatures.addMineables(this);
		DefaultBiomeFeatures.addDefaultOres(this);
		DefaultBiomeFeatures.addClay(this);
		DefaultBiomeFeatures.addDefaultMushrooms(this);
		DefaultBiomeFeatures.addSwampVegetation(this);
		DefaultBiomeFeatures.addSprings(this);
		this.addFeature(GenerationStep.Feature.VEGETAL_DECORATION, Feature.SEAGRASS.configure(new SeagrassFeatureConfig(64, 0.6D)).createDecoratedFeature(Decorator.TOP_SOLID_HEIGHTMAP.configure(DecoratorConfig.DEFAULT)));
		DefaultBiomeFeatures.addFossils(this);
		DefaultBiomeFeatures.addFrozenTopLayer(this);
		TraverseBiomeFeatures.addLushSwampVegetation(this);
		this.addSpawn(EntityCategory.CREATURE, new SpawnEntry(EntityType.SHEEP, 12, 4, 4));
		this.addSpawn(EntityCategory.CREATURE, new SpawnEntry(EntityType.PIG, 10, 4, 4));
		this.addSpawn(EntityCategory.CREATURE, new SpawnEntry(EntityType.CHICKEN, 10, 4, 4));
		this.addSpawn(EntityCategory.CREATURE, new SpawnEntry(EntityType.COW, 8, 4, 4));
		this.addSpawn(EntityCategory.AMBIENT, new SpawnEntry(EntityType.BAT, 10, 8, 8));
		this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.SPIDER, 100, 4, 4));
		this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.ZOMBIE, 95, 4, 4));
		this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
		this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.SKELETON, 100, 4, 4));
		this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.CREEPER, 100, 4, 4));
		this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.SLIME, 100, 4, 4));
		this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
		this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.WITCH, 5, 1, 1));
		this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.SLIME, 1, 1, 1));
		TerraformBiomeSets.addSlimeSpawnBiome(this);
	}

	@Override
	public int getGrassColorAt(double x, double z) {
		return GRASS_COLOR;
	}

	@Override
	public int getFoliageColor() {
		return FOLIAGE_COLOR;
	}

}
