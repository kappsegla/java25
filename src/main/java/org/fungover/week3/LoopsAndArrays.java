package org.fungover.week3;

public class LoopsAndArrays {

    public static void main(String[] args) {

//        System.out.println("1 1 1 1 1");
//        System.out.println("2 2 2 2 2");
//        System.out.println("3 3 3 3 3");
//        System.out.println("4 4 4 4 4");
        int max = Integer.parseInt(System.console().readLine("Enter a max value"));
        for (int i = 1; i <= max; i++) {
            //Do something
            System.out.println(i + " " + i + " " + i + " " + i);
        }


    }
}
