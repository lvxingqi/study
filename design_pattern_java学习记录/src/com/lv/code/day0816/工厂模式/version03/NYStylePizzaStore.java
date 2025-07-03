package com.lv.code.day0816.工厂模式.version03;

import com.lv.code.day0816.工厂模式.version03.Pizza;
import com.lv.code.day0816.工厂模式.version03.PizzaStore;
import com.lv.code.day0816.工厂模式.version03.ny_style.NYStyleCheesePizza;
import com.lv.code.day0816.工厂模式.version03.ny_style.NYStyleClamPizza;
import com.lv.code.day0816.工厂模式.version03.ny_style.NYStylePepperoniPizza;
import com.lv.code.day0816.工厂模式.version03.ny_style.NYStyleVeggiePizza;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 下午 02:04
 * @since jdk1.0
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){//奶酪
            return new NYStyleCheesePizza();
        }else if (type.equals("pepperoni")){//香肠
            return new NYStylePepperoniPizza();
        }else if (type.equals("clam")){//蛤
            return new NYStyleClamPizza();
        }else if (type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
