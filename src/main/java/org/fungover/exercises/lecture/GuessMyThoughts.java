package org.fungover.exercises.lecture;

import java.util.Random;

public class GuessMyThoughts {
    public static void main(String[] args) {

        int startGuess = 1;
        int endGuess = 100;
        Random random = new Random();
        boolean notDone = true;

        while (notDone) {
            int guess = random.nextInt(startGuess, endGuess + 1);
            System.out.println("You are thinking of " + guess);
            String response = System.console().readLine().trim();
            switch (response) {
                case ">":
                    startGuess = guess + 1;
                    break;
                case "<":
                    endGuess = guess - 1;
                    break;
                case "=":
                    System.out.println("I knew it!!!!");
                    notDone = false;
                    break;
            }
        }
    }

    //Optimal solution dividing remaining numbers in 2
    static int test(int think) {
        int lowNumber = 0;
        int highNumber = 101;
        int gissning = (highNumber - lowNumber) / 2;
        int antalGissningar = 1;

        System.out.println("Secret number: " + think);
        System.out.println("Första gissning: " + gissning);

        while (true) {
            if (gissning > think) {
                antalGissningar++;
                highNumber = gissning;
                gissning = gissning - ((highNumber - lowNumber) / 2);
                System.out.println("Gissning: " + gissning);
            } else if (gissning < think) {
                antalGissningar++;
                lowNumber = gissning;
                gissning = gissning + ((highNumber - lowNumber) / 2);
                System.out.println("Gissning: " + gissning);
            } else {
                System.out.println(gissning + " är rätt! Datorn använde " + antalGissningar + " gissningar.");
                break;
            }
        }
        return gissning;
    }
}


