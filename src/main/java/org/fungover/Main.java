package org.fungover;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int age = 20;
        byte catCount = -128;
        var catCount2 = 1L;
        String name = "Martin";
        String multiLineText = """
                Line 1
                Line 2
                """;
        //Here we add 10 to the string before printing it
        //Another line of comment
        System.out.println("Hello World!" + 10);
        /*
        Multiple comments about adding 10 to age
         */
        System.out.println(age + 10);
        System.out.println(30);
        System.out.printf("Hello %s! Your age is %d and you have %d cats.%n", name, age, catCount);
        System.out.println(Integer.toBinaryString(catCount));
        System.out.println(Integer.toBinaryString(-128));


        double weight = 5.0;
        float weight2 = 5.0f;
        BigDecimal bigDecimal = new BigDecimal("5.1");
        BigInteger bigInteger = new BigInteger("5");
    }

    public static void test() {

    }

    public static void record(){

    }
}
