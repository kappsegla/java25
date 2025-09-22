package org.fungover.oop2;

public class RockPaperScissors {
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static final int MAX_SCORE = 3;

    private static final ScoreBoard scoreBoard = new ScoreBoard();

    static void main() {
        while (scoreBoard.player1Score() < MAX_SCORE &&
                scoreBoard.player2Score() < MAX_SCORE) {
            //Input av human choice
            int playerChoice;
            try {
                playerChoice = getPlayerChoice();
            } catch (IllegalArgumentException e) {
                continue;
            }
            //Datorns val
            int computerChoice = getComputerChoice();
            //Kolla vinnare
            checkWinner(computerChoice, playerChoice);
        }
    }

    private static void checkWinner(int computerChoice, int playerChoice) {
        printChoices(computerChoice, playerChoice);
        if (computerChoice == playerChoice) {
            //Draw
            printWinner(" It's a draw.");
        } else if (computerChoice == ROCK && playerChoice == SCISSORS) {
            //Computer wins
            scoreBoard.increasePlayer2Score();
            printWinner(" Computer wins.");
        } else if (computerChoice == PAPER && playerChoice == ROCK) {
            //Computer wins
            scoreBoard.increasePlayer2Score();
            printWinner(" Computer wins.");
        } else if (computerChoice == SCISSORS && playerChoice == PAPER) {
            //Computer wins
            scoreBoard.increasePlayer2Score();
            printWinner(" Computer wins.");
        } else {
            //Player wins
            scoreBoard.increasePlayer1Score();
            printWinner(" Player wins.");
        }
    }

    private static void printChoices(int computerChoice, int playerChoice) {
        System.out.print("Computer picks " + computerChoice + ", Player picks " + playerChoice);
    }

    private static void printWinner(String x) {
        System.out.println(x);
        System.out.println("Score: Computer " + scoreBoard.player2Score() + ", Player " + scoreBoard.player1Score());

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
