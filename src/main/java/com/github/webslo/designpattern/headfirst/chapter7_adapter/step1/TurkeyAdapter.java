package com.github.webslo.designpattern.headfirst.chapter7_adapter.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 10:49
 * @description
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
