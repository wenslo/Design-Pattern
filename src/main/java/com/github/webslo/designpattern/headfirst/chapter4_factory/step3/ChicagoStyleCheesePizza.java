package com.github.webslo.designpattern.headfirst.chapter4_factory.step3;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 12:38
 * @description
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chizago StyleDeep Dish Cheese Pizza";
        dough = "Extan Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
