package org.fungover.week3;

import java.util.Arrays;

public class LoopsAndArrays {

    public static void main(String[] args) {
        //Ask the user for values
        //Print the values
        int numberCount = Integer.parseInt(System.console().readLine("How many numbers do you have "));
        int[] values = new int[numberCount];

        for (int i = 0; i < 10; i++) {
            int value = Integer.parseInt(System.console().readLine("Enter a value "));
            values[i] = value;
        }

        System.out.println(Arrays.toString(values));
        //System.out.println("The values are " + value1 + ", " + value2 + ", " + value3);


    }
}
