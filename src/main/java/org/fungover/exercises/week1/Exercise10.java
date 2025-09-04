package org.fungover.exercises.week1;

public class Exercise10 {

    public static void main(String[] args) {
        double number1, number2, number3;
        number1 = 50.5;
        number2 = 30.5;
        number3 = 200.5;

        double averageResult = calculateAverage(number1, number2, number3);

        if (averageResult > 90.0) {
            System.out.println("Mycket bra jobbat!");
        } else if (averageResult > 70.0 && averageResult < 90.0) {
            System.out.println("Bra jobbat.");
        } else {
            System.out.println("Öva lite mer.");
        }
    }

    static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}


