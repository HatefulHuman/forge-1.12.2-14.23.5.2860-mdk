package com.shengchanshe.shentong.shentong;

import com.shengchanshe.shentong.network.packet.jiuchongshuanjianjue.HeJianJue;
import com.shengchanshe.shentong.network.packet.jiuchongshuanjianjue.JiuChongShuanJian;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.*;

public class JiuChongShuanJianJue {
    public static long tick1 = 0;
    public static void HeJianJue(HeJianJue message, MessageContext ctx) {
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
                            if (entityData.getString("DaoLv").equals(player.getDisplayNameString())) {
                                double distance = Math.abs(player.posX - entity.posX) + Math.abs(player.posY - entity.posY) + Math.abs(player.posZ - entity.posZ);
                                Timer timer = new Timer();
                                timer.schedule(new TimerTask() {
                                    @Override
                                    public void run() {
                                        player.setPositionAndUpdate(entity.posX, entity.posY, entity.posZ);
                                        if (distance <= 5) {
                                            //五格范围内有其他玩家时
                                            entityData.setDouble("MagicAttack", entityData.getDouble("MagicAttack") * 1.05);
                                        }
                                    }
                                }, 1000);//延迟一秒后执行,只执行一次
                                timer.schedule(new TimerTask() {
                                    @Override
                                    public void run() {
                                        if (distance >= 5) {
                                            //五格范围内没有其他玩家时
                                            entityData.setDouble("MagicAttack", entityData.getDouble("MagicAttack") / 1.05);
                                        }
                                    }
                                }, 0, 50);
                                timer.schedule(new TimerTask() {
                                    @Override
                                    public void run() {
                                        if (timer != null) {
                                            timer.cancel();
                                        }
                                    }
                                }, 30000);
                            } else {
                                TextComponentString iTextComponent = new TextComponentString("您还没有道侣!");
                                player1.sendMessage(iTextComponent);
                            }
                        }
                    }
                }
            }
        } else {
            TextComponentString iTextComponent = new TextComponentString("你的灵力不足以施展神通!");
            player1.sendMessage(iTextComponent);
        }
    }

    public static long tick2 = 0;
    private static boolean boostAttackDamage = false;
    public static void YiJianJue(AttackEntityEvent event) {
        if (event.getEntity() instanceof EntityLivingBase) {
            EntityPlayer player = (EntityPlayer) event.getEntity();
            EntityLivingBase target = (EntityLivingBase) event.getEntity();
            NBTTagCompound nbtTagCompound = player.getEntityData();
            Entity player1 = event.getEntity();
            if (nbtTagCompound.hasKey("ShenTong2") && nbtTagCompound.getInteger("ShenTong2") == 9
                    && nbtTagCompound.getDouble("GongFa30") >= 3 && nbtTagCompound.getBoolean("BeiDong1")) {
                long current = player.world.getTotalWorldTime();
                if (tick2 == 0 || current - tick2 >= 40) {
                    if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 96) {
                        boostAttackDamage = true;
                        if (boostAttackDamage) {
                            tick2 = current;
                            nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 96);
                            double magicAttack = nbtTagCompound.getDouble("MagicAttack");
                            // 增加攻击伤害
                            // 检查事件是否涉及玩家攻击
                            if (event.getEntityPlayer() != null && event.getTarget() != null) {
                                // 增加玩家攻击伤害
                                event.getEntityPlayer().getAttributeMap().getAttributeInstance(SharedMonsterAttributes.ATTACK_DAMAGE)
                                        .applyModifier(new AttributeModifier("Extra Damage", magicAttack * 1.6, 0));
                            }
                            // 重置增加攻击伤害的标志
                            boostAttackDamage = false;
                        }
                    } else if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") < 96){
                        TextComponentString iTextComponent = new TextComponentString("你的灵力不足以保持神通!");
                        player1.sendMessage(iTextComponent);
                    }
                }
            }
        }
    }

    public static long tick3 = 0;
    public static void JiuChongShuanJian(JiuChongShuanJian message, MessageContext ctx) {
        EntityPlayer player = ctx.getServerHandler().player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        Entity player1 = player;
        if (nbtTagCompound.hasKey("MagicAttack")) {
            long current = player.world.getTotalWorldTime();
            if (tick3 == 0 || current - tick3 >= 1200) {
                if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 960
                        && nbtTagCompound.hasKey("Base") && nbtTagCompound.getDouble("Base") >= 48) {
                    tick3 = current;
                    nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 960);
                    nbtTagCompound.setDouble("Base", nbtTagCompound.getDouble("Base") - 48);
                    for (EntityPlayerMP player2 : player.getServer().getPlayerList().getPlayers()) {
                        if (player2 instanceof EntityPlayer && player2 != player) {
                            NBTTagCompound entityData = player2.getEntityData();
                            if (entityData.getString("DaoLv").equals(player.getDisplayNameString())) {
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
                                                entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (float) (nbtTagCompound.getDouble("MagicAttack") * 2));
                                                entity.attackEntityFrom(DamageSource.causePlayerDamage(player2), (float) (entityData.getDouble("MagicAttack") * 2));
                                                // 安全删除实体
                                                iterator.remove();
                                            }
                                        }
                                    }
                                }, 0, 500);

                                timer.schedule(new TimerTask() {
                                    @Override
                                    public void run() {
                                        if (timer != null) {
                                            timer.cancel();
                                        }
                                    }
                                }, 5000);
                            } else {
                                TextComponentString iTextComponent = new TextComponentString("您还没有道侣!");
                                player1.sendMessage(iTextComponent);
                            }
                        }
                    }
                } else {
                    TextComponentString iTextComponent = new TextComponentString("你的灵力或真元不足以施展神通!");
                    player1.sendMessage(iTextComponent);
                }
            }
        }
    }
}
