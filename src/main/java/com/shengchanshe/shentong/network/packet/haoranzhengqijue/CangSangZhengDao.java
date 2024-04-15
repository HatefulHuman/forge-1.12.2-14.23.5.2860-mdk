package com.shengchanshe.shentong.network.packet.haoranzhengqijue;

import com.shengchanshe.shentong.shentong.HaoRanZhengQiJue;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CangSangZhengDao implements IMessage {
    public static long tick = 0;

    public CangSangZhengDao() {

    }

    public CangSangZhengDao(EntityPlayer player) {
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (player != null && player.capabilities != null && player.capabilities.isCreativeMode) {
            World world = Minecraft.getMinecraft().world;
            //粒子的位置
            double posX = player.posX;
            double posY = player.posY + 1.0;
            double posZ = player.posZ;
            // 执行你的逻辑，例如使用World类的spawnParticle方法
            for (int i = 0; i < 80; i++) {
                //粒子的偏移
                double offsetX = (world.rand.nextDouble() - 0.5) * 1.5;
                double offsetY = (world.rand.nextDouble() - 0.5) * 0.1;
                double offsetZ = (world.rand.nextDouble() - 0.5) * 1.5;

                world.spawnParticle(EnumParticleTypes.END_ROD, posX, posY, posZ, offsetX, offsetY, offsetZ);
            }
//            Timer timer = new Timer();
//            timer.schedule(new TimerTask() {
//                @Override
//                public void run() {
//                    double radius = 1.0;  // 粒子环绕的半径
//                    int particleCount = 3;  // 粒子数量
//                    double verticalSpeed = 0.2;  // 上下移动的速度
//                    double horizontalSpeed = 0.2;  // 水平旋转的速度
//                    for (int i = 0; i < particleCount; i++) {
//                        double u = (i * 2 * Math.PI) / particleCount;
//                        double v = (player.ticksExisted * verticalSpeed + i * horizontalSpeed) % (2 * Math.PI);
//                        double x = player.posX + radius * Math.sin(v) * Math.cos(u);
//                        double y = player.posY + radius * Math.sin(v) * Math.sin(u);
//                        double z = player.posZ + radius * Math.cos(v);
//                        double posX = x;
//                        double posY = y - 0.5;
//                        double posZ = z;
//                        player.world.spawnParticle(EnumParticleTypes.END_ROD, posX, posY, posZ, 0, 0, 0);
//                    }
//                }
//            }, 0, 20);
//            timer.schedule(new TimerTask() {
//                @Override
//                public void run() {
//                    // 将值还原原来的值
//                    if (timer != null) {
//                        timer.cancel();
//                    }
//                }
//            }, 1000);
        } else {
            long current = player.world.getTotalWorldTime();
            if (tick == 0 || current - tick >= 1200) {
                tick = current;
                if (nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("Base")
                        && nbtTagCompound.getDouble("Power") >= 960 && nbtTagCompound.getDouble("Base") >= 48) {
                    World world = Minecraft.getMinecraft().world;
                    //粒子的位置
                    double posX = player.posX;
                    double posY = player.posY + 1.0;
                    double posZ = player.posZ;
                    // 执行你的逻辑，例如使用World类的spawnParticle方法
                    for (int i = 0; i < 80; i++) {
                        //粒子的偏移
                        double offsetX = (world.rand.nextDouble() - 0.5) * 1.5;
                        double offsetY = (world.rand.nextDouble() - 0.5) * 0.1;
                        double offsetZ = (world.rand.nextDouble() - 0.5) * 1.5;

                        world.spawnParticle(EnumParticleTypes.END_ROD, posX, posY, posZ, offsetX, offsetY, offsetZ);
                    }
//                    Timer timer = new Timer();
//                    timer.schedule(new TimerTask() {
//                        @Override
//                        public void run() {
//                            double radius = 1.0;  // 粒子环绕的半径
//                            int particleCount = 3;  // 粒子数量
//                            double verticalSpeed = 0.2;  // 上下移动的速度
//                            double horizontalSpeed = 0.2;  // 水平旋转的速度
//                            for (int i = 0; i < particleCount; i++) {
//                                double u = (i * 2 * Math.PI) / particleCount;
//                                double v = (player.ticksExisted * verticalSpeed + i * horizontalSpeed) % (2 * Math.PI);
//                                double x = player.posX + radius * Math.sin(v) * Math.cos(u);
//                                double y = player.posY + radius * Math.sin(v) * Math.sin(u);
//                                double z = player.posZ + radius * Math.cos(v);
//                                double posX = x;
//                                double posY = y - 0.5;
//                                double posZ = z;
//                                player.world.spawnParticle(EnumParticleTypes.END_ROD, posX, posY, posZ, 0, 0, 0);
//                            }
//                        }
//                    }, 0, 20);
//                    timer.schedule(new TimerTask() {
//                        @Override
//                        public void run() {
//                            // 将值还原原来的值
//                            if (timer != null) {
//                                timer.cancel();
//                            }
//                        }
//                    }, 1000);
                }
            }
        }
    }

    public void fromBytes(ByteBuf buf) {

    }

    public void toBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<CangSangZhengDao, IMessage> {

        @Override
        public IMessage onMessage(CangSangZhengDao message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                HaoRanZhengQiJue.CangSangZhengDao(message, ctx);
            });
            return null;
        }
    }
}