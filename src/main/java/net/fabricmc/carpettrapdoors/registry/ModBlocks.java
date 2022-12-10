package net.fabricmc.carpettrapdoors.registry;

import net.fabricmc.carpettrapdoors.CarpetTrapdoorMain;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Arrays;

public class ModBlocks {

    public static final String[] colors = new String[] {"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"};

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(CarpetTrapdoorMain.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(CarpetTrapdoorMain.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(CarpetTrapdoorMain.CARPET_TRAPDOORS)));
    }
    public static void registerModBlocks()
    {
        registerWoodenTrapdoors();
        registerIronTrapdoors();
    }

    public static void registerWoodenTrapdoors()
    {
        for (String color: colors) {
            registerBlock(color+"_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
        }
    }
    public static void registerIronTrapdoors()
    {
        for (String color: colors) {
            registerBlock(color+"_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
        }
    }
}
