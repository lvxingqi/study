package com.lv.code.day0821.适配器模式;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/28 上午 09:02
 * @Description
 */
public class ArrayListAdapter implements Enumeration<String> {
    ArrayList<String> list;
    Iterator<String> iterator;
    public ArrayListAdapter(ArrayList<String> list){
        this.list=list;
        iterator=list.iterator();
    }
    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public String nextElement() {
        return iterator.next();
    }
}
