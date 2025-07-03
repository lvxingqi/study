package com.lv.code.day0829.迭代器模式.version04;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 下午 04:29
 * @Description
 */
public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems=new ArrayList<>();
        addItem("K&B式煎饼早餐",
                "煎饼配炒鸡蛋和吐司",
                true,
                2.99);
        addItem("普通煎饼早餐",
                "香肠+煎蛋煎饼",
                false,
                2.99);
        addItem("蓝莓煎饼",
                "新鲜蓝莓做的煎饼",
                true,
                3.49);
        addItem("华夫饼",
                "蓝莓或草莓的煎饼(可选)",
                true,
                3.59);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        menuItems.add(new MenuItem(name,description,vegetarian,price));
    }

    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
