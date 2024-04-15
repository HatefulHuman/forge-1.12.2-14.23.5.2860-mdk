package com.shengchanshe.shentong.network.packet.shangguomogong;

import com.shengchanshe.shentong.shentong.ShangGuMoGong;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.*;

public class ZhenMo implements IMessage {
    private static final double PARTICLE_RANGE = 10.0; // 生成范围
    private static final Set<BlockPos> playerRegions = new HashSet<>();
    private static long tick = 0;

    public ZhenMo() {
    }

    public ZhenMo(EntityPlayer player) {
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (nbtTagCompound.hasKey("ShaQi") && nbtTagCompound.getDouble("ShaQi") >= 444) {
            long current = player.world.getTotalWorldTime();
            if (tick == 0 || current - tick >= 1200) {
                tick = current;
                Random random = player.world.rand;
                BlockPos regionCenter = new BlockPos(player.posX, player.posY, player.posZ);
                createPlayerRegion(player, regionCenter);
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 200; i++) {
                            double offsetX = random.nextDouble() * PARTICLE_RANGE - PARTICLE_RANGE / 2;
                            double offsetY = random.nextDouble() * PARTICLE_RANGE - PARTICLE_RANGE / 2;
                            double offsetZ = random.nextDouble() * PARTICLE_RANGE - PARTICLE_RANGE / 2;
                            BlockPos regionCenter = new BlockPos(player.posX, player.posY, player.posZ);

                            for (BlockPos regionCenter1 : playerRegions) {
                                double particleX = regionCenter1.getX() + 0.5 + offsetX;
                                double particleY = regionCenter1.getY() + 1.0 + offsetY;
                                double particleZ = regionCenter1.getZ() + 0.5 + offsetZ;
                                player.world.spawnParticle(
                                        EnumParticleTypes.PORTAL, // 粒子类型
                                        true, // 是否长时间存在
                                        particleX, particleY, particleZ, // 粒子位置
                                        0, 0, 0, // 粒子速度
                                        1 // 粒子尺寸
                                );
                            }
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
                }, 9000);
            }
        }
    }

    @Override
    public void fromBytes(ByteBuf buf) {

    }

    @Override
    public void toBytes(ByteBuf buf) {

    }

    private static void createPlayerRegion(EntityPlayer player, BlockPos regionCenter) {
        // 创建玩家区域
        playerRegions.removeIf(pos -> pos.getDistance(regionCenter.getX(), regionCenter.getY(), regionCenter.getZ()) > PARTICLE_RANGE);
        playerRegions.add(regionCenter);
    }

    public static class Handler implements IMessageHandler<ZhenMo, IMessage> {

        @Override
        public IMessage onMessage(ZhenMo message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                ShangGuMoGong.ZhenMo(message, ctx);
            });
            return null;
        }
    }
}
