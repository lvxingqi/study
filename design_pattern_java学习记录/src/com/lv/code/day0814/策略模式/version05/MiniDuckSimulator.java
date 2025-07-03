package com.lv.code.day0814.策略模式.version05;
import com.lv.code.day0814.策略模式.version05.fly.impl.FlyRocketPowered;
import org.junit.Test;

/**
 * @version design_pattern.1.0
 * @Description: 迷你鸭子模拟器（测试类）
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 11:30
 */
public class MiniDuckSimulator {
    @Test
    public void test(){
        Duck mallard=new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model1=new ModelDuck();
        model1.performFly();
        model1.setFlyBehavior(new FlyRocketPowered());
        model1.performFly();
    }
}
