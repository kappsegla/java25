package org.fungover.exercises.week1;

public class Exercise6 {

    public static void main(String[] args) {
        meanValue();
    }

    private static void meanValue() {
        String input = System.console().readLine("Ge mig ditt första tal ");
        String input2 = System.console().readLine("Ge mig ditt andra tal ");
        try {
//            if( Character.isDigit(input.charAt(0)))
//                System.out.println("input contains number");
            int tal1 = Integer.parseInt(input);
            int tal2 = Integer.parseInt(input2);
            double meanValue = (tal1 + tal2) / 2.0;
            System.out.println("Medelvärdet är " + meanValue);

            //Alternative use Math.max(tal1,tal2)
            if (tal1 > tal2) {
                System.out.println("Det Största talet är " + tal1);
            } else {
                System.out.println("Det Största talet är " + tal2);
            }

        } catch (NumberFormatException e) {
            System.out.println("That is not a valid integer");
        }
    }
}
