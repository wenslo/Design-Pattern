package com.github.webslo.designpattern.headfirst.chapter5_singleton.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 17:19
 * @description
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
