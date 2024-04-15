package com.shengchanshe.shentong.client.gui;

import com.shengchanshe.shentong.ShenTongMod;
import com.shengchanshe.shentong.network.ModNetwork;
import com.shengchanshe.shentong.network.packet.EntityDataSyncMessageServer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.io.IOException;

@SideOnly(Side.CLIENT)
public class ShenTongGuiContainer extends GuiContainer {
    private static final String TEXTURE_PATH = ShenTongMod.MODID + ":" + "textures/gui/container/shen_tong_gui.png";
    private static final ResourceLocation TEXTURE = new ResourceLocation(TEXTURE_PATH);
    public static int shenTong1;
    public static int shenTong2;
    public static int shenTong3;
    protected static int width1 = 16,height1 = 16;

    private static final int BUTTON_L = 0;
    private static final int BUTTON_R = 1;
    private static final int BUTTON_L1 = 2;
    private static final int BUTTON_R1 = 3;
    private static final int BUTTON_L2 = 4;
    private static final int BUTTON_R2 = 5;

    private static final int BUTTON_WIDTH = 13;
    private static final int BUTTON_HEIGHT = 8;

    public ShenTongGuiContainer(Container inventorySlotsIn) {
        super(inventorySlotsIn);
        this.xSize = 80;
        this.ySize = 135;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        int offsetX1 = 32;
        GlStateManager.color(1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(TEXTURE);
        int offsetX = (this.width - this.xSize) / 2, offsetY = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(offsetX, offsetY, 0, 0, this.xSize, this.ySize);
        EntityPlayer player1 = this.mc.player;
        NBTTagCompound data1 = player1.getEntityData();
        if(data1.getDouble("GongFa6") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong1"),1,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/qing_yuan_jian_jue/qing_yuan_jian_qi.png",
                    offsetX,offsetY,offsetX1,23,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa6") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong2"),1,
                    ShenTongMod.MODID + ":" +"textures/gui/sheng_tong/qing_yuan_jian_jue/qing_yuan_jian_dun.png",
                    offsetX,offsetY,offsetX1,56,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa6") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong3"),1,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/qing_yuan_jian_jue/qing_yuan_jian_zhen.png",
                    offsetX,offsetY,offsetX1,89,0,0,width1,height1,width1,height1);
        }
        if(data1.getDouble("GongFa8") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong1"),2,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/ni_qing_duan_tian/ni_qing.png",
                    offsetX,offsetY,offsetX1,23,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa8") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong2"),2,
                    ShenTongMod.MODID + ":" +  "textures/gui/sheng_tong/ni_qing_duan_tian/jing_xin.png",
                    offsetX,offsetY,offsetX1,56,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa8") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong3"),2,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/ni_qing_duan_tian/duan_tian.png",
                    offsetX,offsetY,offsetX1,89,0,0,width1,height1,width1,height1);
        }
        if(data1.getDouble("GongFa31") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong1"),3,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/su_xin_lun_hui_gong/huo_dan.png",
                    offsetX,offsetY,offsetX1,23,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa31") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong2"),3,
                    ShenTongMod.MODID + ":" +  "textures/gui/sheng_tong/su_xin_lun_hui_gong/zhen_yan.png",
                    offsetX,offsetY,offsetX1,56,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa31") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong3"),3,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/su_xin_lun_hui_gong/nie_pan.png",
                    offsetX,offsetY,offsetX1,89,0,0,width1,height1,width1,height1);
        }
        if(data1.getDouble("GongFa21") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong1"),4,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/liu_ji_zhen_mo_gong/yi_zhuan_zhen_mo.png",
                    offsetX,offsetY,offsetX1,23,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa21") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong2"),4,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/liu_ji_zhen_mo_gong/san_zhuan_zhen_mo.png",
                    offsetX,offsetY,offsetX1,56,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa21") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong3"),4,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/liu_ji_zhen_mo_gong/liu_zhuan_zhen_mo.png",
                    offsetX,offsetY,offsetX1,89,0,0,width1,height1,width1,height1);
        }

        if(data1.getDouble("GongFa23") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong1"),5,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/hao_ran_zheng_qi_jue/wei_ran_zheng_qi.png",
                    offsetX,offsetY,offsetX1,23,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa23") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong2"),5,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/hao_ran_zheng_qi_jue/xuan_gang_zhen_qi.png",
                    offsetX,offsetY,offsetX1,56,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa23") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong3"),5,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/hao_ran_zheng_qi_jue/cang_sang_zheng_dao.png",
                    offsetX,offsetY,offsetX1,89,0,0,width1,height1,width1,height1);
        }
        if(data1.getDouble("GongFa24") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong1"),6,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/shang_gu_mo_gong/gui_mo_dun.png",
                    offsetX,offsetY,offsetX1,23,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa24") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong2"),6,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/shang_gu_mo_gong/mo_gong.png",
                    offsetX,offsetY,offsetX1,56,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa24") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong3"),6,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/shang_gu_mo_gong/zhen_mo.png",
                    offsetX,offsetY,offsetX1,89,0,0,width1,height1,width1,height1);
        }
        if(data1.getDouble("GongFa28") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong1"),7,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yuan_ci_shen_guang/hu_ti_yuan_ci.png",
                    offsetX,offsetY,offsetX1,23,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa28") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong2"),7,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yuan_ci_shen_guang/yuan_ci_shen_shan.png",
                    offsetX,offsetY,offsetX1,56,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa28") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong3"),7,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yuan_ci_shen_guang/shen_guang_wei_she.png",
                    offsetX,offsetY,offsetX1,89,0,0,width1,height1,width1,height1);
        }
        if(data1.getDouble("GongFa29") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong1"),8,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yin_yang_he_huan_gong/he_he_shu.png",
                    offsetX,offsetY,offsetX1,23,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa29") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong2"),8,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yin_yang_he_huan_gong/he_ji.png",
                    offsetX,offsetY,offsetX1,56,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa29") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong3"),8,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yin_yang_he_huan_gong/yin_yang_liang_cheng.png",
                    offsetX,offsetY,offsetX1,89,0,0,width1,height1,width1,height1);
        }
        if(data1.getDouble("GongFa30") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong1"),9,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/jiu_chong_shuang_jian_jue/he_jian_jue.png",
                    offsetX,offsetY,offsetX1,23,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa30") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong2"),9,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/jiu_chong_shuang_jian_jue/yi_jian_jue.png",
                    offsetX,offsetY,offsetX1,56,0,0,width1,height1,width1,height1);
        }
        if (data1.getDouble("GongFa30") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            jiNengTuBiaoGui(this.mc,data1.getInteger("ShenTong3"),9,
                    ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/jiu_chong_shuang_jian_jue/jiu_chong_shuang_jian.png",
                    offsetX,offsetY,offsetX1,89,0,0,width1,height1,width1,height1);
        }
    }
    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        EntityPlayer player1 = this.mc.player;
        NBTTagCompound data1 = player1.getEntityData();
        shenTong1 = data1.getInteger("ShenTong1");
        shenTong2 = data1.getInteger("ShenTong2");
        shenTong3 = data1.getInteger("ShenTong3");
//        if (data1.getDouble("GongFa6") >= 1) {
//            shenTong1 = 1;
//        }else if (data1.getDouble("GongFa8") >= 1){
//            shenTong1 = 2;
//        }else if (data1.getDouble("GongFa31") >= 1){
//            shenTong1 = 3;
//        }else if (data1.getDouble("GongFa21") >= 1){
//            shenTong1 = 4;
//        }else if (data1.getDouble("GongFa23") >= 1){
//            shenTong1 = 5;
//        }else if (data1.getDouble("GongFa24") >= 1){
//            shenTong1 = 6;
//        }else if (data1.getDouble("GongFa28") >= 1){
//            shenTong1 = 7;
//        }else if (data1.getDouble("GongFa29") >= 1){
//            shenTong1 = 8;
//        }else if (data1.getDouble("GongFa30") >= 1){
//            shenTong1 = 9;
//        }
//        if (data1.getDouble("GongFa6") >= 3) {
//            shenTong2 = 1;
//        }else if (data1.getDouble("GongFa8") >= 3){
//            shenTong2 = 2;
//        }else if (data1.getDouble("GongFa31") >= 3){
//            shenTong2 = 3;
//        }else if (data1.getDouble("GongFa21") >= 3){
//            shenTong2 = 4;
//        }else if (data1.getDouble("GongFa23") >= 3){
//            shenTong2 = 5;
//        }else if (data1.getDouble("GongFa24") >= 3){
//            shenTong2 = 6;
//        }else if (data1.getDouble("GongFa28") >= 3){
//            shenTong2 = 7;
//        }else if (data1.getDouble("GongFa29") >= 3){
//            shenTong2 = 8;
//        }else if (data1.getDouble("GongFa30") >= 3){
//            shenTong2 = 9;
//        }
//        if (data1.getDouble("GongFa6") >= 6) {
//            shenTong3 = 1;
//        }else if (data1.getDouble("GongFa8") >= 6){
//            shenTong3 = 2;
//        }else if (data1.getDouble("GongFa31") >= 6){
//            shenTong3 = 3;
//        }else if (data1.getDouble("GongFa21") >= 6){
//            shenTong3 = 4;
//        }else if (data1.getDouble("GongFa23") >= 6){
//            shenTong3 = 5;
//        }else if (data1.getDouble("GongFa24") >= 6){
//            shenTong3 = 6;
//        }else if (data1.getDouble("GongFa28") >= 6){
//            shenTong3 = 7;
//        }else if (data1.getDouble("GongFa29") >= 6){
//            shenTong3 = 8;
//        }else if (data1.getDouble("GongFa30") >= 6){
//            shenTong3 = 9;
//        }
        if (button.id == BUTTON_L || button.id == BUTTON_R) {
            // 当按钮ID为BUTTON_L时执行相应的操作
            if (data1.getDouble("GongFa6") >= 1) {
                shenTong1 = 1;
            }else if (data1.getDouble("GongFa8") >= 1){
                shenTong1 = 2;
            }else if (data1.getDouble("GongFa31") >= 1){
                shenTong1 = 3;
            }else if (data1.getDouble("GongFa21") >= 1){
                shenTong1 = 4;
            }else if (data1.getDouble("GongFa23") >= 1){
                shenTong1 = 5;
            }else if (data1.getDouble("GongFa24") >= 1){
                shenTong1 = 6;
            }else if (data1.getDouble("GongFa28") >= 1){
                shenTong1 = 7;
            }else if (data1.getDouble("GongFa29") >= 1){
                shenTong1 = 8;
            }else if (data1.getDouble("GongFa30") >= 1){
                shenTong1 = 9;
            }
        }
        if(button.id == BUTTON_L1 || button.id == BUTTON_R1){
            if (data1.getDouble("GongFa6") >= 3) {
                shenTong2 = 1;
            }else if (data1.getDouble("GongFa8") >= 3){
                shenTong2 = 2;
            }else if (data1.getDouble("GongFa31") >= 3){
                shenTong2 = 3;
            }else if (data1.getDouble("GongFa21") >= 3){
                shenTong2 = 4;
            }else if (data1.getDouble("GongFa23") >= 3){
                shenTong2 = 5;
            }else if (data1.getDouble("GongFa24") >= 3){
                shenTong2 = 6;
            }else if (data1.getDouble("GongFa28") >= 3){
                shenTong2 = 7;
            }else if (data1.getDouble("GongFa29") >= 3){
                shenTong2 = 8;
            }else if (data1.getDouble("GongFa30") >= 3){
                shenTong2 = 9;
            }
        }
        if (button.id == BUTTON_L2 || button.id == BUTTON_R2){
            if (data1.getDouble("GongFa6") >= 6) {
                shenTong3 = 1;
            }else if (data1.getDouble("GongFa8") >= 6){
                shenTong3 = 2;
            }else if (data1.getDouble("GongFa31") >= 6){
                shenTong3 = 3;
            }else if (data1.getDouble("GongFa21") >= 6){
                shenTong3 = 4;
            }else if (data1.getDouble("GongFa23") >= 6){
                shenTong3 = 5;
            }else if (data1.getDouble("GongFa24") >= 6){
                shenTong3 = 6;
            }else if (data1.getDouble("GongFa28") >= 6){
                shenTong3 = 7;
            }else if (data1.getDouble("GongFa29") >= 6){
                shenTong3 = 8;
            }else if (data1.getDouble("GongFa30") >= 6){
                shenTong3 = 9;
            }
        }
//        if (button.id == BUTTON_R) {
//            // 当按钮ID为BUTTON_L时执行相应的操作
//            if (shenTong1 >= 1 && shenTong1 < 9) {
//                shenTong1++;
//            } else {
//                shenTong1 = 1;
//            }
//        }
//        if (button.id == BUTTON_R1) {
//            if (shenTong2 >= 1 && shenTong2 < 9) {
//                shenTong2++;
//            } else {
//                shenTong2 = 1;
//            }
//        }
//        if (button.id == BUTTON_R2){
//            if (shenTong3 >= 1 && shenTong3 < 9){
//                shenTong3++;
//            }else {
//                shenTong3 = 1;
//            }
//        }
        NBTTagCompound data = new NBTTagCompound();
        data.setInteger("ShenTong1", shenTong1);
        data.setInteger("ShenTong2", shenTong2);
        data.setInteger("ShenTong3", shenTong3);
        if (data.getInteger("ShenTong1") == 5 && data1.getDouble("GongFa23") >= 1 && button.id == BUTTON_L && button.id == BUTTON_R){
            data.setBoolean("False1",false);
        }
        if (data.getInteger("ShenTong1") == 6 && data1.getDouble("GongFa24") >= 1 && button.id == BUTTON_L && button.id == BUTTON_R){
            data.setBoolean("False2",false);
        }
        if (data.getInteger("ShenTong1") == 7 && data1.getDouble("GongFa28") >= 1 && button.id == BUTTON_L && button.id == BUTTON_R){
            data.setBoolean("HuTiShenGuangFalse",false);
        }
        if (data.getInteger("ShenTong2") == 5 && data1.getDouble("GongFa23") >= 3 && button.id == BUTTON_L1 && button.id == BUTTON_R1){
            data.setBoolean("False",false);
        }
        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data);
        ModNetwork.INSTANCE.sendToServer(message);
    }
    @Override
    public void initGui() {
        super.initGui();
        int offsetX = (this.width - this.xSize) / 2, offsetY = (this.height - this.ySize) / 2;
//        this.buttonList.add(new GuiButton(BUTTON_L, offsetX + 53, offsetY + 22, 13, 8, "") {
//            @Override
//            public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
//                if (this.visible) {
//                    GlStateManager.color(1.0F, 1.0F, 1.0F);
//                    mc.getTextureManager().bindTexture(TEXTURE);
//                    this.drawTexturedModalRect(this.x, this.y, 1, 127, this.width, this.height);
//                }
//            }
//        });
        button(BUTTON_L,offsetX,offsetY,14,30,1,135);
        button(BUTTON_R,offsetX,offsetY,53,30,1,144);
        button(BUTTON_L1,offsetX,offsetY,14,63,1,135);
        button(BUTTON_R1,offsetX,offsetY,53,63,1,144);
        button(BUTTON_L2,offsetX,offsetY,14,96,1,135);
        button(BUTTON_R2,offsetX,offsetY,53,96,1,144);
    }
    public void button(int button,int offsetX,int offsetY,int offsetX1,int offsetY1,int button_texture_x,int button_texture_y){
        this.buttonList.add(new GuiButton(button, offsetX + offsetX1 ,offsetY + offsetY1, BUTTON_WIDTH, BUTTON_HEIGHT, "") {
            @Override
            public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
                if (this.visible) {
                    GlStateManager.color(1.0F, 1.0F, 1.0F);
                    mc.getTextureManager().bindTexture(TEXTURE);
                    this.drawTexturedModalRect(this.x, this.y, button_texture_x, button_texture_y, this.width, this.height);
                }
            }
        });
    }

    public static void jiNengTuBiaoGui(Minecraft mc, int shenTong, int i, String texture, int offsetX, int offsetY, int offsetX1, int offsetY1, int u, int v, int width, int height, int textureWidth, int textureHeight){
        if (shenTong == i){
            mc.getTextureManager().bindTexture(new ResourceLocation(texture));
            drawModalRectWithCustomSizedTexture(offsetX + offsetX1, offsetY + offsetY1, u, v, width, height, textureWidth, textureHeight);
        }
    }
    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        String title = I18n.format("container.shengchanshe.shentongui");
        this.fontRenderer.drawString(title, (this.xSize - this.fontRenderer.getStringWidth(title)) / 2, 5, 0x404040,false);

        String title1 = I18n.format("container.shengchanshe.shentongui2");
        this.fontRenderer.drawString(title1, (this.xSize - this.fontRenderer.getStringWidth(title1)) / 2, 120, 0x404040,false);
        EntityPlayer player1 = this.mc.player;
        int shenTong1_Y= 43;
        int shenTong2_Y= 75;
        int shenTong3_Y= 110;
        NBTTagCompound data1 = player1.getEntityData();
        if(data1.getDouble("GongFa6") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            if (data1.getInteger("ShenTong1") == 1){
                this.fontRenderer.drawString("青元剑气", (this.xSize - this.fontRenderer.getStringWidth("青元剑气")) / 2, shenTong1_Y, 0x404040,false);
            }
        }
        if (data1.getDouble("GongFa6") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            if (data1.getInteger("ShenTong2") == 1){
                this.fontRenderer.drawString("青元剑盾", (this.xSize - this.fontRenderer.getStringWidth("青元剑盾")) / 2, shenTong2_Y, 0x404040,false);
            }
        }
        if (data1.getDouble("GongFa6") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            if (data1.getInteger("ShenTong3") == 1){
                this.fontRenderer.drawString("大庚剑阵", (this.xSize - this.fontRenderer.getStringWidth("大庚剑阵")) / 2, shenTong3_Y, 0x404040,false);
            }
        }
        if(data1.getDouble("GongFa8") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            if (data1.getInteger("ShenTong1") == 2){
                this.fontRenderer.drawString("逆情", (this.xSize - this.fontRenderer.getStringWidth("逆情")) / 2, shenTong1_Y, 0x404040,false);
            }
        }
        if (data1.getDouble("GongFa8") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            if (data1.getInteger("ShenTong2") == 2){
                this.fontRenderer.drawString("静心", (this.xSize - this.fontRenderer.getStringWidth("静心")) / 2, shenTong2_Y, 0x404040,false);
            }
        }
        if (data1.getDouble("GongFa8") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            if (data1.getInteger("ShenTong3") == 2){
                this.fontRenderer.drawString("断天", (this.xSize - this.fontRenderer.getStringWidth("断天")) / 2, shenTong3_Y, 0x404040,false);
            }
        }
        if(data1.getDouble("GongFa31") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            if (data1.getInteger("ShenTong1") == 3){
                this.fontRenderer.drawString("火弹", (this.xSize - this.fontRenderer.getStringWidth("火弹")) / 2, shenTong1_Y, 0x404040,false);
            }
        }
        if (data1.getDouble("GongFa31") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            if (data1.getInteger("ShenTong2") == 3){
                this.fontRenderer.drawString("真炎", (this.xSize - this.fontRenderer.getStringWidth("真炎")) / 2, shenTong2_Y, 0x404040,false);
            }
        }
        if (data1.getDouble("GongFa31") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            if (data1.getInteger("ShenTong3") == 3)
            this.fontRenderer.drawString("涅槃", (this.xSize - this.fontRenderer.getStringWidth("涅槃")) / 2, shenTong3_Y, 0x404040,false);
        }
        if(data1.getDouble("GongFa21") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            if (data1.getInteger("ShenTong1") == 4)
            this.fontRenderer.drawString("一极真魔", (this.xSize - this.fontRenderer.getStringWidth("一极真魔")) / 2, shenTong1_Y, 0x404040,false);
        }
        if (data1.getDouble("GongFa21") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            if (data1.getInteger("ShenTong2") == 4)
            this.fontRenderer.drawString("三极真魔", (this.xSize - this.fontRenderer.getStringWidth("三极真魔")) / 2, shenTong2_Y, 0x404040,false);
        }
        if (data1.getDouble("GongFa21") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            if (data1.getInteger("ShenTong3") == 4)
            this.fontRenderer.drawString("六极真魔", (this.xSize - this.fontRenderer.getStringWidth("六极真魔")) / 2, shenTong3_Y, 0x404040,false);
        }
        if(data1.getDouble("GongFa23") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            if (data1.getInteger("ShenTong1") == 5)
            this.fontRenderer.drawString("巍然正气", (this.xSize - this.fontRenderer.getStringWidth("巍然正气")) / 2, shenTong1_Y, 0x404040,false);
        }
        if (data1.getDouble("GongFa23") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            if (data1.getInteger("ShenTong2") == 5)
            this.fontRenderer.drawString("玄罡真气", (this.xSize - this.fontRenderer.getStringWidth("玄罡真气")) / 2, shenTong2_Y, 0x404040,false);
        }
        if (data1.getDouble("GongFa23") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            if (data1.getInteger("ShenTong3") == 5)
            this.fontRenderer.drawString("沧桑正道", (this.xSize - this.fontRenderer.getStringWidth("沧桑正道")) / 2, shenTong3_Y, 0x404040,false);
        }
        if(data1.getDouble("GongFa24") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            if (data1.getInteger("ShenTong1") == 6)
            this.fontRenderer.drawString("诡魔遁", (this.xSize - this.fontRenderer.getStringWidth("诡魔遁")) / 2, shenTong1_Y, 0x404040,false);
        }
        if (data1.getDouble("GongFa24") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            if (data1.getInteger("ShenTong2") == 6)
            this.fontRenderer.drawString("魔功", (this.xSize - this.fontRenderer.getStringWidth("魔功")) / 2, shenTong2_Y, 0x404040,false);
        }
        if (data1.getDouble("GongFa24") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            if (data1.getInteger("ShenTong3") == 6)
            this.fontRenderer.drawString("真魔", (this.xSize - this.fontRenderer.getStringWidth("真魔")) / 2, shenTong3_Y, 0x404040,false);
        }
        if(data1.getDouble("GongFa28") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            if (data1.getInteger("ShenTong1") == 7)
            this.fontRenderer.drawString("护体元磁", (this.xSize - this.fontRenderer.getStringWidth("护体元磁")) / 2, shenTong1_Y, 0x404040,false);
        }
        if (data1.getDouble("GongFa28") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            if (data1.getInteger("ShenTong2") == 7)
            this.fontRenderer.drawString("元磁神山", (this.xSize - this.fontRenderer.getStringWidth("元磁神山")) / 2, shenTong2_Y, 0x404040,false);
        }
        if (data1.getDouble("GongFa28") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            if (data1.getInteger("ShenTong3") == 7)
            this.fontRenderer.drawString("神光威慑", (this.xSize - this.fontRenderer.getStringWidth("神光威慑")) / 2, shenTong3_Y, 0x404040,false);
        }
        if(data1.getDouble("GongFa29") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            if (data1.getInteger("ShenTong1") == 8)
            this.fontRenderer.drawString("合击", (this.xSize - this.fontRenderer.getStringWidth("合击")) / 2, shenTong2_Y, 0x404040,false);
        }
        if (data1.getDouble("GongFa29") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            if (data1.getInteger("ShenTong2") == 8)
            this.fontRenderer.drawString("合和术", (this.xSize - this.fontRenderer.getStringWidth("合和术")) / 2, shenTong1_Y, 0x404040,false);
        }
        if (data1.getDouble("GongFa29") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            if (data1.getInteger("ShenTong3") == 8)
            this.fontRenderer.drawString("阴阳两成", (this.xSize - this.fontRenderer.getStringWidth("阴阳两成")) / 2, shenTong3_Y, 0x404040,false);
        }
        if(data1.getDouble("GongFa30") >= 1 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 2){
            if (data1.getInteger("ShenTong1") == 9)
            this.fontRenderer.drawString("合剑诀", (this.xSize - this.fontRenderer.getStringWidth("合剑诀")) / 2, shenTong1_Y, 0x404040,false);
        }
        if (data1.getDouble("GongFa30") >= 3 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 3){
            if (data1.getInteger("ShenTong2") == 9)
            this.fontRenderer.drawString("奕剑诀", (this.xSize - this.fontRenderer.getStringWidth("奕剑诀")) / 2, shenTong2_Y, 0x404040,false);
        }
        if (data1.getDouble("GongFa30") >= 6 && data1.hasKey("JingJieNum") && data1.getInteger("JingJieNum") >= 4) {
            if (data1.getInteger("ShenTong3") == 9)
            this.fontRenderer.drawString("九重双剑", (this.xSize - this.fontRenderer.getStringWidth("九重双剑")) / 2, shenTong3_Y, 0x404040,false);
        }
    }
}
