package org.fungover.oop2;

public class Dice {
    private int[] dice = new int[5];

    /**
     * Store a die roll at index
     *
     * @param index Must be between 0-4 inclusive
     * @param value The die value to store.
     */
    public void addRoll(int index, int value) {
        dice[index] = value;
    }

    /**
     * Retrieve a stored die value
     *
     * @param index The index to retrieve
     * @return Stored valued for index
     */
    public int getRoll(int index) {
        if (index < 0 || index > dice.length - 1)
            throw new IllegalArgumentException("Index must be between 0 and 4 inclusive");
        return dice[index];
    }
}
