package com.lv.code.day0926.组合模式.version01;


import java.util.Iterator;
import java.util.Stack;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/27 下午 07:08
 * @Description
 */
public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    /**
     * 将我们要遍历的顶层组合的迭代器传入，我们把它抛进一个堆栈结构中。
     *
     * @param iterator
     */
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    /**
     * 当用户想要取得下一个元素时，我们先调用hasNext()来确定是否还有下一个。
     *
     * @return
     */
    @Override
    public Object next() {
        if (hasNext()) {
            //如果还有下一个元素，我们就从堆栈中取出目前的迭代器，然后取得它的下一个元素
            Iterator iterator = (Iterator) stack.peek();//查看堆栈顶部元素而不删除
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                //如果元素是一个菜单，我们有了另一个需要被包含进遍历中的组合，所以我们
                //将它丢进堆栈中。
                stack.push(component.createIterator());
            }
            //不管是不是菜单，都要返回该组件
            return component;
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        //想要知道是否还有下一个元素，我们检查堆栈是否被清空，
        //如果已经空了，就表示没有下一个元素了
        if (stack.empty()) {
            return false;
        } else {
            //否则，我们就从堆栈的顶层中取出迭代器，看看是否还有下一个元素，
            //如果它没有元素，我们就将它推出堆栈，然后递归的调用hasNext();
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                //否则表示还有下一个元素，返回true，
                return true;
            }
        }
    }

    /**
     * 不支持删除，只有遍历
     */
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
