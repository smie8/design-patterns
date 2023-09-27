package com.designpatterns.command.commands;

import com.designpatterns.command.machines.Stereo;

public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCDInput();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
