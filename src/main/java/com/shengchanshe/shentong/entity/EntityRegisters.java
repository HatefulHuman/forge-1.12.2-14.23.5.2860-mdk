package com.shengchanshe.shentong.entity;

import com.shengchanshe.shentong.ShenTongMod;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class EntityRegisters {
    private static int nextID = 0;

    public static final EntityEntry JIANQIENTITY =
            EntityEntryBuilder.create().entity(JianQiEntity.class)
                    .id(ShenTongMod.MODID + ":jian_qi", nextID++).name("JianQi").tracker(64, 10, true).build();

    public static final EntityEntry HUODAN =
            EntityEntryBuilder.create().entity(HuoDanEntity.class)
                    .id(ShenTongMod.MODID + ":huo_dan", nextID++).name("HuoDan").tracker(64, 10, true).build();
    //六极真魔功
    public static final EntityEntry YIZHUANZHENMO =
            EntityEntryBuilder.create().entity(YiZhuanZhenMoEntity.class)
                    .id(ShenTongMod.MODID + ":yi_zhuan_zhen_mo", nextID++).name("YiZhuanZhenMo").tracker(64, 10, false).build();
    public static final EntityEntry SANZHUANZHENMO =
            EntityEntryBuilder.create().entity(SanZhuanZhenMoEntity.class)
                    .id(ShenTongMod.MODID + ":san_zhuan_zhen_mo", nextID++).name("SanZhuanZhenMo").tracker(64, 10, false).build();
    public static final EntityEntry LIUZHUANZHENMO =
            EntityEntryBuilder.create().entity(LiuZhuanZhenMoEntity.class)
                    .id(ShenTongMod.MODID + ":liu_zhuan_zhen_mo", nextID++).name("LiuZhuanZhenMo").tracker(64, 10, false).build();
    //浩然正气决
    public static final EntityEntry WEI_RAN_ZHENG_QI =
            EntityEntryBuilder.create().entity(WeRanZhengQiEntity.class)
                    .id(ShenTongMod.MODID + ":wei_ran_zheng_qi", nextID++).name("WeiRanZhengQi").tracker(64, 10, false).build();
    public static final EntityEntry XUAN_GANG_ZHEN_QI =
            EntityEntryBuilder.create().entity(XuanGangZhenQiEntity.class)
                    .id(ShenTongMod.MODID + ":xuan_gang_zhen_qi", nextID++).name("XuanGangZhenQi").tracker(64, 10, false).build();
    public static final EntityEntry CANG_SANG_ZHENG_DAO =
            EntityEntryBuilder.create().entity(CangSangZhengDaoEntity.class)
                    .id(ShenTongMod.MODID + ":cang_sang_zheng_dao", nextID++).name("CangSangZhengDao").tracker(64, 10, false).build();
    //上古魔攻
    public static final EntityEntry GUI_MO_DUN =
            EntityEntryBuilder.create().entity(GuiMoDunEntity.class)
                    .id(ShenTongMod.MODID + ":gui_mo_dun", nextID++).name("GuiMoDun").tracker(64, 10, false).build();
    public static final EntityEntry MO_GONG =
            EntityEntryBuilder.create().entity(MoGongEntity.class)
                    .id(ShenTongMod.MODID + ":mo_gong", nextID++).name("MoGong").tracker(64, 10, false).build();
    public static final EntityEntry SHANG_GU_ZHEN_MO =
            EntityEntryBuilder.create().entity(ShangGuZhenMoEntity.class)
                    .id(ShenTongMod.MODID + ":shang_gu_zhen_mo", nextID++).name("ShangGuZhenMo").tracker(64, 10, false).build();


    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<EntityEntry> event) {
        IForgeRegistry<EntityEntry> registry = event.getRegistry();
        registry.register(JIANQIENTITY);
        registry.register(HUODAN);

        registry.register(YIZHUANZHENMO);
        registry.register(SANZHUANZHENMO);
        registry.register(LIUZHUANZHENMO);

        registry.register(WEI_RAN_ZHENG_QI);
        registry.register(XUAN_GANG_ZHEN_QI);
        registry.register(CANG_SANG_ZHENG_DAO);

        registry.register(GUI_MO_DUN);
        registry.register(MO_GONG);
        registry.register(SHANG_GU_ZHEN_MO);
    }

//    @SubscribeEvent
//    public static void onEntityRegistation(RegistryEvent.Register<EntityEntry> event) {
//        event.getRegistry().register(EntityEntryBuilder.create()
//                .entity(YiZhuanZhengMoEntity.class)
//                .id(new ResourceLocation(ShenTongMod.MODID, "yi_zhuan_zhen_mo"), nextID++)
//                .name("YiZhuanZhenMo")
//                .tracker(80, 3, false)
//                .build()
//        );
//        event.getRegistry().register(EntityEntryBuilder.create()
//                .entity(YiZhuanZhengMoEntity.class)
//                .id(new ResourceLocation(ShenTongMod.MODID, "san_zhuan_zhen_mo"), nextID++)
//                .name("SanZhuanZhenMo")
//                .tracker(80, 3, false)
//                .build()
//        );
//        event.getRegistry().register(EntityEntryBuilder.create()
//                .entity(YiZhuanZhengMoEntity.class)
//                .id(new ResourceLocation(ShenTongMod.MODID, "liu_zhuan_zhen_mo"), nextID++)
//                .name("LiuZhuanZhenMo")
//                .tracker(80, 3, false)
//                .build()
//        );
//    }
}
