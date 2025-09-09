package org.fungover.week3;

public class Methods {

    public static void main(String[] args) {

        System.out.println(add(1.0, 2));
        System.out.println(add(2));
    }
    //Överlagring/Overloading of methods
    //Multiple methods with the same name but different parameters
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static int add(int number){
        return number + number;
    }


}
