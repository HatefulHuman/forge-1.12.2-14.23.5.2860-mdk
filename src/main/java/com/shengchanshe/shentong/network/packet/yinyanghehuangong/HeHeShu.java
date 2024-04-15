package com.shengchanshe.shentong.network.packet.yinyanghehuangong;

import com.shengchanshe.shentong.shentong.YinYangHeHuanGong;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.Timer;
import java.util.TimerTask;

public class HeHeShu  implements IMessage {

    public HeHeShu(){

    }
    public HeHeShu(EntityPlayer player){
        World world = player.getEntityWorld();
        NBTTagCompound nbtTagCompound = player.getEntityData();
        double playerX = player.posX;
        double playerY = player.posY - player.getYOffset();
        double playerZ = player.posZ;
        double radius = 0.5; // 圆形的半径
        int particleCount = 20; // 粒子数量

        double rotation = (System.currentTimeMillis() / 1000.0) * 0.5; // 计算旋转角度
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < particleCount; i++) {
                    double angle = 2 * Math.PI * i / particleCount + rotation;
                    double offsetX = radius * Math.cos(angle);
                    double offsetZ = radius * Math.sin(angle);

                    double particleX = playerX + offsetX;
                    double particleY = playerY;
                    double particleZ = playerZ + offsetZ;

                    player.world.spawnParticle(EnumParticleTypes.PORTAL, particleX, particleY, particleZ, 0, 0, 0);
                }
            }
        },0,100);//延迟一秒后执行,只执行一次
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (timer != null) {
                    timer.cancel();
                }
            }
        }, 2000); // 7秒后终止任务
    }
    @Override
    public void fromBytes(ByteBuf buf) {

    }

    @Override
    public void toBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<HeHeShu, IMessage> {

        @Override
        public IMessage onMessage(HeHeShu message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                YinYangHeHuanGong.HeHeShu(message,ctx);
            });
            return null;
        }
    }
}