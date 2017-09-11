package com.company;

/**
 *
 */
public class Bicycle extends Vehicle implements Operation{
    private boolean eletricBike = false;


    public Bicycle(boolean engineon,String make, String model,   int gear, boolean eletricBike) {
        super(engineon, make, model, gear);
        this.eletricBike = eletricBike;
    }

    public boolean isEletricBike() {
        return eletricBike;
    }

    public void setEletricBike(boolean eletricBike) {
        this.eletricBike = eletricBike;
    }

    @Override
    public boolean isEngineOn() {
        if (isEletricBike() == true) {

            return super.isEngineOn();
        }
        return false;
    }

    @Override
    public void setEngineOn(boolean engineOn) {
        if (isEletricBike() == true) {
            super.setEngineOn(engineOn);
            System.out.println("engine is now set to " + engineOn);
        } else {
            System.out.println("The bike is not set to electric");
        }

    }

//    @Override
//    public void setEngineon(boolean engine) {
//        if (isEletricBike() == true) {
//            this.engine = engine;
//            System.out.println("engine is now set to " + engine);
//        } else {
//            System.out.println("The bike is not set to electric");
//        }
//    }

    @Override
    public boolean startVehicle() {
        if (isEletricBike() == true) {
//            setEletricBike(true);
            setEngineOn(true);
            System.out.println("Starting Bicycle motor is now on... Gear is " + getGear()+ " and engine is " + isEngineOn());
            return true;
        } else {
            System.out.println("Bicycle is not electric.. Just stride to move ");
            return false;
        }
    }

    @Override
    public boolean changeGear(int gears) {
        if (isEletricBike() == true) {
            if ((gears >= -1 || gears < 6) && getGear() != gears && isEngineOn() == true) {
                setGear(gears);
                System.out.println("Now on gear " + gears);
                return true;
            } else {
                System.out.println("Gear is already on " + getGear());
                return false;
            }
        } else {
            if ((gears >= -1 || gears < 6) && getGear() != gears) {
                setGear(gears);
                System.out.println("Now on gear " + gears);
                return true;
            } else {
                System.out.println("Gear is already on " + getGear());
                return false;
            }
        }
    }

    @Override
    public boolean moveVehicle() {
        if (isEletricBike() == true) {
            if ((getGear() > 0 && getGear() < 6) && isEngineOn() == true) {
                System.out.println(getMake() + " moving on gear " + getGear() + " at " + getGear() * 10 + " MPH.. this is an ebike");
                return true;
            } else if (getGear() == -1) {
                System.out.println("Bicycle moving in reverse... this is an ebike");
                return true;
            } else {
                System.out.println("Bicycle is not moving... check if you have started the Bicycle or if the gear is right this is an ebike.");
                return false;
            }
        } else {
            if ((getGear() > 0 && getGear() < 6)) {
                System.out.println(getMake() + " moving on gear " + getGear() + " at " + getGear() * 10 + " MPH.. this is not an ebike");
                return true;
            } else if (getGear() == -1) {
                System.out.println("Bicycle moving in reverse... this is not an ebike");
                return true;
            } else {
                System.out.println("Bicycle is not moving... check if you have started the Bicycle or if the gear is right. this is not an ebike");
                return false;
            }
        }
    }

    @Override
    public boolean turnOffVehicle() {
        if (isEletricBike() == true) {
            if (getGear() == 0 && isEngineOn() == true) {
                setEngineOn(false);
                System.out.println("Turning off electric bike..");
                System.out.println("electric bicycle turned off.");
                return true;
            } else {
                System.out.println("Make sure your turn gear to 0 and then turn off...");
                return false;
            }


        }
        System.out.println("Your bicycle is not an ebike... Just lock it.");
        return false;

    }
}




