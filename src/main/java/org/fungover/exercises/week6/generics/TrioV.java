package org.fungover.exercises.week6.generics;

import org.fungover.exercises.week5.vehicles.Bicycle;
import org.fungover.exercises.week5.vehicles.Boat;
import org.fungover.exercises.week5.vehicles.Car;
import org.fungover.exercises.week5.vehicles.Vehicle;

public class TrioV<T extends Vehicle, U extends Vehicle, V extends Vehicle> {
    public T vehicle1;
    public U vehicle2;
    public V vehicle3;

    static void main() {
        TrioV<Car, Boat, Bicycle> myVehicleCollection;
    }

}
