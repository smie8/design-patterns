package com.designpatterns.command.remotecontrol;

import com.designpatterns.command.commands.Command;
import com.designpatterns.command.commands.NoCommand;

public class RemoteControl {

    Command[] onCommandButtons; // This array represents the on buttons of the remote control
    Command[] offCommandButtons; // This array represents the off buttons of the remote control
    Command undoCommand; // This variable represents the undo button of the remote control. Sadly we can only undo one command

    public RemoteControl(int numberOfSlots) {
        onCommandButtons = new Command[numberOfSlots];
        offCommandButtons = new Command[numberOfSlots];

        Command noCommand = new NoCommand();

        for (int i = 0; i < numberOfSlots; i++) {
            onCommandButtons[i] = noCommand;
            offCommandButtons[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommandButtons[slot] = onCommand;
        offCommandButtons[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        // Null check is not necessary because we have a NoCommand object in each slot of the array
        onCommandButtons[slot].execute();
        // We save the command for undoing
        undoCommand = onCommandButtons[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommandButtons[slot].execute();
        undoCommand = offCommandButtons[slot];
    }

    public void undoButtonWasPushed() {
        System.out.println("-- Undo button was pushed --");
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommandButtons.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommandButtons[i].getClass().getName() + "    " + offCommandButtons[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
