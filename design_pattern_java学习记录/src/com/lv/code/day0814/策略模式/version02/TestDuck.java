package com.lv.code.day0814.策略模式.version02;

import org.junit.Test;

/**
 * @version design_pattern.1.0
 * @Description: 测试类
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 10:15
 */
public class TestDuck {
    @Test
    public void test(){
        Duck mallardDuck=new MallardDuck();
        mallardDuck.fly();

        Duck rubberDuck=new RubberDuck();
        //橡皮鸭会飞了，大问题
        rubberDuck.fly();
    }
}
