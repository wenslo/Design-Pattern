package com.github.webslo.designpattern.headfirst.chapter7_adapter.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 10:48
 * @description
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
