package com.github.webslo.designpattern.headfirst.chapter4_factory.step3;

import java.util.ArrayList;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 12:30
 * @description
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        toppings.forEach(it -> System.out.println("             " + it));
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cup() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
