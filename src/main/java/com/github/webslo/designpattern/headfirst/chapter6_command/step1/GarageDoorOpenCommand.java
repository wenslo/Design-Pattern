package com.github.webslo.designpattern.headfirst.chapter6_command.step1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 17:33
 * @description
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.garageDoor = door;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
    }
}
