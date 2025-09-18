package org.fungover.exercises.week3distance;

import java.awt.*;

public class Car {
    private String make;
    private double price;
    private Color color;

    public Car(String make, double price, Color color) {
        this.make = make;
        this.price = price;
        this.color = color;
    }

    public Car() {
        this.make = "Unknown";
        this.price = 0.0;
        this.color = Color.WHITE;
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    public void setMake(String make) {
        if (make != null && !make.isEmpty())
            this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setColor(int r, int g, int b) {
        this.color = new Color(r, g, b);
    }

    public double halfPrice() {
        return this.price = this.price / 2;
    }

    static void main() {
        Car car = new Car("BMW", 750000, Color.WHITE);
        Car car2 = new Car();
        car.setPrice(700000);
        car.halfPrice();
        IO.println("New price:" + car.getPrice());
    }
}
