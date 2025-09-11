package org.fungover.exercises.week2;

public class Exercise3 {
    public static void main(String[] args) {
        for (int i = 20; i >= 2; i--) {
            if (i % 2 == 0)
                System.out.println(i);
        }
        for (int i = 20; i >= 2; i--) {
            int jämn = i % 2;
            if (jämn == 0) {
                System.out.print(i + " ");
            }
        }
        for (int i = 10; i > 0; i--) {
            System.out.print(i * 2 + "... ");
        }
    }
}
