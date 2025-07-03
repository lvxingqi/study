package com.lv.code.day0815.装饰者模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/15 下午 03:50
 * @since jdk1.0
 */
//牛奶
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",牛奶";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.7;
    }
}
