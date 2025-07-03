package com.lv.code.day0815.装饰者模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/15 下午 04:34
 * @since jdk1.0
 */
//奶泡
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+1.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",奶泡";
    }
}
