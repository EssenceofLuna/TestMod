package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "0.0.0.1";

    @SidedProxy(clientSide="com.example.examplemod.ClientOnlyProxy", serverSide="com.example.examplemod.DedicatedServerProxy")
    public static CommonProxy proxy;
    

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit();
    }
    
    public static String prependModID(String name) {return MODID+":"+name;}
}
