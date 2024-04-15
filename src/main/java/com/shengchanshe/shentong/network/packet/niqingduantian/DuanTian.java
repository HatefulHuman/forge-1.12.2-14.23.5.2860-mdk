package com.shengchanshe.shentong.network.packet.niqingduantian;

import com.shengchanshe.shentong.shentong.NiQingDuanTianDaFa;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.Random;

public class DuanTian implements IMessage {
    private static long tick2 = 0;

    //  默认的构造器(Constructor)是必须的
    public DuanTian() {

    }

    public DuanTian(EntityPlayer player) {
        World world = player.getEntityWorld();
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 960) {
            long current = player.world.getTotalWorldTime();
            if (tick2 == 0 || current - tick2 >= 1200) {
                tick2 = current;
                Random rand = new Random();
                for (int i = 0; i < 60; i++) {
                    double offsetX = rand.nextGaussian() * 5;
                    double offsetY = rand.nextGaussian() * 5;
                    double offsetZ = rand.nextGaussian() * 5;
                    world.spawnParticle(EnumParticleTypes.WATER_WAKE,
                            player.posX + offsetX, player.posY + offsetY, player.posZ + offsetZ,
                            0, 0, 0);
                    world.spawnParticle(EnumParticleTypes.DRIP_WATER,
                            player.posX + offsetX, player.posY + offsetY, player.posZ + offsetZ,
                            0, 0, 0);
                }
            }
        }
    }


    public void fromBytes(ByteBuf buf) {

    }

    public void toBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<DuanTian, IMessage> {
        @Override
        public IMessage onMessage(DuanTian message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                NiQingDuanTianDaFa.DuanTian(message, ctx);
            });
            return null;
        }
    }
}
