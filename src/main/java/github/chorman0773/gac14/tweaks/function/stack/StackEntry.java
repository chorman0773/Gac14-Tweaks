package github.chorman0773.gac14.tweaks.function.stack;

import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;

public abstract class StackEntry {
	public abstract Object getValue();
	public abstract String getType();
	
	public String toString() {
		return getValue().toString();
	}
	private final Class<?> cl;
	public Class<?> getValueType(){
		return cl;
	}
	StackEntry(Class<?> cl){
		this.cl = cl;
	}
	
	public static final class IntegerValue extends StackEntry{
		public IntegerValue(int value) {
			super(int.class);
			this.value = value;
		}
		private final int value;
		public Integer getValue() {
			return value;
		}
		public String getType() {
			return "int";
		}
	}
	
	public static final class ItemDescriptor{
		private Item i;
		private NBTTagCompound tag;
	}
	
	
}
