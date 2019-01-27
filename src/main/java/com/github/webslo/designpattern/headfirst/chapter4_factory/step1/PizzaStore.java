package com.github.webslo.designpattern.headfirst.chapter4_factory.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 12:11
 * @description
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
