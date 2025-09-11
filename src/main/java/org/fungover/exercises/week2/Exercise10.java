package org.fungover.exercises.week2;

public class Exercise10 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 8, 21, 3};
        analyzeIntArray(numbers);
    }

    private static void analyzeIntArray(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            if (number < min) min = number;
            else if (number > max) max = number;
        }
        System.out.printf("""
                Summan är     : %d
                Lägsta nummer : %d
                Högsta nummer : %d
                """, sum, min, max);
    }
}

