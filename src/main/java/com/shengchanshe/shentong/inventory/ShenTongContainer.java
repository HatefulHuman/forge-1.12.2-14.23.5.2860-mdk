package com.shengchanshe.shentong.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ShenTongContainer extends Container {

    public ShenTongContainer()
    {
        super();
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
