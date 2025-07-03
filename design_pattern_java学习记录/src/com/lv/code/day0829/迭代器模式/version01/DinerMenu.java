package com.lv.code.day0829.迭代器模式.version01;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 下午 04:44
 * @Description
 */
public class DinerMenu {
    static final int MAX_ITEMS=6;
    int numberOfItems=0;
    MenuItem[] menuItems;

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public DinerMenu() {
        menuItems=new MenuItem[MAX_ITEMS];

    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        if (numberOfItems>=MAX_ITEMS){
            System.out.println("对不起，菜单满了，不能再添加菜单项到菜单上");
        }else {
            menuItems[numberOfItems]=new MenuItem(name,description,vegetarian,price);
            numberOfItems++;
        }
    }
}
