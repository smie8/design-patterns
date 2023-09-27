package com.designpatterns.command.commands;

import com.designpatterns.command.machines.GarageDoor;

public class GarageDoorUpCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
        garageDoor.stop();
    }

    @Override
    public void undo() {
        garageDoor.down();
        garageDoor.lightOff();
        garageDoor.stop();
    }
}
