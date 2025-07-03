package com.lv.code.day0816.工厂模式.version03.chica_style;

import com.lv.code.day0816.工厂模式.version03.Pizza;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 上午 11:27
 * @since jdk1.0
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name="Chicago Style Deep Dish Cheese Pizza";//芝加哥风味深盘奶酪披萨
        dough="Extra Thick Crust Dough";//超厚面团
        sauce="Plum Tomato Sauce"; //梅子番茄酱
        toppings.add("Shredded Mozzarella Cheese"); //马苏里拉奶酪丝
    }

    @Override
    protected void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
