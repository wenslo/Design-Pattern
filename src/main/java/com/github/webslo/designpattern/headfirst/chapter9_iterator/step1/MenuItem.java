package com.github.webslo.designpattern.headfirst.chapter9_iterator.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 15:09
 * @description
 */
public class MenuItem {
    String name;
    String description;
    boolean vetetarian;
    double price;

    public MenuItem(String name, String description, boolean vetetarian, double price) {
        this.name = name;
        this.description = description;
        this.vetetarian = vetetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVetetarian() {
        return vetetarian;
    }

    public double getPrice() {
        return price;
    }
}
