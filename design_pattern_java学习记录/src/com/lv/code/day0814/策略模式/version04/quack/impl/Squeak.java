package com.lv.code.day0814.策略模式.version04.quack.impl;

import com.lv.code.day0814.策略模式.version04.quack.QuackBehavior;

/**
 * @version design_pattern.1.0
 * @Description: 橡皮鸭的吱吱叫
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 10:30
 */
public class Squeak implements QuackBehavior {
    /**
     *
     */
    @Override
    public void quack() {
        System.out.println("squeak...squeak...");
    }
}
