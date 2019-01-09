package com.github.webslo.designpattern.headfirst.init.step1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-09 21:57
 * @description
 */
public class DecoyDuck extends Duck {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    protected void quack() {

    }

    @Override
    protected void swim() {
    }

    @Override
    protected void display() {
        logger.debug("诱饵鸭子");
    }

    @Override
    protected void fly() {
    }
}
