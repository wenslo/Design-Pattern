package com.github.webslo.designpattern.headfirst.chapter6_command.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-27 17:41
 * @description
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            buffer.append("[slot").append(i).append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append("     ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        return null;
    }
}
