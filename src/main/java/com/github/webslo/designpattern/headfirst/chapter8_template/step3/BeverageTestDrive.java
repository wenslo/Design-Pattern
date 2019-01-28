package com.github.webslo.designpattern.headfirst.chapter8_template.step3;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 11:29
 * @description
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaWithHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
