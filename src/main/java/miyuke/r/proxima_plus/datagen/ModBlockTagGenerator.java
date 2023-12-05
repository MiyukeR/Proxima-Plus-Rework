package miyuke.r.proxima_plus.datagen;

import miyuke.r.proxima_plus.ProximaPlus;
import miyuke.r.proxima_plus.init.ModBlocks;
import miyuke.r.proxima_plus.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ProximaPlus.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.PROXIMA_B_STONE.get()).addTag(Tags.Blocks.STONE);
        
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
        	.add(ModBlocks.PROXIMA_B_SANDSTONE.get()).addTag(Tags.Blocks.STONE);
        
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
    		.add(ModBlocks.PROXIMA_B_STONE_SLAB.get()).addTag(Tags.Blocks.STONE);
        
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
    		.add(ModBlocks.PROXIMA_B_STONE_STAIRS.get()).addTag(Tags.Blocks.STONE);
        
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
    		.add(ModBlocks.PROXIMA_B_STONE_BUTTON.get()).addTag(Tags.Blocks.STONE);
        
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
    		.add(ModBlocks.PROXIMA_B_STONE_WALL.get()).addTag(Tags.Blocks.STONE);
    }
}