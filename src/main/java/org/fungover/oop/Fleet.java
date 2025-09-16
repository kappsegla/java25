package org.fungover.oop;

public class Fleet {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle(4, 50, 14.0f);
        Vehicle vehicle2 = new Vehicle(8, 72, 10.0f);
        Vehicle vehicle3 = new Vehicle(vehicle2);

        System.out.println(vehicle1);
        System.out.println("Range: " + vehicle1.range());
        System.out.println(vehicle2);
        System.out.println("Range: " + vehicle2.range());
    }
}
