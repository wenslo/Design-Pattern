package com.github.webslo.designpattern.headfirst.chapter4_factory.step3;


/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 12:41
 * @description
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
        }
        return pizza;
    }
}
