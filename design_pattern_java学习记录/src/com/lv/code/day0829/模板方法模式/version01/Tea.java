package com.lv.code.day0829.模板方法模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 上午 09:20
 * @Description
 */
public class Tea {
    //准备步骤
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        poorInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("煮开水...");
    }

    private void steepTeaBag() {
        System.out.println("用沸水泡茶");
    }

    private void poorInCup() {
        System.out.println("把茶倒进杯子里");
    }

    private void addLemon() {
        System.out.println("加柠檬");
    }
}
