package org.fungover.exercises.week5.vehicles;

public class Vehicle {
    //Domain language
    //Domain driven design DDD
    public void goTo(String destination) {
        System.out.println("Färdas till " + destination);
    }

    public static Bicycle rentABike() {
        return new Bicycle();
    }

    static void main() {
        Vehicle vehicle = new SailBoat();
        vehicle.goTo("Göteborg");

        Vehicle vehicle1 = rentABike();
        vehicle1.goTo("Kalmar");
    }
}
