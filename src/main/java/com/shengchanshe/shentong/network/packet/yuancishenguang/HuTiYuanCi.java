package com.shengchanshe.shentong.network.packet.yuancishenguang;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class HuTiYuanCi implements IMessage {
    private double posX;
    private double posY;
    private double posZ;

    public HuTiYuanCi() {
    }

    public HuTiYuanCi(double posX, double posY, double posZ) {
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        posX = buf.readDouble();
        posY = buf.readDouble();
        posZ = buf.readDouble();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeDouble(posX);
        buf.writeDouble(posY);
        buf.writeDouble(posZ);
    }

    public static class Handler implements IMessageHandler<HuTiYuanCi, IMessage> {
        @Override
        public IMessage onMessage(HuTiYuanCi message, MessageContext ctx) {
            Minecraft.getMinecraft().addScheduledTask(new Runnable() {
                @Override
                public void run() {
                    // 在客户端上显示粒子效果
                    World world = Minecraft.getMinecraft().world;
                    //粒子的位置
                    double posX = message.getPosX();
                    double posY = message.getPosY() + 0.5;
                    double posZ = message.getPosZ();
                    // 执行你的逻辑，例如使用World类的spawnParticle方法
                    world.spawnParticle(EnumParticleTypes.SPELL_INSTANT, posX, posY, posZ, 0, 0, 0);
                }
            });
            return null;
        }
    }


    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double getPosZ() {
        return posZ;
    }

}
