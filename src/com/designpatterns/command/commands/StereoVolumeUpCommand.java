package com.designpatterns.command.commands;

import com.designpatterns.command.machines.Stereo;

public class StereoVolumeUpCommand implements Command {

    private Stereo stereo;

    public StereoVolumeUpCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        if (stereo.getVolume() < 11) {
            stereo.setVolume(stereo.getVolume() + 1);
        }
    }

    @Override
    public void undo() {
        if (stereo.getVolume() > 0) {
            stereo.setVolume(stereo.getVolume() - 1);
        }
    }
}
