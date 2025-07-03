package com.lv.code.day0814.策略模式.version04;

import com.lv.code.day0814.策略模式.version04.fly.impl.FlyNoWay;
import com.lv.code.day0814.策略模式.version04.quack.impl.Squeak;

/**
 * @version design_pattern.1.0
 * @Description: 橡皮鸭
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 09:23
 */
public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Squeak();
    }
    @Override
    public void display() {
        System.out.println("i am a rubber duck!");
    }
}
