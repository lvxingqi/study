package com.lv.code.day0814.策略模式.version05;

import com.lv.code.day0814.策略模式.version05.fly.impl.FlyNoWay;
import com.lv.code.day0814.策略模式.version05.quack.impl.MuteQuack;

/**
 * @version design_pattern.1.0
 * @Description: 模型鸭
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 11:26
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new MuteQuack();
    }
    /**
     *
     */
    @Override
    public void display() {
        System.out.println("i am a model duck");
    }
}
