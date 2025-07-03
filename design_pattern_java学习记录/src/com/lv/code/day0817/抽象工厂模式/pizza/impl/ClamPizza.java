package com.lv.code.day0817.抽象工厂模式.pizza.impl;

import com.lv.code.day0817.抽象工厂模式.pizza.Pizza;
import com.lv.code.day0817.抽象工厂模式.material_factory.PizzaIngredientFactory;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/17 下午 03:16
 * @since jdk1.0
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;
    }
    @Override
    public void prepare() {
        setName("");
        System.out.println("Preparing..."+name);
        dough=ingredientFactory.createDough();
        sauce=ingredientFactory.createSauce();
        pepperoni=ingredientFactory.createPepperoni();
    }
}
