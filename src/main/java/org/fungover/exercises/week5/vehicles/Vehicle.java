package org.fungover.exercises.week5.vehicles;

public abstract class Vehicle {
    protected final String manufacturer;

    public Vehicle(String m) {
        this.manufacturer = m;
    }

    public String manufacturer() {
        return manufacturer;
    }

    public abstract void goTo(String destination);

    public static Bicycle rentABike() {
        return new Bicycle("Trek");
    }

    static void main() {
        Vehicle vehicle = new SailBoat("X-Yachts");
        vehicle.goTo("Göteborg");

        Vehicle vehicle1 = rentABike();
        vehicle1.goTo("Kalmar");

        var vehicle2 = new Car("Volvo");
        vehicle2.goTo("Stockholm");
    }
}
