package at.mueseb.carpettrapdoors;

import at.mueseb.carpettrapdoors.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CarpetTrapdoorMain implements ModInitializer {

	public static final String MOD_ID = "carpettrapdoors";
	public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "carpet_trapdoors"));

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder().icon(() -> new ItemStack(Items.RED_CARPET)).displayName(Text.translatable("Carpet Trapdoors")).build());
		ModBlocks.registerModBlocks();

	}
}
