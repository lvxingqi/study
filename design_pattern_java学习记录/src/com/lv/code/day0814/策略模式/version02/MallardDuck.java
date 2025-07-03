package com.lv.code.day0814.策略模式.version02;

/**
 * @version design_pattern.1.0
 * @Description: 绿头鸭
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 09:09
 */
public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("i am a mallard duck!");
    }

    /**
     *
     */
    @Override
    public void quack() {
        System.out.println("Mallard Duck quack...quack...");
    }
}
