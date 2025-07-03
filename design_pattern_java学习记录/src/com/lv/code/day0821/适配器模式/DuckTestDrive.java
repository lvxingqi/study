package com.lv.code.day0821.适配器模式;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/21 下午 04:19
 * @since jdk1.0
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck=new MallardDuck();

        WildTurkey turkey=new WildTurkey();
        Duck turkeyAdapter=new TurkeyAdapter(turkey);
        System.out.println("The turkey says...");
        turkey.fly();
        turkey.gobble();

        System.out.println("The duck says...");
        testDuck(duck);

        System.out.println("The turkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
