package com.lv.code.day0829.迭代器模式.version04;

import java.util.ArrayList;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/25 上午 09:18
 * @Description
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        CafeMenu cafeMenu=new CafeMenu();
        ArrayList<Menu> menus=new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);
        Waiter waiter=new Waiter(menus);
//        Waiter waiter=new Waiter(pancakeHouseMenu,dinerMenu,cafeMenu);
        waiter.printMenu();
    }
}
