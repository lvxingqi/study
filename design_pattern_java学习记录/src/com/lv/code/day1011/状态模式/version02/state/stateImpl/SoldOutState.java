package com.lv.code.day1011.状态模式.version02.state.stateImpl;

import com.lv.code.day1011.状态模式.version02.GumBallMachine;
import com.lv.code.day1011.状态模式.version02.state.State;

/**
 * @author 吕星琪
 * @version 1.10 2023/10/11 下午 06:58
 * @description
 */
public class SoldOutState implements State {
    GumBallMachine gumBallMachine;

    public SoldOutState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("售罄了，不能投入钱");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("售罄了，不能退钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("售罄了，不能转动手柄");
    }

    @Override
    public void dispense() {
        System.out.println("售罄了，不能分发糖果");
    }
}
