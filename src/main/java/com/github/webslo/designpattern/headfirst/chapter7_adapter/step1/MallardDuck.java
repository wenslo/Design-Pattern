package com.github.webslo.designpattern.headfirst.chapter7_adapter.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 10:47
 * @description
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
