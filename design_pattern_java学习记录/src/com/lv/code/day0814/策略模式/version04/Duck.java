package com.lv.code.day0814.策略模式.version04;

import com.lv.code.day0814.策略模式.version04.fly.FlyBehavior;
import com.lv.code.day0814.策略模式.version04.quack.QuackBehavior;

/**
 * @version design_pattern.1.0
 * @Description: 鸭子超类
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 09:03
 */
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public void swim(){
        System.out.println("i can swim!");
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    /**
     * @Description 每一种鸭子的外观都不同，所以display()是抽象的
     * @Param  no
     */
    public abstract void display();
}
