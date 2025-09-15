package org.fungover.exercises.lecture;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        //double num3 = Double.parseDouble(System.console().readLine());

        System.out.println("Choose an operator, +-*/%");
        char operator = scanner.next().trim().charAt(0);

        double result = switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            case '%' -> num1 % num2;
            default -> throw new IllegalStateException("Not supported operator");
        };
        System.out.println(num1 + String.valueOf(operator) + num2 + " = " + result);
        System.out.printf("%.2f %c %.2f = %.2f", num1, operator, num2, result);
    }
}
