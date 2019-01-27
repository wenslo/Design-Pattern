package com.github.webslo.designpattern.headfirst.chapter5_singleton.step3;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 17:22
 * @description
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public Singleton getInstance() {
        return singleton;
    }
}
