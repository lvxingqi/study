package com.lv.code.day0816.工厂模式.version01;


/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 上午 09:50
 * @since jdk1.0
 */
public class PizzaStore {

    Pizza pizza;
    public Pizza orderPizza(String type){
        if (type.equals("NewYork")){
            pizza=new NYStyleCheesePizza();
        }else if (type.equals("Chicago")){
            pizza=new ChicagoStyleCheesePizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
