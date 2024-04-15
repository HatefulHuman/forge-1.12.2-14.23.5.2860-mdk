package com.shengchanshe.shentong.network.packet;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.ByteBufUtils;

public class EntityDataSyncMessageServer implements IMessage {
    private NBTTagCompound entityData;

    public EntityDataSyncMessageServer() {}

    public EntityDataSyncMessageServer(NBTTagCompound entityData) {
        this.entityData = entityData;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        entityData = new NBTTagCompound();
        entityData = ByteBufUtils.readTag(buf);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeTag(buf, entityData);
    }

    public static class Handler implements IMessageHandler<EntityDataSyncMessageServer, IMessage> {
        @Override
        public IMessage onMessage(EntityDataSyncMessageServer message, MessageContext ctx) {
            EntityPlayerMP player = ctx.getServerHandler().player;
            if (player != null && player.world != null) {
                player.getEntityData().merge(message.entityData);
//                    player.getEntityData().setInteger("ShenTong", message.entityData.getInteger("ShenTong"));
            }
            return null;
        }
    }
}