package com.lv.code.day0829.模板方法模式.version03;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 上午 09:11
 * @Description
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    void addCondiments() {
        System.out.println("加糖和牛奶");
    }
}
