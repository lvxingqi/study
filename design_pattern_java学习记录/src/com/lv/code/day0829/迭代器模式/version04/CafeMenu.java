package com.lv.code.day0829.迭代器模式.version04;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/25 下午 02:17
 * @Description
 */
public class CafeMenu implements Menu{
    Hashtable menuItems=new Hashtable();
    public CafeMenu(){
        addItem("1咖啡","好喝的咖啡",true,1.09);
        addItem("2咖啡","好喝的咖啡",true,2.19);
        addItem("3咖啡","好喝的咖啡",true,2.99);
        addItem("4咖啡","好喝的咖啡",true,3.09);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        menuItems.put(menuItem.getName(),menuItem);
    }

    @Override
    public Iterator createIterator(){
        //取得值的迭代器而不是整个迭代器
        return menuItems.values().iterator();
    }
}
