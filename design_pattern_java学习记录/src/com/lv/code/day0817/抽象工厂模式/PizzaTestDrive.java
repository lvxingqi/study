package com.lv.code.day0817.抽象工厂模式;

import com.lv.code.day0817.抽象工厂模式.material_factory.PizzaIngredientFactory;
import com.lv.code.day0817.抽象工厂模式.pizza.Pizza;
import com.lv.code.day0817.抽象工厂模式.pizzaStore.PizzaStore;
import com.lv.code.day0817.抽象工厂模式.pizzaStore.impl.NYStylePizzaStore;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 下午 03:08
 * @since jdk1.0
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore=new NYStylePizzaStore();
        pizzaStore.orderPizza("cheese");

    }
}
