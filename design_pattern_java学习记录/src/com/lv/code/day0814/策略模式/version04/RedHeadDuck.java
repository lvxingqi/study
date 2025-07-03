package com.lv.code.day0814.策略模式.version04;

import com.lv.code.day0814.策略模式.version04.fly.impl.FlyWithWings;
import com.lv.code.day0814.策略模式.version04.quack.impl.Quack;

/**
 * @version design_pattern.1.0
 * @Description: 红头鸭
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 09:11
 */
public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        flyBehavior=new FlyWithWings();
        quackBehavior=new Quack();
    }
    @Override
    public void display() {
        System.out.println("i am redhead duck");
    }
}
