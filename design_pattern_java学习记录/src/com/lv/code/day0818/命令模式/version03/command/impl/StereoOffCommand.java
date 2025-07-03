package com.lv.code.day0818.命令模式.version03.command.impl;

import com.lv.code.day0818.命令模式.version03.electrical_appliances.Stereo;
import com.lv.code.day0818.命令模式.version03.command.Command;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 04:24
 * @since jdk1.0
 */
public class StereoOffCommand implements Command {
    Stereo stereo;
    public StereoOffCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void undo() {
        stereo.on();
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
