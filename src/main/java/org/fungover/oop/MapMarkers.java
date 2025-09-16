package org.fungover.oop;

public class MapMarkers {

    public static void main(String[] args) {

        Point point = new Point();
        Point point1 = new Point(3.0, 4.0);

        System.out.println(point.distanceTo(point1));
    }
}
