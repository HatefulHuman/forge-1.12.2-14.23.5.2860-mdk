package com.shengchanshe.shentong;

import com.shengchanshe.shentong.common.CommonProxy;
import com.shengchanshe.shentong.common.EventLoader;
import com.shengchanshe.shentong.inventory.ShenTongUiLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ShenTongMod.MODID, name = ShenTongMod.NAME, version = ShenTongMod.VERSION ,dependencies = "required-after:fanrenxiuxian;")//dependencies = "required-after:Forge@[14.23.5.2705,)"
public class ShenTongMod {
    public static final String MODID = "shentong";
    public static final String NAME = "Shen Tong";
    public static final String VERSION = "1.0.6";

    public static Logger logger;

    @Mod.Instance
    public static ShenTongMod instance;

    @SidedProxy(clientSide = "com.shengchanshe.shentong.client.ClientProxy",
            serverSide = "com.shengchanshe.shentong.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);

    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event) {
        proxy.init(event);
        new ShenTongUiLoader();
        MinecraftForge.EVENT_BUS.register(new EventLoader());
	}

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    public static void serverInit(FMLServerStartingEvent event) {

    }

}