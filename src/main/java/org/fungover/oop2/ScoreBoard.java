package org.fungover.oop2;

public class ScoreBoard {
    private int player1;
    private int player2;

    public void increasePlayer1Score() {
        player1++;
    }

    public void increasePlayer2Score() {
        player2++;
    }

    public int player1Score() {
        return player1;
    }

    public int player2Score() {
        return player2;
    }
}
