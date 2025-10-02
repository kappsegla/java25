package org.fungover.exercises.week5.vehicles;

public class SailBoat extends Boat {

    public SailBoat(String m) {
        super(m);
    }

    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med segelbåt till: " + destination);
    }
}
