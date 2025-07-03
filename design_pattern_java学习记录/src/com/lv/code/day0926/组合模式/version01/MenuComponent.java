package com.lv.code.day0926.组合模式.version01;

import java.util.Iterator;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/26 上午 10:47
 * @Description
 */
public abstract class MenuComponent {

    //菜单和菜单项根据需要自己实现需要的方法，统一提供默认

    //因为有些方法对菜单项有意义，有些方法只对菜单有意义，所以默认实现是抛出异常
    //下面3个方法对菜单有意义
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    //下面4个方法对菜单项有意义
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public String getDescription(){
        throw new UnsupportedOperationException();
    }
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    //这个方法菜单和菜单项都需要实现
    public void print(){
        throw new UnsupportedOperationException();
    }

    public abstract Iterator createIterator();
}
