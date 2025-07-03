package com.lv.code.day0818.命令模式.version03.command.impl;

import com.lv.code.day0818.命令模式.version03.electrical_appliances.Light;
import com.lv.code.day0818.命令模式.version03.command.Command;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 上午 11:46
 * @since jdk1.0
 */
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        //动作
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
