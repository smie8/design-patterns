package com.designpatterns.command.commands;

import com.designpatterns.command.machines.Fan;

public class FanSpeedHighCommand implements Command {

    private Fan fan;
    private int previousSpeed;

    public FanSpeedHighCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.setSpeedHigh();
    }

    @Override
    public void undo() {
        fan.setSpeed(previousSpeed);
    }
}
