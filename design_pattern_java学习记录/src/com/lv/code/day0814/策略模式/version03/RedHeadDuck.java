package com.lv.code.day0814.策略模式.version03;

/**
 * @version design_pattern.1.0
 * @Description: 红头鸭
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 09:11
 */
public class RedHeadDuck extends Duck implements Quackable, Flyable {
    @Override
    public void display() {
        System.out.println("i am redhead duck");
    }

    /**
     *
     */
    @Override
    public void quack() {
        System.out.println("RedHead Duck quack...quack...");
    }

    /**
     *
     */
    @Override
    public void fly() {
        System.out.println("i can fly!");
    }
}
