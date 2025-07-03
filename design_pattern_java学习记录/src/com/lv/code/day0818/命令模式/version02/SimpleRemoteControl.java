package com.lv.code.day0818.命令模式.version02;

import com.lv.code.day0818.命令模式.version02.command.Command;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 02:03
 * @since jdk1.0
 */
public class SimpleRemoteControl {
    //插槽
    Command slot;
    public SimpleRemoteControl(){}

    public void setSlot(Command command) {
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
