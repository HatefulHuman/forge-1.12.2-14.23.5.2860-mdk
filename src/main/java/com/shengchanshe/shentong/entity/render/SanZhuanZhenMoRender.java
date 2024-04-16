package com.shengchanshe.shentong.entity.render;

import com.shengchanshe.shentong.ShenTongMod;
import com.shengchanshe.shentong.entity.SanZhuanZhenMoEntity;
import com.shengchanshe.shentong.entity.model.SanZhuanZhenMoModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;

public class SanZhuanZhenMoRender extends Render<SanZhuanZhenMoEntity> {
    private float prevRotation;// 保存上一帧的旋转角度
    private static final ResourceLocation SAN_ZHUAN_ZHENG_MO = new ResourceLocation(ShenTongMod.MODID + ":textures/entity/liu_ji_zhen_mo_gong/san_zhuan_zhen_mo.png");
    private SanZhuanZhenMoModel sanZhuanZhenMoModel = new SanZhuanZhenMoModel();
    protected SanZhuanZhenMoRender(RenderManager renderManager) {
        super(renderManager);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(SanZhuanZhenMoEntity entity) {
        return SAN_ZHUAN_ZHENG_MO;
    }

    @Override
    public void doRender(SanZhuanZhenMoEntity entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GL11.glPushMatrix(); //将当前的渲染矩阵推入堆栈，以保存当前的渲染状态
        EntityPlayer player = Minecraft.getMinecraft().player; // 获取玩家实体对象
        float playerRotation = player.rotationYaw;   // 获取玩家的旋转角度
        GL11.glTranslated(x, y, z); //将模型的渲染坐标平移到指定的位置 (x, y, z)
        GL11.glRotatef(180, 0, 0, 1);//将模型绕着指定的轴旋转.这里的参数 (180, 0, 0, 1) 表示绕着Z轴旋转180度
        // 使用插值平滑过渡旋转角度
        float rotation = (prevRotation + (playerRotation - prevRotation) * partialTicks);
        GL11.glRotatef(rotation+180, 0, 1, 0);
        bindTexture(SAN_ZHUAN_ZHENG_MO);
        sanZhuanZhenMoModel.render(entity, 0.0F, 0.0f, 0.0F, 0.0F, 0.0F, 0.0625F); //调用模型的 render 方法来进行渲染
        prevRotation = rotation;// 更新上一帧的旋转角度
        GL11.glPopMatrix(); //从堆栈中弹出之前保存的渲染矩阵，恢复之前的渲染状态。
    }
}
