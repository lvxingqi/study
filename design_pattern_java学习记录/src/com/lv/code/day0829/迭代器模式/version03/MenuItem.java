package com.lv.code.day0829.迭代器模式.version03;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 下午 04:27
 * @Description
 */
public class MenuItem {
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
}
