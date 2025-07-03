package com.lv.code.day1011.状态模式.version02;

import com.lv.code.day1011.状态模式.version02.state.State;
import com.lv.code.day1011.状态模式.version02.state.stateImpl.HasQuarterState;
import com.lv.code.day1011.状态模式.version02.state.stateImpl.NoQuarterState;
import com.lv.code.day1011.状态模式.version02.state.stateImpl.SoldOutState;
import com.lv.code.day1011.状态模式.version02.state.stateImpl.SoldState;

/**
 * @author 吕星琪
 * @version 1.10 2023/10/11 下午 02:36
 * @description 糖果机
 * 现在每个状态负责自己的行为了，糖果机持有每个状态的实例，通过实例处理用户行为
 */
public class GumBallMachine {
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;

    public void setState(State state) {
        this.state = state;
    }

    State state=new SoldOutState(this);

    public GumBallMachine(int numberGumballs) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState=new SoldOutState(this);
        this.count = numberGumballs;
        if (numberGumballs>0){
            state=noQuarterState;
        }
    }

    int count=0;

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void reverseBall(){
        System.out.println("一颗糖球滚出来了");
        if (count!=0){
            count--;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getCount() {
        return count;
    }
}
