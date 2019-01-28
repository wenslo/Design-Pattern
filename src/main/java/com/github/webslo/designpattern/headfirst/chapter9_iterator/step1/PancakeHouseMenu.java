package com.github.webslo.designpattern.headfirst.chapter9_iterator.step1;

import java.util.ArrayList;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 15:10
 * @description
 */
public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast", "1111111111111", true, 2.99);
        addItem("Regular Pancake Breakfast", "222222222222", false, 2.99);
        addItem("Blueberry Pancakes", "2222222222222", true, 3.29);
        addItem("Waffles", "33333333333333", true, 3.05);
    }

    public void addItem(String name, String description, boolean vetetarian, double price) {
        MenuItem item = new MenuItem(name, description, vetetarian, price);
        menuItems.add(item);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
