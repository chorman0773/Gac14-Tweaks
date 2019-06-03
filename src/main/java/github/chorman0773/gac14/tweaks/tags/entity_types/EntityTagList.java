package github.chorman0773.gac14.tweaks.tags.entity_types;

import net.minecraft.entity.EntityType;
import net.minecraft.tags.NetworkTagCollection;
import net.minecraft.util.registry.IRegistry;

public class EntityTagList extends NetworkTagCollection<EntityType<?>> {

	public EntityTagList() {
		super(IRegistry.field_212629_r, "tags/entity_types", "entity_types");
		// TODO Auto-generated constructor stub
	}

}
