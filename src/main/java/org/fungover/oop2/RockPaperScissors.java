package org.fungover.oop2;

public class RockPaperScissors {
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;

    static void main() {
        //Input av human choice
        int playerChoice = getPlayerChoice();
        //Datorns val
        int computerChoice = getComputerChoice();
        //Kolla vinnare
        checkWinner(computerChoice, playerChoice);
        //Todo: Ge vinnaren poäng
        //Todo: Flera rundor
        //Todo: Snygga utskrifter
    }

    private static void checkWinner(int computerChoice, int playerChoice) {
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
    }

    private static int getComputerChoice() {
        int computerChoice;
        double rand = Math.random();
        if (rand < 0.33) {
            computerChoice = ROCK;
        } else if (rand < 0.66) {
            computerChoice = PAPER;
        } else
            computerChoice = SCISSORS;
        return computerChoice;
    }

    private static int getPlayerChoice() {
        String input = IO.readln("Your choice (r)ock,(p)aper,(s)cissors: ");
        int playerChoice =
                switch (input.trim().toLowerCase()) {
                    case "rock", "r" -> ROCK;
                    case "paper", "p" -> PAPER;
                    case "scissors", "s" -> SCISSORS;
                    default -> throw new IllegalArgumentException();
                };
        return playerChoice;
    }
}
