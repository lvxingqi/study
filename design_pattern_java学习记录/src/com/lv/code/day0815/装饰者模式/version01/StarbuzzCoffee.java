package com.lv.code.day0815.装饰者模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/15 下午 04:38
 * @since jdk1.0
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage houseBlend=new Espresso();
        System.out.println(houseBlend.getDescription()+houseBlend.cost());

        Beverage beverage2=new DarkRoast();
        beverage2=new Mocha(beverage2);
        beverage2=new Mocha(beverage2);
        beverage2=new Whip(beverage2);
        System.out.println(beverage2.getDescription()+","+beverage2.cost());
    }
}
