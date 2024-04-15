package com.shengchanshe.shentong.entity.render;

import com.shengchanshe.shentong.ShenTongMod;
import com.shengchanshe.shentong.entity.JianQiEntity;
import com.shengchanshe.shentong.entity.model.JianQiModelE;
import com.shengchanshe.shentong.entity.model.JianQiModelN;
import com.shengchanshe.shentong.entity.model.JianQiModelS;
import com.shengchanshe.shentong.entity.model.JianQiModelW;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class JianQiRender extends Render<JianQiEntity> {
    private static final ResourceLocation GRENADE = new ResourceLocation(ShenTongMod.MODID + ":textures/entity/qing_yuan_jian_qi.png");
    private JianQiModelN modelN = new JianQiModelN();
    private JianQiModelS modelS = new JianQiModelS();
    private JianQiModelW modelW = new JianQiModelW();
    private JianQiModelE modelE = new JianQiModelE();

    public JianQiRender(RenderManager renderManager) {
            super(renderManager);
    }

    @Override
    protected ResourceLocation getEntityTexture(JianQiEntity entity) {
            return GRENADE;

    }

    @Override
    public void doRender(JianQiEntity entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GL11.glPushMatrix();
        bindTexture(GRENADE);
        GL11.glTranslated(x, y, z);
        GL11.glRotatef(180, 0, 0, 1);
        EntityPlayer player = Minecraft.getMinecraft().player; // 获取玩家实体对象
        EnumFacing facing = player.getHorizontalFacing();
        if (facing == EnumFacing.NORTH) {
            // 玩家面朝北方
            modelN.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        } else if (facing == EnumFacing.SOUTH) {
            // 玩家面朝南方
            modelS.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        } else if (facing == EnumFacing.WEST) {
            // 玩家面朝西方
            modelW.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        } else if (facing == EnumFacing.EAST) {
            // 玩家面朝东方
            modelE.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        }
        GL11.glPopMatrix();
    }
}