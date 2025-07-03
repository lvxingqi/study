package com.lv.code.day0829.迭代器模式.version04;

import java.util.Iterator;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 下午 04:44
 * @Description
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS=6;
    int numberOfItems=0;
    MenuItem[] menuItems;

//    这个方法会暴露我们的内部实现，我们不想要这个方法
    /*public MenuItem[] getMenuItems() {
        return menuItems;
    }*/

    public DinerMenu() {
        menuItems=new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT","描述1",true,2.99);
        addItem("Vegetarian BLT","描述2",true,2.99);
        addItem("Vegetarian BLT","描述3",true,2.99);
        addItem("Vegetarian BLT","描述4",true,2.99);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        if (numberOfItems>=MAX_ITEMS){
            System.out.println("对不起，菜单满了，不能再添加菜单项到菜单上");
        }else {
            menuItems[numberOfItems]=new MenuItem(name,description,vegetarian,price);
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
