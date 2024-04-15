package com.shengchanshe.shentong.client.gui;

import com.shengchanshe.shentong.ShenTongMod;
import com.shengchanshe.shentong.shentong.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class ShenTongHUD extends Gui {
    private static final ResourceLocation TEXTURE = new ResourceLocation( ShenTongMod.MODID + ":textures/gui/container/shen_tong_hud.png");
    private static final ResourceLocation QING_YUAN_JIAN_QI = new ResourceLocation( ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/qing_yuan_jian_jue/qing_yuan_jian_qi.png");
    private static final ResourceLocation QING_YUAN_JIAN_DUN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/qing_yuan_jian_jue/qing_yuan_jian_dun.png");
    private static final ResourceLocation QING_YUAN_JIAN_ZHEN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/qing_yuan_jian_jue/qing_yuan_jian_zhen.png");
    private static final ResourceLocation LENG_QUE_ZHONG_QING_YUAN_JIAN_QI = new ResourceLocation( ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/qing_yuan_jian_jue/leng_que_zhong_qing_yuan_jian_qi.png");
    private static final ResourceLocation LENG_QUE_ZHONG_QING_YUAN_JIAN_DUN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/qing_yuan_jian_jue/leng_que_zhong_qing_yuan_jian_dun.png");
    private static final ResourceLocation LENG_QUE_ZHONG_QING_YUAN_JIAN_ZHEN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/qing_yuan_jian_jue/leng_que_zhong_qing_yuan_jian_zhen.png");

    private static final ResourceLocation NI_QING = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/ni_qing_duan_tian/ni_qing.png");
    private static final ResourceLocation JING_XIN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/ni_qing_duan_tian/jing_xin.png");
    private static final ResourceLocation DUAN_TIAN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/ni_qing_duan_tian/duan_tian.png");
    private static final ResourceLocation LENG_QUE_ZHONG_NI_QING = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/ni_qing_duan_tian/leng_que_zhong_ni_qing.png");
    private static final ResourceLocation LENG_QUE_ZHONG_JING_XIN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/ni_qing_duan_tian/leng_que_zhong_jing_xin.png");
    private static final ResourceLocation LENG_QUE_ZHONG_DUAN_TIAN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/ni_qing_duan_tian/leng_que_zhong_duan_tian.png");

    private static final ResourceLocation HUO_DAN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/su_xin_lun_hui_gong/huo_dan.png");
    private static final ResourceLocation ZHEN_YAN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/su_xin_lun_hui_gong/zhen_yan.png");
    private static final ResourceLocation NIE_PAN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/su_xin_lun_hui_gong/nie_pan.png");
    private static final ResourceLocation LENG_QUE_ZHONG_HUO_DAN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/su_xin_lun_hui_gong/leng_que_zhong_huo_dan.png");
    private static final ResourceLocation LENG_QUE_ZHONG_ZHEN_YAN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/su_xin_lun_hui_gong/leng_que_zhong_zhen_yan.png");
    private static final ResourceLocation LENG_QUE_ZHONG_NIE_PAN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/su_xin_lun_hui_gong/leng_que_zhong_nie_pan.png");

    private static final ResourceLocation YI_ZHUAN_ZHEN_MO = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/liu_ji_zhen_mo_gong/yi_zhuan_zhen_mo.png");
    private static final ResourceLocation SAN_ZHUAN_ZHEN_MO = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/liu_ji_zhen_mo_gong/san_zhuan_zhen_mo.png");
    private static final ResourceLocation LIU_ZHUAN_ZHEN_MO = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/liu_ji_zhen_mo_gong/liu_zhuan_zhen_mo.png");
    private static final ResourceLocation LENG_QUE_ZHONG_YI_ZHUAN_ZHEN_MO = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/liu_ji_zhen_mo_gong/leng_que_zhong_yi_zhuan_zhen_mo.png");
    private static final ResourceLocation LENG_QUE_ZHONG_SAN_ZHUAN_ZHEN_MO = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/liu_ji_zhen_mo_gong/leng_que_zhong_san_zhuan_zhen_mo.png");
    private static final ResourceLocation LENG_QUE_ZHONG_LIU_ZHUAN_ZHEN_MO = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/liu_ji_zhen_mo_gong/leng_que_zhong_liu_zhuan_zhen_mo.png");

    private static final ResourceLocation WEI_RAN_ZHENG_QI = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/hao_ran_zheng_qi_jue/wei_ran_zheng_qi.png");
    private static final ResourceLocation XUAN_GENG_ZHEN_QI = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/hao_ran_zheng_qi_jue/xuan_gang_zhen_qi.png");
    private static final ResourceLocation CANG_SANG_ZHENG_DAO = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/hao_ran_zheng_qi_jue/cang_sang_zheng_dao.png");
    private static final ResourceLocation LENG_QUE_ZHONG_WEI_RAN_ZHENG_QI = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/hao_ran_zheng_qi_jue/leng_que_zhong_wei_ran_zheng_qi.png");
    private static final ResourceLocation LENG_QUE_ZHONG_XUAN_GENG_ZHEN_QI = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/hao_ran_zheng_qi_jue/leng_que_zhong_xuan_geng_zhen_qi.png");
    private static final ResourceLocation LENG_QUE_ZHONG_CANG_SANG_ZHENG_DAO = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/hao_ran_zheng_qi_jue/leng_que_zhong_cang_sang_zheng_dao.png");

    private static final ResourceLocation GUI_MO_DUN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/shang_gu_mo_gong/gui_mo_dun.png");
    private static final ResourceLocation MO_GONG = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/shang_gu_mo_gong/mo_gong.png");
    private static final ResourceLocation ZHEN_MO = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/shang_gu_mo_gong/zhen_mo.png");
    private static final ResourceLocation LENG_QUE_ZHONG_GUI_MO_DUN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/shang_gu_mo_gong/leng_que_zhong_gui_mo_dun.png");
    private static final ResourceLocation LENG_QUE_ZHONG_MO_GONG = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/shang_gu_mo_gong/leng_que_zhong_mo_gong.png");
    private static final ResourceLocation LENG_QUE_ZHONG_ZHEN_MO = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/shang_gu_mo_gong/leng_que_zhong_zhen_mo.png");

    private static final ResourceLocation HU_TI_YUAN_CI = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yuan_ci_shen_guang/hu_ti_yuan_ci.png");
    private static final ResourceLocation YUAN_CI_SHEN_SHAN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yuan_ci_shen_guang/yuan_ci_shen_shan.png");
    private static final ResourceLocation SHEN_GUANG_WEI_SHE = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yuan_ci_shen_guang/shen_guang_wei_she.png");
    private static final ResourceLocation LENG_QUE_ZHONG_HU_TI_YUAN_CI = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yuan_ci_shen_guang/leng_que_zhong_hu_ti_yuan_ci.png");
    private static final ResourceLocation LENG_QUE_ZHONG_YUAN_CI_SHEN_SHAN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yuan_ci_shen_guang/leng_que_zhong_yuan_ci_shen_shan.png");
    private static final ResourceLocation LENG_QUE_ZHONG_SHEN_GUANG_WEI_SHE = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yuan_ci_shen_guang/leng_que_zhong_shen_guang_wei_she.png");

    private static final ResourceLocation HE_HE_SHU = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yin_yang_he_huan_gong/he_he_shu.png");
    private static final ResourceLocation HE_JI = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yin_yang_he_huan_gong/he_ji.png");
    private static final ResourceLocation YIN_YANG_LIANG_CHENG = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yin_yang_he_huan_gong/yin_yang_liang_cheng.png");
    private static final ResourceLocation LENG_QUE_ZHONG_HE_HE_SHU = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yin_yang_he_huan_gong/leng_que_zhong_he_he_shu.png");
    private static final ResourceLocation LENG_QUE_ZHONG_HE_JI = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yin_yang_he_huan_gong/leng_que_zhong_he_ji.png");
    private static final ResourceLocation LENG_QUE_ZHONG_YIN_YANG_LIANG_CHENG = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/yin_yang_he_huan_gong/leng_que_zhong_yin_yang_liang_cheng.png");

    private static final ResourceLocation HE_JIAN_JUE = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/jiu_chong_shuang_jian_jue/he_jian_jue.png");
    private static final ResourceLocation YI_JIAN_JUE = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/jiu_chong_shuang_jian_jue/yi_jian_jue.png");
    private static final ResourceLocation JIU_CHONG_SHUANG_JIAN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/jiu_chong_shuang_jian_jue/jiu_chong_shuang_jian.png");
    private static final ResourceLocation LENG_QUE_ZHONG_HE_JIAN_JUE = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/jiu_chong_shuang_jian_jue/leng_que_zhong_he_jian_jue.png");
    private static final ResourceLocation LENG_QUE_ZHONG_YI_JIAN_JUE = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/jiu_chong_shuang_jian_jue/leng_que_zhong_yi_jian_jue.png");
    private static final ResourceLocation LENG_QUE_ZHONG_JIU_CHONG_SHUANG_JIAN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/jiu_chong_shuang_jian_jue/leng_que_zhong_jiu_chong_shuang_jian.png");

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onRenderGameOverlay(RenderGameOverlayEvent.Post event) {
        Minecraft mc = Minecraft.getMinecraft();
        Entity entity = mc.getRenderViewEntity();
        NBTTagCompound nbtTagCompound = mc.player.getEntityData();
        long current = mc.player.world.getTotalWorldTime();
        int posX = (event.getResolution().getScaledWidth()) / 2;
        int posY = (event.getResolution().getScaledHeight()) / 2;
        int w = (event.getResolution().getScaledWidth());
        int h = (event.getResolution().getScaledHeight());
        int h1 = 26;
        int w1 = 84;
        int w2 = 59;
        int w3 = 34;
        if (entity instanceof EntityPlayer) {
            ScaledResolution resolution = event.getResolution();
            GlStateManager.enableBlend();
            mc.getTextureManager().bindTexture(TEXTURE);
            //x, y：这是矩形的左上角的坐标。
            //u, v：这是纹理的左上角相对于纹理文件的偏移量。
            //width, height：这是纹理的宽度和高度，告诉Minecraft游戏引擎从纹理文件中截取多大区域。
            //textWidth, textHeight：这是告诉Minecraft游戏引擎将纹理绘制到屏幕上时要拉伸的宽度和高度。
            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- 97, h- 35, 0, 0,
                    256, 256, 256, 256);

            if(nbtTagCompound.hasKey("ShenTong1") && nbtTagCompound.hasKey("JingJieNum") && nbtTagCompound.getInteger("JingJieNum") >= 2){
                if (nbtTagCompound.getInteger("ShenTong1") == 1 && nbtTagCompound.getDouble("GongFa6") >= 1){
                    long qingYuanJianJue = current - QingYuanJianJue.tick;
                    if (QingYuanJianJue.tick == 0 || current - QingYuanJianJue.tick >= 30){
                        mc.getTextureManager().bindTexture(QING_YUAN_JIAN_QI);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w - w1, h- h1, 0, 0, 16, 16,16,16);
                    }else {
                        int partialWidth = Math.toIntExact(16 * qingYuanJianJue / 30);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_QING_YUAN_JIAN_QI);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(QING_YUAN_JIAN_QI);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong1") == 2 && nbtTagCompound.getDouble("GongFa8") >= 1){
                    if (nbtTagCompound.getBoolean("BeiDong")){
                        mc.getTextureManager().bindTexture(NI_QING);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                    }else if(!nbtTagCompound.getBoolean("BeiDong")) {
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_NI_QING);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong1") == 3 && nbtTagCompound.getDouble("GongFa31") >= 1){
                    long huoDan = current - SuXinLunHuiGong.tick;
                    if(SuXinLunHuiGong.tick == 0||current - SuXinLunHuiGong.tick >= 40){
                        mc.getTextureManager().bindTexture(HUO_DAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                    }else {
                        int partialWidth = Math.toIntExact(16 * huoDan / 40);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_HUO_DAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(HUO_DAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong1") == 4 && nbtTagCompound.getDouble("GongFa21") >= 1){
                    long yiZhuanZhenMo = current - LiuJiZhenMoGong.tick;
                    if (LiuJiZhenMoGong.tick == 0 || current -  LiuJiZhenMoGong.tick >= 200){
                        mc.getTextureManager().bindTexture(YI_ZHUAN_ZHEN_MO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                    }else{
                        int partialWidth = Math.toIntExact(16 * yiZhuanZhenMo / 200);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_YI_ZHUAN_ZHEN_MO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(YI_ZHUAN_ZHEN_MO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong1") == 5 && nbtTagCompound.getDouble("GongFa23") >= 1){
                    if (nbtTagCompound.getBoolean("BeiDong")){
                        mc.getTextureManager().bindTexture(WEI_RAN_ZHENG_QI);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                    }else if(!nbtTagCompound.getBoolean("BeiDong")) {
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_WEI_RAN_ZHENG_QI);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong1") == 6 && nbtTagCompound.getDouble("GongFa24") >= 1){
                    if (nbtTagCompound.getBoolean("BeiDong")){
                        mc.getTextureManager().bindTexture(GUI_MO_DUN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                    }else if(!nbtTagCompound.getBoolean("BeiDong")) {
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_GUI_MO_DUN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong1") == 7 && nbtTagCompound.getDouble("GongFa28") >= 1){
                    if (nbtTagCompound.getBoolean("BeiDong")){
                        mc.getTextureManager().bindTexture(HU_TI_YUAN_CI);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                    }else if(!nbtTagCompound.getBoolean("BeiDong")) {
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_HU_TI_YUAN_CI);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong1") == 8 && nbtTagCompound.getDouble("GongFa29") >= 1){
                    long heHeShu = current - YinYangHeHuanGong.tick1;
                    if (YinYangHeHuanGong.tick1 == 0 || current - YinYangHeHuanGong.tick1 >= 1200){
                        mc.getTextureManager().bindTexture(HE_HE_SHU);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                    }else{
                        int partialWidth = Math.toIntExact(16 * heHeShu / 1200);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_HE_HE_SHU);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(HE_HE_SHU);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong1") == 9 && nbtTagCompound.getDouble("GongFa30") >= 1){
                    long heJianJue = current - JiuChongShuanJianJue.tick1;
                    if (JiuChongShuanJianJue.tick1 == 0 || current - JiuChongShuanJianJue.tick1 >= 1200){
                        mc.getTextureManager().bindTexture(HE_JIAN_JUE);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                    }else{
                        int partialWidth = Math.toIntExact(16 * heJianJue / 1200);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_HE_JIAN_JUE);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(HE_JIAN_JUE);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }
            }

            if(nbtTagCompound.hasKey("ShenTong2") && nbtTagCompound.hasKey("JingJieNum") && nbtTagCompound.getInteger("JingJieNum") >= 3){
                if (nbtTagCompound.getInteger("ShenTong2") == 1 && nbtTagCompound.getDouble("GongFa6") >= 3){
                    long qingYuanJianDun = current - QingYuanJianJue.tick1;
                    if (QingYuanJianJue.tick1 == 0 || current - QingYuanJianJue.tick1>=120){
                        mc.getTextureManager().bindTexture(QING_YUAN_JIAN_DUN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                    }else {
                        int partialWidth = Math.toIntExact(16 * qingYuanJianDun / 120);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_QING_YUAN_JIAN_DUN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(QING_YUAN_JIAN_DUN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong2") == 2 && nbtTagCompound.getDouble("GongFa8") >= 3){
                    long jingXin = current - NiQingDuanTianDaFa.tick;
                    if (NiQingDuanTianDaFa.tick == 0 || current - NiQingDuanTianDaFa.tick >= 200){
                        mc.getTextureManager().bindTexture(JING_XIN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                    }else {
                        int partialWidth = Math.toIntExact(16 * jingXin / 200);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_JING_XIN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(JING_XIN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong2") == 3 && nbtTagCompound.getDouble("GongFa31") >= 3){
                    if (nbtTagCompound.getBoolean("BeiDong1")){
                        mc.getTextureManager().bindTexture(ZHEN_YAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                    }else if(!nbtTagCompound.getBoolean("BeiDong1")) {
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_ZHEN_YAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong2") == 4 && nbtTagCompound.getDouble("GongFa21") >= 3){
                    long sanZhuanZhenMo = current - LiuJiZhenMoGong.tick1;
                    if (LiuJiZhenMoGong.tick1 == 0 || current -  LiuJiZhenMoGong.tick1 >= 360){
                        mc.getTextureManager().bindTexture(SAN_ZHUAN_ZHEN_MO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                    }else{
                        int partialWidth = Math.toIntExact(16 * sanZhuanZhenMo / 360);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_SAN_ZHUAN_ZHEN_MO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(SAN_ZHUAN_ZHEN_MO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong2") == 5 && nbtTagCompound.getDouble("GongFa23") >= 3){
                    if (nbtTagCompound.getBoolean("BeiDong1")){
                        mc.getTextureManager().bindTexture(XUAN_GENG_ZHEN_QI);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                    }else if(!nbtTagCompound.getBoolean("BeiDong1")) {
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_XUAN_GENG_ZHEN_QI);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong2") == 6 && nbtTagCompound.getDouble("GongFa24") >= 3){
                    long moGong = current - ShangGuMoGong.tick;
                    if (ShangGuMoGong.tick == 0 || current -  ShangGuMoGong.tick >= 180){
                        mc.getTextureManager().bindTexture(MO_GONG);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                    }else{
                        int partialWidth = Math.toIntExact(16 * moGong / 180);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_MO_GONG);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(MO_GONG);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, partialWidth, 16,16,16);
                    };
                }else if (nbtTagCompound.getInteger("ShenTong2") == 7 && nbtTagCompound.getDouble("GongFa28") >= 3){
                    if (nbtTagCompound.getBoolean("BeiDong1")){
                        mc.getTextureManager().bindTexture(YUAN_CI_SHEN_SHAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                    }else if(!nbtTagCompound.getBoolean("BeiDong1")) {
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_YUAN_CI_SHEN_SHAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong2") == 8 && nbtTagCompound.getDouble("GongFa29") >= 3){
                    long heJi = current - YinYangHeHuanGong.tick2;
                    if (YinYangHeHuanGong.tick2 == 0 || current - YinYangHeHuanGong.tick2 >= 360){
                        mc.getTextureManager().bindTexture(HE_JI);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                    }else{
                        int partialWidth = Math.toIntExact(16 * heJi / 360);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_HE_JI);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(HE_JI);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong2") == 9 && nbtTagCompound.getDouble("GongFa30") >= 3){
                    if (nbtTagCompound.getBoolean("BeiDong1")){
                        long yiJianJue = current - JiuChongShuanJianJue.tick2;
                        if (JiuChongShuanJianJue.tick2 == 0 || current - JiuChongShuanJianJue.tick2 >= 40){
                            mc.getTextureManager().bindTexture(YI_JIAN_JUE);
                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                        }else{
                            int partialWidth = Math.toIntExact(16 * yiJianJue / 40);
                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_YI_JIAN_JUE);
                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                            mc.getTextureManager().bindTexture(YI_JIAN_JUE);
                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, partialWidth, 16,16,16);
                        }
                    }else if(!nbtTagCompound.getBoolean("BeiDong1")) {
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_YUAN_CI_SHEN_SHAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
                    }

                }
            }

            if (nbtTagCompound.hasKey("ShenTong3") && nbtTagCompound.hasKey("JingJieNum") && nbtTagCompound.getInteger("JingJieNum") >= 4){
                if (nbtTagCompound.getInteger("ShenTong3") == 1 && nbtTagCompound.getDouble("GongFa6") >= 6){
                    long qingYuanJianZhen = current - QingYuanJianJue.tick2;
                    if (QingYuanJianJue.tick2 == 0 || current - QingYuanJianJue.tick2>=1200){
                        mc.getTextureManager().bindTexture(QING_YUAN_JIAN_ZHEN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                    }else {
                        int partialWidth = Math.toIntExact(16 * qingYuanJianZhen / 1200);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_QING_YUAN_JIAN_ZHEN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(QING_YUAN_JIAN_ZHEN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong3") == 2 && nbtTagCompound.getDouble("GongFa8") >= 6){
                    long duanTian = current - NiQingDuanTianDaFa.tick1;
                    if (NiQingDuanTianDaFa.tick1 == 0 || current - NiQingDuanTianDaFa.tick1 >= 1200){
                        mc.getTextureManager().bindTexture(DUAN_TIAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                    }else {
                        int partialWidth = Math.toIntExact(16 * duanTian / 1200);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_DUAN_TIAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(DUAN_TIAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong3") == 3 && nbtTagCompound.getDouble("GongFa31") >= 6){
                    long niePan = current - SuXinLunHuiGong.tick2;
                    if (SuXinLunHuiGong.tick2 == 0 || current - SuXinLunHuiGong.tick2 >= 1200){
                        mc.getTextureManager().bindTexture(NIE_PAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                    }else {
                        int partialWidth = Math.toIntExact(16 * niePan / 1200);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_NIE_PAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(NIE_PAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong3") == 4 && nbtTagCompound.getDouble("GongFa21") >= 6){
                    long liuZhuanZhenMo = current - LiuJiZhenMoGong.tick2;
                    if (LiuJiZhenMoGong.tick2 == 0 || current -  LiuJiZhenMoGong.tick2 >= 1200){
                        mc.getTextureManager().bindTexture(LIU_ZHUAN_ZHEN_MO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                    }else{
                        int partialWidth = Math.toIntExact(16 * liuZhuanZhenMo / 1200);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_LIU_ZHUAN_ZHEN_MO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(LIU_ZHUAN_ZHEN_MO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong3") == 5 && nbtTagCompound.getDouble("GongFa23") >= 6){
                    long cangSangZhengDao = current - HaoRanZhengQiJue.tick;
                    if (HaoRanZhengQiJue.tick == 0 || current -  HaoRanZhengQiJue.tick >= 1200){
                        mc.getTextureManager().bindTexture(CANG_SANG_ZHENG_DAO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                    }else{
                        int partialWidth = Math.toIntExact(16 * cangSangZhengDao / 1200);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_CANG_SANG_ZHENG_DAO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(CANG_SANG_ZHENG_DAO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong3") == 6 && nbtTagCompound.getDouble("GongFa24") >= 6){
                    long zhenMo = current - ShangGuMoGong.tick1;
                    if (ShangGuMoGong.tick1 == 0 || current -  ShangGuMoGong.tick1 >= 1200){
                        mc.getTextureManager().bindTexture(ZHEN_MO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                    }else{
                        int partialWidth = Math.toIntExact(16 * zhenMo / 1200);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_ZHEN_MO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(ZHEN_MO);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong3") == 7 && nbtTagCompound.getDouble("GongFa28") >= 6){
                    long shenGuangWeiShe = current - YuanCiShenGuang.tick;
                    if (YuanCiShenGuang.tick == 0 || current -  YuanCiShenGuang.tick >= 1200){
                        mc.getTextureManager().bindTexture(SHEN_GUANG_WEI_SHE);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                    }else{
                        int partialWidth = Math.toIntExact(16 * shenGuangWeiShe / 1200);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_SHEN_GUANG_WEI_SHE);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(SHEN_GUANG_WEI_SHE);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong3") == 8 && nbtTagCompound.getDouble("GongFa29") >= 6){
                    long yinYangLiangCheng = current - YinYangHeHuanGong.tick3;
                    if (YinYangHeHuanGong.tick3 == 0 || current - YinYangHeHuanGong.tick3 >= 1200){
                        mc.getTextureManager().bindTexture(YIN_YANG_LIANG_CHENG);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                    }else{
                        int partialWidth = Math.toIntExact(16 * yinYangLiangCheng / 1200);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_YIN_YANG_LIANG_CHENG);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(YIN_YANG_LIANG_CHENG);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }else if (nbtTagCompound.getInteger("ShenTong3") == 9 && nbtTagCompound.getDouble("GongFa30") >= 6){
                    long jiuChongShuangJian = current - JiuChongShuanJianJue.tick3;
                    if (JiuChongShuanJianJue.tick3 == 0 || current - JiuChongShuanJianJue.tick3 >= 1200){
                        mc.getTextureManager().bindTexture(JIU_CHONG_SHUANG_JIAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                    }else{
                        int partialWidth = Math.toIntExact(16 * jiuChongShuangJian / 1200);
                        mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_JIU_CHONG_SHUANG_JIAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
                        mc.getTextureManager().bindTexture(JIU_CHONG_SHUANG_JIAN);
                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
                    }
                }
                //            if (mc.player != null && mc.player.capabilities != null && mc.player.capabilities.isCreativeMode) {
//                if(nbtTagCompound.hasKey("ShenTong1")){
//                    if (nbtTagCompound.getInteger("ShenTong1") == 1){
//                        long qingYuanJianJue = current - QingYuanJianJue.tick;
//                        if (QingYuanJianJue.tick == 0 || current - QingYuanJianJue.tick >= 30){
//                            mc.getTextureManager().bindTexture(QING_YUAN_JIAN_QI);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
//                        }else {
//                            int partialWidth = Math.toIntExact(16 * qingYuanJianJue / 30);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_QING_YUAN_JIAN_QI);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(QING_YUAN_JIAN_QI);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong1") == 2){
//                        mc.getTextureManager().bindTexture(NI_QING);
//                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
//                    }else if (nbtTagCompound.getInteger("ShenTong1") == 3){
//                        long huoDan = SuXinLunHuiGong.tick;
//                        if(SuXinLunHuiGong.tick == 0||current - SuXinLunHuiGong.tick >= 40){
//                            mc.getTextureManager().bindTexture(HUO_DAN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
//                        }else {
//                            int partialWidth = Math.toIntExact(16 * huoDan / 40);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_HUO_DAN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(HUO_DAN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong1") == 4){
//                        long yiZhuanZhenMo = LiuJiZhenMoGong.tick;
//                        if (LiuJiZhenMoGong.tick == 0 || current -  LiuJiZhenMoGong.tick >= 200){
//                            mc.getTextureManager().bindTexture(YI_ZHUAN_ZHEN_MO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
//                        }else{
//                            int partialWidth = Math.toIntExact(16 * yiZhuanZhenMo / 200);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_YI_ZHUAN_ZHEN_MO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(YI_ZHUAN_ZHEN_MO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong1") == 5){
//                        mc.getTextureManager().bindTexture(WEI_RAN_ZHENG_QI);
//                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
//                    }else if (nbtTagCompound.getInteger("ShenTong1") == 6){
//                        mc.getTextureManager().bindTexture(GUI_MO_DUN);
//                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
//                    }else if (nbtTagCompound.getInteger("ShenTong1") == 7){
//                        mc.getTextureManager().bindTexture(HU_TI_YUAN_CI);
//                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
//                    }else if (nbtTagCompound.getInteger("ShenTong1") == 8){
//                        long heHeShu = YinYangHeHuanGong.tick1;
//                        if (YinYangHeHuanGong.tick1 == 0 || current - YinYangHeHuanGong.tick1 >= 1200){
//                            mc.getTextureManager().bindTexture(HE_HE_SHU);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
//                        }else{
//                            int partialWidth = Math.toIntExact(16 * heHeShu / 1200);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_HE_HE_SHU);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(HE_HE_SHU);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong1") == 9){
//                        long heJianJue = JiuChongShuanJianJue.tick1;
//                        if (JiuChongShuanJianJue.tick1 == 0 || current - JiuChongShuanJianJue.tick1 >= 1200){
//                            mc.getTextureManager().bindTexture(HE_JIAN_JUE);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
//                        }else{
//                            int partialWidth = Math.toIntExact(16 * heJianJue / 1200);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_HE_JIAN_JUE);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(HE_JIAN_JUE);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w1, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }
//                }
//            }else {
//
//            }
//            if (mc.player != null && mc.player.capabilities != null && mc.player.capabilities.isCreativeMode) {
//                if(nbtTagCompound.hasKey("ShenTong2")){
//                    if (nbtTagCompound.getInteger("ShenTong2") == 1){
//                        long qingYuanJianDun = current - QingYuanJianJue.tick1;
//                        if (QingYuanJianJue.tick1 == 0 || current - QingYuanJianJue.tick1>=120){
//                            mc.getTextureManager().bindTexture(QING_YUAN_JIAN_DUN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                        }else {
//                            int partialWidth = Math.toIntExact(16 * qingYuanJianDun / 120);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_QING_YUAN_JIAN_DUN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(QING_YUAN_JIAN_DUN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong2") == 2){
//                        long jingXin = current - NiQingDuanTianDaFa.tick;
//                        if (NiQingDuanTianDaFa.tick == 0 || current - NiQingDuanTianDaFa.tick >= 200){
//                            mc.getTextureManager().bindTexture(JING_XIN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                        }else {
//                            int partialWidth = Math.toIntExact(16 * jingXin / 200);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_JING_XIN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(JING_XIN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong2") == 3){
//                        mc.getTextureManager().bindTexture(ZHEN_YAN);
//                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                    }else if (nbtTagCompound.getInteger("ShenTong2") == 4){
//                        long sanZhuanZhenMo = LiuJiZhenMoGong.tick1;
//                        if (LiuJiZhenMoGong.tick1 == 0 || current -  LiuJiZhenMoGong.tick1 >= 360){
//                            mc.getTextureManager().bindTexture(SAN_ZHUAN_ZHEN_MO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                        }else{
//                            int partialWidth = Math.toIntExact(16 * sanZhuanZhenMo / 360);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_SAN_ZHUAN_ZHEN_MO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(SAN_ZHUAN_ZHEN_MO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong2") == 5){
//                        mc.getTextureManager().bindTexture(XUAN_GENG_ZHEN_QI);
//                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                    }else if (nbtTagCompound.getInteger("ShenTong2") == 6){
//                        long moGong = ShangGuMoGong.tick;
//                        if (ShangGuMoGong.tick == 0 || current -  ShangGuMoGong.tick >= 180){
//                            mc.getTextureManager().bindTexture(MO_GONG);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                        }else{
//                            int partialWidth = Math.toIntExact(16 * moGong / 180);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_MO_GONG);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(MO_GONG);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong2") == 7){
//                        mc.getTextureManager().bindTexture(YUAN_CI_SHEN_SHAN);
//                        mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                    }else if (nbtTagCompound.getInteger("ShenTong2") == 8){
//                        long heJi = YinYangHeHuanGong.tick2;
//                        if (YinYangHeHuanGong.tick2 == 0 || current - YinYangHeHuanGong.tick2 >= 360){
//                            mc.getTextureManager().bindTexture(HE_JI);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                        }else{
//                            int partialWidth = Math.toIntExact(16 * heJi / 360);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_HE_JI);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(HE_JI);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong2") == 9){
//                        long yiJianJue = JiuChongShuanJianJue.tick2;
//                        if (JiuChongShuanJianJue.tick2 == 0 || current - JiuChongShuanJianJue.tick2 >= 40){
//                            mc.getTextureManager().bindTexture(YI_JIAN_JUE);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                        }else{
//                            int partialWidth = Math.toIntExact(16 * yiJianJue / 40);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_YI_JIAN_JUE);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(YI_JIAN_JUE);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }
//                }
//            }else {
//
//            }
//            if (mc.player != null && mc.player.capabilities != null && mc.player.capabilities.isCreativeMode) {
//                if (nbtTagCompound.hasKey("ShenTong3")){
//                    if (nbtTagCompound.getInteger("ShenTong3") == 1){
//                        long qingYuanJianZhen = current - QingYuanJianJue.tick2;
//                        if (QingYuanJianJue.tick2 == 0 || current - QingYuanJianJue.tick2>=1200){
//                            mc.getTextureManager().bindTexture(QING_YUAN_JIAN_ZHEN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                        }else {
//                            int partialWidth = Math.toIntExact(16 * qingYuanJianZhen / 1200);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_JING_XIN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(QING_YUAN_JIAN_ZHEN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w2, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong3") == 2){
//                        long duanTian = current - NiQingDuanTianDaFa.tick1;
//                        if (NiQingDuanTianDaFa.tick1 == 0 || current - NiQingDuanTianDaFa.tick1 >= 1200){
//                            mc.getTextureManager().bindTexture(DUAN_TIAN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                        }else {
//                            int partialWidth = Math.toIntExact(16 * duanTian / 1200);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_DUAN_TIAN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(DUAN_TIAN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong3") == 3){
//                        long niePan = SuXinLunHuiGong.tick2;
//                        if (SuXinLunHuiGong.tick2 == 0 || current - SuXinLunHuiGong.tick2 >= 1200){
//                            mc.getTextureManager().bindTexture(NIE_PAN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                        }else {
//                            int partialWidth = Math.toIntExact(16 * niePan / 1200);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_NIE_PAN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(NIE_PAN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong3") == 4){
//                        long liuZhuanZhenMo = LiuJiZhenMoGong.tick2;
//                        if (LiuJiZhenMoGong.tick2 == 0 || current -  LiuJiZhenMoGong.tick2 >= 1200){
//                            mc.getTextureManager().bindTexture(LIU_ZHUAN_ZHEN_MO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                        }else{
//                            int partialWidth = Math.toIntExact(16 * liuZhuanZhenMo / 1200);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_LIU_ZHUAN_ZHEN_MO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(LIU_ZHUAN_ZHEN_MO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong3") == 5){
//                        long cangSangZhengDao = HaoRanZhengQiJue.tick;
//                        if (HaoRanZhengQiJue.tick == 0 || current -  HaoRanZhengQiJue.tick >= 1200){
//                            mc.getTextureManager().bindTexture(CANG_SANG_ZHENG_DAO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                        }else{
//                            int partialWidth = Math.toIntExact(16 * cangSangZhengDao / 1200);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_CANG_SANG_ZHENG_DAO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(CANG_SANG_ZHENG_DAO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong3") == 6){
//                        long zhenMo = ShangGuMoGong.tick1;
//                        if (ShangGuMoGong.tick1 == 0 || current -  ShangGuMoGong.tick1 >= 1200){
//                            mc.getTextureManager().bindTexture(ZHEN_MO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                        }else{
//                            int partialWidth = Math.toIntExact(16 * zhenMo / 1200);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_ZHEN_MO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(ZHEN_MO);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong3") == 7){
//                        long shenGuangWeiShe = YuanCiShenGuang.tick;
//                        if (YuanCiShenGuang.tick == 0 || current -  YuanCiShenGuang.tick >= 1200){
//                            mc.getTextureManager().bindTexture(SHEN_GUANG_WEI_SHE);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                        }else{
//                            int partialWidth = Math.toIntExact(16 * shenGuangWeiShe / 1200);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_SHEN_GUANG_WEI_SHE);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(SHEN_GUANG_WEI_SHE);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong3") == 8){
//                        long yinYangLiangCheng = YinYangHeHuanGong.tick3;
//                        if (YinYangHeHuanGong.tick3 == 0 || current - YinYangHeHuanGong.tick3 >= 1200){
//                            mc.getTextureManager().bindTexture(YIN_YANG_LIANG_CHENG);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                        }else{
//                            int partialWidth = Math.toIntExact(16 * yinYangLiangCheng / 1200);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_YIN_YANG_LIANG_CHENG);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(YIN_YANG_LIANG_CHENG);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }else if (nbtTagCompound.getInteger("ShenTong3") == 9){
//                        long jiuChongShuangJian = JiuChongShuanJianJue.tick3;
//                        if (JiuChongShuanJianJue.tick3 == 0 || current - JiuChongShuanJianJue.tick3 >= 1200){
//                            mc.getTextureManager().bindTexture(JIU_CHONG_SHUANG_JIAN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                        }else{
//                            int partialWidth = Math.toIntExact(16 * jiuChongShuangJian / 1200);
//                            mc.getTextureManager().bindTexture(LENG_QUE_ZHONG_JIU_CHONG_SHUANG_JIAN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, 16, 16,16,16);
//                            mc.getTextureManager().bindTexture(JIU_CHONG_SHUANG_JIAN);
//                            mc.ingameGUI.drawModalRectWithCustomSizedTexture(w- w3, h- h1, 0, 0, partialWidth, 16,16,16);
//                        }
//                    }
//                }
//            }else {

//                }
            }
        }
    }

}
