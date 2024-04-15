package com.shengchanshe.shentong.potion;

import com.shengchanshe.shentong.ShenTongMod;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class NiQingPotionEffect extends PotionEffect {
    public NiQingPotionEffect(int duration, int amplifier) {
        super(Potion.getPotionFromResourceLocation(ShenTongMod.MODID+":ni_qing_potion"), duration, amplifier, false, true);
    }
}