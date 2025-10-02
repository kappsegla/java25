package org.fungover.exercises.week5.vehicles;

public class MotorBoat extends Boat {

    public MotorBoat(Manufacturer m) {
        super(m);
    }

    @Override
    public void goTo(String destination) {
        System.out.println("Motorbåtar hela vägen till " + destination);
    }
}
