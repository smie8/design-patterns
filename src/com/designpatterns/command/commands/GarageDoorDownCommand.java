package com.designpatterns.command.commands;

import com.designpatterns.command.machines.GarageDoor;

public class GarageDoorDownCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
        garageDoor.lightOff();
        garageDoor.stop();
    }

    @Override
    public void undo() {
        garageDoor.up();
        garageDoor.lightOn();
        garageDoor.stop();
    }
}
