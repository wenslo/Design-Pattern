package com.github.webslo.designpattern.headfirst.chapter9_iterator.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 15:16
 * @description
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
