package com.shengchanshe.shentong.potion;

import com.shengchanshe.shentong.ShenTongMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

public class ZhenYanPotion extends Potion {
    private static final ResourceLocation ZHEN_YAN = new ResourceLocation(ShenTongMod.MODID + ":" + "textures/gui/sheng_tong/su_xin_lun_hui_gong/zhen_yan.png");
    public ZhenYanPotion() {
        super(false, 0xFFA500);
        this.setRegistryName(ShenTongMod.MODID+":zhen_yan_potion");
        this.setPotionName("effect."+ShenTongMod.MODID+".zhen_yan_potion");
    }

    @Override
    public boolean hasStatusIcon() {
        return false;
    }
    @Override
    public void renderInventoryEffect(PotionEffect effect, Gui gui, int x, int y, float z) {
        super.renderInventoryEffect(effect, gui, x, y, z);
        Minecraft.getMinecraft().getTextureManager().bindTexture(ZHEN_YAN);
        gui.drawModalRectWithCustomSizedTexture(x+8, y+8, 0, 0, 16, 16,16, 16);
    }
    @Override
    public void renderHUDEffect(PotionEffect effect, Gui gui, int x, int y, float z, float alpha) {
        super.renderHUDEffect(effect, gui, x, y, z, alpha);
        Minecraft.getMinecraft().getTextureManager().bindTexture(ZHEN_YAN);
        gui.drawModalRectWithCustomSizedTexture(x+4, y+4, 0, 0, 16, 16,16, 16);
    }
}
