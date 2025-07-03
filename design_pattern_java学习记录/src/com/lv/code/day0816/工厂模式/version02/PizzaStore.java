package com.lv.code.day0816.工厂模式.version02;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 上午 09:50
 * @since jdk1.0
 */
public class PizzaStore {

    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory){
        this.factory=factory;
    }
    Pizza pizza;
    public Pizza orderPizza(String type){
        //注意这里的简单工厂只是一种编程习惯，并不是工厂模式
        pizza=factory.createPizza(type);//会变化的部分已经封装到简单工厂去了
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
