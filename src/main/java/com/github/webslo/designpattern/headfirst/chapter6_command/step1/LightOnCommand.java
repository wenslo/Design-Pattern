package com.github.webslo.designpattern.headfirst.chapter6_command.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 17:27
 * @description
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
