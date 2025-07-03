package com.lv.code.day0816.工厂模式.version03;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 下午 03:08
 * @since jdk1.0
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore=new NYStylePizzaStore();
        PizzaStore chicoStore=new ChicagoPizzaStore();
        PizzaStore californiaStore=new CaliforniaPizzaStore();
        Pizza pizza=pizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        System.out.println();
        pizza=chicoStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        System.out.println();
        pizza=californiaStore.orderPizza("cheese");

        System.out.println(pizza.getName());


    }
}
