package com.shengchanshe.shentong.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class LiuZhuanZhenMoEntity extends Entity {
    private EntityPlayer player;
    public LiuZhuanZhenMoEntity(World worldIn) {
        super(worldIn);
    }
    public LiuZhuanZhenMoEntity(World worldIn, EntityPlayer player) {
        super(worldIn);
        this.player = player;
    }
    @Override
    public void onUpdate() {
        super.onUpdate();

        if (player == null) {
            player = world.getClosestPlayerToEntity(this, 10);
        }

        if (player != null) {
            double angle = Math.toRadians(player.rotationYaw - 180);
            double offsetX = -Math.sin(angle);
            double offsetZ = Math.cos(angle);
            double targetX = player.posX + offsetX;
            double targetY = player.posY + 1;
            double targetZ = player.posZ + offsetZ;

            double deltaX = targetX - posX;
            double deltaY = targetY - posY;
            double deltaZ = targetZ - posZ;

            motionX = deltaX * 1;
            motionY = deltaY * 1;
            motionZ = deltaZ * 1;

            double distanceSq = deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ;
            double maxDistanceSq = 1.0; // 距离的阈值，可以根据需要调整
            if (distanceSq > maxDistanceSq) {
                double scale = Math.sqrt(maxDistanceSq / distanceSq);
                motionX *= scale;
                motionY *= scale;
                motionZ *= scale;
            }
            move(MoverType.PLAYER,motionX, motionY, motionZ);
        }
    }

    @Override
    protected void entityInit() {

    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound) {

    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound) {

    }
}
