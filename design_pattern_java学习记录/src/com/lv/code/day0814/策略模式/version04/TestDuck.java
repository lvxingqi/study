package com.lv.code.day0814.策略模式.version04;

import org.junit.Test;

/**
 * @version design_pattern.1.0
 * @Description: 测试类
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 10:57
 */
public class TestDuck {
    @Test
    public void test(){
        Duck duck=new MallardDuck();
        duck.performFly();
        duck.performQuack();
        Duck duck1=new DecoyDuck();
        duck1.performFly();
        duck1.performQuack();
    }
}
