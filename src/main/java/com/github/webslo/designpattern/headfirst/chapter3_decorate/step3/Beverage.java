package com.github.webslo.designpattern.headfirst.chapter3_decorate.step3;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 20:34
 * @description
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
