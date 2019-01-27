package com.github.webslo.designpattern.headfirst.chapter4_factory.step3;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 12:43
 * @description
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}
