package com.lv.code.day0818.单例模式.version02;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 上午 09:29
 * @since jdk1.0
 */
public class Singleton {
    private static Singleton uniqueInstance=null;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        if (uniqueInstance==null){
            uniqueInstance =new Singleton();
        }
        return uniqueInstance;
    }
}
