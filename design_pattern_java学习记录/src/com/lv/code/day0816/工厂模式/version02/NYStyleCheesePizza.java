package com.lv.code.day0816.工厂模式.version02;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 上午 11:20
 * @since jdk1.0
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name="NY Style Sauce and cheese Pizza";
        dough="Thin Crust Dough"; //薄皮面团
        sauce="Marinara Sauce"; //马力拉酱
        toppings.add("Grated Reggiano Cheese Pizza");//磨碎的雷击亚诺奶酪
    }
}
