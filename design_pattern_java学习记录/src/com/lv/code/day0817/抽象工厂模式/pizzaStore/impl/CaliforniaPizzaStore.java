package com.lv.code.day0817.抽象工厂模式.pizzaStore.impl;

import com.lv.code.day0817.抽象工厂模式.material_factory.PizzaIngredientFactory;
import com.lv.code.day0817.抽象工厂模式.material_factory.impl.CaliforniaIngredientFactory;
import com.lv.code.day0817.抽象工厂模式.pizza.Pizza;
import com.lv.code.day0817.抽象工厂模式.pizza.impl.CheesePizza;
import com.lv.code.day0817.抽象工厂模式.pizza.impl.ClamPizza;
import com.lv.code.day0817.抽象工厂模式.pizza.impl.PepperoniPizza;
import com.lv.code.day0817.抽象工厂模式.pizza.impl.VeggiePizza;
import com.lv.code.day0817.抽象工厂模式.pizzaStore.PizzaStore;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 下午 03:34
 * @since jdk1.0
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory=new CaliforniaIngredientFactory();
        if (type.equals("cheese")){//奶酪
            return new CheesePizza(ingredientFactory);
        }else if (type.equals("pepperoni")){//香肠
            return new PepperoniPizza(ingredientFactory);
        }else if (type.equals("clam")){//蛤
            return new ClamPizza(ingredientFactory);
        }else if (type.equals("veggie")){
            return new VeggiePizza(ingredientFactory);
        }
        return null;
    }
}
