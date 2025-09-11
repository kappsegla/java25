package org.fungover.exercises.week2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        boolean stop = false;
        String output = "";
        while (!stop) {
            String input = System.console().readLine("Lägg till ord i en sträng, avsluta med tom input eller .");
            if (input.equals(".") || input.isEmpty()) { //input.matches(".")?
                stop = true;
            } else {
                output += (input + " ");
                System.out.println(output);
            }
        }
        //Adding strings together wastes memory a bit since strings are immutable.
        //A better approach is to use a StringBuilder which is a mutable string.
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        while (true) {
            System.out.println(" Please enter your word: ");
            String input = sc.nextLine();
            result.append(input);
            if (!result.isEmpty()) {
                result.append(" ");
            }
            if (input.isEmpty() || input.equalsIgnoreCase(".")) {
                break;
            }
        }

        //Another solution

        String tal = System.console().readLine(" Enter a number: ");
        int input = Integer.parseInt(tal);
        while (input > 2) {
            if (input % 2 == 0) {
                input = input / 2;
                System.out.print(input + " ");
            } else {
                input = input * 3 + 1;
                System.out.print(input + " ");

            }
        }
    }
}
