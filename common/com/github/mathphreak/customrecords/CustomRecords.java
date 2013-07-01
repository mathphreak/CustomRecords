package com.github.mathphreak.customrecords;

import com.github.mathphreak.customrecords.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_INFO.ID,name=Reference.MOD_INFO.NAME,version=Reference.MOD_INFO.VERSION)
public class CustomRecords {
    @Instance(Reference.MOD_INFO.ID)
    public static CustomRecords instance;
    
    /**
     * @param event  
     */
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        // load config; do version check?
        // initialize blocks/items
    }
    
    /**
     * @param event  
     */
    @Init
    public void init(FMLInitializationEvent event) {
        // events
        // crafting recipes
    }
    
    /**
     * @param event  
     */
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        // interact with other mods
    }
}
