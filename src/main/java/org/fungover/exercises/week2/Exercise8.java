package org.fungover.exercises.week2;

import java.util.Random;
import java.util.Scanner;


public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the length of your array: ");
        int arrayLength = sc.nextInt();
        int[] randomArray = createRandomIntArray(arrayLength);
        printIntArray(randomArray);
    }

    private static int[] createRandomIntArray(int arrayLength) {
        Random rand = new Random();
        int[] randomArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
            randomArray[i] = rand.nextInt(100000);
        return randomArray;
    }

    private static void printIntArray(int[] intArray) {
        for (int number : intArray)
            System.out.print(number + " ");
    }

}
