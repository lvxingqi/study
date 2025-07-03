package com.lv.code.day0829.模板方法模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 上午 09:11
 * @Description
 */
public class Coffee {
    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void boilWater() {
        System.out.println("煮开水...");
    }
    private void brewCoffeeGrinds() {
        System.out.println("用沸水冲泡咖啡");
    }
    private void pourInCup() {
        System.out.println("把咖啡倒进杯子");
    }
    private void addSugarAndMilk() {
        System.out.println("加糖和牛奶");
    }
}
