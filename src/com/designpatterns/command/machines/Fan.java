package com.designpatterns.command.machines;

public class Fan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private int speed;
    String location;

    public Fan(String location) {
        this.location = location;
    }

        public void on() {
            this.speed = MEDIUM;
            System.out.println(location + "fan is on (medium speed)");
        }

        public void off() {
            this.speed = OFF;
            System.out.println(location + "fan is off");
        }

        public void setSpeedHigh() {
            this.speed = HIGH;
            System.out.println(location + "fan is on (high speed)");
        }

        public void setSpeedMedium() {
            this.speed = MEDIUM;
            System.out.println(location + "fan is on (medium speed)");
        }

        public void setSpeedLow() {
            this.speed = LOW;
            System.out.println(location + "fan is on (low speed)");
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int previousSpeed) {
            switch (previousSpeed) {
                case Fan.HIGH:
                    setSpeedHigh();
                    break;
                case Fan.MEDIUM:
                    setSpeedMedium();
                    break;
                case Fan.LOW:
                    setSpeedLow();
                    break;
                case Fan.OFF:
                    off();
                    break;
                default:
                    break;
        }
    }
}
