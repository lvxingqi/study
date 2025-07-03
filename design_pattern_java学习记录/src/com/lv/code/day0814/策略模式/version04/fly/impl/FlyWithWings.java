package com.lv.code.day0814.策略模式.version04.fly.impl;

import com.lv.code.day0814.策略模式.version04.fly.FlyBehavior;

/**
 * @version design_pattern.1.0
 * @Description: 用翅膀飞
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 10:02
 */
public class FlyWithWings implements FlyBehavior {
    /**
     *
     */
    @Override
    public void fly() {
        System.out.println("fly with swings!");
    }
}
