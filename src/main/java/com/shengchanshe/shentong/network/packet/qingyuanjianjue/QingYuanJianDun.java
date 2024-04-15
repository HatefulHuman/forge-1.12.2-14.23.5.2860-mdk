package com.shengchanshe.shentong.network.packet.qingyuanjianjue;

import com.shengchanshe.shentong.shentong.QingYuanJianJue;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.Timer;
import java.util.TimerTask;

public class QingYuanJianDun implements IMessage {
    //  默认的构造器(Constructor)是必须的
    private static int remainingTime = 30;
    private static long tick1 = 0;

    public QingYuanJianDun() {

    }

    public QingYuanJianDun(EntityPlayer player) {
        NBTTagCompound nbtTagCompound = player.getEntityData();
        double radius = 2.0;
        if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 96) {
            long current = player.world.getTotalWorldTime();
            if (tick1 == 0 || current - tick1 >= 120) {
                tick1 = current;
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        if (remainingTime > 0) {
                            // 计算旋转角度
                            double rotation = (remainingTime / 20.0) * 2 * Math.PI;
                            for (int i = 1; i <= 10; i++) {
                                double angle = Math.toRadians((360 / 3) * i); // 计算每个粒子的角度
                                double offsetX = player.posX + 2 * Math.cos(angle + rotation); // 根据角度计算X轴偏移量
                                double offsetY = player.posY + 1 * (Math.random() - 0.5) * 2; // 在Y轴上随机偏移
                                double offsetZ = player.posZ + 2 * Math.sin(angle + rotation); // 根据角度计算Z轴偏移量
//                            double offsetX = (player.posX + radius + (Math.random() - 0.5) * 1);
//                            double offsetY = (player.posY + 1 + (Math.random() - 0.5) * 2);
//                            double offsetZ = (player.posZ + radius + (Math.random() - 0.5) * 1);
                                player.world.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, offsetX, offsetY, offsetZ, 0, 0, 0);
                            }
                            remainingTime--;
                        } else {
                            if (timer != null) {
                                timer.cancel();
                                remainingTime = 30;
                            }
                        }
                    }
                }, 0, 100);
            }
        }
    }

    public void fromBytes(ByteBuf buf) {

    }

    public void toBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<QingYuanJianDun, IMessage> {

        @Override
        public IMessage onMessage(QingYuanJianDun message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                QingYuanJianJue.QingYuanJianDun(message, ctx);
            });
            return null;
        }
    }

}
