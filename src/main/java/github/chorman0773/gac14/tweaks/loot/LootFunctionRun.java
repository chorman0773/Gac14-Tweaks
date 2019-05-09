package github.chorman0773.gac14.tweaks.loot;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;

public class LootFunctionRun extends LootFunction {


	private ResourceLocation func;

	public LootFunctionRun(LootCondition[] conditionsIn,ResourceLocation func) {
		super(conditionsIn);
		this.func = func;
	}

	@Override
	public ItemStack apply(ItemStack stack, Random rand, LootContext context) {
		
		//TODO push the ref to a function stack
		Entity e = context.getKillerPlayer();
		if(e!=null)
			;
		
		return stack;
	}

}
