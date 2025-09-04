package org.fungover.exercises.week1;

import java.text.NumberFormat;
import java.util.Locale;

public class Exercise4 {
    public static void main(String[] args) {
        double height = 4.1;
        double width = 3.0;
        double area = height * width;
        //Make sure to use sv_SE as the locale
        NumberFormat formatter = NumberFormat.getInstance(Locale.of("sv","SE"));
        System.out.println("The area of the rectangle is " + formatter.format(area));
    }
}
