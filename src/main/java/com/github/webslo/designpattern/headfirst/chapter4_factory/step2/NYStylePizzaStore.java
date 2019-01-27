package com.github.webslo.designpattern.headfirst.chapter4_factory.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 12:18
 * @description
 */
public class NYStylePizzaStore extends Pizza {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
        }
        return pizza;
    }
}
