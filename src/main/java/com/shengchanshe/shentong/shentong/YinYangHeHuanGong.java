package com.shengchanshe.shentong.shentong;

import com.shengchanshe.shentong.network.packet.yinyanghehuangong.HeHeShu;
import com.shengchanshe.shentong.network.packet.yinyanghehuangong.HeJi;
import com.shengchanshe.shentong.network.packet.yinyanghehuangong.YinYangLiangCheng;
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

public class YinYangHeHuanGong {
    public static long tick1 = 0;
    public static void HeHeShu(HeHeShu message, MessageContext ctx) {
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 = player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 32) {
            if (nbtTagCompound.hasKey("Attack")) {
                long current = player.world.getTotalWorldTime();
                if (tick1 == 0 || current - tick1 >= 1200) {
                    tick1 = current;
                    nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 32);
                    for (Entity entity : player.world.loadedEntityList) {
                        if (entity instanceof EntityPlayer && entity != player) {
                            NBTTagCompound entityData = entity.getEntityData();
                            if(entityData.getString("DaoLv").equals(player.getDisplayNameString())){
                                double distance = Math.abs(player.posX - entity.posX) + Math.abs(player.posY - entity.posY) + Math.abs(player.posZ - entity.posZ);
                                Timer timer = new Timer();
                                timer.schedule(new TimerTask() {
                                    @Override
                                    public void run() {
                                        if (distance <= 5) {
                                            //五格范围内有其他玩家时
                                            entityData.setDouble("Attack" , entityData.getDouble("Attack") * 1.05);
                                        }
                                        entity.setPositionAndUpdate(player.posX, player.posY, player.posZ);
                                    }
                                },50);//延迟一秒后执行,只执行一次
                                timer.schedule(new TimerTask() {
                                    @Override
                                    public void run() {

                                        if (distance >= 5) {
                                            //五格范围内没有其他玩家时
                                            entityData.setDouble("Attack", entityData.getDouble("Attack") / 1.05);
                                        }
                                    }
                                },0,1000);
                                timer.schedule(new TimerTask() {
                                    @Override
                                    public void run() {
                                        if (timer != null) {
                                            timer.cancel();
                                        }
                                    }
                                },30000);
                            }
                        }
                    }
                }
            }
        }else {
            TextComponentString iTextComponent = new TextComponentString("您的灵力不足以施展神通!");
            player1.sendMessage(iTextComponent);
        }
    }

    public static long tick2 = 0;
    public static void HeJi(HeJi message, MessageContext ctx){
        EntityPlayer player = ctx.getServerHandler().player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        Entity player1 = player;
        if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 96){
            long current = player.world.getTotalWorldTime();
            if (tick2 == 0 || current - tick2 >= 360) {
                tick2 = current;
                nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 96);
                for (Entity entity1 : player.world.loadedEntityList) {
                    if (entity1 instanceof EntityPlayer) {
                        NBTTagCompound entityData = entity1.getEntityData();
                        if(entityData.getString("DaoLv") != null && entityData.getString("DaoLv").equals(player.getDisplayNameString())){
                            nbtTagCompound.setDouble("Defense", nbtTagCompound.getDouble("Defense") * 1.15);
                            entityData.setDouble("Attack" , entityData.getDouble("Attack") * 1.15);
                            entity1.setPositionAndUpdate(player.posX, player.posY, player.posZ);
                            Timer timer = new Timer();
                            timer.schedule(new TimerTask() {
                                @Override
                                public void run() {
                                    double range = 5;
                                    List<EntityLivingBase> entities = new ArrayList<>(player.world.getEntitiesWithinAABB(EntityLivingBase.class, player.getEntityBoundingBox().grow(range)));
                                    Iterator<EntityLivingBase> iterator = entities.iterator();
                                    while (iterator.hasNext()) {
                                        EntityLivingBase entity = iterator.next();
                                        if (entity != player) {
                                            // 对生物造成伤害
                                            entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (float) (nbtTagCompound.getDouble("Attack") * 1.8));
                                            entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (float) (entityData.getDouble("Attack") * 1.8));
                                            // 安全删除实体
                                            iterator.remove();
                                        }
                                    }
                                }
                            },0,500);
                            timer.schedule(new TimerTask() {
                                @Override
                                public void run() {
                                    if (timer != null) {
                                        timer.cancel();
                                    }
                                    nbtTagCompound.setDouble("Defense", entityData.getDouble("Defense") / 1.15);
                                    entityData.setDouble("Attack" , entityData.getDouble("Attack") / 1.15);
                                }
                            },9000);
                        }else {
                            TextComponentString iTextComponent = new TextComponentString("您还没有道侣!");
                            player1.sendMessage(iTextComponent);
                        }
                    }
                }
            }
        }else {
            TextComponentString iTextComponent = new TextComponentString("您的灵力不足以施展神通!");
            player1.sendMessage(iTextComponent);
        }
    }

    public static long tick3 = 0;
    public static void YinYangLiangCheng(YinYangLiangCheng message, MessageContext ctx){
        EntityPlayer player = ctx.getServerHandler().player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        Entity player1 = player;
        if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 960 && nbtTagCompound.hasKey("Base") && nbtTagCompound.getDouble("Base") >= 48) {
            if (nbtTagCompound.hasKey("Attack")) {
                long current = player.world.getTotalWorldTime();
                if (tick1 == 0 || current - tick1 >= 1200) {
                    tick1 = current;
                    nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 960);
                    nbtTagCompound.setDouble("Base", nbtTagCompound.getDouble("Base") - 48);
                    for (Entity entity1 : player.world.loadedEntityList) {
                        //加载世界玩家
                        // for (EntityPlayerMP player : player.getServer().getPlayerList().getPlayers()) {}
                        if (entity1 instanceof EntityPlayer) {
                            EntityPlayer player2 = (EntityPlayer) entity1;
                            NBTTagCompound entityData = entity1.getEntityData();
                            if (entityData.getString("DaoLv").equals(player.getDisplayNameString())) {
                                nbtTagCompound.setDouble("Defense",nbtTagCompound.getDouble("Defense") * 1.25);
                                nbtTagCompound.setDouble("MagicDefense",nbtTagCompound.getDouble("MagicDefense") * 1.25);
                                entityData.setDouble("Attack" , entityData.getDouble("Attack") * 1.25);
                                player2.capabilities.setPlayerWalkSpeed(0.125F);
                                player2.sendPlayerAbilities();
                                double range = 5;
                                List<EntityLivingBase> entities = new ArrayList<>(player.world.getEntitiesWithinAABB(EntityLivingBase.class, player.getEntityBoundingBox().grow(range)));
                                Iterator<EntityLivingBase> iterator = entities.iterator();
                                while (iterator.hasNext()) {
                                    EntityLivingBase entity = iterator.next();
                                    if (entity != player) {
                                        // 对生物造成伤害
                                        entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (float) (nbtTagCompound.getDouble("Attack") * 3));
                                        entity.attackEntityFrom(DamageSource.causePlayerDamage(player2), (float) (entityData.getDouble("Attack") * 3));
                                        // 安全删除实体
                                        iterator.remove();
                                    }
                                }
                                Timer timer = new Timer();
                                timer.schedule(new TimerTask() {
                                    @Override
                                    public void run() {
                                        nbtTagCompound.setDouble("Defense",nbtTagCompound.getDouble("Defense") / 1.25);
                                        nbtTagCompound.setDouble("MagicDefense",nbtTagCompound.getDouble("MagicDefense") / 1.25);
                                        entityData.setDouble("Attack" , entityData.getDouble("Attack") / 1.25);
                                        player2.capabilities.setPlayerWalkSpeed(0.1F);
                                        player2.sendPlayerAbilities();
                                    }
                                },20000);
                            }else {
                                TextComponentString iTextComponent = new TextComponentString("您还没有道侣!");
                                player1.sendMessage(iTextComponent);
                            }
                        }
                    }
                }
            }
        }else {
            TextComponentString iTextComponent = new TextComponentString("您的灵力或真元不足以施展神通!");
            player1.sendMessage(iTextComponent);
        }
    }
}