package com.lv.code.day0817.抽象工厂模式.pizza.impl;

import com.lv.code.day0817.抽象工厂模式.pizza.Pizza;
import com.lv.code.day0817.抽象工厂模式.material_factory.PizzaIngredientFactory;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/17 下午 03:09
 * @since jdk1.0
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;
    }

    @Override
    public void prepare() {
        dough=ingredientFactory.createDough();
        sauce=ingredientFactory.createSauce();
        veggies=ingredientFactory.createVeggies();
        clams=ingredientFactory.createClams();
        pepperoni=ingredientFactory.createPepperoni();
        System.out.println("原料装配完成");
    }
}
