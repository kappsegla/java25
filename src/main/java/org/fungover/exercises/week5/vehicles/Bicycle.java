package org.fungover.exercises.week5.vehicles;

public class Bicycle extends Vehicle {

    public Bicycle(Manufacturer m) {
        super(m);
    }

    @Override
    public void goTo(String d) {
        System.out.println("Cyklar till: " + d + " på en " + manufacturer);
    }
}
