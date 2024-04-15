package com.shengchanshe.shentong.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class JianQiEntity extends EntityThrowable {
    private double harm = 0;

    public JianQiEntity(World worldIn) {
        super(worldIn);
        setSize(1.0f,0.01f);
    }

    public JianQiEntity(World worldIn, EntityLivingBase throwerIn) {
        super(worldIn, throwerIn);
        setSize(1.0f,0.01f);
    }

    @Override
    public void onImpact(RayTraceResult result) {
        if (result.entityHit != null) {
            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)this.getHarm());
        }

        if (!this.world.isRemote) {
            this.world.setEntityState(this, (byte)3);
        }
    }
    @Override
    public void onUpdate() {
        super.onUpdate();

        ticksExisted++;

        if (ticksExisted >= 20) { // 40个游戏刻钟为两秒
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