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
        System.out.println(Arrays.toString(values));

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

        //The biggest number we can make by adding two values from the array
        int biggestValue = 0;
        int number1 = 0;
        int number2 = 0;

        for (int i = 0; i < values.length-1; i++) {
            for (int j = i+1; j < values.length; j++) {
                int sum = values[i] +  values[j];
                if( sum > biggestValue ) {
                    biggestValue = sum;
                    number1 = values[i];
                    number2 = values[j];
                }
            }
        }

        System.out.println("The biggest sum of 2 values: " + biggestValue);
        System.out.println("By adding " + number1 + " and " + number2);

        
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
