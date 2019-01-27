package com.github.webslo.designpattern.headfirst.chapter4_factory.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 12:11
 * @description
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
