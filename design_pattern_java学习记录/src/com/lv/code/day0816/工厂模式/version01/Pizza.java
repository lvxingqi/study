package com.lv.code.day0816.工厂模式.version01;

import java.util.ArrayList;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 上午 10:41
 * @since jdk1.0
 */
public abstract class Pizza {
    String name; //披萨名字
    String dough; //面团
    String sauce; //酱

    ArrayList<String > toppings=new ArrayList<>(); //存储加的不同的奶酪
    void prepare(){
        System.out.println("Preparing..."+name);
        System.out.println("Tossing dough..."+dough);
        System.out.println("Adding sauce..."+sauce);
        for (String topping : toppings) {
            System.out.println("    " + topping);
        }
    }
    //烤
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
