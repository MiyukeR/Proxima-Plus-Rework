package miyuke.r.proxima_plus.datagen;

import miyuke.r.proxima_plus.ProximaPlus;
import miyuke.r.proxima_plus.init.*;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
	public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, ProximaPlus.MODID, exFileHelper);
	}
	
	@Override
	protected void registerStatesAndModels() {
		blockWithItem(ModBlocks.PROXIMA_B_STONE);
		blockWithItem(ModBlocks.PROXIMA_B_SANDSTONE);
		
		stairsBlock(((StairBlock) ModBlocks.PROXIMA_B_STONE_STAIRS.get()), blockTexture(ModBlocks.PROXIMA_B_STONE.get()));
		slabBlock(((SlabBlock) ModBlocks.PROXIMA_B_STONE_SLAB.get()), blockTexture(ModBlocks.PROXIMA_B_STONE.get()), blockTexture(ModBlocks.PROXIMA_B_STONE.get()));
		wallBlock(((WallBlock) ModBlocks.PROXIMA_B_STONE_WALL.get()), blockTexture(ModBlocks.PROXIMA_B_STONE.get()));
		
		buttonBlock(((ButtonBlock) ModBlocks.PROXIMA_B_STONE_BUTTON.get()), blockTexture(ModBlocks.PROXIMA_B_STONE.get()));
	}
	
	private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
		simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
	}
}
