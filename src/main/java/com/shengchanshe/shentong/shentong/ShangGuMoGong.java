package com.shengchanshe.shentong.shentong;

import com.shengchanshe.shentong.entity.GuiMoDunEntity;
import com.shengchanshe.shentong.entity.MoGongEntity;
import com.shengchanshe.shentong.entity.ShangGuZhenMoEntity;
import com.shengchanshe.shentong.network.ModNetwork;
import com.shengchanshe.shentong.network.packet.shangguomogong.GuiMoDun;
import com.shengchanshe.shentong.network.packet.shangguomogong.MoGong;
import com.shengchanshe.shentong.network.packet.shangguomogong.ZhenMo;
import com.shengchanshe.shentong.util.EntityPosition;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

public class ShangGuMoGong {
    public static double attack1;
    private static long tickGMD = 0;

    public static void GuiMoDun(TickEvent.PlayerTickEvent event) {
        if (event.player instanceof EntityPlayer) {
            EntityPlayer player = event.player;
            NBTTagCompound nbtTagCompound = player.getEntityData();
            World world = player.getEntityWorld();
            GuiMoDunEntity guiMoDunEntity = new GuiMoDunEntity(world, player);
            tickGMD++;
            if (nbtTagCompound.hasKey("ShenTong1") && nbtTagCompound.getInteger("ShenTong1") == 6 && tickGMD >= 20
                    && nbtTagCompound.getDouble("GongFa24") >= 1 && nbtTagCompound.getBoolean("BeiDong")) {
                double radius = 1.0;  // 粒子环绕的半径
                int particleCount = 3;  // 粒子数量
                double verticalSpeed = 0.1;  // 上下移动的速度
                double horizontalSpeed = 0.1;  // 水平旋转的速度
                for (int i = 0; i < particleCount; i++) {
                    double u = (i * 2 * Math.PI) / particleCount;
                    double v = (player.ticksExisted * verticalSpeed + i * horizontalSpeed) % (2 * Math.PI);
                    double x = player.posX + radius * Math.sin(v) * Math.cos(u);
                    double y = player.posY + radius * Math.sin(v) * Math.sin(u);
                    double z = player.posZ + radius * Math.cos(v);
                    GuiMoDun message = new GuiMoDun(x, y, z);
                    ModNetwork.INSTANCE.sendToAll(message);
                }
                tickGMD = 0;
            }
            if (nbtTagCompound.hasKey("ShenTong1") && nbtTagCompound.getInteger("ShenTong1") == 6
                    && nbtTagCompound.getDouble("GongFa24") >= 1 && nbtTagCompound.getBoolean("BeiDong")) {
                EntityPosition.EntityPosition(player, 2, guiMoDunEntity);
                guiMoDunEntity.setDead();
                player.addPotionEffect(new PotionEffect(Potion.getPotionById(1),2,1));
            } else {
                guiMoDunEntity.setDead();
            }
            if (nbtTagCompound.hasKey("ShenTong1") && nbtTagCompound.getInteger("ShenTong1") == 6
                    && !nbtTagCompound.getBoolean("False2") && nbtTagCompound.getDouble("GongFa24")>= 1
                    && nbtTagCompound.getBoolean("BeiDong")) {
                attack1 = nbtTagCompound.getDouble("Attack") * 1.1;
                nbtTagCompound.setDouble("Attack", attack1);
                nbtTagCompound.setBoolean("False2", true);
            } else if (nbtTagCompound.getBoolean("False2") && !nbtTagCompound.getBoolean("BeiDong")) {
                nbtTagCompound.setDouble("Attack", (nbtTagCompound.getDouble("Attack") / 1.1));
                nbtTagCompound.setBoolean("False2", false);
            }
        }
    }

    public static long tick = 0;
    private static boolean isHealing = false;
    private static long lastKeyPressTime = 0;
    public static void MoGong(MoGong message, MessageContext ctx) {
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 = player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (nbtTagCompound.hasKey("ShaQi") && nbtTagCompound.getDouble("ShaQi") >= 44) {
            MoGongEntity moGongEntity = new MoGongEntity(player.world, player);
            long current = player.world.getTotalWorldTime();
            if (tick == 0 || current - tick >= 180) {
                tick = current;
                nbtTagCompound.setDouble("ShaQi", nbtTagCompound.getDouble("ShaQi") - 44);
                double recoverHP = nbtTagCompound.getDouble("HealthMax") * 0.1;
                player.heal((float) recoverHP);
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        EntityPosition.EntityPosition(player, 2, moGongEntity);
                    }
                }, 0);
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        if (timer != null) {
                            timer.cancel();
                        }
                        moGongEntity.setDead();
                    }
                }, 4000);
                isHealing = true;
                lastKeyPressTime = System.currentTimeMillis();
            }
        } else {
            player1.sendMessage(new TextComponentString("您的煞气不足以施展神通!"));
        }
    }

    public static void MoGong(LivingAttackEvent event) {
        if (event.getSource().getTrueSource() instanceof EntityPlayer && event.getEntity() instanceof EntityLivingBase) {
            EntityPlayer player = (EntityPlayer) event.getSource().getTrueSource();
            EntityLivingBase target = (EntityLivingBase) event.getEntity();
            NBTTagCompound nbtTagCompound = player.getEntityData();
            if (isHealing && System.currentTimeMillis() - lastKeyPressTime <= 4000) {
                double healthMax = nbtTagCompound.getDouble("HealthMax") * 0.02;
                player.heal((float) healthMax);
            }
        }
    }

    public static long tick1 = 0;
    private static final int REGION_SIZE = 10;
    private static final Set<BlockPos> playerRegions = new HashSet<>();
    public static void ZhenMo(ZhenMo message, MessageContext ctx) {
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 = player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        ShangGuZhenMoEntity shangGuZhenMoEntity = new ShangGuZhenMoEntity(player.world, player);
        if (nbtTagCompound.hasKey("ShaQi") && nbtTagCompound.getDouble("ShaQi") >= 444) {
            long current = player.world.getTotalWorldTime();
            if (tick1 == 0 || current - tick1 >= 1200) {
                tick1 = current;
                EntityPosition.EntityPosition(player, 2, shangGuZhenMoEntity);
                nbtTagCompound.setDouble("ShaQi", nbtTagCompound.getDouble("ShaQi") - 444);
                BlockPos regionCenter = new BlockPos(player.posX, player.posY, player.posZ);
                double attack = nbtTagCompound.getDouble("Attack") * 1.3;
                nbtTagCompound.setDouble("Attack", attack);
                player.addPotionEffect(new PotionEffect(Potion.getPotionById(1),180,2));
                createPlayerRegion(player, regionCenter);
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        // 检查剩余时间
                        // 每秒执行的操作
                        if (player.isSpectator() || player.isCreative()) {
                            // 如果玩家是观察者模式或创造模式，则不做任何操作
                            return;
                        }
                        if (isInPlayerRegion(player)) {
                            // 玩家在区域内，禁止飞行
                            player.capabilities.isFlying = false;
                        }
                    }
                }, 0, 20);//0.5秒执行一次
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        if (timer != null) {
                            timer.cancel();
                        }
                        shangGuZhenMoEntity.setDead();
                        double attack = nbtTagCompound.getDouble("Attack") / 1.3;
                        nbtTagCompound.setDouble("Attack", attack);
                    }
                }, 9000);
            }
        } else {
            player1.sendMessage(new TextComponentString("您的煞气不足以施展神通!"));
        }
    }

    private static void createPlayerRegion(EntityPlayer player, BlockPos regionCenter) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // 检查剩余时间
                // 每秒执行的操作
                // 创建玩家区域
                playerRegions.removeIf(pos -> pos.getDistance(regionCenter.getX(), regionCenter.getY(), regionCenter.getZ()) > REGION_SIZE);
                playerRegions.add(regionCenter);
            }
        }, 0);//0.5秒执行一次
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (timer != null) {
                    timer.cancel();
                }
                playerRegions.remove(regionCenter);
            }
        }, 9000);
    }


    public static void shunYi(PlayerInteractEvent.RightClickEmpty event) {
        // 获取玩家对象
        EntityPlayer player = event.getEntityPlayer();
        if (isInPlayerRegion(player)) {
            // 获取玩家当前的视线方向
            Vec3d lookVec = player.getLookVec();
            // 设置瞬移的距离
            double maxTeleportDistance = 10.0; // 最大瞬移距离
            double minTeleportDistance = 1.0; // 最小瞬移距离

            RayTraceResult result = player.rayTrace(maxTeleportDistance, 1.0F);
            double targetDistance = player.getPosition().distanceSq(result.getBlockPos());
            double teleportDistance = Math.max(minTeleportDistance, Math.min(maxTeleportDistance, Math.sqrt(targetDistance)));
            // 计算瞬移后的位置
            double teleportX = player.posX + teleportDistance * lookVec.x;
            double teleportY = player.posY + teleportDistance * lookVec.y;
            double teleportZ = player.posZ - teleportDistance * lookVec.z;

            // 更新玩家的位置
            player.setPositionAndUpdate(teleportX, teleportY, teleportZ);
        }
    }

    public static void shunYi(PlayerInteractEvent.RightClickBlock event) {
        // 获取玩家对象
        EntityPlayer player = event.getEntityPlayer();
        if (isInPlayerRegion(player)) {
            // 获取玩家当前的视线方向
            Vec3d lookVec = player.getLookVec();
            // 设置瞬移的距离
            double maxTeleportDistance = 10.0; // 最大瞬移距离
            double minTeleportDistance = 1.0; // 最小瞬移距离
            RayTraceResult result = player.rayTrace(maxTeleportDistance, 1.0F);
            if (result != null && result.typeOfHit == RayTraceResult.Type.BLOCK) {
                double targetDistance = player.getPosition().distanceSq(result.getBlockPos());
                double teleportDistance = Math.max(minTeleportDistance, Math.min(maxTeleportDistance, Math.sqrt(targetDistance)));
                // 计算瞬移后的位置
                double teleportX = player.posX + teleportDistance * lookVec.x;
                double teleportY = player.posY + teleportDistance * lookVec.y;
                double teleportZ = player.posZ - teleportDistance * lookVec.z;

                // 更新玩家的位置
                player.setPositionAndUpdate(teleportX, teleportY, teleportZ);
            }
        }
    }

    private static boolean isInPlayerRegion(EntityPlayer player) {
        // 检查玩家是否在区域内
        BlockPos playerPos = new BlockPos(player.posX, player.posY, player.posZ);
        for (BlockPos regionCenter : playerRegions) {
            if (playerPos.getDistance(regionCenter.getX(), regionCenter.getY(), regionCenter.getZ()) <= REGION_SIZE) {
                return true;
            }
        }
        return false;
    }
}