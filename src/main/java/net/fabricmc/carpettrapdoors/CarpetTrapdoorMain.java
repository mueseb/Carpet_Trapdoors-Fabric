package net.fabricmc.carpettrapdoors;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.carpettrapdoors.registry.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CarpetTrapdoorMain implements ModInitializer {

	public static final String MOD_ID = "carpettrapdoors";
	public static final ItemGroup CARPET_TRAPDOORS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "carpet_trapdoors"), () -> new ItemStack(Blocks.RED_CARPET));

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}
