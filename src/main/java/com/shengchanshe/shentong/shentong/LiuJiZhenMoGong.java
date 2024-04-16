package com.shengchanshe.shentong.shentong;

import com.shengchanshe.shentong.entity.LiuZhuanZhenMoEntity;
import com.shengchanshe.shentong.entity.SanZhuanZhenMoEntity;
import com.shengchanshe.shentong.entity.YiZhuanZhenMoEntity;
import com.shengchanshe.shentong.network.packet.liujizhenmogun.LiuZhuanZhenMo;
import com.shengchanshe.shentong.network.packet.liujizhenmogun.SanZhuanZhenMo;
import com.shengchanshe.shentong.network.packet.liujizhenmogun.YiZhuanZhenMo;
import com.shengchanshe.shentong.util.EntityPosition;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.*;

public class LiuJiZhenMoGong {

    public static int cengShu = 0;
    public static long tick = 0;
    private static double defense_1;
    private static double attack_1;
    private static double magicDefense_1;

    public static void YiZhuanZhenMo(YiZhuanZhenMo message, MessageContext ctx) {
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 = player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (player != null && player.capabilities != null && player.capabilities.isCreativeMode) {
            // 玩家处于创造模式
            if (nbtTagCompound.hasKey("Defense") && nbtTagCompound.hasKey("Attack") && nbtTagCompound.hasKey("MagicDefense")) {
                cengShu = 1;
                YiZhuanZhenMoEntity yiZhuanZhenMoEntity = new YiZhuanZhenMoEntity(player.world, player);
                double attack = nbtTagCompound.getDouble("Attack");
                double defense = nbtTagCompound.getDouble("Defense");
                double magicDefense = nbtTagCompound.getDouble("MagicDefense");
                defense_1 = defense;
                attack_1 = attack;
                magicDefense_1 = magicDefense;
                double defense1 = defense + ((defense * 0.15));
                double attack1 = attack + (attack * 0.15);
                double magicDefense1 = magicDefense + ((magicDefense * 0.15));
                player.addPotionEffect(new PotionEffect(Potion.getPotionById(1),100,0));
                // 创建一个计时器
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        EntityPosition.EntityPosition(player, 1,yiZhuanZhenMoEntity);
                        nbtTagCompound.setDouble("Defense", defense1);
                        nbtTagCompound.setDouble("Attack", attack1);
                        nbtTagCompound.setDouble("MagicDefense", magicDefense1);
                    }
                }, 0);
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        // 将值还原原来的值
                        if (timer != null) {
                            timer.cancel();
                        }
                        if (cengShu == 1) {
                            cengShu = 0;
                        }
                        yiZhuanZhenMoEntity.setDead();
                        nbtTagCompound.setDouble("Attack", attack);
                        nbtTagCompound.setDouble("Defense", defense);
                        nbtTagCompound.setDouble("MagicDefense", magicDefense);

                    }
                }, 5000);
            }
        } else {
            // 玩家不处于创造模式
            if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 32) {
                if (nbtTagCompound.hasKey("Defense") && nbtTagCompound.hasKey("Attack") && nbtTagCompound.hasKey("MagicDefense")) {
                    long current = player.world.getTotalWorldTime();
                    if (tick == 0 || current - tick >= 200) {
                        tick = current;
                        cengShu = 1;
                        YiZhuanZhenMoEntity yiZhuanZhenMoEntity = new YiZhuanZhenMoEntity(player.world, player);
                        double attack = nbtTagCompound.getDouble("Attack");
                        double defense = nbtTagCompound.getDouble("Defense");
                        double magicDefense = nbtTagCompound.getDouble("MagicDefense");
                        defense_1 = defense;
                        attack_1 = attack;
                        magicDefense_1 = magicDefense;
                        double defense1 = defense + ((defense * 0.15));
                        double attack1 = attack + (attack * 0.15);
                        double magicDefense1 = magicDefense + ((magicDefense * 0.15));
                        nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 32);
                        player.addPotionEffect(new PotionEffect(Potion.getPotionById(1),100,0));
                        // 创建一个计时器
                        Timer timer = new Timer();
                        timer.schedule(new TimerTask() {
                            @Override
                            public void run() {
                                EntityPosition.EntityPosition(player, 1, yiZhuanZhenMoEntity);
                                nbtTagCompound.setDouble("Defense", defense1);
                                nbtTagCompound.setDouble("Attack", attack1);
                                nbtTagCompound.setDouble("MagicDefense", magicDefense1);
                            }
                        }, 0);
                        timer.schedule(new TimerTask() {
                            @Override
                            public void run() {
                                // 将值还原原来的值
                                if (timer != null) {
                                    timer.cancel();
                                }
                                if (cengShu == 1) {
                                    cengShu = 0;
                                }
                                yiZhuanZhenMoEntity.setDead();
                                nbtTagCompound.setDouble("Attack", attack);
                                nbtTagCompound.setDouble("Defense", defense);
                                nbtTagCompound.setDouble("MagicDefense", magicDefense);

                            }
                        }, 5000);
                    }
                }
            } else {
                TextComponentString iTextComponent = new TextComponentString("您的灵力不足以施展神通!");
                player1.sendMessage(iTextComponent);
            }
        }
    }

    public static long tick1 = 0;
    public static void SanZhuanZhenMo(SanZhuanZhenMo message, MessageContext ctx) {
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 = player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (player != null && player.capabilities != null && player.capabilities.isCreativeMode) {
            // 玩家处于创造模式
            if (nbtTagCompound.hasKey("Defense") && nbtTagCompound.hasKey("Attack") && nbtTagCompound.hasKey("MagicDefense") && cengShu == 1) {
                cengShu = 3;
                SanZhuanZhenMoEntity sanZhuanZhenMoEntity = new SanZhuanZhenMoEntity(player.world, player);
                double attack = nbtTagCompound.getDouble("Attack");
                double defense = nbtTagCompound.getDouble("Defense");
                double magicDefense = nbtTagCompound.getDouble("MagicDefense");

                double defense2 = defense + ((defense * 0.25));
                double attack2 = attack + (attack * 0.25);
                double magicDefense2 = magicDefense + ((magicDefense * 0.25));
                player.addPotionEffect(new PotionEffect(Potion.getPotionById(1),180,1));
                // 创建一个计时器
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        EntityPosition.EntityPosition(player,1,sanZhuanZhenMoEntity);
                        nbtTagCompound.setDouble("Defense", defense2);
                        nbtTagCompound.setDouble("Attack", attack2);
                        nbtTagCompound.setDouble("MagicDefense", magicDefense2);
                    }
                }, 0);
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        // 将值还原原来的值
                        if (timer != null) {
                            timer.cancel();
                        }
                        if(cengShu == 3){
                            cengShu = 0;
                        }
                        sanZhuanZhenMoEntity.setDead();
                        nbtTagCompound.setDouble("Attack", attack_1);
                        nbtTagCompound.setDouble("Defense", defense_1);
                        nbtTagCompound.setDouble("MagicDefense", magicDefense_1);
                    }
                }, 9000);
            } else {
                TextComponentString iTextComponent = new TextComponentString("请先使用一转真魔!");
                player1.sendMessage(iTextComponent);
            }
        } else {
            // 玩家不处于创造模式
            if (nbtTagCompound.hasKey("ShaQi") && nbtTagCompound.getDouble("ShaQi") >= 96 && cengShu == 1) {
                if (nbtTagCompound.hasKey("Defense") && nbtTagCompound.hasKey("Attack") && nbtTagCompound.hasKey("MagicDefense")) {
                    long current = player.world.getTotalWorldTime();
                    if (tick2 == 0 || current - tick2 >= 360) {
                        tick2 = current;
                        cengShu = 3;
                        nbtTagCompound.setDouble("ShaQi", nbtTagCompound.getDouble("ShaQi") - 96);
                        SanZhuanZhenMoEntity sanZhuanZhenMoEntity = new SanZhuanZhenMoEntity(player.world, player);
                        double attack = nbtTagCompound.getDouble("Attack");
                        double defense = nbtTagCompound.getDouble("Defense");
                        double magicDefense = nbtTagCompound.getDouble("MagicDefense");

                        double defense2 = defense + ((defense * 0.25));
                        double attack2 = attack + (attack * 0.25);
                        double magicDefense2 = magicDefense + ((magicDefense * 0.25));
                        player.addPotionEffect(new PotionEffect(Potion.getPotionById(1),180,1));
                        // 创建一个计时器
                        Timer timer = new Timer();
                        timer.schedule(new TimerTask() {
                            @Override
                            public void run() {
                                EntityPosition.EntityPosition(player,1,sanZhuanZhenMoEntity);
                                nbtTagCompound.setDouble("Defense", defense2);
                                nbtTagCompound.setDouble("Attack", attack2);
                                nbtTagCompound.setDouble("MagicDefense", magicDefense2);
                            }
                        }, 0);
                        timer.schedule(new TimerTask() {
                            @Override
                            public void run() {
                                // 将值还原原来的值
                                if (timer != null) {
                                    timer.cancel();
                                }
                                cengShu = 0;
                                sanZhuanZhenMoEntity.setDead();
                                nbtTagCompound.setDouble("Attack", attack_1);
                                nbtTagCompound.setDouble("Defense", defense_1);
                                nbtTagCompound.setDouble("MagicDefense", magicDefense_1);
                            }
                        }, 9000);
                    }
                }
            } else {
                TextComponentString iTextComponent = new TextComponentString("您的煞气不足以施展神通或者没有使用一转真魔!");
                player1.sendMessage(iTextComponent);
            }
        }
    }

    public static long tick2 = 0;
    public static void LiuZhuanZhenMo(LiuZhuanZhenMo message, MessageContext ctx) {
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 = player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (player != null && player.capabilities != null && player.capabilities.isCreativeMode) {
            // 玩家处于创造模式
            if (nbtTagCompound.hasKey("Defense") && nbtTagCompound.hasKey("Attack") && nbtTagCompound.hasKey("MagicDefense") && cengShu == 3) {
                cengShu = 6;
                LiuZhuanZhenMoEntity liuZhuanZhenMoEntity = new LiuZhuanZhenMoEntity(player.world, player);
                double attack = nbtTagCompound.getDouble("Attack");
                double defense = nbtTagCompound.getDouble("Defense");
                double magicDefense = nbtTagCompound.getDouble("MagicDefense");

                double defense2 = defense + ((defense * 0.45));
                double attack2 = attack + (attack * 0.45);
                double magicDefense2 = magicDefense + ((magicDefense * 0.45));
                EntityPosition.EntityPosition(player,1,liuZhuanZhenMoEntity);
                nbtTagCompound.setDouble("Defense", defense2);
                nbtTagCompound.setDouble("Attack", attack2);
                nbtTagCompound.setDouble("MagicDefense", magicDefense2);
                player.addPotionEffect(new PotionEffect(Potion.getPotionById(1),300,2));
                // 创建一个计时器
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        double range = 9.0;
                        BlockPos playerPos = player.getPosition();
                        List<EntityLivingBase> entities = new ArrayList<>(player.world.getEntitiesWithinAABB(EntityLivingBase.class, player.getEntityBoundingBox().grow(range)));
                        Iterator<EntityLivingBase> iterator = entities.iterator();
                        while (iterator.hasNext()) {
                            EntityLivingBase entity = iterator.next();
                            if (entity != player) {
                                // 将生物拉至玩家身旁
                                entity.setPositionAndUpdate(playerPos.getX() + 2, playerPos.getY(), playerPos.getZ() + 2);
                            }
                        }
                    }
                }, 0, 100);
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        // 将值还原原来的值
                        if (timer != null) {
                            timer.cancel();
                        }
                        cengShu = 0;
                        liuZhuanZhenMoEntity.setDead();
                        nbtTagCompound.setDouble("Attack", attack_1);
                        nbtTagCompound.setDouble("Defense", defense_1);
                        nbtTagCompound.setDouble("MagicDefense", magicDefense_1);
                    }
                }, 15000);
            } else {
                TextComponentString iTextComponent = new TextComponentString("请先使用三转真魔!");
                player1.sendMessage(iTextComponent);
            }
        } else {
            // 玩家不处于创造模式
            if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 960 && nbtTagCompound.hasKey("ShaQi") && nbtTagCompound.getDouble("ShaQi") >= 48 && cengShu == 3) {
                if (nbtTagCompound.hasKey("Defense") && nbtTagCompound.hasKey("Attack") && nbtTagCompound.hasKey("MagicDefense")) {
                    long current = player.world.getTotalWorldTime();
                    if (tick2 == 0 || current - tick2 >= 1200) {
                        tick2 = current;
                        nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 960);
                        nbtTagCompound.setDouble("ShaQi", nbtTagCompound.getDouble("ShaQi") - 48);
                        cengShu = 6;
                        LiuZhuanZhenMoEntity liuZhuanZhenMoEntity = new LiuZhuanZhenMoEntity(player.world, player);
                        double attack = nbtTagCompound.getDouble("Attack");
                        double defense = nbtTagCompound.getDouble("Defense");
                        double magicDefense = nbtTagCompound.getDouble("MagicDefense");
                        double defense2 = defense + ((defense * 0.45));
                        double attack2 = attack + (attack * 0.45);
                        double magicDefense2 = magicDefense + ((magicDefense * 0.45));
                        EntityPosition.EntityPosition(player,1,liuZhuanZhenMoEntity);
                        nbtTagCompound.setDouble("Defense", defense2);
                        nbtTagCompound.setDouble("Attack", attack2);
                        nbtTagCompound.setDouble("MagicDefense", magicDefense2);
                        player.addPotionEffect(new PotionEffect(Potion.getPotionById(1),300,2));
                        // 创建一个计时器
                        Timer timer = new Timer();
                        timer.schedule(new TimerTask() {
                            @Override
                            public void run() {
                                double range = 9.0;
                                BlockPos playerPos = player.getPosition();
                                List<EntityLivingBase> entities = new ArrayList<>(player.world.getEntitiesWithinAABB(EntityLivingBase.class, player.getEntityBoundingBox().grow(range)));
                                Iterator<EntityLivingBase> iterator = entities.iterator();
                                while (iterator.hasNext()) {
                                    EntityLivingBase entity = iterator.next();
                                    if (entity != player) {
                                        // 将生物拉至玩家身旁
                                        entity.setPositionAndUpdate(playerPos.getX() + 2, playerPos.getY(), playerPos.getZ() + 2);
                                    }
                                }
                            }
                        }, 0, 100);
                        timer.schedule(new TimerTask() {
                            @Override
                            public void run() {
                                // 将值还原原来的值
                                if (timer != null) {
                                    timer.cancel();
                                }
                                cengShu = 0;
                                liuZhuanZhenMoEntity.setDead();
                                nbtTagCompound.setDouble("Attack", attack_1);
                                nbtTagCompound.setDouble("Defense", defense_1);
                                nbtTagCompound.setDouble("MagicDefense", magicDefense_1);
                            }
                        }, 15000);
                    }
                }
            } else {
                TextComponentString iTextComponent = new TextComponentString("您的灵力或煞气不足以施展神通或者没有使用三转真魔!");
                player1.sendMessage(iTextComponent);
            }
        }
    }
}

