package com.shengchanshe.shentong.network.packet.yuancishenguang;

import com.shengchanshe.shentong.network.ModNetwork;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

//真炎粒子效果
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
                    EntityPlayerMP player = ctx.getServerHandler().player;
                    double radius = 1.0;  // 粒子环绕的半径
                    int particleCount = 5;  // 粒子数量
                    double verticalSpeed = 0.1;  // 上下移动的速度
                    double horizontalSpeed = 0.1;  // 水平旋转的速度

                    for (int i = 0; i < particleCount; i++) {
                        double u = (i * 2 * Math.PI) / particleCount;
                        double v = (player.ticksExisted * verticalSpeed + i * horizontalSpeed) % (2 * Math.PI);
                        double x = player.posX + radius * Math.sin(v) * Math.cos(u);
                        double y = player.posY + radius * Math.sin(v) * Math.sin(u);
                        double z = player.posZ + radius * Math.cos(v);
                        // 在客户端上显示粒子效果
                        World world = Minecraft.getMinecraft().world;
                        //粒子的位置
                        // 执行你的逻辑，例如使用World类的spawnParticle方法
                        world.spawnParticle(EnumParticleTypes.SPELL_INSTANT, x, y, z, 0, 0, 0);
                    }
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
