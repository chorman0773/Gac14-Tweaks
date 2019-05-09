package github.chorman0773.gac14.tweaks.tags.entity_types;

import net.minecraft.entity.EntityType;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public final class EntityTag extends Tag<EntityType<?>> {

	public EntityTag(ResourceLocation resourceLocationIn) {
		super(resourceLocationIn);
		// TODO Auto-generated constructor stub
	}
	
	public EntityTag(String name) {
		this(ResourceLocation.makeResourceLocation(name));
	}

}
