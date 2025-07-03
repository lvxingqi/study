package com.lv.code.day0829.模板方法模式.version02;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 上午 10:21
 * @Description
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        poorInCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();
    private void boilWater() {
        System.out.println("煮开水...");
    }
    private void poorInCup() {
        System.out.println("倒进杯子里");
    }
}
