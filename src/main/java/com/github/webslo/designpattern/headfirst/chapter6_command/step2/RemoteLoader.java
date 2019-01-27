package com.github.webslo.designpattern.headfirst.chapter6_command.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 17:54
 * @description
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        remoteControl.setCommand(0, new NoCommand(), lightOffCommand);
        remoteControl.setCommand(1, stereoOnWithCDCommand, new NoCommand());

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
    }
}
