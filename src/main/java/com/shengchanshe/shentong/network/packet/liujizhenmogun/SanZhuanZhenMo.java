package com.shengchanshe.shentong.network.packet.liujizhenmogun;

import com.shengchanshe.shentong.shentong.LiuJiZhenMoGong;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.Timer;
import java.util.TimerTask;

public class SanZhuanZhenMo implements IMessage {
    private static long tick = 0;
    public SanZhuanZhenMo() {

    }
    public SanZhuanZhenMo(EntityPlayer player) {
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (player != null && player.capabilities != null && player.capabilities.isCreativeMode) {
            long current = player.world.getTotalWorldTime();
            if (tick == 0 || current - tick >= 360) {
                tick = current;
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        double radius = 1.0;  // 粒子环绕的半径
                        int particleCount = 3;  // 粒子数量
                        double verticalSpeed = 0.2;  // 上下移动的速度
                        double horizontalSpeed = 0.2;  // 水平旋转的速度
                        for (int i = 0; i < particleCount; i++) {
                            double u = (i * 2 * Math.PI) / particleCount;
                            double v = (player.ticksExisted * verticalSpeed + i * horizontalSpeed) % (2 * Math.PI);
                            double x = player.posX + radius * Math.sin(v) * Math.cos(u);
                            double y = player.posY + radius * Math.sin(v) * Math.sin(u);
                            double z = player.posZ + radius * Math.cos(v);
                            double posX = x;
                            double posY = y - 0.5;
                            double posZ = z;
                            player.world.spawnParticle(EnumParticleTypes.PORTAL, posX, posY, posZ, 0, 0, 0);
                        }
                    }
                }, 0, 20);
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        // 将值还原原来的值
                        if (timer != null) {
                            timer.cancel();
                        }
                    }
                }, 9000);
            }
        }else {
            if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 32) {
                long current = player.world.getTotalWorldTime();
                if (tick == 0 || current - tick >= 360) {
                    tick = current;
                    Timer timer = new Timer();
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            double radius = 1.0;  // 粒子环绕的半径
                            int particleCount = 3;  // 粒子数量
                            double verticalSpeed = 0.2;  // 上下移动的速度
                            double horizontalSpeed = 0.2;  // 水平旋转的速度
                            for (int i = 0; i < particleCount; i++) {
                                double u = (i * 2 * Math.PI) / particleCount;
                                double v = (player.ticksExisted * verticalSpeed + i * horizontalSpeed) % (2 * Math.PI);
                                double x = player.posX + radius * Math.sin(v) * Math.cos(u);
                                double y = player.posY + radius * Math.sin(v) * Math.sin(u);
                                double z = player.posZ + radius * Math.cos(v);
                                double posX = x;
                                double posY = y - 0.5;
                                double posZ = z;
                                player.world.spawnParticle(EnumParticleTypes.PORTAL, posX, posY, posZ, 0, 0, 0);
                            }
                        }
                    }, 0,20);
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            // 将值还原原来的值
                            if (timer != null) {
                                timer.cancel();
                            }
                        }
                    }, 9000);
                }
            }
        }
    }
    public void fromBytes(ByteBuf buf) {

    }

    public void toBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<SanZhuanZhenMo, IMessage> {

        @Override
        public IMessage onMessage(SanZhuanZhenMo message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                LiuJiZhenMoGong.SanZhuanZhenMo(message,ctx);
            });
            return null;
        }
    }

}
