package com.lv.code.day0815.装饰者模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/15 下午 03:24
 * @since jdk1.0
 */
//深度烘培
public class DarkRoast extends Beverage{
    public DarkRoast(){
        description="烘培咖啡";
    }
    @Override
    public double cost() {
        return .95;
    }
}
