package com.github.webslo.designpattern.headfirst.chapter1_strategy.step2.behavior;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-16 14:50
 * @description
 */
public class FlyWithRocket implements FlyBehavior {
    private static final Logger logger = LoggerFactory.getLogger(FlyWithRocket.class);

    @Override
    public void fly() {
        logger.debug("I'm flying with a rocket ! ");
    }
}
