package com.lv.code.day0818.命令模式.version03;

import com.lv.code.day0818.命令模式.version03.command.impl.*;
import com.lv.code.day0818.命令模式.version03.electrical_appliances.CeilingFan;
import com.lv.code.day0818.命令模式.version03.electrical_appliances.GarageDoor;
import com.lv.code.day0818.命令模式.version03.electrical_appliances.Light;
import com.lv.code.day0818.命令模式.version03.electrical_appliances.Stereo;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 04:27
 * @since jdk1.0
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl();

        Light livingRoomLight=new Light("LivingRoom");
        Light kitchenLight=new Light("KitchenLight");
        CeilingFan ceilingFan=new CeilingFan("LivingRoom");
        GarageDoor garageDoor=new GarageDoor("");
        Stereo stereo=new Stereo("LivingRoom");

        LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff=new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightLightOn=new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightLightOff=new LightOffCommand(kitchenLight);

        CellingFanOnCommand cellingFanOnCommand=new CellingFanOnCommand(ceilingFan);
        CellingFanOffCommand cellingFanOffCommand=new CellingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpenCommand=new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand=new GarageDoorCloseCommand(garageDoor);

        StereoOnCommand stereoOnCommand=new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand=new StereoOffCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightLightOn,kitchenLightLightOff);
        remoteControl.setCommand(2,cellingFanOnCommand,cellingFanOffCommand);
        remoteControl.setCommand(3,garageDoorOpenCommand,garageDoorCloseCommand);
        remoteControl.setCommand(4,stereoOnCommand,stereoOffCommand);

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPressed();
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);





    }
}
