package com.lv.code.day0818.命令模式.version03.electrical_appliances;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 04:21
 * @since jdk1.0
 */
public class Stereo {
    public Stereo(String name) {
        System.out.println("This is "+name+" Stereo");
    }

    public void on(){
        System.out.println("Stereo is on");
    }
    public void off(){
        System.out.println("Stereo is off");
    }
    public void setCd(){
        System.out.println("CD 已经放上了");
    }
    public void setVolume(int volume){
        System.out.println("音量是"+volume);
    }
}
