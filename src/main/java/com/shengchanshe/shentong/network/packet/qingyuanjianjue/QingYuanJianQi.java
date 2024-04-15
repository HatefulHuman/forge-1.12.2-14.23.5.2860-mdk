package com.shengchanshe.shentong.network.packet.qingyuanjianjue;

import com.shengchanshe.shentong.shentong.QingYuanJianJue;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class QingYuanJianQi implements IMessage {
    //  默认的构造器(Constructor)是必须的

    public QingYuanJianQi() {

    }

    public void fromBytes(ByteBuf buf) {

    }

    public void toBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<QingYuanJianQi, IMessage> {

        @Override
        public IMessage onMessage(QingYuanJianQi message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                QingYuanJianJue.QingYuanJianQi(message,ctx);
            });
            return null;
        }
    }

}
