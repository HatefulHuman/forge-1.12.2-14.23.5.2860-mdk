package com.shengchanshe.shentong.potion;

import com.shengchanshe.shentong.ShenTongMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

public class NiQingPotion extends Potion {
    private static final ResourceLocation NI_QING = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/ni_qing_duan_tian/ni_qing.png");
    public NiQingPotion() {
        super(false, 0x0000FF);
        this.setRegistryName(ShenTongMod.MODID+":ni_qing_potion");
        this.setPotionName("effect."+ShenTongMod.MODID+".ni_qing_potion");
    }

    @Override
    public boolean hasStatusIcon() {
        return false;
    }
    @Override
    public void renderInventoryEffect(PotionEffect effect, Gui gui, int x, int y, float z) {
        super.renderInventoryEffect(effect, gui, x, y, z);
        Minecraft.getMinecraft().getTextureManager().bindTexture(NI_QING);
        gui.drawModalRectWithCustomSizedTexture(x+8, y+8, 0, 0, 16, 16,16, 16);
    }
    @Override
    public void renderHUDEffect(PotionEffect effect, Gui gui, int x, int y, float z, float alpha) {
        super.renderHUDEffect(effect, gui, x, y, z, alpha);
        Minecraft.getMinecraft().getTextureManager().bindTexture(NI_QING);
        gui.drawModalRectWithCustomSizedTexture(x+4, y+4, 0, 0, 16, 16,16, 16);
    }
}