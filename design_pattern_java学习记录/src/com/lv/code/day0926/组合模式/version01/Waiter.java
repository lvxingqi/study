package com.lv.code.day0926.组合模式.version01;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 下午 05:03
 * @Description
 */
public class Waiter {
    MenuComponent allMenus;
    public Waiter(MenuComponent allMenus){
        this.allMenus=allMenus;
    }
    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator iterator= allMenus.createIterator();
        System.out.println("\n素食\n");
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}