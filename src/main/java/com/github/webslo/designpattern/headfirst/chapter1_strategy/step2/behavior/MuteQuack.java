package com.github.webslo.designpattern.headfirst.chapter1_strategy.step2.behavior;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-16 14:41
 * @description
 */
public class MuteQuack implements QuackBehavior {
    private static final Logger logger = LoggerFactory.getLogger(MuteQuack.class);

    @Override
    public void quack() {
        logger.debug("Do nothing");
    }
}
