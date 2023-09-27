package com.designpatterns.command.commands;

import com.designpatterns.command.machines.Fan;

public class FanSpeedLowCommand implements Command {

    private Fan fan;
    private int previousSpeed;

    public FanSpeedLowCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.setSpeedLow();
    }

    @Override
    public void undo() {
        fan.setSpeed(previousSpeed);
    }
}
