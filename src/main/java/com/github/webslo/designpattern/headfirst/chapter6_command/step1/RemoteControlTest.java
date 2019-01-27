package com.github.webslo.designpattern.headfirst.chapter6_command.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 17:29
 * @description
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor door = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(door);


        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(doorOpenCommand);
        remote.buttonWasPressed();
    }
}
