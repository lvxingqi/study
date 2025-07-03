package com.lv.code.day0829.迭代器模式.version04;

import java.util.Iterator;
/**
 * @author 吕星琪
 * @version 1.10 2023/8/30 上午 09:14
 * @Description
 */
public class DinerMenuIterator implements Iterator {
    int position=0;
    MenuItem[] list;

    public DinerMenuIterator(MenuItem[] list) {
        this.list=list;
    }

    @Override
    public Object next() {
        MenuItem menuItem=list[position];
        position=position+1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return position < list.length && list[position] != null;
    }

    @Override
    public void remove(){
        if (position<0){
            throw new IllegalStateException("你不能从一个空数组中删除元素");
        }
        //移除当前位置的元素，并将之后全部元素前移一位
        if (list[position-1]!=null){
            for (int i=position-1;i<(list.length-1);i++){
                list[i]=list[i+1];
            }
            list[list.length-1]=null;
        }
    }
}
