package com.github.webslo.designpattern.headfirst.chapter3_decorate.step3;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 20:48
 * @description
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .40 + beverage.cost();
    }
}
