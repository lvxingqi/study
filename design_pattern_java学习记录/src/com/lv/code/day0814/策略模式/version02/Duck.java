package com.lv.code.day0814.策略模式.version02;

/**
 * @version design_pattern.1.0
 * @Description: 鸭子超类
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 09:03
 */
public abstract class Duck {
    public void quack(){
        System.out.println("quack...quack...");
    }
    public void swim(){
        System.out.println("i can swim!");
    }
    /**
     * @Description 每一种鸭子的外观都不同，所以display()是抽象的
     * @Param  no
     */
    public abstract void display();

    /**
     * 缺点：直接把飞的行为写死在超类里面，会出现会飞的橡皮鸭
     * */
    public void fly(){
        System.out.println("i can fly!");
    }
}
