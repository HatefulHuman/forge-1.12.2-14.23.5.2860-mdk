package com.shengchanshe.shentong.network.packet.yuancishenguang;

import com.shengchanshe.shentong.shentong.YuanCiShenGuang;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

//真炎粒子效果
public class ShenGuangWeiShe implements IMessage {
    private static long tick = 0;

    public ShenGuangWeiShe() {
    }

    public ShenGuangWeiShe(EntityPlayer player) {
        long current = player.world.getTotalWorldTime();
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (nbtTagCompound.hasKey("YuanCi") && nbtTagCompound.hasKey("Base") && nbtTagCompound.getDouble("YuanCi") >= 90 && nbtTagCompound.getDouble("Base") >= 48) {
            if (tick == 0 || current - tick >= 1200) {
                tick = current;
                //粒子的位置
                double posX = player.posX;
                double posY = player.posY;
                double posZ = player.posZ;
                // 执行你的逻辑，例如使用World类的spawnParticle方法
                for (int i = 0; i < 500; i++) {
                    //粒子的偏移
                    double offsetX = (player.world.rand.nextDouble() - 0.5) * 9;
                    double offsetY = (player.world.rand.nextDouble() - 0.5) * 9;
                    double offsetZ = (player.world.rand.nextDouble() - 0.5) * 9;
                    player.world.spawnParticle(EnumParticleTypes.TOTEM, posX, posY, posZ, offsetX, offsetY, offsetZ);
                }
            }
        }
    }

    @Override
    public void fromBytes(ByteBuf buf) {
    }

    @Override
    public void toBytes(ByteBuf buf) {
    }

    public static class Handler implements IMessageHandler<ShenGuangWeiShe, IMessage> {
        @Override
        public IMessage onMessage(ShenGuangWeiShe message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                YuanCiShenGuang.ShenGuangWeiShe(message, ctx);
            });
            return null;
        }
    }

}
