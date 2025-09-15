package org.fungover.oop;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
        this.width = 10;
    }

    public Rectangle(int width, int height) {
        if (width <= 0 || height <= 0)
            throw new IllegalArgumentException("Values can't be 0 or less");
        if (width == height)
            throw new IllegalArgumentException("Width and height can't be same");
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
}
