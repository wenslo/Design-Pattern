package com.github.webslo.designpattern.headfirst.chapter2_observer.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 19:01
 * @description
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
