package org.fungover.exercises.week2;

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
    }
}
