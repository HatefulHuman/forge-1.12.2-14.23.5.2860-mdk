package com.shengchanshe.shentong.potion;

import com.shengchanshe.shentong.ShenTongMod;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class JingXinPotionEffect extends PotionEffect {
    public JingXinPotionEffect(int duration, int amplifier) {
        super(Potion.getPotionFromResourceLocation(ShenTongMod.MODID+":jing_xin_potion"), duration, amplifier, false, true);
    }
}