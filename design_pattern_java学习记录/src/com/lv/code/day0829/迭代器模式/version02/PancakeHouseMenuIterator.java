package com.lv.code.day0829.迭代器模式.version02;

import java.util.ArrayList;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/30 上午 09:18
 * @Description
 */
public class PancakeHouseMenuIterator implements Iterator{
    ArrayList<MenuItem> items;
    int position=0;
    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items=items;
    }

    @Override
    public Object next() {
        MenuItem menuItem=items.get(position);
        position=position+1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return position<items.size();
    }
}
