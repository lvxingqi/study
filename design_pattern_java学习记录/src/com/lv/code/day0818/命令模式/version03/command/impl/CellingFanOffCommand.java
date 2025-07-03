package com.lv.code.day0818.命令模式.version03.command.impl;

import com.lv.code.day0818.命令模式.version03.command.Command;
import com.lv.code.day0818.命令模式.version03.electrical_appliances.CeilingFan;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/21 上午 09:55
 * @since jdk1.0
 */
public class CellingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    @Override
    public void undo() {

    }

    public CellingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {

    }
}
