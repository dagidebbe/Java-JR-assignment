package com.company;

import java.util.ArrayList;

public class Main  {

    public static void main(String[] args) {
	// write your code here
//        Automobile v = new Automobile(true,"ha", "he",4, 4);
//        Bicycle b = new Bicycle(true, "Stride", "concave", 2, true);
//        Plane p = new Plane(true,"Boeing", "767", 0);


//        p.startVehicle();
//        p.changeGear(5);
//        p.moveVehicle();
//        p.takeOff();
//        p.turnOffVehicle();
//        p.land();
//        p.changeGear(0);
//        p.turnOffVehicle();
//        System.out.println("=====================================");
//
//        System.out.println(v.getGear());
//        b.startVehicle( );
//        b.changeGear(2);
//        b.moveVehicle();
//        b.changeGear(0);
//        b.turnOffVehicle();
//
//        b.moveVehicle();
//
//        b.startVehicle();
//
//        b.changeGear(-1);
//
//        b.moveVehicle();
//        b.changeGear(3);
//        b.moveVehicle();
//
//        b.changeGear(0);
//        b.turnOffVehicle();
//
//        System.out.println("=====================================");
//
//
//
//                System.out.println(v.getGear());
//        v.startVehicle( );
//        v.changeGear(2);
//        v.changeGear(0);
////        v.turnOffVehicle();
//
//        v.moveVehicle();
//
//        v.changeGear(-1);
//
//        v.moveVehicle();
//
//        v.changeGear(0);
//        v.turnOffVehicle();
//
//        System.out.println("=====================================");

        ArrayList<Vehicle> v = new ArrayList<Vehicle>();
        v.add(new Automobile(true,"ha", "he",4, 4));
        v.add(new Bicycle(true, "Stride", "concave", 2, true));
        v.add(new Plane(true,"Boeing", "767", 0));

        for(int i = 0; i < v.size(); i++){
            v.get(i).startVehicle();
            v.get(i).changeGear(1);
            v.get(i).moveVehicle();
            v.get(i).changeGear(0);
            v.get(i).turnOffVehicle();
            System.out.println("===========================");
        }


    }


}
