package miyuke.r.proxima_plus.init;

import miyuke.r.proxima_plus.ProximaPlus;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, ProximaPlus.MODID);
	
	
	//Guidebook
	public static final RegistryObject<Item> PROXIMADUX = ITEMS.register("proximadux", () -> new Item(new Item.Properties().stacksTo(64)));
	
	//Items
	
	
	//Blocks
	
	
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	
	}
}
