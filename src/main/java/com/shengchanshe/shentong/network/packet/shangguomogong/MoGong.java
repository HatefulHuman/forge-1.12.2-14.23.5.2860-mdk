package com.shengchanshe.shentong.network.packet.shangguomogong;

import com.shengchanshe.shentong.shentong.ShangGuMoGong;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.Timer;
import java.util.TimerTask;

public class MoGong  implements IMessage {
    public static long tick = 0;
    public MoGong(){
    }
    public MoGong(EntityPlayer player){
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (nbtTagCompound.hasKey("ShaQi") && nbtTagCompound.getDouble("ShaQi") >= 44) {
            long current = player.world.getTotalWorldTime();
            if (tick == 0 || current - tick >= 180) {
                tick = current;
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        double radius = 1.0;  // 粒子环绕的半径
                        int particleCount = 1;  // 粒子数量
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
                }, 0, 200);
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        if (timer != null) {
                            timer.cancel();
                        }
                    }
                }, 4000);
            }
        }
    }
    @Override
    public void fromBytes(ByteBuf buf) {

    }

    @Override
    public void toBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<MoGong, IMessage> {

        @Override
        public IMessage onMessage(MoGong message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                ShangGuMoGong.MoGong(message,ctx);
            });
            return null;
        }
    }
}
