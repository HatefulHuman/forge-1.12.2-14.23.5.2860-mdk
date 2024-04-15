package com.shengchanshe.shentong.shentong;

import com.shengchanshe.shentong.entity.CangSangZhengDaoEntity;
import com.shengchanshe.shentong.entity.WeRanZhengQiEntity;
import com.shengchanshe.shentong.entity.XuanGangZhenQiEntity;
import com.shengchanshe.shentong.network.ModNetwork;
import com.shengchanshe.shentong.network.packet.haoranzhengqijue.CangSangZhengDao;
import com.shengchanshe.shentong.network.packet.haoranzhengqijue.WeiRangZhengQi;
import com.shengchanshe.shentong.util.EntityPosition;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.*;

public class HaoRanZhengQiJue {
    public static boolean aBoolean = false;

    public static double attack;
    public static double attack1;
    public static double magicAttack;
    public static double magicAttack1;
    public static double defense;
    public static double defense1;
    public static double magicDefense;
    public static double magicDefense1;
    public static double i;

    public static void WeiRangZhengQi(TickEvent.PlayerTickEvent event) {
        if (event.player instanceof EntityPlayer) {
            EntityPlayer player = event.player;
            NBTTagCompound nbtTagCompound = player.getEntityData();
            World world = player.getEntityWorld();
            Entity player1 = event.player;
            WeRanZhengQiEntity weRanZhengQiEntity = new WeRanZhengQiEntity(world, player);
            boolean b = nbtTagCompound.getBoolean("False1");
            if (player != null && player.capabilities != null && player.capabilities.isCreativeMode) {
                if (nbtTagCompound.hasKey("ShenTong1") && nbtTagCompound.getInteger("ShenTong1") == 5
                        && !aBoolean && nbtTagCompound.getBoolean("BeiDong") && !nbtTagCompound.getBoolean("BeiDong1")) {
                    double radius = 1.0;  // 粒子环绕的半径
                    int particleCount = 2;  // 粒子数量
                    double verticalSpeed = 0.1;  // 上下移动的速度
                    double horizontalSpeed = 0.1;  // 水平旋转的速度
                    for (int i = 0; i < particleCount; i++) {
                        double u = (i * 2 * Math.PI) / particleCount;
                        double v = (player.ticksExisted * verticalSpeed + i * horizontalSpeed) % (2 * Math.PI);
                        double x = player.posX + radius * Math.sin(v) * Math.cos(u);
                        double y = player.posY + radius * Math.sin(v) * Math.sin(u);
                        double z = player.posZ + radius * Math.cos(v);
                        WeiRangZhengQi message = new WeiRangZhengQi(x, y, z);
                        ModNetwork.INSTANCE.sendToAll(message);
                    }
                    EntityPosition.EntityPosition(player, 2, weRanZhengQiEntity);
                    weRanZhengQiEntity.setDead();
                }
                if (nbtTagCompound.hasKey("ShenTong1") && nbtTagCompound.getInteger("ShenTong1") == 5 && !b && nbtTagCompound.getBoolean("BeiDong")) {
                    i = 0.3;
                    attack = nbtTagCompound.getDouble("Attack");
                    attack1 = (attack / 1.2);
                    magicAttack = nbtTagCompound.getDouble("MagicAttack");
                    magicAttack1 = (magicAttack / 1.2);
                    defense = nbtTagCompound.getDouble("Defense");
                    defense1 = (defense * 1.1);
                    magicDefense = nbtTagCompound.getDouble("MagicDefense");
                    magicDefense1 = (magicDefense * 1.1);
                    nbtTagCompound.setDouble("Attack", attack1);
                    nbtTagCompound.setDouble("MagicAttack", magicAttack1);
                    nbtTagCompound.setDouble("Defense", defense1);
                    nbtTagCompound.setDouble("MagicDefense", magicDefense1);
                    nbtTagCompound.setBoolean("False1", true);
                } else if (b && !nbtTagCompound.getBoolean("BeiDong")) {
                    double attack3 = nbtTagCompound.getDouble("Attack");
                    double magicAttack3 = nbtTagCompound.getDouble("MagicAttack");
                    double defense3 = nbtTagCompound.getDouble("Defense");
                    double magicDefense3 = nbtTagCompound.getDouble("MagicDefense");
                    nbtTagCompound.setDouble("Attack", (attack3 * 1.2));
                    nbtTagCompound.setDouble("MagicAttack", (magicAttack3 * 1.2));
                    nbtTagCompound.setDouble("Defense", (defense3 / 1.1));
                    nbtTagCompound.setDouble("MagicDefense", (magicDefense3 / 1.1));
                    nbtTagCompound.setBoolean("False1", false);
                }
            } else {
                if (nbtTagCompound.hasKey("ShenTong1") && nbtTagCompound.getInteger("ShenTong1") == 5
                        && nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 32
                        && !aBoolean && nbtTagCompound.getDouble("GongFa23") >= 1 && nbtTagCompound.getBoolean("BeiDong")
                        && !nbtTagCompound.getBoolean("BeiDong1")) {
                    double radius = 1.0;  // 粒子环绕的半径
                    int particleCount = 2;  // 粒子数量
                    double verticalSpeed = 0.1;  // 上下移动的速度
                    double horizontalSpeed = 0.1;  // 水平旋转的速度
                    for (int i = 0; i < particleCount; i++) {
                        double u = (i * 2 * Math.PI) / particleCount;
                        double v = (player.ticksExisted * verticalSpeed + i * horizontalSpeed) % (2 * Math.PI);
                        double x = player.posX + radius * Math.sin(v) * Math.cos(u);
                        double y = player.posY + radius * Math.sin(v) * Math.sin(u);
                        double z = player.posZ + radius * Math.cos(v);
                        WeiRangZhengQi message = new WeiRangZhengQi(x, y, z);
                        ModNetwork.INSTANCE.sendToAll(message);
                    }
                    nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 1.6);
                    EntityPosition.EntityPosition(player, 2, weRanZhengQiEntity);
                    weRanZhengQiEntity.setDead();
                }
                if (nbtTagCompound.hasKey("ShenTong1") && nbtTagCompound.getInteger("ShenTong1") == 5 && !b &&
                        nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("HealthMax") && nbtTagCompound.getDouble("Power") >= 32
                        && nbtTagCompound.getDouble("GongFa23") >= 1 && nbtTagCompound.getBoolean("BeiDong")) {
                    i = 0.3;
                    attack = nbtTagCompound.getDouble("Attack");
                    attack1 = (attack / 1.2);
                    magicAttack = nbtTagCompound.getDouble("MagicAttack");
                    magicAttack1 = (magicAttack / 1.2);
                    defense = nbtTagCompound.getDouble("Defense");
                    defense1 = (defense * 1.1);
                    magicDefense = nbtTagCompound.getDouble("MagicDefense");
                    magicDefense1 = (magicDefense * 1.1);
                    nbtTagCompound.setDouble("Attack", attack1);
                    nbtTagCompound.setDouble("MagicAttack", magicAttack1);
                    nbtTagCompound.setDouble("Defense", defense1);
                    nbtTagCompound.setDouble("MagicDefense", magicDefense1);
                    nbtTagCompound.setBoolean("False1", true);
                } else if (b && !nbtTagCompound.getBoolean("BeiDong")) {
                    double attack3 = nbtTagCompound.getDouble("Attack");
                    double magicAttack3 = nbtTagCompound.getDouble("MagicAttack");
                    double defense3 = nbtTagCompound.getDouble("Defense");
                    double magicDefense3 = nbtTagCompound.getDouble("MagicDefense");
                    nbtTagCompound.setDouble("Attack", (attack3 * 1.2));
                    nbtTagCompound.setDouble("MagicAttack", (magicAttack3 * 1.2));
                    nbtTagCompound.setDouble("Defense", (defense3 / 1.1));
                    nbtTagCompound.setDouble("MagicDefense", (magicDefense3 / 1.1));
                    nbtTagCompound.setBoolean("False1", false);
                } else if (b && nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") < 32) {
                    if (nbtTagCompound.getBoolean("BeiDong")){
                        nbtTagCompound.setBoolean("BeiDong",false);
                    }
                    TextComponentString iTextComponent = new TextComponentString("你的灵力不足以保持神通!");
                    player1.sendMessage(iTextComponent);
                    double attack3 = nbtTagCompound.getDouble("Attack");
                    double magicAttack3 = nbtTagCompound.getDouble("MagicAttack");
                    double defense3 = nbtTagCompound.getDouble("Defense");
                    double magicDefense3 = nbtTagCompound.getDouble("MagicDefense");
                    nbtTagCompound.setDouble("Attack", (attack3 * 1.2));
                    nbtTagCompound.setDouble("MagicAttack", (magicAttack3 * 1.2));
                    nbtTagCompound.setDouble("Defense", (defense3 / 1.1));
                    nbtTagCompound.setDouble("MagicDefense", (magicDefense3 / 1.1));
                    nbtTagCompound.setBoolean("False1", false);
                }
            }
        }
    }

    private static double a;
    private static double b;

    public static void XuanGangZhenQi(TickEvent.PlayerTickEvent event) {
        EntityPlayer player = event.player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        Entity player1 = event.player;
        World world = player.getEntityWorld();
        XuanGangZhenQiEntity xuanGangZhenQiEntity = new XuanGangZhenQiEntity(world, player);//技能召唤的实体
        if (player != null && player.capabilities != null && player.capabilities.isCreativeMode) {
            if (nbtTagCompound.hasKey("ShenTong2") && nbtTagCompound.getInteger("ShenTong2") == 5 && !aBoolean
                    && nbtTagCompound.getDouble("GongFa23") >= 3 && nbtTagCompound.getBoolean("BeiDong1")) {
                double radius = 1.0;  // 粒子环绕的半径
                int particleCount = 2;  // 粒子数量
                double verticalSpeed = 0.1;  // 上下移动的速度
                double horizontalSpeed = 0.1;  // 水平旋转的速度
                for (int i = 0; i < particleCount; i++) {
                    double u = (i * 2 * Math.PI) / particleCount;
                    double v = (player.ticksExisted * verticalSpeed + i * horizontalSpeed) % (2 * Math.PI);
                    double x = player.posX + radius * Math.sin(v) * Math.cos(u);
                    double y = player.posY + radius * Math.sin(v) * Math.sin(u);
                    double z = player.posZ + radius * Math.cos(v);
                    WeiRangZhengQi message = new WeiRangZhengQi(x, y, z);
                    ModNetwork.INSTANCE.sendToAll(message);
                }
                EntityPosition.EntityPosition(player, 2, xuanGangZhenQiEntity);//召唤的实体存在的位置
                xuanGangZhenQiEntity.setDead();
            }
            if (nbtTagCompound.hasKey("ShenTong2") && nbtTagCompound.getInteger("ShenTong2") == 5
                    && !nbtTagCompound.getBoolean("False") && nbtTagCompound.getBoolean("BeiDong1")) {
                i = 0.4;//反伤概率
                //计算属性加成
                a = nbtTagCompound.getDouble("HealthMax");
                b = (a * 0.1);
                a = a + b;
                nbtTagCompound.setDouble("HealthMax", a);
                nbtTagCompound.setBoolean("False", true);
            } else if (nbtTagCompound.hasKey("ShenTong2") && nbtTagCompound.getInteger("ShenTong2") != 5 && nbtTagCompound.getBoolean("False")
                && !nbtTagCompound.getBoolean("BeiDong1")) {
                double c = nbtTagCompound.getDouble("HealthMax");
                nbtTagCompound.setDouble("HealthMax", (c / 1.1));
                nbtTagCompound.setBoolean("False", false);
            }
        } else {
            if (nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("HealthMax") && nbtTagCompound.getDouble("Power") >= 96
                    && nbtTagCompound.getDouble("GongFa23") >= 3 && nbtTagCompound.getBoolean("BeiDong1") && !aBoolean) {
                double radius = 1.0;  // 粒子环绕的半径
                int particleCount = 2;  // 粒子数量
                double verticalSpeed = 0.1;  // 上下移动的速度
                double horizontalSpeed = 0.1;  // 水平旋转的速度
                for (int i = 0; i < particleCount; i++) {
                    double u = (i * 2 * Math.PI) / particleCount;
                    double v = (player.ticksExisted * verticalSpeed + i * horizontalSpeed) % (2 * Math.PI);
                    double x = player.posX + radius * Math.sin(v) * Math.cos(u);
                    double y = player.posY + radius * Math.sin(v) * Math.sin(u);
                    double z = player.posZ + radius * Math.cos(v);
                    WeiRangZhengQi message = new WeiRangZhengQi(x, y, z);
                    ModNetwork.INSTANCE.sendToAll(message);
                }
                nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 4.8);
                EntityPosition.EntityPosition(player, 2, xuanGangZhenQiEntity);//召唤的实体存在的位置
                xuanGangZhenQiEntity.setDead();//
                if (nbtTagCompound.hasKey("ShenTong2") && nbtTagCompound.getInteger("ShenTong2") == 5
                        && !nbtTagCompound.getBoolean("False") && nbtTagCompound.getBoolean("BeiDong1")) {
                    i = 0.4;//反伤概率
                    //计算属性加成
                    a =  nbtTagCompound.getDouble("HealthMax");
                    b =  (a * 0.1);
                    a = a + b;
                    nbtTagCompound.setDouble("HealthMax", a);
                    nbtTagCompound.setBoolean("False", true);
                } else if (nbtTagCompound.getBoolean("False") && !nbtTagCompound.getBoolean("BeiDong1")) {
                    int c = (int) nbtTagCompound.getDouble("HealthMax");
                    nbtTagCompound.setDouble("HealthMax", (c / 1.1));
                    nbtTagCompound.setBoolean("False", false);
                } else if (nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("HealthMax") && nbtTagCompound.getDouble("Power") < 96) {
                    if (nbtTagCompound.getBoolean("BeiDong1")){
                        nbtTagCompound.setBoolean("BeiDong1",false);
                    }
                    double c =  nbtTagCompound.getDouble("HealthMax");
                    nbtTagCompound.setDouble("HealthMax", (c / 1.1));
                    TextComponentString iTextComponent = new TextComponentString("你的灵力不足以保持神通!");
                    player1.sendMessage(iTextComponent);
                    nbtTagCompound.setBoolean("False", false);
                }
            }
        }
    }

    public static long tick = 0;
    public static void CangSangZhengDao(CangSangZhengDao message, MessageContext ctx) {
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 = player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        World world = player.getEntityWorld();
        BlockPos playerPos = player.getPosition();
        double attack1 = nbtTagCompound.getDouble("Attack");
        double range = 5.0; // 伤害范围
        double damage = (attack1 * 1.45); // 伤害值
        float trueDamagePercentage = 0.15f; // 真实伤害的百分比
        CangSangZhengDaoEntity cangSangZhengDaoEntity = new CangSangZhengDaoEntity(world, player);
        if (player != null && player.capabilities != null && player.capabilities.isCreativeMode) {
            EntityPosition.EntityPosition(player, 2, cangSangZhengDaoEntity);
            List<EntityLivingBase> entities = new ArrayList<>(player.world.getEntitiesWithinAABB(EntityLivingBase.class, player.getEntityBoundingBox().grow(range)));
            Iterator<EntityLivingBase> iterator = entities.iterator();
            aBoolean = true;
            while (iterator.hasNext()) {
                EntityLivingBase entity = iterator.next();
                if (entity != player) {
                    // 对生物造成伤害
                    double trueDamage = (damage * trueDamagePercentage);
                    double normalDamage = damage - trueDamage;

                    // 对生物造成伤害
                    entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (float) normalDamage);
                    entity.attackEntityFrom(DamageSource.causePlayerDamage(player).setDamageBypassesArmor(), (float) trueDamage);
                    // 安全删除实体
                    iterator.remove();
                }
            }
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    // 检查剩余时间
                    // 每秒执行的操作
                    cangSangZhengDaoEntity.setDead();
                    aBoolean = false;
                }
            }, 1000);
        } else {
            long current = player.world.getTotalWorldTime();
            if (tick == 0 || current - tick >= 1200) {
                tick = current;
                if (nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("Base")
                        && nbtTagCompound.hasKey("ShenTong3") && nbtTagCompound.getInteger("ShenTong3") == 5
                        && nbtTagCompound.getDouble("Power") >= 960 && nbtTagCompound.getDouble("Base") >= 48) {
                    nbtTagCompound.setDouble("Power", nbtTagCompound.getDouble("Power") - 960);
                    nbtTagCompound.setDouble("Base", nbtTagCompound.getDouble("Base") - 48);
                    EntityPosition.EntityPosition(player, 2, cangSangZhengDaoEntity);
                    List<EntityLivingBase> entities = new ArrayList<>(player.world.getEntitiesWithinAABB(EntityLivingBase.class, player.getEntityBoundingBox().grow(range)));
                    Iterator<EntityLivingBase> iterator = entities.iterator();
                    aBoolean = true;
                    while (iterator.hasNext()) {
                        EntityLivingBase entity = iterator.next();
                        if (entity != player) {
                            // 对生物造成伤害
                            double trueDamage = (damage * trueDamagePercentage);
                            double normalDamage = damage - trueDamage;


                            // 对生物造成伤害
                            entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (float) normalDamage);
                            entity.attackEntityFrom(DamageSource.causePlayerDamage(player).setDamageBypassesArmor(), (float) trueDamage);
                            // 安全删除实体
                            iterator.remove();
                        }
                    }
                    Timer timer = new Timer();
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            // 检查剩余时间
                            // 每秒执行的操作
                            cangSangZhengDaoEntity.setDead();
                            aBoolean = false;
                        }
                    }, 1000);
                } else {
                    TextComponentString iTextComponent = new TextComponentString("你的灵力或真元不足以施展神通!");
                    player1.sendMessage(iTextComponent);
                }
            }
        }
    }


    public static void WeiRangZhengQi(LivingHurtEvent event) {
        if (event.getEntity() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntityLiving();
            NBTTagCompound nbtTagCompound = player.getEntityData();
            World world = player.getEntityWorld();
            BlockPos playerPos = player.getPosition();
            if (nbtTagCompound.hasKey("ShenTong1") && nbtTagCompound.getInteger("ShenTong1") == 5) {
                if (nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("HealthMax") && i == 0.3
                        && nbtTagCompound.getDouble("Power") >= 32 && nbtTagCompound.getDouble("GongFa23") >= 1) {
                    // 使用随机数判断是否触发伤害效果
                    if (player instanceof EntityPlayer) {
                        if (event.getSource().getTrueSource() instanceof EntityLivingBase) {
                            if (world.rand.nextDouble() <= i) {
                                // 获取附近的实体
                                AxisAlignedBB range = new AxisAlignedBB(playerPos).grow(3);
                                List<EntityLivingBase> entities = world.getEntitiesWithinAABB(EntityLivingBase.class, range);
                                // 对附近的敌人造成伤害
                                for (EntityLivingBase entity : entities) {
                                    if (entity != player && entity.isEntityAlive()) {
                                        entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (float) nbtTagCompound.getDouble("Attack"));
                                    }
                                }
                            }
                        }
                    }
                }
                if (nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("HealthMax") && i == 0.4
                        && nbtTagCompound.getDouble("Power") >= 96 && nbtTagCompound.getDouble("GongFa23") >= 3) {
                    if (player instanceof EntityPlayer) {
                        if (event.getSource().getTrueSource() instanceof EntityLivingBase) {
                            if (world.rand.nextDouble() <= i) {
                                // 获取附近的实体
                                AxisAlignedBB range = new AxisAlignedBB(playerPos).grow(3);
                                List<EntityLivingBase> entities = world.getEntitiesWithinAABB(EntityLivingBase.class, range);
                                // 对附近的敌人造成伤害
                                for (EntityLivingBase entity : entities) {
                                    if (entity != player && entity.isEntityAlive()) {
                                        entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (float) nbtTagCompound.getDouble("Attack"));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}