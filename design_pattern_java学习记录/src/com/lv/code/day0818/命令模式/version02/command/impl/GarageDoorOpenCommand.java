package com.lv.code.day0818.命令模式.version02.command.impl;

import com.lv.code.day0818.命令模式.version02.GarageDoor;
import com.lv.code.day0818.命令模式.version02.command.Command;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 02:29
 * @since jdk1.0
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public void setGarageDoor(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
