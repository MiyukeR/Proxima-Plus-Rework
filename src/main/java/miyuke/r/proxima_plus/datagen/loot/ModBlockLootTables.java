package miyuke.r.proxima_plus.datagen.loot;

import miyuke.r.proxima_plus.init.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
    	this.dropSelf(ModBlocks.PROXIMA_B_STONE.get());
    	this.dropSelf(ModBlocks.PROXIMA_B_SANDSTONE.get());
    	this.dropSelf(ModBlocks.PROXIMA_B_STONE_STAIRS.get());
    	this.dropSelf(ModBlocks.PROXIMA_B_STONE_WALL.get());
    	this.dropSelf(ModBlocks.PROXIMA_B_STONE_BUTTON.get());
    	
    	this.add(ModBlocks.PROXIMA_B_STONE_SLAB.get(),
    			block -> createSlabItemTable(ModBlocks.PROXIMA_B_STONE_SLAB.get()));
    }
    
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}