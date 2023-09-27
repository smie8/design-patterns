package com.designpatterns.command;

import com.designpatterns.command.commands.FanOffCommand;
import com.designpatterns.command.commands.FanOnCommand;
import com.designpatterns.command.commands.FanSpeedHighCommand;
import com.designpatterns.command.commands.FanSpeedLowCommand;
import com.designpatterns.command.commands.FanSpeedMediumCommand;
import com.designpatterns.command.commands.GarageDoorDownCommand;
import com.designpatterns.command.commands.GarageDoorUpCommand;
import com.designpatterns.command.commands.LightOffCommand;
import com.designpatterns.command.commands.LightOnCommand;
import com.designpatterns.command.commands.MacroCommand;
import com.designpatterns.command.commands.StereoOffWithCDCommand;
import com.designpatterns.command.commands.StereoOnWithCDCommand;
import com.designpatterns.command.commands.StereoVolumeDownCommand;
import com.designpatterns.command.commands.StereoVolumeUpCommand;
import com.designpatterns.command.machines.Fan;
import com.designpatterns.command.machines.GarageDoor;
import com.designpatterns.command.machines.Light;
import com.designpatterns.command.machines.Stereo;
import com.designpatterns.command.remotecontrol.RemoteControl;

import java.util.List;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(10);

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();
        GarageDoor garageDoor = new GarageDoor();
        Fan workshopFan = new Fan("Workshop");

        // Instantiate commands
        LightOnCommand bedroomLightOn = new LightOnCommand(bedroomLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedroomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);
        StereoVolumeUpCommand stereoVolumeUp = new StereoVolumeUpCommand(stereo);
        StereoVolumeDownCommand stereoVolumeDown = new StereoVolumeDownCommand(stereo);
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        FanOnCommand workshopFanOn = new FanOnCommand(workshopFan);
        FanOffCommand workshopFanOff = new FanOffCommand(workshopFan);
        FanSpeedLowCommand workshopFanSpeedLow = new FanSpeedLowCommand(workshopFan);
        FanSpeedMediumCommand workshopFanSpeedMedium = new FanSpeedMediumCommand(workshopFan);
        FanSpeedHighCommand workshopFanSpeedHigh = new FanSpeedHighCommand(workshopFan);
        MacroCommand lightsOn = new MacroCommand(List.of(bedroomLightOn, kitchenLightOn));
        MacroCommand lightsOff = new MacroCommand(List.of(bedroomLightOff, kitchenLightOff));

        // Bind commands to remote control slots
        remoteControl.setCommand(0, bedroomLightOn, bedroomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOffWithCD);
        remoteControl.setCommand(3, stereoVolumeUp, stereoVolumeDown);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(5, workshopFanOn, workshopFanOff);
        remoteControl.setCommand(6, workshopFanSpeedLow, workshopFanOff);
        remoteControl.setCommand(7, workshopFanSpeedMedium, workshopFanOff);
        remoteControl.setCommand(8, workshopFanSpeedHigh, workshopFanOff);
        remoteControl.setCommand(9, lightsOn, lightsOff);

        // Test remote control
        System.out.println(remoteControl);
        System.out.printf("\n");
        // Bedroom Light
        remoteControl.onButtonWasPushed(0); // Bedroom light on
        remoteControl.offButtonWasPushed(0); // Bedroom light off
        remoteControl.undoButtonWasPushed(); // Undo off (= turn light on)
        System.out.printf("\n");

        // Kitchen Light
        remoteControl.onButtonWasPushed(1); // Kitchen light on
        remoteControl.undoButtonWasPushed(); // Undo on (= turn light off)
        remoteControl.onButtonWasPushed(1); // Kitchen light on
        remoteControl.offButtonWasPushed(1); // Kitchen light off
        System.out.printf("\n");

        // Stereo
        remoteControl.onButtonWasPushed(2); // Stereo on
        remoteControl.offButtonWasPushed(2); // Stereo off
        remoteControl.onButtonWasPushed(2); // Stereo on
        remoteControl.onButtonWasPushed(3); // Volume up
        remoteControl.onButtonWasPushed(3); // Volume up
        remoteControl.onButtonWasPushed(3); // Volume up
        remoteControl.offButtonWasPushed(3); // Volume down
        remoteControl.undoButtonWasPushed(); // Undo volume down (= volume up)
        remoteControl.offButtonWasPushed(2); // Stereo off
        System.out.printf("\n");

        // Garage Door
        remoteControl.onButtonWasPushed(4); // Garage door up
        remoteControl.offButtonWasPushed(4); // Garage door down
        System.out.printf("\n");

        // Workshop Fan
        remoteControl.onButtonWasPushed(5); // Workshop fan on
        remoteControl.offButtonWasPushed(5); // Workshop fan off
        remoteControl.onButtonWasPushed(5); // Workshop fan on
        remoteControl.onButtonWasPushed(6); // Workshop fan speed low
        remoteControl.onButtonWasPushed(8); // Workshop fan speed high
        remoteControl.undoButtonWasPushed(); // Undo high (= low)
        remoteControl.onButtonWasPushed(7); // Workshop fan speed medium
        remoteControl.offButtonWasPushed(5); // Workshop fan off
        System.out.printf("\n");

        // Lights macro
        remoteControl.onButtonWasPushed(9); // Lights on
        remoteControl.offButtonWasPushed(9); // Lights off
    }
}
