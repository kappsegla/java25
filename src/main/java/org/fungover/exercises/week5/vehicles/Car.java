package org.fungover.exercises.week5.vehicles;

public class Car extends Vehicle {

    public Car(Manufacturer m) {
        super(m);
    }

    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med bil till: " + destination);
    }
}
