package com.github.webslo.designpattern.headfirst.chapter6_command.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 17:40
 * @description
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Do nothing");
    }
}
