package com.shengchanshe.shentong.network.packet.niqingduantian;

import com.shengchanshe.shentong.shentong.NiQingDuanTianDaFa;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class JingXin implements IMessage {
    //  默认的构造器(Constructor)是必须的
    public JingXin() {

    }
    public void fromBytes(ByteBuf buf) {

    }

    public void toBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<JingXin, IMessage> {

        @Override
        public IMessage onMessage(JingXin message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                NiQingDuanTianDaFa.JingXin(message,ctx);
            });
            return null;
        }
    }

}