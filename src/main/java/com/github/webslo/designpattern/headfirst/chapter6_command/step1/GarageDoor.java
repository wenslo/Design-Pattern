package com.github.webslo.designpattern.headfirst.chapter6_command.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 17:33
 * @description
 */
public class GarageDoor {
    public void up() {
        System.out.println("Garage door up");
    }

    public void down() {
        System.out.println("Garage down");
    }

    public void stop() {
        System.out.println("Garage stop");
    }

    public void lightOn() {
        System.out.println("Garage light on");
    }

    public void lightOff() {
        System.out.println("Garage light off");
    }

}
