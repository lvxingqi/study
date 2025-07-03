package com.lv.code.day0816.工厂模式.version03;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 上午 09:50
 * @since jdk1.0
 */
public abstract class PizzaStore {
    Pizza pizza;
    public final Pizza orderPizza(String type){
        //注意这里把类变成抽象类，创建Pizza的方法也是抽象的，交给每个子类决定实现
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //此方法被成为工厂方法
    public abstract Pizza createPizza(String type);
}
