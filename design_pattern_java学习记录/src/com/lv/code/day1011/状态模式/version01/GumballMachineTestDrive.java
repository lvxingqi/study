package com.lv.code.day1011.状态模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/10/11 下午 06:40
 * @description
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumBallMachine gumBallMachine=new GumBallMachine(5);

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.ejectQuarter();
        gumBallMachine.turnCrank();

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        gumBallMachine.ejectQuarter();

        System.out.println(gumBallMachine);

        gumBallMachine.insertQuarter();
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        System.out.println(gumBallMachine);
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();
        System.out.println(gumBallMachine);
        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        System.out.println(gumBallMachine);


    }
}
