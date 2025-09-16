package org.fungover.oop;

public class ShapeLibrary {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(1, 2);
        Rectangle rect2 = new Rectangle(3, 2);
        Rectangle rect3 = new Rectangle(4, 5);
        Rectangle rect4 = new Rectangle(1, 2);

        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = rect1;
        rectangles[1] = rect2;
        rectangles[2] = rect3;
        rectangles[3] = rect4;

//        for (int i = 0; i < rectangles.length; i++) {
//            Rectangle rect = rectangles[i];
//        }
        if (rect1.equals(rect4))
            System.out.println("Same same but different");


        for (Rectangle rect : rectangles) {
            //String s = rect.toString();
            //System.out.println(s);
            System.out.println(rect);
            System.out.println("Width: " + rect.getWidth() + " , Height: " + rect.getHeight());
        }

    }
}
