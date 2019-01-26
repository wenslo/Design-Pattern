package com.github.webslo.designpattern.headfirst.chapter3_decorate.step3;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 20:59
 * @description
 */
public class Grande extends SizeDecorator {
    Beverage beverage;

    public Grande(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Grande";
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }
}
