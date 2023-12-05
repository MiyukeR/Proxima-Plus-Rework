package miyuke.r.proxima_plus.init;

import miyuke.r.proxima_plus.ProximaPlus;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.registries.*;
import net.minecraftforge.eventbus.api.*;

import java.util.function.Supplier;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, ProximaPlus.MODID);
	
	//Blocks
	public static final RegistryObject<Block> PROXIMA_B_STONE = registerBlock("proxima_b_stone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.STONE).requiresCorrectToolForDrops())); 
	public static final RegistryObject<Block> PROXIMA_B_STONE_SLAB = registerBlock("proxima_b_stone_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.STONE).requiresCorrectToolForDrops())); 
	public static final RegistryObject<Block> PROXIMA_B_SANDSTONE = registerBlock("proxima_b_sandstone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops())); 
	
	//Stairs
	public static final RegistryObject<Block> PROXIMA_B_STONE_STAIRS = registerBlock("proxima_b_stone_stairs",
			() -> new StairBlock(() -> ModBlocks.PROXIMA_B_STONE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	
	//Others
	public static final RegistryObject<Block> PROXIMA_B_STONE_BUTTON = registerBlock("proxima_b_stone_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE).requiresCorrectToolForDrops(), 
					BlockSetType.IRON, 10, true));
	public static final RegistryObject<Block> PROXIMA_B_STONE_WALL = registerBlock("proxima_b_stone_wall",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.STONE).requiresCorrectToolForDrops())); 
	
	
	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}
	
	
	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
		return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}
	
	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
