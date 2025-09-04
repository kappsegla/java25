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
        switch (grade) {
            case 'A':
                System.out.println("Utmärkt!");
                break;
            case 'B':
                System.out.println("Bra jobbat!");
                break;
            case 'C':
            case 'D':
                System.out.println("Godkänt.");
                break;
            default:
                System.out.println("Underkänt.");
                break;
        }
        if (grade == 'A') {
            System.out.println("Utmärkt!");
        } else if (grade == 'B') {
            System.out.println("Bra jobbat!");
        } else if (grade == 'C' || grade == 'D') {
            System.out.println("Godkänt.");
        } else {
            System.out.println("Underkänt.");
        }
    }
}
