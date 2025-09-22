package org.fungover.oop2;

import org.fungover.exercises.week3.Counter;

public class ScoreBoard {
    private Counter player1;
    private Counter player2;

    public ScoreBoard() {
        player1 = new Counter();
        player2 = new Counter();
    }

    public void increasePlayer1Score() {
        player1.increase();
    }

    public void increasePlayer2Score() {
        player2.increase();
    }

    public int player1Score() {
        return player1.value();
    }

    public int player2Score() {
        return player2.value();
    }
}
