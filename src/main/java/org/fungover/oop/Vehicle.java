package org.fungover.oop;

import java.util.Objects;

public class Vehicle {
    private int passengerCount;
    private float fuelCapacity;
    private float kmPerLiter;

    public Vehicle(int passengerCount, float fuelCapacity, float kmPerLiter) {
        //Validation?
        this.passengerCount = passengerCount;
        this.fuelCapacity = fuelCapacity;
        this.kmPerLiter = kmPerLiter;
    }

    public Vehicle(Vehicle vehicle) {
        //Since this is code in the Vehicle class
        //We can access private fields directly
        this.passengerCount = vehicle.passengerCount;
        this.fuelCapacity = vehicle.fuelCapacity;
        this.kmPerLiter = vehicle.kmPerLiter;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public float getFuelCapacity() {
        return fuelCapacity;
    }

    public float getKmPerLiter() {
        return kmPerLiter;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount < 0)
            throw new IllegalArgumentException();
        this.passengerCount = passengerCount;
    }

    public double range() {
        return fuelCapacity * kmPerLiter;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "passengerCount=" + passengerCount +
                ", fuelCapacity=" + fuelCapacity +
                ", kmPerLiter=" + kmPerLiter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vehicle vehicle)) return false;
        return passengerCount == vehicle.passengerCount && Float.compare(fuelCapacity, vehicle.fuelCapacity) == 0 && Float.compare(kmPerLiter, vehicle.kmPerLiter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerCount, fuelCapacity, kmPerLiter);
    }
}
