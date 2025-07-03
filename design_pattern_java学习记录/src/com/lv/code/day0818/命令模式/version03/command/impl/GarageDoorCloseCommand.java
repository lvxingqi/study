package com.lv.code.day0818.命令模式.version03.command.impl;

import com.lv.code.day0818.命令模式.version03.command.Command;
import com.lv.code.day0818.命令模式.version03.electrical_appliances.GarageDoor;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/21 上午 09:52
 * @since jdk1.0
 */
public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    @Override
    public void undo() {

    }

    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor=garageDoor;
    }
    @Override
    public void execute() {

    }
}
