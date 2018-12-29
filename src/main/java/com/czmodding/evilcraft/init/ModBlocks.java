package com.czmodding.evilcraft.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.czmodding.evilcraft.Reference;

@Mod.EventBusSubscriber(modid=Reference.MODID)

public class ModBlocks {

	static Block rubyBlock;
	
	public static void init() {
		
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		
	}
	
	public static void registerRender(Item item) {
		
	}
}
