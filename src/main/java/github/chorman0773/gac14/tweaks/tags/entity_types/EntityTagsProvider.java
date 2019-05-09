package github.chorman0773.gac14.tweaks.tags.entity_types;

import java.nio.file.Path;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.TagsProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.tags.TagCollection;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.IRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTagsProvider extends TagsProvider<EntityType<?>> {
	
	private TagCollection<EntityType<?>> collect;
	private DataGenerator generator;
	
	@SuppressWarnings("deprecation")
	public EntityTagsProvider(DataGenerator generator) {
		super(generator, IRegistry.field_212629_r);
		this.generator = generator;
		this.generator.addProvider(this);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "entity_types";
	}

	@Override
	protected void registerTags() {
		
	}

	@Override
	protected void setCollection(TagCollection<EntityType<?>> colectionIn) {
		collect = colectionIn;
	}

	@Override
	protected Path makePath(ResourceLocation id) {
		// TODO Auto-generated method stub
		return generator.getOutputFolder().resolve("data/"+id.getNamespace()+"/tags/entity_types/"+id.getPath());
	}

}
