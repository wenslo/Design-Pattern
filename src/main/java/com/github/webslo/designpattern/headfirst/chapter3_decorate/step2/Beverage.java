package com.github.webslo.designpattern.headfirst.chapter3_decorate.step2;

import java.util.Objects;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 20:20
 * @description
 */
public abstract class Beverage {
    protected String description;
    protected Double milk;
    protected Double soy;
    protected Double mocha;
    protected Double whip;

    public void getDescription() {
        System.out.println("description is " + description);
    }

    protected Double cost() {
        Double cost = 0.0;
        if (Objects.nonNull(milk)) {
            cost += milk;
        }
        if (Objects.nonNull(soy)) {
            cost += soy;
        }
        if (Objects.nonNull(mocha)) {
            cost += mocha;
        }
        if (Objects.nonNull(whip)) {
            cost += whip;
        }
        return cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getMilk() {
        return milk;
    }

    public void setMilk(Double milk) {
        this.milk = milk;
    }

    public Double getSoy() {
        return soy;
    }

    public void setSoy(Double soy) {
        this.soy = soy;
    }

    public Double getMocha() {
        return mocha;
    }

    public void setMocha(Double mocha) {
        this.mocha = mocha;
    }

    public Double getWhip() {
        return whip;
    }

    public void setWhip(Double whip) {
        this.whip = whip;
    }
}
