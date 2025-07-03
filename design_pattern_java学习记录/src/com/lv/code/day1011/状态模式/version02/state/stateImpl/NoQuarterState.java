package com.lv.code.day1011.状态模式.version02.state.stateImpl;

import com.lv.code.day1011.状态模式.version02.GumBallMachine;
import com.lv.code.day1011.状态模式.version02.state.State;

/**
 * @author 吕星琪
 * @version 1.10 2023/10/11 下午 06:58
 * @description
 */
public class NoQuarterState implements State {
    GumBallMachine gumBallMachine;

    public NoQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你投入了25分钱");
        gumBallMachine.setState(gumBallMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("没付钱，你不能退钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动了，但没付钱");
    }

    @Override
    public void dispense() {
        System.out.println("没付钱，付钱");
    }
}
