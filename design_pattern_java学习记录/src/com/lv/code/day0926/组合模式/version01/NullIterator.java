package com.lv.code.day0926.组合模式.version01;


import java.util.Iterator;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/27 下午 07:10
 * @Description
 */
public class NullIterator implements Iterator {
    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
