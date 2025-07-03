package com.lv.code.day0926.组合模式.version01;

import java.util.ArrayList;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/25 上午 09:18
 * @Description
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        //声明4个菜单
        MenuComponent pancakeHouseMenu=new Menu("煎饼屋菜单","早餐");
        MenuComponent dinerMenu=new Menu("餐馆菜单","午餐");
        MenuComponent cafeMenu=new Menu("咖啡店菜单","晚餐");
        MenuComponent dessertMenu=new Menu("甜点菜单","所有甜点");

        //顶级菜单
        MenuComponent allMenus=new Menu("顶级菜单","包含所有菜单组合");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        //给餐馆菜单添加菜单项
        dinerMenu.add(new MenuItem("意大利面食","好吃的意大利面",true,3.89));
        //餐馆菜单包含甜点菜单
        dinerMenu.add(dessertMenu);

        //甜点菜单添加菜单项
        dessertMenu.add(new MenuItem("苹果派","好吃的甜甜的苹果派",true,3.29));

        Waiter waiter=new Waiter(allMenus);
        waiter.printMenu();
        waiter.printVegetarianMenu();


    }
}
