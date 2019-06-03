package github.chorman0773.gac14.tweaks.tags.entity_types;

import net.minecraft.entity.EntityType;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public final class EntityTags {

	private EntityTags() {
		// TODO Auto-generated constructor stub
	}
	
	public static Tag<EntityType<?>> getTag(String name){
		return new Tag<>(ResourceLocation.makeResourceLocation(name));
	}
	
	public static final Tag<EntityType<?>> UNDEAD = getTag("gac14:undead");
	public static final Tag<EntityType<?>> ARTHROPOD = getTag("gac14:arthropod");
	public static final Tag<EntityType<?>> AQUATIC = getTag("gac14:aquatic");
	public static final Tag<EntityType<?>> SKELETONS = getTag("gac14:skeletons");
	public static final Tag<EntityType<?>> PERSISTANT = getTag("gac14:persistant");

}
