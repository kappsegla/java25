package org.fungover.exercises.week2;

import java.math.BigInteger;

public class Method6 {

    public static void main(String[] args) {
        System.out.println("Number | Prime");
        for (int i = 2; i <= 23; i++)
            if (isPrime(i)) System.out.printf("%6d | Yes\n", i);
            else System.out.printf("%6d | No\n", i);

        BigInteger bigInteger = BigInteger.valueOf(982451653);
        System.out.println(bigInteger.isProbablePrime(10));

    }

    public static boolean isPrime(int number) {
        if (number == 2)
            return true;
        if (number % 2 == 0)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0)
                return false;
        return true;
    }
}
