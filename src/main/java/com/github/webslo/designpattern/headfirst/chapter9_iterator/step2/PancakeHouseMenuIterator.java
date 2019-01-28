package com.github.webslo.designpattern.headfirst.chapter9_iterator.step2;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 16:00
 * @description
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList list;
    int position;

    public PancakeHouseMenuIterator(ArrayList list) {
        this.list = list;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < list.size() && list.get(position) != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) list.get(position);
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        list.remove(position);
    }
}
