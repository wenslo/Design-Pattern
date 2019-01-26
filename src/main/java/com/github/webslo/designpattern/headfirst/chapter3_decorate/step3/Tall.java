package com.github.webslo.designpattern.headfirst.chapter3_decorate.step3;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 20:58
 * @description
 */
public class Tall extends SizeDecorator {
    Beverage beverage;

    public Tall(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Tall";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
