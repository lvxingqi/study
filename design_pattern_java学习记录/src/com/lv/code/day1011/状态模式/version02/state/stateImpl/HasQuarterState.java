package com.lv.code.day1011.状态模式.version02.state.stateImpl;

import com.lv.code.day1011.状态模式.version02.GumBallMachine;
import com.lv.code.day1011.状态模式.version02.state.State;

/**
 * @author 吕星琪
 * @version 1.10 2023/10/11 下午 06:58
 * @description
 */
public class HasQuarterState implements State {
    GumBallMachine gumBallMachine;
    public HasQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine=gumBallMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("已经投过25分钱了，不能再投钱了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你的25分钱已经退出");
        gumBallMachine.setState(gumBallMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动了手柄，请稍等...");
        gumBallMachine.setState((gumBallMachine.getSoldState()));
    }

    @Override
    public void dispense() {
        System.out.println("没有糖果分发");
    }
}
