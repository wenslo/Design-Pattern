package com.github.webslo.designpattern.headfirst.chapter6_command.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 17:28
 * @description
 */
public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
