package com.lv.code.day0817.抽象工厂模式.pizza.impl;

import com.lv.code.day0817.抽象工厂模式.material_factory.PizzaIngredientFactory;
import com.lv.code.day0817.抽象工厂模式.pizza.Pizza;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/17 下午 03:31
 * @since jdk1.0
 */
public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public VeggiePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;
    }
    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        sauce= ingredientFactory.createSauce();
        veggies=ingredientFactory.createVeggies();
    }
}
