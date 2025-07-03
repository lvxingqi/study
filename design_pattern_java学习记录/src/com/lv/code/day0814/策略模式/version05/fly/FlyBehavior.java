package com.lv.code.day0814.策略模式.version05.fly;

/**
 * @author 20141
 */
public interface FlyBehavior {
    /**飞行，将会改变的部分全部提取出来，行为的实现交给具体的实现类，而不是交给鸭子类
     * 比如怎么飞由具体的飞行类实现*/
    void fly();
}
