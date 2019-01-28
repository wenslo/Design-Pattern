package com.github.webslo.designpattern.headfirst.chapter8_template.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 11:20
 * @description
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
