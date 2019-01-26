package com.github.webslo.designpattern.headfirst.chapter3_decorate.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 20:25
 * @description
 */
public class HouseBlend extends Beverage {
    private Double houseBlendl;

    public HouseBlend(String description, Double houseBlendl) {
        super.description = description;
        this.houseBlendl = houseBlendl;
    }

    @Override
    protected Double cost() {
        Double superCost = super.cost();
        return houseBlendl + superCost;
    }
}
