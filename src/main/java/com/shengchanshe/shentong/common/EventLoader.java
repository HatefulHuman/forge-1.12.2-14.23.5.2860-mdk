package com.shengchanshe.shentong.common;

import com.shengchanshe.shentong.ShenTongMod;
import com.shengchanshe.shentong.inventory.ShenTongUiLoader;
import com.shengchanshe.shentong.key.KeyLoader;
import com.shengchanshe.shentong.network.ModNetwork;
import com.shengchanshe.shentong.network.packet.EntityDataSyncMessageServer;
import com.shengchanshe.shentong.network.packet.haoranzhengqijue.CangSangZhengDao;
import com.shengchanshe.shentong.network.packet.jiuchongshuanjianjue.HeJianJue;
import com.shengchanshe.shentong.network.packet.jiuchongshuanjianjue.JiuChongShuanJian;
import com.shengchanshe.shentong.network.packet.liujizhenmogun.LiuZhuanZhenMo;
import com.shengchanshe.shentong.network.packet.liujizhenmogun.SanZhuanZhenMo;
import com.shengchanshe.shentong.network.packet.liujizhenmogun.YiZhuanZhenMo;
import com.shengchanshe.shentong.network.packet.qingyuanjianjue.DaGengJianZhen;
import com.shengchanshe.shentong.network.packet.niqingduantian.DuanTian;
import com.shengchanshe.shentong.network.packet.niqingduantian.JingXin;
import com.shengchanshe.shentong.network.packet.qingyuanjianjue.QingYuanJianDun;
import com.shengchanshe.shentong.network.packet.qingyuanjianjue.QingYuanJianQi;
import com.shengchanshe.shentong.network.packet.shangguomogong.MoGong;
import com.shengchanshe.shentong.network.packet.shangguomogong.ZhenMo;
import com.shengchanshe.shentong.network.packet.suxinlunhuigong.HuoDan;
import com.shengchanshe.shentong.network.packet.suxinlunhuigong.NiePan;
import com.shengchanshe.shentong.network.packet.yinyanghehuangong.HeHeShu;
import com.shengchanshe.shentong.network.packet.yinyanghehuangong.HeJi;
import com.shengchanshe.shentong.network.packet.yinyanghehuangong.YinYangLiangCheng;
import com.shengchanshe.shentong.network.packet.yuancishenguang.ShenGuangWeiShe;
import com.shengchanshe.shentong.shentong.*;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EventLoader {

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        EntityPlayer playerIn = Minecraft.getMinecraft().player;
        World worldIn = Minecraft.getMinecraft().world;
        NBTTagCompound data = playerIn.getEntityData();
        if (KeyLoader.shentonggui.isPressed()) {
            BlockPos pos = playerIn.getPosition();
            int id = ShenTongUiLoader.GUI_DEMO;
            playerIn.openGui(ShenTongMod.instance, id, worldIn, pos.getX(), pos.getY(), pos.getZ());
        }
        if (KeyLoader.shentongone.isPressed()){
            NBTTagCompound data1 = new NBTTagCompound();
            if (!data.hasKey("BeiDong")){
                data1.setBoolean("BeiDong",false);
            }
            if (playerIn != null && playerIn.capabilities != null && playerIn.capabilities.isCreativeMode) {
                if (data.hasKey("ShenTong1")){
                    if (data.getInteger("ShenTong1") == 1){
                        ModNetwork.INSTANCE.sendToServer(new QingYuanJianQi());
                    }else if(data.getInteger("ShenTong1") == 2){
                        if (!data.getBoolean("BeiDong")){
                            data1.setBoolean("BeiDong",true);
                        }else if(data.getBoolean("BeiDong")) {
                            data1.setBoolean("BeiDong",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }else if (data.getInteger("ShenTong1") == 3){
                        ModNetwork.INSTANCE.sendToServer(new HuoDan());
                    }else if (data.getInteger("ShenTong1") == 4){
                        ModNetwork.INSTANCE.sendToServer(new YiZhuanZhenMo(playerIn));
                    }else if(data.getInteger("ShenTong1") == 5){
                        if (!data.getBoolean("BeiDong")){
                            data1.setBoolean("BeiDong",true);
                        }else if(data.getBoolean("BeiDong")) {
                            data1.setBoolean("BeiDong",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }else if(data.getInteger("ShenTong1") == 6){
                        if (!data.getBoolean("BeiDong")){
                            data1.setBoolean("BeiDong",true);
                        }else if(data.getBoolean("BeiDong")) {
                            data1.setBoolean("BeiDong",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }else if(data.getInteger("ShenTong1") == 7){
                        if (!data.getBoolean("BeiDong")){
                            data1.setBoolean("BeiDong",true);
                        }else if(data.getBoolean("BeiDong")) {
                            data1.setBoolean("BeiDong",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }else if (data.getInteger("ShenTong1") == 8){
                        ModNetwork.INSTANCE.sendToServer(new HeHeShu(playerIn));
                    }else if (data.getInteger("ShenTong1") == 9){
                        ModNetwork.INSTANCE.sendToServer(new HeJianJue());
                    }
                }
            }else {
                if (data.hasKey("ShenTong1") && data.hasKey("JingJieNum") && data.getInteger("JingJieNum") >= 2){
                    if (data.getInteger("ShenTong1") == 1 && data.getDouble("GongFa6") >= 1){
                        ModNetwork.INSTANCE.sendToServer(new QingYuanJianQi());
                    }else if(data.getInteger("ShenTong1") == 2 && data.getDouble("GongFa8") >= 1){
                        if (!data.getBoolean("BeiDong")){
                            data1.setBoolean("BeiDong",true);
                        }else if(data.getBoolean("BeiDong")) {
                            data1.setBoolean("BeiDong",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }else if (data.getInteger("ShenTong1") == 3 && data.getDouble("GongFa31") >= 1){
                        ModNetwork.INSTANCE.sendToServer(new HuoDan());
                    }else if (data.getInteger("ShenTong1") == 4 && data.getDouble("GongFa21") >= 1){
                        ModNetwork.INSTANCE.sendToServer(new YiZhuanZhenMo(playerIn));
                    }else if(data.getInteger("ShenTong1") == 5 && data.getDouble("GongFa23") >= 1){
                        if (!data.getBoolean("BeiDong")){
                            data1.setBoolean("BeiDong",true);
                        }else if(data.getBoolean("BeiDong")) {
                            data1.setBoolean("BeiDong",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }else if(data.getInteger("ShenTong1") == 6 && data.getDouble("GongFa24") >= 1){
                        if (!data.getBoolean("BeiDong")){
                            data1.setBoolean("BeiDong",true);
                        }else if(data.getBoolean("BeiDong")) {
                            data1.setBoolean("BeiDong",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }else if(data.getInteger("ShenTong1") == 7 && data.getDouble("GongFa28") >= 1){
                        if (!data.getBoolean("BeiDong")){
                            data1.setBoolean("BeiDong",true);
                        }else if(data.getBoolean("BeiDong")) {
                            data1.setBoolean("BeiDong",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }else if (data.getInteger("ShenTong1") == 8 && data.getDouble("GongFa29") >= 1){
                        ModNetwork.INSTANCE.sendToServer(new HeHeShu(playerIn));
                    }else if (data.getInteger("ShenTong1") == 9 && data.getDouble("GongFa30") >= 1){
                        ModNetwork.INSTANCE.sendToServer(new HeJianJue());
                    }
                }
            }
        }
        if (KeyLoader.shentongtwo.isPressed()){
            NBTTagCompound data1 = new NBTTagCompound();
            if (!data.hasKey("BeiDong1")){
                data1.setBoolean("BeiDong1",false);
            }
            if (playerIn != null && playerIn.capabilities != null && playerIn.capabilities.isCreativeMode) {
                if(data.hasKey("ShenTong2")){
                    if (data.getInteger("ShenTong2") == 1){
                        ModNetwork.INSTANCE.sendToServer(new QingYuanJianDun(playerIn));
                    }else if (data.getInteger("ShenTong2") == 2){
                        ModNetwork.INSTANCE.sendToServer(new JingXin());
                    }else if(data.getInteger("ShenTong2") == 3){
                        if (!data.getBoolean("BeiDong1")){
                            data1.setBoolean("BeiDong1",true);
                        }else if(data.getBoolean("BeiDong1")) {
                            data1.setBoolean("BeiDong1",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }else if (data.getInteger("ShenTong2") == 4){
                        ModNetwork.INSTANCE.sendToServer(new SanZhuanZhenMo(playerIn));
                    }else if(data.getInteger("ShenTong2") == 5){
                        if (!data.getBoolean("BeiDong1")){
                            data1.setBoolean("BeiDong1",true);
                        }else if(data.getBoolean("BeiDong1")) {
                            data1.setBoolean("BeiDong1",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }else if (data.getInteger("ShenTong2") == 6){
                        ModNetwork.INSTANCE.sendToServer(new MoGong(playerIn));
                    }else if(data.getInteger("ShenTong2") == 7){
                        if (!data.getBoolean("BeiDong1")){
                            data1.setBoolean("BeiDong1",true);
                        }else if(data.getBoolean("BeiDong1")) {
                            data1.setBoolean("BeiDong1",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }else if (data.getInteger("ShenTong2") == 8){
                        ModNetwork.INSTANCE.sendToServer(new HeJi());
                    }else if (data.getInteger("ShenTong2") == 9){
                        if (!data.getBoolean("BeiDong1")){
                            data1.setBoolean("BeiDong1",true);
                        }else if(data.getBoolean("BeiDong1")) {
                            data1.setBoolean("BeiDong1",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }
                }
            }else {
                if(data.hasKey("ShenTong2") && data.hasKey("JingJieNum") && data.getInteger("JingJieNum") >= 3){
                    if (data.getInteger("ShenTong2") == 1 && data.getDouble("GongFa6") >= 3){
                        ModNetwork.INSTANCE.sendToServer(new QingYuanJianDun(playerIn));
                    }else if (data.getInteger("ShenTong2") == 2 && data.getDouble("GongFa8") >= 3){
                        ModNetwork.INSTANCE.sendToServer(new JingXin());
                    }else if(data.getInteger("ShenTong2") == 3 && data.getDouble("GongFa31") >= 3){
                        if (!data.getBoolean("BeiDong1")){
                            data1.setBoolean("BeiDong1",true);
                        }else if(data.getBoolean("BeiDong1")) {
                            data1.setBoolean("BeiDong1",false);
                        }
                        EntityDataSyncMessageServer message1 = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message1);
                    }else if (data.getInteger("ShenTong2") == 4 && data.getDouble("GongFa21") >= 3){
                        ModNetwork.INSTANCE.sendToServer(new SanZhuanZhenMo(playerIn));
                    }else if(data.getInteger("ShenTong2") == 5 && data.getDouble("GongFa23") >= 3){
                        if (!data.getBoolean("BeiDong1")){
                            data1.setBoolean("BeiDong1",true);
                        }else if(data.getBoolean("BeiDong1")) {
                            data1.setBoolean("BeiDong1",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }else if (data.getInteger("ShenTong2") == 6 && data.getDouble("GongFa24") >= 3){
                        ModNetwork.INSTANCE.sendToServer(new MoGong(playerIn));
                    }else if(data.getInteger("ShenTong2") == 7 && data.getDouble("GongFa28") >= 3){
                        if (!data.getBoolean("BeiDong1")){
                            data1.setBoolean("BeiDong1",true);
                        }else if(data.getBoolean("BeiDong1")) {
                            data1.setBoolean("BeiDong1",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }else if (data.getInteger("ShenTong2") == 8 && data.getDouble("GongFa29") >= 3){
                        ModNetwork.INSTANCE.sendToServer(new HeJi());
                    }else if (data.getInteger("ShenTong2") == 9 && data.getDouble("GongFa30") >= 3){
                        if (!data.getBoolean("BeiDong1")){
                            data1.setBoolean("BeiDong1",true);
                        }else if(data.getBoolean("BeiDong1")) {
                            data1.setBoolean("BeiDong1",false);
                        }
                        EntityDataSyncMessageServer message = new EntityDataSyncMessageServer(data1);
                        ModNetwork.INSTANCE.sendToServer(message);
                    }
                }
            }
        }

        if (KeyLoader.shentongthree.isPressed()){
            if (playerIn != null && playerIn.capabilities != null && playerIn.capabilities.isCreativeMode){
                if (data.hasKey("ShenTong3")){
                    if (data.getInteger("ShenTong3") == 1){
                        ModNetwork.INSTANCE.sendToServer(new DaGengJianZhen(playerIn));
                    }else if (data.getInteger("ShenTong3") == 2){
                        ModNetwork.INSTANCE.sendToServer(new DuanTian(playerIn));
                    }else if (data.getInteger("ShenTong3") == 3){
                        ModNetwork.INSTANCE.sendToServer(new NiePan(playerIn));
                    }else if (data.getInteger("ShenTong3") == 4){
                        ModNetwork.INSTANCE.sendToServer(new LiuZhuanZhenMo(playerIn));
                    }else if(data.getInteger("ShenTong3") == 5){
                        ModNetwork.INSTANCE.sendToServer(new CangSangZhengDao(playerIn));
                    }else if(data.getInteger("ShenTong3") == 6){
                        ModNetwork.INSTANCE.sendToServer(new ZhenMo(playerIn));
                    }else if(data.getInteger("ShenTong3") == 7){
                        ModNetwork.INSTANCE.sendToServer(new ShenGuangWeiShe(playerIn));
                    }else if(data.getInteger("ShenTong3") == 8){
                        ModNetwork.INSTANCE.sendToServer(new YinYangLiangCheng());
                    }else if(data.getInteger("ShenTong3") == 9){
                        ModNetwork.INSTANCE.sendToServer(new JiuChongShuanJian());
                    }
                }
            }else {
                if (data.hasKey("ShenTong3") && data.hasKey("JingJieNum") && data.getInteger("JingJieNum") >= 4){
                    if (data.getInteger("ShenTong3") == 1 && data.getDouble("GongFa6") >= 6){
                        ModNetwork.INSTANCE.sendToServer(new DaGengJianZhen(playerIn));
                    }else if (data.getInteger("ShenTong3") == 2 && data.getDouble("GongFa8") >= 6){
                        ModNetwork.INSTANCE.sendToServer(new DuanTian(playerIn));
                    }else if (data.getInteger("ShenTong3") == 3 && data.getDouble("GongFa31") >= 6){
                        ModNetwork.INSTANCE.sendToServer(new NiePan(playerIn));
                    }else if (data.getInteger("ShenTong3") == 4 && data.getDouble("GongFa21") >= 6){
                        ModNetwork.INSTANCE.sendToServer(new LiuZhuanZhenMo(playerIn));
                    }else if(data.getInteger("ShenTong3") == 5 && data.getDouble("GongFa23") >= 6){
                        ModNetwork.INSTANCE.sendToServer(new CangSangZhengDao(playerIn));
                    }else if(data.getInteger("ShenTong3") == 6 && data.getDouble("GongFa24") >= 6){
                        ModNetwork.INSTANCE.sendToServer(new ZhenMo(playerIn));
                    }else if(data.getInteger("ShenTong3") == 7 && data.getDouble("GongFa28") >= 6){
                        ModNetwork.INSTANCE.sendToServer(new ShenGuangWeiShe(playerIn));
                    }else if(data.getInteger("ShenTong3") == 8 && data.getDouble("GongFa29") >= 6){
                        ModNetwork.INSTANCE.sendToServer(new YinYangLiangCheng());
                    }else if(data.getInteger("ShenTong3") == 9 && data.getDouble("GongFa30") >= 6){
                        ModNetwork.INSTANCE.sendToServer(new JiuChongShuanJian());
                    }
                }
            }
        }
    }
    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {

        NiQingDuanTianDaFa.NiQing(event);

        SuXinLunHuiGong.ZhenYan(event);

        HaoRanZhengQiJue.WeiRangZhengQi(event);
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event){
        NiQingDuanTianDaFa.NiQing(event);

        SuXinLunHuiGong.ZhenYan(event);

        HaoRanZhengQiJue.WeiRangZhengQi(event);
        HaoRanZhengQiJue.XuanGangZhenQi(event);

        ShangGuMoGong.GuiMoDun(event);

        YuanCiShenGuang.HuTiYuanCi(event);

    }
    @SubscribeEvent
    public void onLivingAttack(LivingAttackEvent event) {
        ShangGuMoGong.MoGong(event);

    }
    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent.RightClickEmpty event) {
        // 玩家右键点击空气事件
        ShangGuMoGong.shunYi(event);
    }

    @SubscribeEvent
    public void onPlayerRightClick(PlayerInteractEvent.RightClickBlock event) {
            ShangGuMoGong.shunYi(event);
    }
    @SubscribeEvent
    public void onPlayerAttack(AttackEntityEvent event) {
        JiuChongShuanJianJue.YiJianJue(event);

    }
}
