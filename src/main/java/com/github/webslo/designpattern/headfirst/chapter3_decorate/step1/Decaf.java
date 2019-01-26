package com.github.webslo.designpattern.headfirst.chapter3_decorate.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 20:06
 * @description
 */
public class Decaf extends Beverage {
    @Override
    protected float cost() {
        return 2;
    }
}
