package com.github.webslo.designpattern.headfirst.chapter1_strategy.step2.behavior;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-16 14:40
 * @description
 */
public class Quack implements QuackBehavior {
    private static final Logger logger = LoggerFactory.getLogger(Quack.class);

    @Override
    public void quack() {
        logger.debug("ggggggggggggggggggggggggggggg");
    }
}
