package com.github.webslo.designpattern.headfirst.chapter8_template.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 11:18
 * @description
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
