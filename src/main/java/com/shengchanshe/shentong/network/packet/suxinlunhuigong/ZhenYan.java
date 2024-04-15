package com.shengchanshe.shentong.network.packet.suxinlunhuigong;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

//真炎粒子效果
public class ZhenYan implements IMessage {
    private double posX;
    private double posY;
    private double posZ;
    private double offsetX;
    private double offsetY;
    private double offsetZ;

    public ZhenYan() {
    }

    public ZhenYan(double posX, double posY, double posZ,double offsetX, double offsetY,double offsetZ) {
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.offsetZ = offsetZ;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        posX = buf.readDouble();
        posY = buf.readDouble();
        posZ = buf.readDouble();
        offsetX = buf.readDouble();
        offsetY = buf.readDouble();
        offsetZ = buf.readDouble();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeDouble(posX);
        buf.writeDouble(posY);
        buf.writeDouble(posZ);
        buf.writeDouble(offsetX);
        buf.writeDouble(offsetY);
        buf.writeDouble(offsetZ);
    }
    public static class Handler implements IMessageHandler<ZhenYan, IMessage> {
        @Override
            public IMessage onMessage(ZhenYan message, MessageContext ctx) {
            Minecraft.getMinecraft().addScheduledTask(new Runnable() {
                @Override
                public void run() {
                    // 在客户端上显示粒子效果
                    World world = Minecraft.getMinecraft().world;
                    //粒子的位置
                    double posX = message.getPosX();
                    double posY = message.getPosY() + 1.5;
                    double posZ = message.getPosZ();
                    double offsetX = message.offsetX;
                    double offsetY = message.offsetY;
                    double offsetZ = message.offsetZ;
                    // 执行你的逻辑，例如使用World类的spawnParticle方法
//            for (int i = 0; i < 80; i++) {
//                //粒子的偏移
//                double offsetX = (world.rand.nextDouble() - 0.5) * 0.5;
//                double offsetY = (world.rand.nextDouble() - 0.5) * 0.1;
//                double offsetZ = (world.rand.nextDouble() - 0.5) * 0.5;

                    world.spawnParticle(EnumParticleTypes.FLAME, posX, posY, posZ, offsetX, offsetY, offsetZ);
//            }

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
