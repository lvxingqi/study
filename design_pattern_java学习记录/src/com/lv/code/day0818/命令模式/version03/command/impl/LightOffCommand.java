package com.lv.code.day0818.命令模式.version03.command.impl;

import com.lv.code.day0818.命令模式.version03.electrical_appliances.Light;
import com.lv.code.day0818.命令模式.version03.command.Command;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 04:19
 * @since jdk1.0
 */
public class LightOffCommand implements Command {
    Light light;

    @Override
    public void undo() {
        light.on();
    }

    public LightOffCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
