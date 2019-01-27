package com.github.webslo.designpattern.headfirst.chapter4_factory.step3;


/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 12:18
 * @description
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
        }
        return pizza;
    }
}
