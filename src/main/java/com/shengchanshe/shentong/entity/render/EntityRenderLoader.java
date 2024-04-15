package com.shengchanshe.shentong.entity.render;

import com.shengchanshe.shentong.entity.*;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class EntityRenderLoader {
    public static void registerEntityRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(JianQiEntity.class,JianQiRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ZhenMoEntity.class,ZhenMoRender::new);
        RenderingRegistry.registerEntityRenderingHandler(WeRanZhengQiEntity.class, WeRanZhengQiRender::new);
        RenderingRegistry.registerEntityRenderingHandler(XuanGangZhenQiEntity.class,XuanGangZhenQiRender::new);
        RenderingRegistry.registerEntityRenderingHandler(CangSangZhengDaoEntity.class,CangSangZhengDaoRender::new);
        RenderingRegistry.registerEntityRenderingHandler(GuiMoDunEntity.class, GuiMoDunRender::new);
        RenderingRegistry.registerEntityRenderingHandler(MoGongEntity.class,MoGongRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ShangGuZhenMoEntity.class,ShangGuZhenMoRender::new);
    }
}
