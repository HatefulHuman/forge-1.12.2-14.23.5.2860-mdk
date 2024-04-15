package com.shengchanshe.shentong.network.packet.jiuchongshuanjianjue;

import com.shengchanshe.shentong.shentong.JiuChongShuanJianJue;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class HeJianJue implements IMessage {

    public HeJianJue() {
    }

    public HeJianJue(EntityPlayer player) {
    }

    @Override
    public void fromBytes(ByteBuf buf) {
    }

    @Override
    public void toBytes(ByteBuf buf) {
    }

    public static class Handler implements IMessageHandler<HeJianJue, IMessage> {
        @Override
        public IMessage onMessage(HeJianJue message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                JiuChongShuanJianJue.HeJianJue(message, ctx);
            });
            return null;
        }
    }

}