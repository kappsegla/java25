package org.fungover;

public class Main {
    //My first Java program 🌶️🌶️
    public static void main(String[] args) {
        int age = 18, stones = 100 ;
        checkVotingAgeAndWeight(age, stones);
    }

    private static void checkVotingAgeAndWeight(int age, int weight) {
        if (age >= 18)
        {
            System.out.println("You can vote");
            checkWeight(weight);
        }
        else
            System.out.println("you can’t vote") ;
    }

    public static void checkWeight(int weight) {
        if (weight >= 50)
            System.out.println("You are heavy");
        else
            System.out.println("You are not heavy") ;
    }

}