package com.lv.code.day0818.单例模式.version04;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 上午 09:29
 * @since jdk1.0
 */
public class Singleton {
    //静态全局共享，只会创建一次
    private static volatile Singleton uniqueInstance=null;
    private Singleton(){}
    public static Singleton getInstance(){
        if (uniqueInstance==null){
            synchronized (Singleton.class){
                if (uniqueInstance==null){
                    uniqueInstance=new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
