package org.fungover;

public class Main {
    //My first Java program 🌶️🌶️
    public static void main(String[] args) {
        int x = 10;
        String input = System.console().readLine("Enter a number: ");
        int divider = Integer.parseInt(input);
        try {
            int y = x / divider;
            System.out.println(y);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }
    }

    public static void test() {

    }

    public static void record() {

    }
}
