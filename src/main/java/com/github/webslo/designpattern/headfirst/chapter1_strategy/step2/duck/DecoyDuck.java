package com.github.webslo.designpattern.headfirst.chapter1_strategy.step2.duck;

import com.github.webslo.designpattern.headfirst.chapter1_strategy.step2.behavior.FlyWithRocket;
import com.github.webslo.designpattern.headfirst.chapter1_strategy.step2.behavior.FlyWithWings;
import com.github.webslo.designpattern.headfirst.chapter1_strategy.step2.behavior.Quack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-16 14:42
 * @description
 */
public class DecoyDuck extends Duck {
    private static final Logger logger = LoggerFactory.getLogger(DecoyDuck.class);

    @Override
    protected void display() {
        logger.debug("Look like decoy duck");
    }


    public static void main(String[] args) {
        Duck dock = new RedheadDuck();
        dock.setFlyBehavior(new FlyWithWings());
        dock.setQuackBehavior(new Quack());
        dock.display();
        dock.performFly();
        dock.performQuack();

        dock.setFlyBehavior(new FlyWithRocket());
        dock.performFly();
    }
}
