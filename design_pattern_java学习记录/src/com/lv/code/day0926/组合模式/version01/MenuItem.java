package com.lv.code.day0926.组合模式.version01;

import java.util.Iterator;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 下午 04:27
 * @Description
 */
public class MenuItem extends MenuComponent{
    String name;
    String description;
    boolean vegetarian;//素食主义者
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean getVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    @Override
    public boolean isVegetarian() {
        return getVegetarian();
    }

    @Override
    public void print() {
        System.out.print(" "+getName());
        if (isVegetarian()){
            System.out.print("(v)");
        }
        System.out.println(", "+getPrice());
        System.out.println("    ---"+getDescription());
    }
}
