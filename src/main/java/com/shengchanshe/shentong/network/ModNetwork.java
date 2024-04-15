package com.shengchanshe.shentong.network;

import com.shengchanshe.shentong.ShenTongMod;
import com.shengchanshe.shentong.network.packet.EntityDataSyncMessageServer;
import com.shengchanshe.shentong.network.packet.haoranzhengqijue.CangSangZhengDao;
import com.shengchanshe.shentong.network.packet.haoranzhengqijue.WeiRangZhengQi;
import com.shengchanshe.shentong.network.packet.jiuchongshuanjianjue.HeJianJue;
import com.shengchanshe.shentong.network.packet.jiuchongshuanjianjue.JiuChongShuanJian;
import com.shengchanshe.shentong.network.packet.liujizhenmogun.LiuZhuanZhenMo;
import com.shengchanshe.shentong.network.packet.liujizhenmogun.SanZhuanZhenMo;
import com.shengchanshe.shentong.network.packet.liujizhenmogun.YiZhuanZhenMo;
import com.shengchanshe.shentong.network.packet.niqingduantian.DuanTian;
import com.shengchanshe.shentong.network.packet.niqingduantian.JingXin;
import com.shengchanshe.shentong.network.packet.qingyuanjianjue.DaGengJianZhen;
import com.shengchanshe.shentong.network.packet.qingyuanjianjue.QingYuanJianDun;
import com.shengchanshe.shentong.network.packet.qingyuanjianjue.QingYuanJianQi;
import com.shengchanshe.shentong.network.packet.shangguomogong.GuiMoDun;
import com.shengchanshe.shentong.network.packet.shangguomogong.MoGong;
import com.shengchanshe.shentong.network.packet.shangguomogong.ZhenMo;
import com.shengchanshe.shentong.network.packet.suxinlunhuigong.HuoDan;
import com.shengchanshe.shentong.network.packet.suxinlunhuigong.NiePan;
import com.shengchanshe.shentong.network.packet.suxinlunhuigong.ZhenYan;
import com.shengchanshe.shentong.network.packet.yinyanghehuangong.HeHeShu;
import com.shengchanshe.shentong.network.packet.yinyanghehuangong.HeJi;
import com.shengchanshe.shentong.network.packet.yinyanghehuangong.YinYangLiangCheng;
import com.shengchanshe.shentong.network.packet.yuancishenguang.HuTiYuanCi;
import com.shengchanshe.shentong.network.packet.yuancishenguang.ShenGuangWeiShe;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class ModNetwork {
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(ShenTongMod.MODID);
    private static int nextID = 0;
    public ModNetwork(FMLPreInitializationEvent event) {
        // 注册该 Message 及处理它的 Handler
        // 第三个参数是识别码 (discriminator)
        // 第四个参数是收包端，是逻辑端。
        // 如果一个 Message 可以同时在两个逻辑端发送，那就要注册两次，使用不同的识别码
        registerMessage(EntityDataSyncMessageServer.Handler.class,EntityDataSyncMessageServer.class,Side.SERVER);

        registerMessage(QingYuanJianQi.Handler.class,QingYuanJianQi.class,Side.SERVER);
        registerMessage(QingYuanJianDun.Handler.class,QingYuanJianDun.class,Side.SERVER);
        registerMessage(DaGengJianZhen.Handler.class,DaGengJianZhen.class,Side.SERVER);

        registerMessage(JingXin.Handler.class,JingXin.class,Side.SERVER);
        registerMessage(DuanTian.Handler.class,DuanTian.class,Side.SERVER);

        registerMessage(HuoDan.Handler.class,HuoDan.class,Side.SERVER);
        registerMessage(ZhenYan.Handler.class, ZhenYan.class, Side.CLIENT);
        registerMessage(NiePan.Handler.class, NiePan.class, Side.SERVER);

        registerMessage(YiZhuanZhenMo.Handler.class,YiZhuanZhenMo.class,Side.SERVER);
        registerMessage(SanZhuanZhenMo.Handler.class, SanZhuanZhenMo.class,Side.SERVER);
        registerMessage(LiuZhuanZhenMo.Handler.class, LiuZhuanZhenMo.class,Side.SERVER);

        registerMessage(WeiRangZhengQi.Handler.class, WeiRangZhengQi.class, Side.CLIENT);
        registerMessage(CangSangZhengDao.Handler.class, CangSangZhengDao.class,Side.SERVER);

        registerMessage(GuiMoDun.Handler.class, GuiMoDun.class, Side.CLIENT);
        registerMessage(MoGong.Handler.class, MoGong.class,Side.SERVER);
        registerMessage(ZhenMo.Handler.class, ZhenMo.class,Side.SERVER);

        registerMessage(HuTiYuanCi.Handler.class, HuTiYuanCi.class, Side.CLIENT);
        registerMessage(ShenGuangWeiShe.Handler.class, ShenGuangWeiShe.class,Side.SERVER);

        registerMessage(HeHeShu.Handler.class, HeHeShu.class,Side.SERVER);
        registerMessage(HeJi.Handler.class, HeJi.class,Side.SERVER);
        registerMessage(YinYangLiangCheng.Handler.class, YinYangLiangCheng.class,Side.SERVER);

        registerMessage(HeJianJue.Handler.class, HeJianJue.class,Side.SERVER);
        registerMessage(JiuChongShuanJian.Handler.class, JiuChongShuanJian.class,Side.SERVER);
    }

    private static <REQ extends IMessage, REPLY extends IMessage> void registerMessage(
            Class<? extends IMessageHandler<REQ, REPLY>> messageHandler, Class<REQ> requestMessageType, Side side)
    {
        INSTANCE.registerMessage(messageHandler, requestMessageType, nextID++, side);
    }

}

