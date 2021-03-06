package com.github.webslo.designpattern.headfirst.chapter2_observer.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 19:00
 * @description
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();
}
