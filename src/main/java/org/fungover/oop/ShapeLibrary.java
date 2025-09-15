package org.fungover.oop;

public class ShapeLibrary {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2);
        int width = rectangle.getWidth();
        System.out.println(width);

        Rectangle rect2 = new Rectangle(3, 4);
        System.out.println(rect2.getWidth());


    }
}
