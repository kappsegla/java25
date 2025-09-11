package org.fungover.exercises.week2;

public class Ëxercise5 {
    public static void main(String[] args) {
        int i = 0;
        try {
            i = Integer.parseInt(System.console().readLine());
        } catch (NumberFormatException e) {
            System.out.println("invalid input");
        }
        while (i > 2) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i * 3 + 1;
            }
            System.out.println(i);
        }
    }
}
