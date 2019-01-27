package com.github.webslo.designpattern.headfirst.chapter6_command.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 17:50
 * @description
 */
public class Stereo {
    private String mode;
    private int volume;

    public void on() {
        System.out.println("Stereo status is on model is " + mode + " volume is " + volume);

    }

    public void off() {
        System.out.println("Stereo status is off model is " + mode + " volume is " + volume);
    }

    public void setCd() {
        mode = "CD";

    }

    public void setDvd() {
        mode = "DVD";
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
