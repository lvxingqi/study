package com.lv.code.day0818.单例模式.version01;


/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 上午 09:34
 * @since jdk1.0
 */
public class TestSingleton {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();
        System.out.println(instance2==instance);
    }
}
