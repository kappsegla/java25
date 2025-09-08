package org.fungover.week3;

import java.util.Arrays;

public class LoopsAndArrays {

    public static void main(String[] args) {
        //Ask the user for values
        //Print the values
        //Biggest number in the array
        //Mean value of the numbers
        //Biggest number we can make by adding two numbers from the array
        //Sorting
        //Extend array size?

        int numberCount = Integer.parseInt(System.console().readLine("How many numbers do you have "));
        int[] values = new int[numberCount];

        for (int i = 0; i < numberCount; i++) {
            int value = Integer.parseInt(System.console().readLine("Enter a value "));
            values[i] = value;
        }

        //Find the biggest number in the array
        int maxValue = values[0];
        for (int i = 1; i < values.length; i++) {
            maxValue = Math.max(maxValue, values[i]);
        }
        System.out.println("The biggest number: " + maxValue);


        System.out.println(Arrays.toString(values));
    }
}
