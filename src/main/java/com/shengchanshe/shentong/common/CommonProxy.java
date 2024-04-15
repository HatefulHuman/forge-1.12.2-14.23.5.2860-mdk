package com.shengchanshe.shentong.common;

import com.shengchanshe.shentong.entity.EntityRegisters;
import com.shengchanshe.shentong.network.ModNetwork;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        new ModNetwork(event);
        new EntityRegisters();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
