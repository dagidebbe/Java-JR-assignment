package com.company;

/**
 *
 */
public class Plane extends Vehicle implements Operation{

    public Plane(boolean engineon, String  make, String model, int gear) {
        super(engineon, make, model,  gear);
    }

    @Override
    public boolean startVehicle() {
        if (isEngineOn() == true) {
//            setEletricBike(true);
            setEngineOn(true);
            System.out.println("Starting Airplane motor is now on... Gear is " + getGear()+ " and engine is " + isEngineOn());
            return true;
        } else {
            System.out.println("Airplane is not electric.. Just stride to move ");
            return false;
        }
    }

    @Override
    public boolean changeGear(int gears) {
        if ((gears > 0 || gears < 6) && getGear() != gears && isEngineOn() == true && !takeOff()) {
            setGear(gears);
            System.out.println("Now on gear " + gears);
            return true;
        } else {
            System.out.println("Please check your engine or gears");
            return false;
        }
    }

    @Override
    public boolean moveVehicle() {
        if ((getGear() > 0 && getGear() < 6) && isEngineOn()) {
            System.out.println(getMake() + " moving on gear " + getGear() + " at " + getGear() * 20 + " MPH..");
            return true;
        } else if (getGear() == -1 && isEngineOn()== true) {
            System.out.println("Car moving in reverse...");
            return true;
        } else {
            System.out.println("Car is not moving... check if you have started the car or if the gear is right.");
            return false;
        }
    }

    public boolean takeOff() {
            if (moveVehicle()  && getGear() > 4) {
                System.out.println("Fasten your seatbelt, taking off...");
                return true;
            } else {
                System.out.println("You need speed or your're not in the right gear");
                return false;
            }
        }


    public boolean land() {
        if (takeOff()) {
            System.out.println("Fasten your seatbelt. Landing now");
            return true;
        } else {
            System.out.println("Can not take off");
            return false;
        }
    }

    @Override
    public boolean turnOffVehicle() {
        if(getGear() == 0 && isEngineOn()== true && takeOff()==false) {
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
