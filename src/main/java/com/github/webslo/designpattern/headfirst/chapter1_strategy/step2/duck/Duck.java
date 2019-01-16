package com.github.webslo.designpattern.headfirst.chapter1_strategy.step2.duck;

import com.github.webslo.designpattern.headfirst.chapter1_strategy.step2.behavior.FlyBehavior;
import com.github.webslo.designpattern.headfirst.chapter1_strategy.step2.behavior.QuackBehavior;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-16 14:33
 * @description
 */
public abstract class Duck {
    private static final Logger logger = LoggerFactory.getLogger(Duck.class);
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    protected void swim() {
        logger.debug("The duck is swimming");
    }

    protected void display() {
        logger.debug("This is a duck");
    }

    protected void performQuack() {
        quackBehavior.quack();
    }

    protected void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
