package com.lv.code.day1011.状态模式.version02.state.stateImpl;

import com.lv.code.day1011.状态模式.version02.GumBallMachine;
import com.lv.code.day1011.状态模式.version02.state.State;

/**
 * @author 吕星琪
 * @version 1.10 2023/10/11 下午 06:58
 * @description
 */
public class SoldState implements State {
    GumBallMachine gumBallMachine;

    public SoldState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("等待糖果中，不能再投钱了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("等待糖果中，不能退钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("等待糖果中，请稍等");
    }

    @Override
    public void dispense() {
        gumBallMachine.reverseBall();
        if (gumBallMachine.getCount()>0){
            gumBallMachine.setState(gumBallMachine.getNoQuarterState());
        }else {
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }
    }
}
