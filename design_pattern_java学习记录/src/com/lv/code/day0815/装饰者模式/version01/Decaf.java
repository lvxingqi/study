package com.lv.code.day0815.装饰者模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/15 下午 03:25
 * @since jdk1.0
 */
//无咖啡因饮料
public class Decaf extends Beverage{
    public Decaf() {
        description="无咖啡因饮料";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
