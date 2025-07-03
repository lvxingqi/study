package com.lv.code.day0817.抽象工厂模式.material_factory;

import com.lv.code.day0817.抽象工厂模式.material.cheese.Cheese;
import com.lv.code.day0817.抽象工厂模式.material.clams.Clams;
import com.lv.code.day0817.抽象工厂模式.material.dough.Dough;
import com.lv.code.day0817.抽象工厂模式.material.pepperoni.Pepperoni;
import com.lv.code.day0817.抽象工厂模式.material.sauce.Sauce;
import com.lv.code.day0817.抽象工厂模式.material.veggies.Veggies;

public interface PizzaIngredientFactory {
    //面团、酱料、奶酪、蔬菜、香肠、蛤蜊
    //这些原料有细微差别，使用接口
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
