package org.fungover.exercises.week1;

public class Exercise11 {
    public static void main(String[] args) {
        int a = 3;
        if( a > 1 )
            System.out.println("a > 1 (första)");
        a--;
        if( a > 1 ) {
            System.out.println("a > 1 (andra)");
        }
        else {
            System.out.println("a <= 1");
        }

    }
}
