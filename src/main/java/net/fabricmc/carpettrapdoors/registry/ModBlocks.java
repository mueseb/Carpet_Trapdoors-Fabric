package net.fabricmc.carpettrapdoors.registry;

import net.fabricmc.carpettrapdoors.CarpetTrapdoorMain;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final String[] colors = new String[] {"moss","white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"};
    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CarpetTrapdoorMain.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        BlockItem item = new BlockItem(block, new Item.Settings());
        ItemGroupEvents.modifyEntriesEvent(CarpetTrapdoorMain.CARPET_TRAPDOORS).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(CarpetTrapdoorMain.MOD_ID, name), item);
    }
    public static void registerModBlocks()
    {
        registerWoodenTrapdoors();
        registerIronTrapdoors();
    }

    public static void registerWoodenTrapdoors()
    {
        for (String color: colors) {
            registerBlock(color+"_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL), SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN));
        }
    }
    public static void registerIronTrapdoors()
    {
        for (String color: colors) {
            registerBlock(color+"_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL), SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN));
        }
    }

}
