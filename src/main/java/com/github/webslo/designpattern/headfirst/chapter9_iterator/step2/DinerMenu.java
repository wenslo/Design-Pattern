package com.github.webslo.designpattern.headfirst.chapter9_iterator.step2;


import java.util.Iterator;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 15:14
 * @description
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "1111111111111", true, 2.99);
        addItem("BLT", "222222222222", false, 2.99);
        addItem("Soup of the day", "2222222222222", false, 3.29);
        addItem("Hotdog", "33333333333333", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry,menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}