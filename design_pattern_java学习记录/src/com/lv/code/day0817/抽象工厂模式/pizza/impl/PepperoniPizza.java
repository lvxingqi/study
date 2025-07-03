package com.lv.code.day0817.抽象工厂模式.pizza.impl;

import com.lv.code.day0817.抽象工厂模式.pizza.Pizza;
import com.lv.code.day0817.抽象工厂模式.material_factory.PizzaIngredientFactory;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/17 下午 03:25
 * @since jdk1.0
 */
public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public PepperoniPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;
    }
    @Override
    public void prepare() {
        sauce=ingredientFactory.createSauce();
        dough=ingredientFactory.createDough();
    }
}
