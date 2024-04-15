package com.shengchanshe.shentong.client;

import com.shengchanshe.shentong.client.gui.ShenTongHUD;
import com.shengchanshe.shentong.common.CommonProxy;
import com.shengchanshe.shentong.entity.render.EntityRenderLoader;
import com.shengchanshe.shentong.key.KeyLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        EntityRenderLoader.registerEntityRenderers();
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
        new KeyLoader();
        // 创建并注册 HUD 实例
        ShenTongHUD shenTongHUD = new ShenTongHUD();
        MinecraftForge.EVENT_BUS.register(shenTongHUD);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
}
