package com.lv.code.day0816.工厂模式.version02;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 上午 11:41
 * @since jdk1.0
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        if (type.equals("NewYork")){
            return new NYStyleCheesePizza();
        }else if (type.equals("Chicago")){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }

}
