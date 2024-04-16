package com.shengchanshe.shentong.shentong;

import com.shengchanshe.shentong.network.ModNetwork;
import com.shengchanshe.shentong.network.packet.yuancishenguang.HuTiYuanCi;
import com.shengchanshe.shentong.network.packet.yuancishenguang.ShenGuangWeiShe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.*;

public class YuanCiShenGuang {
    private static long tickHTYC = 0;
    public static void HuTiYuanCi(TickEvent.PlayerTickEvent event){
        if (event.player != null) {
            EntityPlayer player = event.player;
            NBTTagCompound nbtTagCompound = player.getEntityData();
            World world = player.getEntityWorld();
            tickHTYC++;
            if (nbtTagCompound.hasKey("ShenTong1") && nbtTagCompound.getInteger("ShenTong1") == 7
                    && nbtTagCompound.getDouble("GongFa28") >= 1 && nbtTagCompound.getBoolean("BeiDong") && tickHTYC >= 20){
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
                    HuTiYuanCi message = new HuTiYuanCi(x,y,z);
                    ModNetwork.INSTANCE.sendToAll(message);
                }
                tickHTYC = 0;
            }
            if (nbtTagCompound.hasKey("ShenTong1") && nbtTagCompound.getInteger("ShenTong1") == 7
                    && !nbtTagCompound.getBoolean("HuTiShenGuangFalse") && nbtTagCompound.getDouble("GongFa28") >= 1 && nbtTagCompound.getBoolean("BeiDong")){
                double defense = nbtTagCompound.getDouble("Defense") * 1.15;
                double magicDefense = nbtTagCompound.getDouble("MagicDefense") * 1.15;
                nbtTagCompound.setDouble("Defense",defense);
                nbtTagCompound.setDouble("MagicDefense",magicDefense);
                nbtTagCompound.setBoolean("HuTiShenGuangFalse",true);
            }else if(nbtTagCompound.getBoolean("HuTiShenGuangFalse") && !nbtTagCompound.getBoolean("BeiDong")){
                double defense = nbtTagCompound.getDouble("Defense") / 1.15;
                double magicDefense = nbtTagCompound.getDouble("MagicDefense") / 1.15;
                nbtTagCompound.setDouble("Defense",defense);
                nbtTagCompound.setDouble("MagicDefense",magicDefense);
                nbtTagCompound.setBoolean("HuTiShenGuangFalse",false);
            }
        }
    }
    public static long tick = 0;
    public static void ShenGuangWeiShe(ShenGuangWeiShe message, MessageContext ctx){
        EntityPlayer player = ctx.getServerHandler().player;
        Entity player1 = player;
        NBTTagCompound nbtTagCompound = player.getEntityData();
        World world = player.getEntityWorld();
        double range = 9.0; // 伤害范围
        if (player != null && player.capabilities != null && player.capabilities.isCreativeMode) {
            List<EntityLivingBase> entities = new ArrayList<>(player.world.getEntitiesWithinAABB(EntityLivingBase.class, player.getEntityBoundingBox().grow(range)));
            Iterator<EntityLivingBase> iterator = entities.iterator();
            while (iterator.hasNext()) {
                EntityLivingBase entity = iterator.next();
                if (entity != player) {
                    // 对生物造成伤害
                    entity.attackEntityFrom(DamageSource.causePlayerDamage(player).setDamageBypassesArmor(), (float) (1200+(nbtTagCompound.getDouble("MagicAttack")*1.2)));
                    // 安全删除实体
                    iterator.remove();
                }
            }
        }else {
            long current = player.world.getTotalWorldTime();
            if (nbtTagCompound.hasKey("YuanCi") && nbtTagCompound.hasKey("Base") && nbtTagCompound.getDouble("YuanCi") >= 90 && nbtTagCompound.getDouble("Base") >= 48){
                if (tick == 0 || current - tick >= 1200) {
                    nbtTagCompound.setDouble("YuanCi", nbtTagCompound.getDouble("YuanCi") - 90);
                    nbtTagCompound.setDouble("Base", nbtTagCompound.getDouble("Base") - 48);
                    tick = current;
                    List<EntityLivingBase> entities = new ArrayList<>(player.world.getEntitiesWithinAABB(EntityLivingBase.class, player.getEntityBoundingBox().grow(range)));
                    Iterator<EntityLivingBase> iterator = entities.iterator();
                    while (iterator.hasNext()) {
                        EntityLivingBase entity = iterator.next();
                        if (entity != player) {
                            // 对生物造成伤害
                            entity.attackEntityFrom(DamageSource.causePlayerDamage(player).setDamageBypassesArmor(), (float) (1200+(nbtTagCompound.getDouble("MagicAttack")*1.2)));
                            // 安全删除实体
                            iterator.remove();
                        }
                    }
                }
            }else {
                TextComponentString iTextComponent = new TextComponentString("您的元磁之力或真元不足以施展神通!");
                player1.sendMessage(iTextComponent);
            }
        }
    }

}