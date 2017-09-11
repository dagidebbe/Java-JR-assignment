package com.company;

import javax.sound.midi.Track;

/**
 *
 */
public class Automobile extends Vehicle implements Operation {
    private int wheel = 4;




    public Automobile(boolean engineon,String make, String model,  int wheel, int gear) {
        super(engineon, make, model, gear);
        this.wheel = wheel;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}
