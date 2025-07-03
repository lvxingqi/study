package com.lv.code.day0818.命令模式.version02;

import com.lv.code.day0818.命令模式.version02.command.Command;
import com.lv.code.day0818.命令模式.version02.command.impl.LightOnCommand;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 02:09
 * @since jdk1.0
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        //先有一个遥控器
        SimpleRemoteControl simpleRemoteControl=new SimpleRemoteControl();
        //给一个具体的命令执行者，电灯对象，实际命令接收者
        Light light=new Light();
        //给个具体的命令，命令需要接收一个命令接收者
        Command lightOn=new LightOnCommand(light);


        //命令传给调用者
        simpleRemoteControl.setSlot(lightOn);
        //模拟按钮按下
        simpleRemoteControl.buttonWasPressed();
    }
}
