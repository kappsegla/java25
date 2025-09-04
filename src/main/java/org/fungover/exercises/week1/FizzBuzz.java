package org.fungover.exercises.week1;

import java.util.stream.Stream;

public class FizzBuzz {
    public static void main(String[] args) {
        Stream.iterate(1,i-> i = i+1)
                .limit(20)
                .forEach(FizzBuzz::fizzOrBuzz);
    }

    //Dividable by 3 and 5 -> fizzbuzz
    //Dividable by 3 -> fizz
    //Dividable by 5 -> buzz
    //Print the number for the rest
    private static void fizzOrBuzz(Integer number) {
        boolean fizz = number % 3 == 0;
        boolean buzz = number % 5 == 0;
        if (fizz && buzz) {
            System.out.println("FizzBuzz");
        } else if (fizz) {
            System.out.println("Fizz");
        } else if (buzz) {
            System.out.println("Buzz");
        }else {
            System.out.println(number);
        }
    }
}
