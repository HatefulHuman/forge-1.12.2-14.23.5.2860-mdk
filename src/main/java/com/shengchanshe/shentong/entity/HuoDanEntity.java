package com.shengchanshe.shentong.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class HuoDanEntity extends EntityLargeFireball {
    private double harm = 0;

    public HuoDanEntity(World worldIn) {
        super(worldIn);
    }

    public HuoDanEntity(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
        super(worldIn, shooter, accelX, accelY, accelZ);
    }

    @Override
    protected void onImpact(RayTraceResult result) {
        // 在火焰弹命中时造成AOE伤害
        if (!this.world.isRemote) {
            BlockPos impactPos = this.getPosition();
            double explosionRadius = 3.0; // AOE伤害的半径
            AxisAlignedBB explosionArea = new AxisAlignedBB(impactPos).grow(explosionRadius);
            for (EntityLivingBase target : this.world.getEntitiesWithinAABB(EntityLivingBase.class, explosionArea)) {
                if (target != this.shootingEntity) {
                    target.attackEntityFrom(DamageSource.causeFireballDamage(this, this.shootingEntity), (float) this.getHarm()); // 造成伤害
                }
            }
        }
        this.setDead();
    }
    @Override
    public void onUpdate() {
        super.onUpdate();

        ticksExisted++;

        if (ticksExisted >= 40) { // 40个游戏刻钟为两秒
            setDead();
            return;
        }
    }
    public double getHarm() {
        return harm;
    }

    public void setHarm(double harm) {
        this.harm = harm;
    }
}
