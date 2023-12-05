package miyuke.r.proxima_plus;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import miyuke.r.proxima_plus.ProximaPlus;
import miyuke.r.proxima_plus.init.*;

import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ProximaPlus.MODID)
public class ProximaPlus {

    public static final String MODID = "proxima_plus";
    private static final Logger LOGGER = LogUtils.getLogger();
    
    public ProximaPlus()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        //creative tabs
        ModCreativeTabs.register(modEventBus);
        //items
        ModItems.register(modEventBus);
        //
        ModBlocks.register(modEventBus);
        
        modEventBus.addListener(this::commonSetup);
        
        MinecraftForge.EVENT_BUS.register(this);
        
        modEventBus.addListener(this::addCreative);
        
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    
    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    	
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        	
        }
    }
}
