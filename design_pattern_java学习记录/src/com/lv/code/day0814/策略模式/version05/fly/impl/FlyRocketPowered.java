package com.lv.code.day0814.策略模式.version05.fly.impl;

import com.lv.code.day0814.策略模式.version05.fly.FlyBehavior;

/**
 * @version design_pattern.1.0
 * @Description: 火箭动力的飞行
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 11:28
 */
public class FlyRocketPowered implements FlyBehavior {
    /**
     *
     */
    @Override
    public void fly() {
        System.out.println("i am flying with a rocket!");
    }
}
