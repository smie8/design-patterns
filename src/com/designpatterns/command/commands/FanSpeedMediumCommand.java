package com.designpatterns.command.commands;

import com.designpatterns.command.machines.Fan;

public class FanSpeedMediumCommand implements Command {

    private Fan fan;
    private int previousSpeed;

    public FanSpeedMediumCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.setSpeedMedium();
    }

    @Override
    public void undo() {
        fan.setSpeed(previousSpeed);
    }
}
