package com.lv.code.day0829.迭代器模式.version01;

import java.util.ArrayList;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 下午 05:03
 * @Description
 */
public class Waiter {
    PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
    ArrayList<MenuItem> breakfastItems=pancakeHouseMenu.getMenuItems();
    DinerMenu dinerMenu =new DinerMenu();
    MenuItem[] lunchItems= dinerMenu.getMenuItems();

    public void printMenu(){
        for (int i=0;i<breakfastItems.size();i++){
            MenuItem item=breakfastItems.get(i);
            System.out.print(item.getName()+" ");
            System.out.println(item.getPrice()+" ");
            System.out.println(item.getDescription());
        }
        for(int i=0;i< lunchItems.length;i++){
            MenuItem item=lunchItems[i];
            System.out.print(item.getName()+" ");
            System.out.println(item.getPrice()+" ");
            System.out.println(item.getDescription());
        }
    }

}
