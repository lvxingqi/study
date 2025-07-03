package com.lv.code.day0829.模板方法模式.version03;

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
        //钩子的作用就体现在这里
        if (customerWantsCondiments()){
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    private void boilWater() {
        System.out.println("煮开水...");
    }
    private void poorInCup() {
        System.out.println("倒进杯子里");
    }

    //添加钩子，钩子hook通常是空的缺省实现返回true，由子类决定要不要覆盖
    boolean customerWantsCondiments(){
        return true;
    }
}
