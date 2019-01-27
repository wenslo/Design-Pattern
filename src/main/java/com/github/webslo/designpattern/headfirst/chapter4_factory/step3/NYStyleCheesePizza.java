package com.github.webslo.designpattern.headfirst.chapter4_factory.step3;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 12:36
 * @description
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
