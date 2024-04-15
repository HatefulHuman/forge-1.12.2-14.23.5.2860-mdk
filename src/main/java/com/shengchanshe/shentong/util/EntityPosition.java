package com.shengchanshe.shentong.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class EntityPosition {
    public static void EntityPosition(EntityPlayer player, int y,Entity entity){
        double angle = Math.toRadians(player.rotationYaw - 180);
        double offsetX = -Math.sin(angle);
        double offsetZ = Math.cos(angle);
        double targetX = player.posX + offsetX;
        double targetY = player.posY + y;
        double targetZ = player.posZ + offsetZ;
        entity.setPosition(targetX, targetY, targetZ);
        player.world.spawnEntity(entity);
    }
}
