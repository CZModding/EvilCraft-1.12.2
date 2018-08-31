package com.czmodding.evilcraft.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.czmodding.evilcraft.items.ItemBasic;

public class ModItems {
 
static Item rubyGem;
	
	public static void init() {
		rubyGem = new ItemBasic("ruby_gem");
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(rubyGem);
	}
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(rubyGem);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}