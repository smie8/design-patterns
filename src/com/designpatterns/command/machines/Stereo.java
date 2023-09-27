package com.designpatterns.command.machines;

public class Stereo {

    private int volume;

    public Stereo() {
        this.volume = 6; // default volume
    }

    public void on() {
        System.out.println("stereo is on");
    }

    public void off() {
        System.out.println("stereo is off");
    }

    public void setCDInput() {
        System.out.println("stereo is set for CD input");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("stereo volume is set to " + volume);
    }

    public int getVolume() {
        return volume;
    }
}
