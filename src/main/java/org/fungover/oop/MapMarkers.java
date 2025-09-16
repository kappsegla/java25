package org.fungover.oop;

public class MapMarkers {

    public static void main(String[] args) {

        Point point = new Point();
        Point point1 = new Point(3.0, 4.0);

        //Use an instance method to calculate distance
        //between point and point1
        System.out.println(point.distanceTo(point1));

        //Use a static method that belongs to the class
        //No this pointer available in the method
        System.out.println(Point.distanceBetween(point, point1));

        System.out.println("Number of Point objects created: " + Point.pointCount);

    }
}
