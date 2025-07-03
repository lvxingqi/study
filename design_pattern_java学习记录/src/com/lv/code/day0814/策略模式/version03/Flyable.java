package com.lv.code.day0814.策略模式.version03;

/**
 * @author 20141
 */
public interface Flyable {
    /**
     * @Description 飞的行为，虽然使用接口提取了飞的行为，但是，会很麻烦，会飞的鸭子都得
     * 实现这个接口，当鸭子很多的时候，重复代码太多了
     * @Param
     */
    void fly();
}
