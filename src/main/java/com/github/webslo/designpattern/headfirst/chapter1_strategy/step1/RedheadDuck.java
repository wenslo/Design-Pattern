package com.github.webslo.designpattern.headfirst.chapter1_strategy.step1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-09 21:46
 * @description
 */
public class RedheadDuck extends Duck {
    private static final Logger logger = LoggerFactory.getLogger(RedheadDuck.class);

    @Override
    public void display() {
        logger.debug("红头鸭子");
    }
}
