package com.github.webslo.designpattern.headfirst.chapter4_factory.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 12:06
 * @description
 */
public abstract class Pizza {
    public void prepare() {
        System.out.println("prepare...");
    }

    public void bake() {
        System.out.println("bake...");
    }

    public void cut() {
        System.out.println("cut...");
    }

    public void box() {
        System.out.println("box...");
    }
}
