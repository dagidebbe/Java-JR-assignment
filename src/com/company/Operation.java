package com.company;

/**
 *
 */
public interface Operation {
    boolean engineon = false;
    String make = "";
    String model = "";
    int wheel = 4;
    int gear = 0;

    boolean startVehicle();
    boolean changeGear(int gears);
    boolean turnOffVehicle();
    boolean moveVehicle();




}
