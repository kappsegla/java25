package org.fungover.exercises.week2;

import java.util.Random;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;
        int number = 0;

        while (number != secret) {
            try {
                number = Integer.parseInt(System.console().readLine("Guess the secret number between 1 and 100: "));
                if (number < secret) {
                    System.out.println("The secret number is higher than your guess.");
                } else if (number > secret) {
                    System.out.println("The secret number is lower than your guess");
                } else
                    System.out.println("You guessed the secret number! c: it was " + secret);
            } catch (NumberFormatException e) {
                System.out.println("invalid input, type a number please.");
            }
        }
    }
}

class AnotherSolution {
    public static void main(String[] args) {
        // exercise 6
        int secret = 66;
        String input = System.console().readLine(" Enter your number between 1 and 100: ");
        int number = Integer.parseInt(input.trim());
        Scanner scan = new Scanner(System.in);
        // int giss = scan.nextInt();
        while (number != secret) {
            System.out.print(" Guss another: ");
            number = scan.nextInt();
            if (1 <= number && number <= 65) {
                System.out.print("your number is so lower the goal");
            }
            if (67 <= number && number <= 100) {
                System.out.print("your number is so greater than the goal");
            }
            if (number == secret) {
                System.out.print("you are winner");
            }
        }
    }
}