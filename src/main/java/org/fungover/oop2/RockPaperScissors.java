package org.fungover.oop2;

public class RockPaperScissors {
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;

    static void main() {
        //Input av human choice
        String input = IO.readln();
        int playerChoice =
                switch (input.trim().toLowerCase()) {
                    case "rock", "r" -> ROCK;
                    case "paper", "p" -> PAPER;
                    case "scissors", "s" -> SCISSORS;
                    default -> throw new IllegalArgumentException();
                };

        //Datorns val
        int computerChoice;
        double rand = Math.random();
        if (rand < 0.33) {
            computerChoice = ROCK;
        } else if (rand < 0.66) {
            computerChoice = PAPER;
        } else
            computerChoice = SCISSORS;

        //Kolla vinnare
        if (computerChoice == playerChoice) {
            //Draw
        } else if (computerChoice == ROCK && playerChoice == SCISSORS) {
            //Computer wins
        } else if (computerChoice == PAPER && playerChoice == ROCK) {
            //Computer wins
        } else if (computerChoice == SCISSORS && playerChoice == PAPER) {
            //Computer wins
        } else {
            //Player wins
        }
        //Ge vinnaren poäng
        //Flera rundor


    }
}
