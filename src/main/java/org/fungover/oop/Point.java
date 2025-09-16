package org.fungover.oop;

import java.util.Objects;

public class Point {
    private double x;
    private double y;

    public static int pointCount = 0;

    public Point(double x, double y) {
        pointCount++;
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        pointCount++;
        this.x = other.x;
        this.y = other.y;
    }

    public Point() {
        pointCount++;
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point other) {
        double a = this.y - other.y;
        double b = this.x - other.x;
        return Math.sqrt(a * a + b * b);
    }

    public static double distanceBetween(Point point1, Point point2) {
        double a = point1.y - point2.y;
        double b = point1.x - point2.x;
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point point)) return false;
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
