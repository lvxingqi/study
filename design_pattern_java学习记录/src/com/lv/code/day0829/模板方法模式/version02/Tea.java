package com.lv.code.day0829.模板方法模式.version02;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 上午 09:20
 * @Description
 */
public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("用沸水冲泡茶");
    }

    @Override
    void addCondiments() {
        System.out.println("添加柠檬");
    }
}
