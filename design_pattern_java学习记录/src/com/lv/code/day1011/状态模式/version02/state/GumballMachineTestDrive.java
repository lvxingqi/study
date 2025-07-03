package com.lv.code.day1011.状态模式.version02.state;


import com.lv.code.day1011.状态模式.version02.GumBallMachine;

/**
 * @author 吕星琪
 * @version 1.10 2023/10/11 下午 06:40
 * @description
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumBallMachine gumBallMachine=new GumBallMachine(5);


        for (int i=0;i<6;i++){
            System.out.println("第"+(i+1)+"次取糖果");
            gumBallMachine.insertQuarter();
            gumBallMachine.turnCrank();
            System.out.println("剩余" + gumBallMachine.getCount() + "颗糖果");
        }


        /*gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();

        gumBallMachine.insertQuarter();
        gumBallMachine.turnCrank();*/


    }
}
