package net.fabricmc.carpettrapdoors;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.carpettrapdoors.registry.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CarpetTrapdoorMain implements ModInitializer {

	public static final String MOD_ID = "carpettrapdoors";

	//() -> new ItemStack(Blocks.RED_CARPET)
	public static final ItemGroup CARPET_TRAPDOORS = FabricItemGroup.builder(new Identifier(MOD_ID, "carpet_trapdoors")).displayName(Text.literal("Carpet Trapdoors")).icon(() -> new ItemStack(Blocks.RED_CARPET)).build();

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}
