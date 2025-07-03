package com.lv.code.day0814.策略模式.version05;

import com.lv.code.day0814.策略模式.version05.fly.FlyBehavior;
import com.lv.code.day0814.策略模式.version05.quack.QuackBehavior;

/**
 * @version design_pattern.1.0
 * @Description: 鸭子超类
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 09:03
 * 第5个版本，将行为的设定从构造方法里面提取出来，使用set方法设定
 */
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior=fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior=qb;
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
    public void swim(){
        System.out.println("i can swim!");
    }
}
