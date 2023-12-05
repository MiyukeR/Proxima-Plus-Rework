package miyuke.r.proxima_plus.init;

import miyuke.r.proxima_plus.ProximaPlus;
import miyuke.r.proxima_plus.init.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProximaPlus.MODID);
	
	public static final RegistryObject<CreativeModeTab> PROXIMA_PLUS = CREATIVE_MODE_TABS.register("proxima_plus",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PROXIMADUX.get()))
			.title(Component.translatable("creative_tab.proxima_plus"))
			.displayItems((pParameters, pOutput) -> {
				//1
				pOutput.accept(ModItems.PROXIMADUX.get());
				
				//2
				pOutput.accept(ModBlocks.PROXIMA_B_STONE.get());
				pOutput.accept(ModBlocks.PROXIMA_B_STONE_SLAB.get());
				pOutput.accept(ModBlocks.PROXIMA_B_STONE_STAIRS.get());
			//	pOutput.accept(ModBlocks.PROXIMA_B_STONE_WALL.get());
			//	pOutput.accept(ModBlocks.PROXIMA_B_STONE_BUTTON.get());
				pOutput.accept(ModBlocks.PROXIMA_B_SANDSTONE.get());
				
				//3
			
			
			})
			.build());
	
	
	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}
}
