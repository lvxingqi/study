package com.lv.code.day0814.策略模式.version03;

/**
 * @version design_pattern.1.0
 * @Description: 鸭子超类
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 09:03
 */
public abstract class Duck {
    public void swim(){
        System.out.println("i can swim!");
    }

    /**
     * @Description 每一种鸭子的外观都不同，所以display()是抽象的
     * @Param  no
     */
    public abstract void display();
}
