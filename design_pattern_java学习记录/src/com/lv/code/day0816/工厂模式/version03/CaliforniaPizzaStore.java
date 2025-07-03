package com.lv.code.day0816.工厂模式.version03;

import com.lv.code.day0816.工厂模式.version03.california_style.CaliforniaStyleCheesePizza;
import com.lv.code.day0816.工厂模式.version03.california_style.CaliforniaStyleClamPizza;
import com.lv.code.day0816.工厂模式.version03.california_style.CaliforniaStylePepperoniPizza;
import com.lv.code.day0816.工厂模式.version03.california_style.CaliforniaStyleVeggiePizza;
import com.lv.code.day0816.工厂模式.version03.chica_style.ChicagoStyleCheesePizza;
import com.lv.code.day0816.工厂模式.version03.chica_style.ChicagoStyleClamPizza;
import com.lv.code.day0816.工厂模式.version03.chica_style.ChicagoStylePepperoniPizza;
import com.lv.code.day0816.工厂模式.version03.chica_style.ChicagoStyleVeggiePizza;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 下午 03:34
 * @since jdk1.0
 */
public class CaliforniaPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){//奶酪
            return new CaliforniaStyleCheesePizza();
        }else if (type.equals("pepperoni")){//香肠
            return new CaliforniaStylePepperoniPizza();
        }else if (type.equals("clam")){//蛤
            return new CaliforniaStyleClamPizza();
        }else if (type.equals("veggie")){//素食
            return new CaliforniaStyleVeggiePizza();
        }
        return null;
    }
}
