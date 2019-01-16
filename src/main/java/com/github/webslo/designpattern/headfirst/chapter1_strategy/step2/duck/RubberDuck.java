package com.github.webslo.designpattern.headfirst.chapter1_strategy.step2.duck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-16 14:42
 * @description
 */
public class RubberDuck extends Duck {
    private static final Logger logger = LoggerFactory.getLogger(RubberDuck.class);

    @Override
    protected void display() {
        logger.debug("Look like rubber duck");
    }
}
