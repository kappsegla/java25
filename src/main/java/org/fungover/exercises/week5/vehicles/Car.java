package org.fungover.exercises.week5.vehicles;

public class Car extends Vehicle {

    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med bil till: " + destination);
    }
}
