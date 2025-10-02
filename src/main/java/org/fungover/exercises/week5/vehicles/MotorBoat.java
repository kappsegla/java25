package org.fungover.exercises.week5.vehicles;

public class MotorBoat extends Boat {


    @Override
    public void goTo(String destination) {
        System.out.println("Motorbåtar hela vägen till " + destination);
    }
}
