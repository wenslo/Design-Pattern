package com.github.webslo.designpattern.headfirst.chapter8_template.step3;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 11:21
 * @description
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping CoffeeWithHook through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        return "n";
    }
}
