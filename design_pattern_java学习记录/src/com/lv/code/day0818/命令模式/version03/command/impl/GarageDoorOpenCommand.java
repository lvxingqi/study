package com.lv.code.day0818.命令模式.version03.command.impl;

import com.lv.code.day0818.命令模式.version03.electrical_appliances.GarageDoor;
import com.lv.code.day0818.命令模式.version03.command.Command;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 02:29
 * @since jdk1.0
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    @Override
    public void undo() {

    }

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
