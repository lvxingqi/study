package com.lv.code.day0817.抽象工厂模式.material_factory.impl;

import com.lv.code.day0817.抽象工厂模式.material.cheese.Cheese;
import com.lv.code.day0817.抽象工厂模式.material.cheese.impl.ReggianoCheese;
import com.lv.code.day0817.抽象工厂模式.material.clams.Clams;
import com.lv.code.day0817.抽象工厂模式.material.clams.impl.FreshClams;
import com.lv.code.day0817.抽象工厂模式.material.dough.Dough;
import com.lv.code.day0817.抽象工厂模式.material.dough.impl.ThinCrustDough;
import com.lv.code.day0817.抽象工厂模式.material.pepperoni.Pepperoni;
import com.lv.code.day0817.抽象工厂模式.material.pepperoni.impl.SlicedPepperoni;
import com.lv.code.day0817.抽象工厂模式.material.sauce.Sauce;
import com.lv.code.day0817.抽象工厂模式.material.sauce.impl.MarinaraSauce;
import com.lv.code.day0817.抽象工厂模式.material.veggies.Veggies;
import com.lv.code.day0817.抽象工厂模式.material.veggies.impl.Garlic;
import com.lv.code.day0817.抽象工厂模式.material.veggies.impl.Mushroom;
import com.lv.code.day0817.抽象工厂模式.material.veggies.impl.Onion;
import com.lv.code.day0817.抽象工厂模式.material.veggies.impl.RedPepper;
import com.lv.code.day0817.抽象工厂模式.material_factory.PizzaIngredientFactory;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/17 上午 11:52
 * @since jdk1.0
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
