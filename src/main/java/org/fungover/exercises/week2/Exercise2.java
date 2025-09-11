package org.fungover.exercises.week2;

public class Exercise2 {
    public static void main(String[] args) {
        int number = 65536;
        while (number >= 2) {
            System.out.println(number);
            number = number >> 1;
        }

        /*
        int x = 65536;
        while (x > 2){
            System.out.print(x + " ");
            x = x / 2;
        }
        */

    }
}
