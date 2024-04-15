package com.shengchanshe.shentong.entity.render;

import com.shengchanshe.shentong.ShenTongMod;
import com.shengchanshe.shentong.entity.ShangGuZhenMoEntity;
import com.shengchanshe.shentong.entity.model.ShangGuZhenMoModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;

public class ShangGuZhenMoRender extends Render<ShangGuZhenMoEntity> {
    private float prevRotation;// 保存上一帧的旋转角度
    private static final ResourceLocation SHANG_GU_ZHEN_MO = new ResourceLocation(ShenTongMod.MODID + ":textures/entity/shang_gu_mo_gong/zhen_mo.png");
    private ShangGuZhenMoModel zhenMoModel = new ShangGuZhenMoModel();
    protected ShangGuZhenMoRender(RenderManager renderManager) {
        super(renderManager);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(ShangGuZhenMoEntity entity) {
        return SHANG_GU_ZHEN_MO;
    }

    @Override
    public void doRender(ShangGuZhenMoEntity entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GL11.glPushMatrix(); //将当前的渲染矩阵推入堆栈，以保存当前的渲染状态
        EntityPlayer player = Minecraft.getMinecraft().player; // 获取玩家实体对象
        float playerRotation = player.rotationYaw;   // 获取玩家的旋转角度
        GL11.glTranslated(x, y, z); //将模型的渲染坐标平移到指定的位置 (x, y, z)
        GL11.glRotatef(180, 0, 0, 1);//将模型绕着指定的轴旋转.这里的参数 (180, 0, 0, 1) 表示绕着Z轴旋转180度
        // 使用插值平滑过渡旋转角度
        float rotation = (prevRotation + (playerRotation - prevRotation) * partialTicks);
        GL11.glRotatef(rotation+180, 0, 1, 0);
        bindTexture(SHANG_GU_ZHEN_MO);  //指定的纹理来绑定当前正在渲染的模型
        zhenMoModel.render(entity, 0.0F, 0.0f, 0.0F, 0.0F, 0.0F, 0.0625F); //调用模型的 render 方法来进行渲染
        prevRotation = rotation;// 更新上一帧的旋转角度
        GL11.glPopMatrix(); //从堆栈中弹出之前保存的渲染矩阵，恢复之前的渲染状态。
    }
}
