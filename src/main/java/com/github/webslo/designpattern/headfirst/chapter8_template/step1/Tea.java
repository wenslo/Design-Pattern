package com.github.webslo.designpattern.headfirst.chapter8_template.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 11:12
 * @description
 */
public class Tea {
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }
}
