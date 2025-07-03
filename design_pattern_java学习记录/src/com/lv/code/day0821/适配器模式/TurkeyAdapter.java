package com.lv.code.day0821.适配器模式;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/21 上午 11:40
 * @since jdk1.0
 */
//火鸡冒充鸭子 火鸡适配器，实现鸭子接口，就是将火鸡适配成鸭子
public class TurkeyAdapter implements Duck{
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {
        this.turkey=turkey;
    }

    @Override
    public void fly() {
        for (int i=0;i<5;i++){
            turkey.fly();
        }
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
