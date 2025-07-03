package com.lv.code.day0818.命令模式.version03.command.impl;

import com.lv.code.day0818.命令模式.version03.electrical_appliances.Stereo;
import com.lv.code.day0818.命令模式.version03.command.Command;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 04:25
 * @since jdk1.0
 */
public class StereoOnCommand implements Command {

    Stereo stereo;
    public StereoOnCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void undo() {
        stereo.off();
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
