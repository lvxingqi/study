package com.lv.code.day0814.策略模式.version03;

/**
 * @version design_pattern.1.0
 * @Description: 橡皮鸭
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 09:23
 */
public class RubberDuck extends Duck implements Quackable {

    /**
     *
     */
    @Override
    public void quack() {
        System.out.println("squeak");
    }

    @Override
    public void display() {
        System.out.println("i am a rubber duck!");
    }
}
