package com.github.webslo.designpattern.headfirst.chapter8_template.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 11:21
 * @description
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
