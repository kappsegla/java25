package org.fungover.exercises.week2;

public class Method5 {

    public static void main(String[] args) {
        String text = "Kalle";
        System.out.println(reversed(text));
    }

    public static String reversed(String text) {
        return new StringBuilder(text).reverse().toString();
    }

}
