package com.lv.code.day0815.装饰者模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/15 下午 03:26
 * @since jdk1.0
 */
//浓咖啡
public class Espresso extends Beverage{
    public Espresso(){
        description="浓咖啡";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
