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

public class ModBlocks {

    public static final Block RED_CARPET_TRAPDOOR = registerBlock("red_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_CARPET_TRAPDOOR = registerBlock("white_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_CARPET_TRAPDOOR = registerBlock("orange_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_CARPET_TRAPDOOR = registerBlock("magenta_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_CARPET_TRAPDOOR = registerBlock("light_blue_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_CARPET_TRAPDOOR = registerBlock("yellow_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_CARPET_TRAPDOOR = registerBlock("lime_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_CARPET_TRAPDOOR = registerBlock("pink_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_CARPET_TRAPDOOR = registerBlock("gray_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_CARPET_TRAPDOOR = registerBlock("light_gray_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_CARPET_TRAPDOOR = registerBlock("cyan_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_CARPET_TRAPDOOR = registerBlock("purple_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_CARPET_TRAPDOOR = registerBlock("blue_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_CARPET_TRAPDOOR = registerBlock("brown_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_CARPET_TRAPDOOR = registerBlock("green_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_CARPET_TRAPDOOR = registerBlock("black_carpet_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.CARPET).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));

    public static final Block RED_CARPET_IRON_TRAPDOOR = registerBlock("red_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_CARPET_IRON_TRAPDOOR = registerBlock("white_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block ORANGE_CARPET_IRON_TRAPDOOR = registerBlock("orange_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block MAGENTA_CARPET_IRON_TRAPDOOR = registerBlock("magenta_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_BLUE_CARPET_IRON_TRAPDOOR = registerBlock("light_blue_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block YELLOW_CARPET_IRON_TRAPDOOR = registerBlock("yellow_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIME_CARPET_IRON_TRAPDOOR = registerBlock("lime_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PINK_CARPET_IRON_TRAPDOOR = registerBlock("pink_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block GRAY_CARPET_IRON_TRAPDOOR = registerBlock("gray_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block LIGHT_GRAY_CARPET_IRON_TRAPDOOR = registerBlock("light_gray_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block CYAN_CARPET_IRON_TRAPDOOR = registerBlock("cyan_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block PURPLE_CARPET_IRON_TRAPDOOR = registerBlock("purple_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLUE_CARPET_IRON_TRAPDOOR = registerBlock("blue_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block BROWN_CARPET_IRON_TRAPDOOR = registerBlock("brown_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block GREEN_CARPET_IRON_TRAPDOOR = registerBlock("green_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));
    public static final Block BLACK_CARPET_IRON_TRAPDOOR = registerBlock("black_carpet_iron_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f, 3.0f).sounds(BlockSoundGroup.WOOL)));



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
        System.out.println("Registering Carpet Trapdoors");
    }

}