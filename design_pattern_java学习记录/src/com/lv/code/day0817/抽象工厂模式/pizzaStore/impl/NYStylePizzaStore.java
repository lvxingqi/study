package com.lv.code.day0817.抽象工厂模式.pizzaStore.impl;

import com.lv.code.day0817.抽象工厂模式.material_factory.PizzaIngredientFactory;
import com.lv.code.day0817.抽象工厂模式.material_factory.impl.NYPizzaIngredientFactory;
import com.lv.code.day0817.抽象工厂模式.pizza.Pizza;
import com.lv.code.day0817.抽象工厂模式.pizza.impl.CheesePizza;
import com.lv.code.day0817.抽象工厂模式.pizza.impl.ClamPizza;
import com.lv.code.day0817.抽象工厂模式.pizza.impl.PepperoniPizza;
import com.lv.code.day0817.抽象工厂模式.pizza.impl.VeggiePizza;
import com.lv.code.day0817.抽象工厂模式.pizzaStore.PizzaStore;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 下午 02:04
 * @since jdk1.0
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
        if (type.equals("cheese")){//奶酪
            pizza= new CheesePizza(ingredientFactory);
            pizza.setName("纽约风味奶酪披萨");
        }else if (type.equals("pepperoni")){//香肠
            pizza=new PepperoniPizza(ingredientFactory);
            pizza.setName("纽约风味香肠披萨");
        }else if (type.equals("clam")){//蛤
            pizza= new ClamPizza(ingredientFactory);
            pizza.setName("纽约风味蛤蜊披萨");
        }else if (type.equals("veggie")){
            pizza= new VeggiePizza(ingredientFactory);
            pizza.setName("纽约风味素食披萨");
        }
        return pizza;
    }
}
