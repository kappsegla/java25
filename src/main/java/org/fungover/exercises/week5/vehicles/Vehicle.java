package org.fungover.exercises.week5.vehicles;

public abstract class Vehicle {
    protected final String manufacturer;

    //DDD - Domain Driven Design
    //Manufacturer is a value object, has no identity
    public Vehicle(Manufacturer m) {
        this.manufacturer = m.manufacturer();
    }

    public String manufacturer() {
        return manufacturer;
    }

    public abstract void goTo(String destination);

    public static Bicycle rentABike() {
        return new Bicycle(Manufacturer.of("Trek"));
    }

    static void main() {
        Vehicle vehicle = new SailBoat(Manufacturer.of("X-Yachts"));
        vehicle.goTo("Göteborg");

        Vehicle vehicle1 = rentABike();
        vehicle1.goTo("Kalmar");

        var vehicle2 = new Car(Manufacturer.of("Volvo"));
        vehicle2.goTo("Stockholm");
    }
}

record Manufacturer(String manufacturer) {
    Manufacturer {
        if (manufacturer.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    //Factory method
    public static Manufacturer of(String manufacturer) {
        //Todo: Add check if we already have created an object for this manufacturer stored in list/set/map
        // and return same object in that case.
        return new Manufacturer(manufacturer);
    }
}
