package com.github.webslo.designpattern.headfirst.chapter6_command.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 17:49
 * @description
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.setCd();
        stereo.setVolume(11);
        stereo.on();
    }
}
