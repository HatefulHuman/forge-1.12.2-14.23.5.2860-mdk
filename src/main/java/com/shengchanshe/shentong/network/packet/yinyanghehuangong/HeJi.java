package com.shengchanshe.shentong.network.packet.yinyanghehuangong;

import com.shengchanshe.shentong.shentong.YinYangHeHuanGong;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class HeJi implements IMessage {

    public HeJi(){

    }
    public HeJi(EntityPlayer player){

    }
    @Override
    public void fromBytes(ByteBuf buf) {

    }

    @Override
    public void toBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<HeJi, IMessage> {

        @Override
        public IMessage onMessage(HeJi message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                YinYangHeHuanGong.HeJi(message,ctx);
            });
            return null;
        }
    }
}