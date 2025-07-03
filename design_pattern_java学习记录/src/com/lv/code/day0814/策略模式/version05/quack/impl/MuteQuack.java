package com.lv.code.day0814.策略模式.version05.quack.impl;

import com.lv.code.day0814.策略模式.version05.quack.QuackBehavior;

/**
 * @version design_pattern.1.0
 * @Description: 什么都不做，不会叫
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 10:31
 */
public class MuteQuack implements QuackBehavior {
    /**
     *
     */
    @Override
    public void quack() {

    }
}
