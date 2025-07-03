package com.lv.code.day0926.组合模式.version01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/27 上午 09:13
 * @Description
 */
public class Menu extends MenuComponent{
    ArrayList<MenuComponent> menuComponents=new ArrayList<>();
    String name;
    String description;
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(","+getDescription());
        System.out.println("---------------------");
        Iterator<MenuComponent> iterator=menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
