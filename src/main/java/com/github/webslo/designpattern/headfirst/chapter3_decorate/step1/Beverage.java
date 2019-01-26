package com.github.webslo.designpattern.headfirst.chapter3_decorate.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 20:03
 * @description
 */
public abstract class Beverage {
    protected String description;

    protected void getDescription() {
        System.out.println("description is " + description);
    }

    protected abstract float cost();
}
