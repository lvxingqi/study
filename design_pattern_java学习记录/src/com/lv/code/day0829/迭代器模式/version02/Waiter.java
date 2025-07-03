package com.lv.code.day0829.迭代器模式.version02;

import java.util.ArrayList;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 下午 05:03
 * @Description
 */
public class Waiter {
    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waiter(PancakeHouseMenu pancakeHouseMenu,DinerMenu dinerMenu){
        this.pancakeHouseMenu=pancakeHouseMenu;
        this.dinerMenu=dinerMenu;
    }

    public void printMenu(){
        //迭代器采用统一的接口方法，去实现对不同数据结构的集合进行元素的遍历
        Iterator pancakeIterator=pancakeHouseMenu.createIterator();
        Iterator dinerIterator=dinerMenu.createIterator();
        System.out.println("MENU\n---\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLAUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem=(MenuItem) iterator.next();
            System.out.println(menuItem.getName()+",");
            System.out.println(menuItem.getPrice()+"---");
            System.out.println(menuItem.getDescription());
        }
    }
}