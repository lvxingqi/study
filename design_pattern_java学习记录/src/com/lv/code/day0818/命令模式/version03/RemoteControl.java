package com.lv.code.day0818.命令模式.version03;

import com.lv.code.day0818.命令模式.version03.command.Command;
import com.lv.code.day0818.命令模式.version03.command.impl.NoCommand;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 02:03
 * @since jdk1.0
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteControl(){
        onCommands=new Command[7];
        offCommands=new Command[7];
        //这个NoCommand什么也不做
        Command noCommand=new NoCommand();
        for (int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        undoCommand=noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    //插槽
    Command slot;

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand=onCommands[slot];
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand=offCommands[slot];
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("\n--------Remote Control--------\n");
        for (int i=0;i<onCommands.length;i++){
            stringBuffer.append("[slot"+i+"]"+onCommands[i].getClass().getName()+"  "
            +offCommands[i].getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }
    public void undoButtonWasPressed(){
        undoCommand.undo();
    }

    public static void main(String[] args) {
        System.out.println(new RemoteControl());
    }
}
