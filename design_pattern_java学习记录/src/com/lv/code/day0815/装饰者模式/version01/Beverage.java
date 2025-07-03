package com.lv.code.day0815.装饰者模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/15 下午 03:19
 * @since jdk1.0
 */
//Beverage饮料
public abstract class Beverage {
    String description="未知饮料";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
