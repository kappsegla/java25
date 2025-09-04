package org.fungover.exercises.week1;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vad är ditt namn? ");
        String name = scanner.nextLine();
        System.out.println("Hej " + name + "!");

        //Alternative using System.console()
        greeting();
    }
    private static void greeting() {
        String input = System.console().readLine("Vad är ditt namn? ");
        System.out.println("Hej " + input + "!");
    }
}
