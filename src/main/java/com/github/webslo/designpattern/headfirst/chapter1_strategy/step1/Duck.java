package com.github.webslo.designpattern.headfirst.chapter1_strategy.step1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-09 21:44
 * @description
 */
public abstract class Duck {
    private static final Logger logger = LoggerFactory.getLogger(Duck.class);

    protected void quack() {
        logger.debug("呱呱呱呱");
    }

    protected void swim() {
        logger.debug("正在游泳");
    }

    protected void display() {
        logger.debug("鸭子");
    }

    protected void fly() {
        logger.debug("这鸭子会飞");
    }
}
