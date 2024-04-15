package com.shengchanshe.shentong.shentong;

import com.shengchanshe.shentong.network.packet.niqingduantian.DuanTian;
import com.shengchanshe.shentong.network.packet.niqingduantian.JingXin;
import com.shengchanshe.shentong.potion.JingXinPotionEffect;
import com.shengchanshe.shentong.potion.NiQingPotionEffect;
import com.shengchanshe.shentong.potion.PotionRegistryHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class NiQingDuanTianDaFa {

    public static void NiQing(LivingHurtEvent event) {
        if (event.getEntity() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntity();
            NBTTagCompound nbtTagCompound = player.getEntityData();
            if (nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("HealthMax") && nbtTagCompound.getDouble("Power") >= 32
                    && nbtTagCompound.hasKey("ShenTong1") && nbtTagCompound.getInteger("ShenTong1") == 2 && nbtTagCompound.getDouble("GongFa8") >= 1
                    && nbtTagCompound.getBoolean("BeiDong")) {
                if (player.hurtResistantTime > 0) {
                    Random rand = new Random();
                    double v = rand.nextDouble();
                    if (v <= 0.15) {
                        double recoverHP = nbtTagCompound.getDouble("HealthMax") * 0.01;
                        double recoverHP1 = player.getHealth() + recoverHP;
                        player.setHealth((float) recoverHP1);
                    }
                }
            }
        }
    }
    public static void NiQing(TickEvent.PlayerTickEvent event) {
        if (event.player instanceof EntityPlayer) {
            EntityPlayer player = event.player;
            NBTTagCompound nbtTagCompound = player.getEntityData();
            World world = player.getEntityWorld();
            if (nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("HealthMax") && nbtTagCompound.getDouble("Power") >= 32
                    && nbtTagCompound.hasKey("ShenTong1") && nbtTagCompound.getInteger("ShenTong1") == 2 && nbtTagCompound.getDouble("GongFa8") >= 1
                    && nbtTagCompound.getBoolean("BeiDong")) {
                double tickNQ = 32 / 20;
                nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - tickNQ);
                NiQingPotionEffect niQingPotionEffect = new NiQingPotionEffect(20, 0);
                player.addPotionEffect(new PotionEffect(niQingPotionEffect));
            }
        }
    }

    public static long tick = 0;
    private static int remainingTime = 5;
    public static void JingXin(JingXin message, MessageContext ctx) {
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 = player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("HealthMax") && nbtTagCompound.getDouble("Power") >= 96) {
            long current = player.world.getTotalWorldTime();
            if (tick == 0 || current - tick >= 200) {
                nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 96);
                tick = current;
                JingXinPotionEffect jingXinPotionEffect = new JingXinPotionEffect(100, 0);
                player.addPotionEffect(new PotionEffect(jingXinPotionEffect));
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        // 检查剩余时间
                        if (remainingTime > 0) {
                            // 每秒执行的操作
                            double range = 7.0;
                            for (EntityLivingBase entity : player.world.getEntitiesWithinAABB(EntityLivingBase.class, player.getEntityBoundingBox().grow(range))) {
                                if (entity == player && player.isEntityAlive()) {//player.isEntityAlive()为判断玩家死亡状态,死亡后不执行,否则会假死
                                    double recoverHP = nbtTagCompound.getDouble("HealthMax") * 0.03;
                                    player.setHealth((float) ((float) player.getHealth() + recoverHP));
                                }
                            }
                            remainingTime--;
                        } else {
                            if (timer != null) {
                                timer.cancel();
                                remainingTime = 5;
                            }
                        }
                    }
                }, 0, 1000);
            }
        } else {
            TextComponentString iTextComponent = new TextComponentString("您的灵力不足以施展神通!");
            player1.sendMessage(iTextComponent);
        }
    }


    public static long tick1 = 0;
    public static void DuanTian(DuanTian message, MessageContext ctx) {
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 =player;

        NBTTagCompound nbtTagCompound = player.getEntityData();
        Potion potion = PotionRegistryHandler.POTION_JING_XIN;  // buff

        if (nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("HealthMax") && nbtTagCompound.getDouble("Power") >= 960) {
            double damageHP = nbtTagCompound.getDouble("HealthMax") * 0.35;
            long current = player.world.getTotalWorldTime();
            if (tick1 == 0 || current - tick1 >= 1200) {
                tick1 = current;
                for (Entity entity : player.world.loadedEntityList) {
//                    if (player != self) {
//                        // 这是除了自己以外的其他玩家
//                        // 在这里进行你的逻辑处理
//                    }
                    if (entity instanceof EntityPlayer && entity != player) {
                        if (potion != null && player.isPotionActive(potion)) {
                            nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 960);
                            PotionEffect potionEffect = player.getActivePotionEffect(potion);
                            if (potionEffect != null) {
                                player.attackEntityFrom(DamageSource.causePlayerDamage(player), (float) damageHP);
                            }
                        } else {
                            TextComponentString iTextComponent = new TextComponentString("无人静心!");
                            player1.sendMessage(iTextComponent);
                        }
                    }
                }
            }
        } else {
            TextComponentString iTextComponent = new TextComponentString("您的灵力不足以施展神通!");
            player1.sendMessage(iTextComponent);
        }
    }
}
