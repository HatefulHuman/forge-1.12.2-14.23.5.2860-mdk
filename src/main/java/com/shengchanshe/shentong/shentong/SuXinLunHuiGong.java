package com.shengchanshe.shentong.shentong;

import com.shengchanshe.shentong.entity.HuoDanEntity;
import com.shengchanshe.shentong.network.ModNetwork;
import com.shengchanshe.shentong.network.packet.suxinlunhuigong.HuoDan;
import com.shengchanshe.shentong.network.packet.suxinlunhuigong.NiePan;
import com.shengchanshe.shentong.network.packet.suxinlunhuigong.ZhenYan;
import com.shengchanshe.shentong.potion.ZhenYanPotionEffect;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.*;

public class SuXinLunHuiGong {
    //火弹
    public static long tick = 0;
    public static void HuoDan(HuoDan message, MessageContext ctx) {
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 = player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        World world = player.world;
        if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") >= 32){
            if (nbtTagCompound.hasKey("MagicAttack")) {
                double magicAttack = nbtTagCompound.getDouble("MagicAttack") * (1.3);
                double speed = 1.5; // 设置速度为1.5
                Vec3d motion = player.getLookVec().scale(speed);
                HuoDanEntity fireball = new HuoDanEntity(world, player, 1, 1, 1);
                Vec3d look = player.getLookVec();
                double spawnX = player.posX + look.x * 2; // 火焰弹的初始X坐标
                double spawnY = player.posY + look.y * 2 + player.getEyeHeight(); // 火焰弹的初始Y坐标
                double spawnZ = player.posZ + look.z * 2; // 火焰弹的初始Z坐标
                fireball.setHarm(magicAttack);
                fireball.setPosition(spawnX, spawnY, spawnZ);

                fireball.motionX = motion.x;
                fireball.motionY = motion.y;
                fireball.motionZ = motion.z;
                fireball.accelerationX = look.x * 0.1;
                fireball.accelerationY = look.y * 0.1;
                fireball.accelerationZ = look.z * 0.1;

                long current = player.world.getTotalWorldTime();
                if (tick == 0||current - tick >= 40) {
                    nbtTagCompound.setDouble("Power",nbtTagCompound.getDouble("Power")-32);
                    tick = current;
                    world.spawnEntity(fireball);
                }
            }
        }else{
            TextComponentString iTextComponent = new TextComponentString("您的灵力不足以施展神通!");
            player1.sendMessage(iTextComponent);
        }
    }


    public static void ZhenYan(LivingHurtEvent event) {
        if (event.getEntityLiving() instanceof EntityPlayer ) {
            EntityPlayer player = (EntityPlayer) event.getEntityLiving();
            NBTTagCompound nbtTagCompound = player.getEntityData();
            Entity player1 = event.getEntity();
            World world = player.getEntityWorld();
            BlockPos playerPos = player.getPosition();
            if (nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("MagicAttack") && nbtTagCompound.getDouble("Power") >= 96
                    && nbtTagCompound.hasKey("ShenTong2") && nbtTagCompound.getInteger("ShenTong2") == 3
                    && nbtTagCompound.getDouble("GongFa31") >= 3 && nbtTagCompound.getBoolean("BeiDong1")){
                double magicAttack = nbtTagCompound.getDouble("MagicAttack") * (0.8);
                // 使用随机数判断是否触发伤害效果
                if (player instanceof EntityPlayer) {
                    if (event.getSource().getTrueSource() instanceof EntityLivingBase) {
                        if (world.rand.nextDouble() <= 0.15) {

                            // 生成火焰粒子
                            double posX = player.posX;
                            double posY = player.posY;
                            double posZ = player.posZ;
                            // 计算粒子的运动方向
                            for (int i = 0; i < 80; i++) {
                                //粒子的偏移
                                double offsetX = (world.rand.nextDouble() - 0.5) * 0.5;
                                double offsetY = (world.rand.nextDouble() - 0.5) * 0.1;
                                double offsetZ = (world.rand.nextDouble() - 0.5) * 0.5;
                                ZhenYan message = new ZhenYan(posX, posY, posZ,offsetX,offsetY,offsetZ);
                                ModNetwork.INSTANCE.sendToAll(message);
                            }
                            // 获取附近的实体
                            AxisAlignedBB range = new AxisAlignedBB(playerPos).grow(3);
                            List<EntityLivingBase> entities = world.getEntitiesWithinAABB(EntityLivingBase.class, range);
                            // 对附近的敌人造成伤害
                            for (EntityLivingBase entity : entities) {
                                if (entity != player && entity.isEntityAlive()) {
                                    entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (float) magicAttack);
                                }
                            }
                        }
                    }
                }
            }else if (nbtTagCompound.hasKey("Power") && nbtTagCompound.getDouble("Power") < 96){
                TextComponentString iTextComponent = new TextComponentString("你的灵力不足以保持神通!");
                player1.sendMessage(iTextComponent);
            }
        }
    }
    public static void ZhenYan(TickEvent.PlayerTickEvent event) {
        if (event.player instanceof EntityPlayer) {
            EntityPlayer player = event.player;
            NBTTagCompound nbtTagCompound = player.getEntityData();
            if (nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("MagicAttack") && nbtTagCompound.getDouble("Power") >= 96
                    &&  nbtTagCompound.hasKey("ShenTong2") && nbtTagCompound.getInteger("ShenTong2") == 3
                    && nbtTagCompound.getDouble("GongFa31") >= 3 && nbtTagCompound.getBoolean("BeiDong1")){
                double i = (96 / 20);
                nbtTagCompound.setDouble("Power",nbtTagCompound.getDouble("Power") - i);
                ZhenYanPotionEffect zhenYanPotionEffect = new ZhenYanPotionEffect(20, 0);
                player.addPotionEffect(new PotionEffect(zhenYanPotionEffect));
            }
        }
    }

    public static long tick2 = 0;
    public static void NiePan(NiePan message, MessageContext ctx){
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 = player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        if (nbtTagCompound.hasKey("Power") && nbtTagCompound.hasKey("Base")
                && nbtTagCompound.hasKey("MagicAttack") && nbtTagCompound.getDouble("Power") >= 960
                && nbtTagCompound.getDouble("Base") >= 48){
            long current = player.world.getTotalWorldTime();
            if (tick2 == 0 || current - tick2 >= 1200) {
                tick2 = current;
                nbtTagCompound.setDouble("Power",nbtTagCompound.getDouble("Power")-960);
                nbtTagCompound.setDouble("Base",nbtTagCompound.getDouble("Base")-48);
                double magicAttack = (nbtTagCompound.getDouble("MagicAttack")* 1.5) + 144;
                // 创建一个计时器
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        // 检查剩余时间
                        // 每秒执行的操作
                        double range = 7.0;
                        //如果攻击频率过快时,击杀大量生物就会造成游戏崩溃,
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
                    }
                }, 0,500);//0.5秒执行一次
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                    if (timer != null){
                        timer.cancel();
                    }
                    }
                }, 6000); // 6秒后终止任务
            }
        }else {
            TextComponentString iTextComponent = new TextComponentString("您的灵力或真元不足以施展神通!");
            player1.sendMessage(iTextComponent);
        }
    }
}