package com.lv.code.day1011.状态模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/10/11 下午 02:36
 * @description 糖果机
 */
public class GumBallMachine {
    final static int SOLD_OUT=0;
    final static int NO_QUARTER=1;
    final static int HAS_QUARTER=2;
    final static int SOLD=3;

    int state=SOLD_OUT;
    int count=0;
    public GumBallMachine(int count){
        this.count=count;
        if (count>0){
            state=NO_QUARTER;
        }
    }

    public void insertQuarter(){
        if (state==HAS_QUARTER){
            System.out.println("已经投过25分钱了，不能再投钱了");
        } else if (state==NO_QUARTER) {
            state=HAS_QUARTER;
            System.out.println("你投入了25分钱");
        } else if (state==SOLD_OUT) {
            System.out.println("售罄了，不能投入25分钱");
        } else if (state == SOLD) {
            System.out.println("请稍等，我们正在给你糖果");
        }
    }

    public void ejectQuarter(){
        if (state==HAS_QUARTER){
            state=NO_QUARTER;
            System.out.println("你的25分钱已经退出");
        } else if (state==NO_QUARTER) {
            System.out.println("你没有投钱，你不能退钱");
        } else if (state==SOLD) {
            System.out.println("对不起，你已经买到糖果了，不能退钱");
        } else if (state == SOLD_OUT) {
            System.out.println("售罄了，你不能投钱，所以不能退你25分钱");
        }
    }

    public void turnCrank(){
        if (state==SOLD){
            state=NO_QUARTER;
            System.out.println("你已经转过了，请稍等");
        } else if (state==NO_QUARTER) {
            System.out.println("你得先投25分钱");
        } else if (state==SOLD_OUT) {
            System.out.println("售罄了，不能转动");
        } else if (state == HAS_QUARTER) {
            System.out.println("你转动了手柄");
            state=SOLD;
            //调用此方法分发糖果
            dispense();
        }
    }

    public void dispense(){
        if (state==SOLD){
            System.out.println("糖果正在发放");
            count=count-1;
            //如果这是最后一颗糖果，就调整为售罄状态，否则回到需要25分钱的状态
            if (count==0){
                System.out.println("对不起，糖果已经售罄了");
                state=SOLD_OUT;
            }else {
                state=NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("你得先付钱");
        } else if (state == SOLD_OUT) {
            System.out.println("不能分发糖果");
        } else if (state == HAS_QUARTER) {
            System.out.println("不能分发糖果");
        }
    }

    @Override
    public String toString() {
        return "GumBallMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
