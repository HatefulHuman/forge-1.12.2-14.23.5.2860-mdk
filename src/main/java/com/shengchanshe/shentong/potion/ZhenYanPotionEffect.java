package com.shengchanshe.shentong.potion;

import com.shengchanshe.shentong.ShenTongMod;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ZhenYanPotionEffect extends PotionEffect {
    public ZhenYanPotionEffect(int duration, int amplifier) {
        super(Potion.getPotionFromResourceLocation(ShenTongMod.MODID+":zhen_yan_potion"), duration, amplifier, false, true);
    }
}