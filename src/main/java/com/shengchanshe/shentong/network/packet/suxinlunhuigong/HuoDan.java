package com.shengchanshe.shentong.network.packet.suxinlunhuigong;

import com.shengchanshe.shentong.shentong.SuXinLunHuiGong;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class HuoDan implements IMessage {

    public HuoDan(){
    }
    @Override
    public void fromBytes(ByteBuf buf) {

    }

    @Override
    public void toBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<HuoDan, IMessage> {

        @Override
        public IMessage onMessage(HuoDan message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                SuXinLunHuiGong.HuoDan(message,ctx);
            });
            return null;
        }
    }
}
