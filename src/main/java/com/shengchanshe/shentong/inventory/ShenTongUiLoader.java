package com.shengchanshe.shentong.inventory;


import com.shengchanshe.shentong.ShenTongMod;
import com.shengchanshe.shentong.client.gui.ShenTongGuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ShenTongUiLoader implements IGuiHandler {
    public static final int GUI_DEMO = 1;

    public ShenTongUiLoader()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(ShenTongMod.instance, this);
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch (ID)
        {
            case GUI_DEMO:
                return new ShenTongContainer();
            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch (ID)
        {
            case GUI_DEMO:
                return new ShenTongGuiContainer(new ShenTongContainer());
            default:
                return null;
        }
    }
}
