package org.fungover.exercises.week1;

public class Exercise9 {
    public static void main(String[] args) {
        char grade = 'C';
        switch (grade) {
            case 'A' -> System.out.println("Utmärkt!");
            case 'B' -> System.out.println("Bra jobbat!");
            case 'C', 'D' -> System.out.println("Godkänt.");
            default -> System.out.println("Underkänt.");
        }
    }
}
