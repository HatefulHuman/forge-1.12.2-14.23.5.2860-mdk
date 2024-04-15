package com.shengchanshe.shentong.potion;

import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class PotionRegistryHandler {
    public static final Potion POTION_JING_XIN = new JingXinPotion();
    public static final Potion POTION_NI_QING = new NiQingPotion();
    public static final Potion POTION_ZHEN_YAN = new ZhenYanPotion();
    @SubscribeEvent
    public static void onPotionRegistration(RegistryEvent.Register<Potion> event) {
        IForgeRegistry<Potion> registry = event.getRegistry();
        registry.register(POTION_JING_XIN);
        registry.register(POTION_NI_QING);
        registry.register(POTION_ZHEN_YAN);
    }

}
