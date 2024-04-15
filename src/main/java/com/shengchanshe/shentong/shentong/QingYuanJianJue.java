package com.shengchanshe.shentong.shentong;

import com.shengchanshe.shentong.entity.JianQiEntity;
import com.shengchanshe.shentong.network.packet.qingyuanjianjue.DaGengJianZhen;
import com.shengchanshe.shentong.network.packet.qingyuanjianjue.QingYuanJianDun;
import com.shengchanshe.shentong.network.packet.qingyuanjianjue.QingYuanJianQi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.*;

public class QingYuanJianJue {

    //青元剑气
    public static long tick = 0;
    public static void QingYuanJianQi(QingYuanJianQi message, MessageContext ctx) {
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 = player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (nbtTagCompound.hasKey("MagicAttack")) {
            double magicAttack = nbtTagCompound.getDouble("MagicAttack") * (1.5);
            JianQiEntity jianQiEntity = new JianQiEntity(player.world, player);
            jianQiEntity.shoot(player, player.rotationPitch, player.rotationYaw, 0.0F, 1.5F, 1.0F);
            jianQiEntity.setHarm(magicAttack);
            //是否开启无重力
            jianQiEntity.setNoGravity(true);
            long current = player.world.getTotalWorldTime();
            if (tick == 0 || current - tick >= 30) {
                if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 32) {
                    tick = current;
                    nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 32);
                    player.world.spawnEntity(jianQiEntity);
                } else {
                    TextComponentString iTextComponent = new TextComponentString("您的灵力不足以施展神通!");
                    player1.sendMessage(iTextComponent);
                }
            }
        }
    }

    //青元剑盾
    public static long tick1 = 0;
    public static void QingYuanJianDun(QingYuanJianDun message, MessageContext ctx) {
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 = player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        long current = player.world.getTotalWorldTime();
        if (tick1 == 0 || current - tick1 >= 120) {
            if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 96) {
                if (nbtTagCompound.hasKey("Defense") && nbtTagCompound.hasKey("MagicDefense")) {
                    Timer timer = new Timer();
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 96);
                        }
                    }, 0, 1000);
                    tick1 = current;
                    double defense = nbtTagCompound.getDouble("Defense");
                    double magicDefense = nbtTagCompound.getDouble("MagicDefense");

                    double defense1 = defense + ((defense * 0.3) + 48);
                    double magicDefense1 = magicDefense + ((magicDefense * 0.3) + 48);
                    nbtTagCompound.setDouble("Defense", defense1);
                    nbtTagCompound.setDouble("MagicDefense", magicDefense1);

                    // 创建一个计时器

                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            // 三秒后执行的操作
                            // 将值还原原来的值
                            if (timer != null) {
                                timer.cancel();
                            }
                            nbtTagCompound.setDouble("Defense", defense);
                            nbtTagCompound.setDouble("MagicDefense", magicDefense);
                        }
                    }, 3000);  // 3000 毫秒表示三秒
                } else {
                    TextComponentString iTextComponent = new TextComponentString("您的灵力不足以施展神通!");
                    player1.sendMessage(iTextComponent);
                }
            }
        }
    }

    //大庚剑阵
    public static long tick2 = 0;
    public static void DaGengJianZhen(DaGengJianZhen message, MessageContext ctx) {
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 = player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        long current = player.world.getTotalWorldTime();
        if (tick2 == 0 || current - tick2 >= 1200) {
            if (nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("Base") && nbtTagCompound.hasKey("MagicAttack") && nbtTagCompound.getDouble("Power") >= 960 && nbtTagCompound.getDouble("Base") >= 48) {
                nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 960);
                nbtTagCompound.setDouble("Base", nbtTagCompound.getDouble("Base") - 48);
                tick2 = current;
                double magicAttack = (nbtTagCompound.getDouble("MagicAttack") * 1.75) + 144;
                // 创建一个计时器
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        // 检查剩余时间
                        // 每秒执行的操作
                        double range = 7.0;
                        List<EntityLivingBase> entities = new ArrayList<>(player.world.getEntitiesWithinAABB(EntityLivingBase.class, player.getEntityBoundingBox().grow(range)));
                        Iterator<EntityLivingBase> iterator = entities.iterator();
                        while (iterator.hasNext()) {
                            EntityLivingBase entity = iterator.next();
                            if (entity != player) {
                                // 对生物造成伤害
                                entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (float) magicAttack);
                                // 安全删除实体
                                iterator.remove();
                            }
                        }
//                    for (EntityLivingBase entity : player.world.getEntitiesWithinAABB(EntityLivingBase.class, player.getEntityBoundingBox().grow(range))) {
//                        // 对生物造成伤害
//                        if (entity != player) {
//                            entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (float) magicAttack);
//                        }
//                    }
                    }
                }, 0, 1000);
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        if (timer != null) {
                            timer.cancel();
                        }
                    }
                }, 7000); // 7秒后终止任务
            } else {
                TextComponentString iTextComponent = new TextComponentString("您的灵力或真元不足以施展神通!");
                player1.sendMessage(iTextComponent);
            }
        }
    }
}
