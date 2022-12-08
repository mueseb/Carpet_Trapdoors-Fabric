package net.fabricmc.carpettrapdoors.registry;

import net.fabricmc.carpettrapdoors.CarpetTrapdoorMain;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item NEW_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));

//    public static final BlockItem RUBY_TRAPDOOR = new BlockItem(ModBlocks.RUBY_TRAPDOOR, new Item.Settings().group(ItemGroup.REDSTONE));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(CarpetTrapdoorMain.MOD_ID, "new_item"), NEW_ITEM);
//        Registry.register(Registry.ITEM, new Identifier("tutorialmod", "ruby"), RUBY);
//        Registry.register(Registry.ITEM, new Identifier("tutorialmod", "ruby_trapdoor"), RUBY_TRAPDOOR);
    }

}
