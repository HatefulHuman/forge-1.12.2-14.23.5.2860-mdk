package com.shengchanshe.shentong.network.packet.suxinlunhuigong;

import com.shengchanshe.shentong.shentong.SuXinLunHuiGong;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class NiePan implements IMessage {
    private static long tick2 = 0;

    public NiePan() {
    }

    public NiePan(EntityPlayer player) {
        World world = player.getEntityWorld();
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 960
                && nbtTagCompound.hasKey("Base") && nbtTagCompound.getDouble("Base") >= 48) {
            long current = player.world.getTotalWorldTime();
            if (tick2 == 0 || current - tick2 >= 1200) {
                tick2 = current;
                Random rand = new Random();
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                    for (int i = 0; i < 60; i++) {
                        double offsetX = rand.nextGaussian() * 5;
                        double offsetY = rand.nextGaussian() * 5;
                        double offsetZ = rand.nextGaussian() * 5;
                        world.spawnParticle(EnumParticleTypes.FLAME,
                                player.posX + offsetX, player.posY + offsetY, player.posZ + offsetZ,
                                0, 0, 0);
                        world.spawnParticle(EnumParticleTypes.LAVA,
                                player.posX + offsetX, player.posY + offsetY, player.posZ + offsetZ,
                                0, 0, 0);
                    }
                    }
                }, 0, 100);
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        if (timer != null) {
                            timer.cancel();
                        }
                    }
                }, 6000); // 6秒后终止任务
            }
        }
    }

    @Override
    public void fromBytes(ByteBuf buf) {

    }

    @Override
    public void toBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<NiePan, IMessage> {

        @Override
        public IMessage onMessage(NiePan message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                SuXinLunHuiGong.NiePan(message, ctx);
            });
            return null;
        }
    }
}
