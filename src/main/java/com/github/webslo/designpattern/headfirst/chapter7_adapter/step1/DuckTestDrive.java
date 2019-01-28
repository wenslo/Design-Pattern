package com.github.webslo.designpattern.headfirst.chapter7_adapter.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-28 10:49
 * @description
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuct(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuct(turkeyAdapter);
    }

    static void testDuct(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
