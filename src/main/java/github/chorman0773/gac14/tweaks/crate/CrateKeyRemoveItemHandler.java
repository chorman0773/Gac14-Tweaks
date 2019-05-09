package github.chorman0773.gac14.tweaks.crate;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.LockCode;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class CrateKeyRemoveItemHandler {

	private CrateKeyRemoveItemHandler() {
		// TODO Auto-generated constructor stub
	}
	
	@SubscribeEvent
	public static void checkCrateKey(PlayerInteractEvent.RightClickBlock interact) {
		BlockPos pos = interact.getPos();
		World w = interact.getWorld();
		TileEntity te = w.getTileEntity(pos);
		if(te!=null&&(te instanceof TileEntityLockableLoot)) {
			TileEntityLockableLoot chest = (TileEntityLockableLoot)te;
			if(chest.hasCustomName()&&chest.getCustomName().getFormattedText().endsWith("\u200b")) {
				if(chest.getLockCode().getLock().equals(interact.getItemStack().getDisplayName().getFormattedText()))
					{chest.setLockCode(LockCode.EMPTY_CODE); interact.getItemStack().shrink(1);}
			}
		}
	}

}
