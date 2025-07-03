package com.lv.code.day0814.策略模式.version05;

import com.lv.code.day0814.策略模式.version05.fly.impl.FlyWithWings;
import com.lv.code.day0814.策略模式.version05.quack.impl.Quack;

/**
 * @version design_pattern.1.0
 * @Description: 绿头鸭
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 09:09
 */
public class MallardDuck extends Duck {
    /**在具体鸭子类的构造方法里面决定鸭子的行为*/
    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("i am a mallard duck!");
    }

}
