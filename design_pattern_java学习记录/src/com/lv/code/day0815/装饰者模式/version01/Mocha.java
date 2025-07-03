package com.lv.code.day0815.装饰者模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/15 下午 04:28
 * @since jdk1.0
 */
//摩卡
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",摩卡";
    }
}
