package com.shengchanshe.shentong.key;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class KeyLoader {
//    public static final List<KeyBinding> KEY_BINDINGS = new ArrayList<KeyBinding>();
    /*
     * 参数依次是 String description, IKeyConflictContext context, KeyModifier modifier, int key, String category。
     * - description 是快捷键名称的本地化键。
     * - context 是 Forge patch 进去的，用于决定快捷键在什么情况下和别的快捷键冲突。
     *   Forge 提供了三个实现，即 KeyConflictContext 这个 enum 下的三个值：UNIVERSAL、
     *   IN_GAME 和 GUI，分别代表“全局适用”，“只在实际游戏中，但没有打开 GUI 时适用”和“只在打
     *   开 GUI 时适用”。如此一来，如果有两个快捷键设定的按键是一样的，但其中一个 context 是 GUI，
     *   另一个是 IN_GAME，那么这两个快捷键就不会被看作是互相冲突的。
     * - modifier 用于提供非常基础的组合键支持，只有四种可能：CTRL、ALT、SHIFT 和 NONE。
     *   NONE 代表原版风格的没有组合键，其他三种都代表组合键支持。不支持三种及以上的组合键。
     *   对于 CTRL，Forge 能正确将其处理为 macOS 上的 Command 键。CTRL、ALT 和 SHIFT 都不
     *   对左右作区分。
     *   举例：这里我们指定了 MY_HOTKEY 的默认键位是 CTRL+K，在 macOS 上则是 CMD+K。
     * - key 参考 Keyboard 类下的常量字段们。
     * - category 原版按键设定中把按键们分成了若干类别，就是这个了。
     *   传入的字符串也充当该类别的本地化键。
     */
    public static KeyBinding shentonggui;

    public static KeyBinding shentongone;

    public static KeyBinding shentongtwo;

    public static KeyBinding shentongthree;

    public KeyLoader()
    {
        KeyLoader.shentonggui = new KeyBinding("key.fanxiushentong.gui", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_R, "凡人修仙1");
        KeyLoader.shentongone = new KeyBinding("key.fanxiushentong.shentongone", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_U, "凡人修仙1");
        KeyLoader.shentongtwo = new KeyBinding("key.fanxiushentong.shentongtwo", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_I, "凡人修仙1");
        KeyLoader.shentongthree = new KeyBinding("key.fanxiushentong.shentongthree", KeyConflictContext.IN_GAME, KeyModifier.NONE, Keyboard.KEY_O, "凡人修仙1");
        ClientRegistry.registerKeyBinding(shentonggui);
        ClientRegistry.registerKeyBinding(shentongone);
        ClientRegistry.registerKeyBinding(shentongtwo);
        ClientRegistry.registerKeyBinding(shentongthree);
    }
}
