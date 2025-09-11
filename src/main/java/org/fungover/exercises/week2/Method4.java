package org.fungover.exercises.week2;

public class Method4 {

    public static void main(String[] args) {
        System.out.println(sum(1000));
    }

    public static int sum(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum = sum + i;
        }
//        while(input > 0){
//            sum += input;
//            input--;
//        }
        return sum;
    }
}
