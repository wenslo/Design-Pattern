package com.github.webslo.designpattern.headfirst.chapter1_strategy.step1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-09 21:54
 * @description
 */
public class RubberDuck extends Duck {
    private static final Logger logger = LoggerFactory.getLogger(RubberDuck.class);

    @Override
    public void quack() {

    }

    @Override
    public void display() {
        logger.debug("橡皮鸭子");
    }
}
