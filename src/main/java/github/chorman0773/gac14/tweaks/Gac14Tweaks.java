package github.chorman0773.gac14.tweaks;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import github.chorman0773.gac14.tweaks.tags.entity_types.EntityTagList;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("gac14-tweaks")
public class Gac14Tweaks
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Gac14Tweaks() {


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    private EntityTagList tags = new EntityTagList();
    
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        event.getServer().getResourceManager().addReloadListener(tags::reload);
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        
    }
}
