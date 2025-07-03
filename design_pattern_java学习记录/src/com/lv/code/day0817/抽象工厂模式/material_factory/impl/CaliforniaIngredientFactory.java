package com.lv.code.day0817.抽象工厂模式.material_factory.impl;

import com.lv.code.day0817.抽象工厂模式.material.cheese.Cheese;
import com.lv.code.day0817.抽象工厂模式.material.clams.Clams;
import com.lv.code.day0817.抽象工厂模式.material.dough.Dough;
import com.lv.code.day0817.抽象工厂模式.material.pepperoni.Pepperoni;
import com.lv.code.day0817.抽象工厂模式.material.sauce.Sauce;
import com.lv.code.day0817.抽象工厂模式.material.veggies.Veggies;
import com.lv.code.day0817.抽象工厂模式.material_factory.PizzaIngredientFactory;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/17 下午 04:14
 * @since jdk1.0
 */
public class CaliforniaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClams() {
        return null;
    }
}
