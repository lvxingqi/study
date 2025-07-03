package com.lv.code.day0821.适配器模式;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/21 上午 11:33
 * @since jdk1.0
 */
public class MallardDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("i am flying");
    }

    @Override
    public void quack() {
        System.out.println("Quack!!!");
    }
}
