package com.lv.code.day0829.迭代器模式.version04;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 下午 05:03
 * @Description
 */
public class Waiter {
    ArrayList<Menu> menus;
    Menu dinerMenu;
    Menu pancakeHouseMenu;
    Menu cafeMenu;

    public Waiter(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public Waiter(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu){
        this.pancakeHouseMenu=pancakeHouseMenu;
        this.dinerMenu=dinerMenu;
        this.cafeMenu=cafeMenu;
    }

    public void printMenu(){
        Iterator menuIterator=menus.iterator();
        while (menuIterator.hasNext()){
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }

    }
    /*public void printMenu(){
        //迭代器采用统一的接口方法，去实现对不同数据结构的集合进行元素的遍历
        Iterator pancakeIterator=pancakeHouseMenu.createIterator();
        Iterator dinerIterator=dinerMenu.createIterator();
        Iterator cafeIterator=cafeMenu.createIterator();
        System.out.println("MENU\n---\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLAUNCH");
        printMenu(dinerIterator);
        System.out.println("\nDINNER");
        printMenu(cafeIterator);
    }*/

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem=(MenuItem) iterator.next();
            System.out.println(menuItem.getName()+",");
            System.out.println(menuItem.getPrice()+"---");
            System.out.println(menuItem.getDescription());
        }
    }
}