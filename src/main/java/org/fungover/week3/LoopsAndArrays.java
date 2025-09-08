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
        int maxValue = maxValue(values);
        System.out.println("The biggest number: " + maxValue);
        //Mean value of the numbers
        double result = average(values);
        System.out.println("Average value: " + result);
        
        System.out.println(Arrays.toString(values));
    }
    
    public static int maxValue(int[] values){
        int maxValue = values[0];
        for (int i = 1; i < values.length; i++) {
            maxValue = Math.max(maxValue, values[i]);
        }
        return maxValue;
    }

    public static double average(int[] values){
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        double result = ((double) sum) / values.length;
        return result;
    }
    
}
