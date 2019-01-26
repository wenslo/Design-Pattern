package com.github.webslo.designpattern.headfirst.chapter3_decorate.step3;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 21:00
 * @description
 */
public class Venti extends SizeDecorator {
    Beverage beverage;

    public Venti(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Venti";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
