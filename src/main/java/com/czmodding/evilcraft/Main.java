	package com.czmodding.evilcraft;

	import com.czmodding.evilcraft.proxy.CommonProxy;
	import com.czmodding.evilcraft.util.Reference;

	import net.minecraftforge.fml.common.Mod;
	import net.minecraftforge.fml.common.Mod.EventHandler;
	import net.minecraftforge.fml.common.Mod.Instance;
	import net.minecraftforge.fml.common.SidedProxy;
	import net.minecraftforge.fml.common.event.FMLInitializationEvent;
	import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
	import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

	@Mod(modid=Reference.MODID, name=Reference.MODNAME, version=Reference.VERSION, acceptedMinecraftVersions=Reference.ACCEPTED_MINECRAFT_VERSIONS)

	public class Main {
		
		@Instance
		public static Main instance;
		
		@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
		public static CommonProxy proxy;
		
		@EventHandler
		public void preInit(FMLPreInitializationEvent event) {
			System.out.println(Reference.MODID + ":preInit");
		}
		
		@EventHandler
		public void init(FMLInitializationEvent event) {
			System.out.println(Reference.MODID + ":init");
			
		}
		
		@EventHandler
		public void postInit(FMLPostInitializationEvent event) {
			System.out.println(Reference.MODID + ":postInit");
		}
	}

