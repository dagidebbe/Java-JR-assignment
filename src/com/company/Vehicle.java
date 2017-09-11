package com.company;

/**
 *
 */
abstract public class Vehicle  implements Operation{
    private boolean engineOn;
    private String make;
    private String model;

    private int gear = 0;

    public Vehicle(boolean engineOn, String make, String model,   int gear) {
        this.engineOn = engineOn;
        this.make = make;
        this.model = model;
        this.gear = gear;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        if (isEngineOn() == engineOn) {
            System.out.println("Engine is already " + engineOn);
        } else {
            this.engineOn = engineOn;
        }
    }


    public String getMake() {
        return make;
    }
    public int getGear() {
        return gear;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public boolean startVehicle() {
        if (!isEngineOn()) {
            setEngineOn(true);
            System.out.println("Starting Vehicle...");
            return true;
        } else {
            System.out.println("Vehicle is "+isEngineOn());
            return false;
        }
    }

    public boolean changeGear(int gears) {
        if ((gears > 0 || gears < 6) && getGear() != gears && isEngineOn()) {
            setGear(gears);
            System.out.println("Now on gear " + gears);
            return true;
        } else {
            System.out.println("Please check your engine or gears");
            return false;
        }
    }

    public boolean moveVehicle() {
        if ((getGear() > 0 && getGear() < 6) && isEngineOn()) {
            System.out.println(getMake() + " moving on gear " + getGear() + " at " + getGear() * 20 + " MPH..");
            return true;
        } else if (getGear() == -1 && isEngineOn()) {
            System.out.println("Car moving in reverse...");
            return true;
        } else {
            System.out.println("Car is not moving... check if you have started the car or if the gear is right.");
            return false;
        }

    }


    public boolean turnOffVehicle(){
        if(getGear() == 0 && isEngineOn()) {
            setEngineOn(false);
            System.out.println("Turning off vehicle..");
            System.out.println("Vehicle turned off.");
            return true;

        } else {
            System.out.println("Make sure your turn gear to 0 and then turn off...");
            return false;


        }
    }
}
