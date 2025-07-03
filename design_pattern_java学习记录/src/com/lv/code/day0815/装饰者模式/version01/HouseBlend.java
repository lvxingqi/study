package com.lv.code.day0815.装饰者模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/15 下午 03:23
 * @since jdk1.0
 */
//混合饮料
public class HouseBlend extends Beverage{
    public HouseBlend(){
        description="混合咖啡";
    }
    @Override
    public double cost() {
        return .89;
    }
}
