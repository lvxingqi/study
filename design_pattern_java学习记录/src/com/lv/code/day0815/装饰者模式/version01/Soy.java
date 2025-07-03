package com.lv.code.day0815.装饰者模式.version01;


/**
 * @author 吕星琪
 * @version 1.10 2023/8/15 下午 04:31
 * @since jdk1.0
 */
//豆浆
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",豆浆";
    }
}
