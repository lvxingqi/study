package com.lv.code.day0818.命令模式.version03.electrical_appliances;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 02:27
 * @since jdk1.0
 */
public class GarageDoor {
    public GarageDoor(String name) {
        System.out.println("This is "+name+" GarageDoor");
    }

    public void up(){
        System.out.println("GarageDoor is open");
    }
    public void down(){}
    public void stop(){}
    public void lightOn(){}
    public void lightOff(){}
}
