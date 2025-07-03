package com.lv.code.day0815.装饰者模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/15 下午 03:48
 * @since jdk1.0
 */
//调料的抽象类，调料和饮料继承自同一个超类，只是为了类型匹配，而不是为了继承属性和方法
public abstract class CondimentDecorator extends Beverage{

    @Override
    public abstract String getDescription();
}
