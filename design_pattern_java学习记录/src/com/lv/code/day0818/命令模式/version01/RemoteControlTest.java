package com.lv.code.day0818.命令模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 02:32
 * @since jdk1.0
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        //命令发送者和命令执行者之间紧耦合，当需要增加
        //车库门的开关时，我们又要在控制类里面修改代码
        Light light=new Light();
        light.on();
        light.off();
    }
}
