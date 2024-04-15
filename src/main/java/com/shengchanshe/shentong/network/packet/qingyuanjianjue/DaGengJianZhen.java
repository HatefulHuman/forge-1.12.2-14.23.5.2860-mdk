package com.shengchanshe.shentong.network.packet.qingyuanjianjue;

import com.shengchanshe.shentong.shentong.QingYuanJianJue;
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

public class DaGengJianZhen implements IMessage {
    private static long tick = 0;

    //  默认的构造器(Constructor)是必须的
    public DaGengJianZhen() {
    }

    public DaGengJianZhen(EntityPlayer player) {
        World world = player.getEntityWorld();
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 960 && nbtTagCompound.hasKey("Base") && nbtTagCompound.getDouble("Base") >= 48) {
            long current = player.world.getTotalWorldTime();
            if (tick == 0 || current - tick >= 1200) {
                tick = current;
                Random rand = new Random();
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 70; i++) {
                            double offsetX = rand.nextGaussian() * 7;
                            double offsetY = rand.nextGaussian() * 7;
                            double offsetZ = rand.nextGaussian() * 7;
                            world.spawnParticle(EnumParticleTypes.SWEEP_ATTACK,
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
                }, 7000); // 7秒后终止任务
            }
        }
    }

    public void fromBytes(ByteBuf buf) {

    }

    public void toBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<DaGengJianZhen, IMessage> {

        @Override
        public IMessage onMessage(DaGengJianZhen message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                QingYuanJianJue.DaGengJianZhen(message, ctx);
            });
            return null;
        }
    }

}
