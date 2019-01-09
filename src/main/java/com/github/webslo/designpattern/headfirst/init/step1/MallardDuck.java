package com.github.webslo.designpattern.headfirst.init.step1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-09 21:45
 * @description
 */
public class MallardDuck extends Duck {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void display() {
        logger.debug("绿头鸭子");
    }
}
