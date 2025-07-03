package com.lv.code.day0829.迭代器模式.version02;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/30 上午 09:14
 * @Description
 */
public class DinerMenuIterator implements Iterator{
    int position=0;
    MenuItem[] items;

    public DinerMenuIterator(MenuItem[] items) {
        this.items=items;
    }

    @Override
    public Object next() {
        MenuItem menuItem=items[position];
        position=position+1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }
}
