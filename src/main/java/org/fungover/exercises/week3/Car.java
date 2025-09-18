package org.fungover.exercises.week3;

public class Car {
    private String model;
    private int price;
    private String color;

    public Car() {
    }

    public Car(String model, int price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public Car(String model, int price) {
        this.color = "white";
        this.price = price;
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
