package org.fungover.oop2;

public class Yatzy {
    static void main() {
        Dice dice = new Dice();

        dice.addRoll(0, 6);
        dice.addRoll(1, 1);

        System.out.println(dice.getRoll(0));

        String string = "";
        string.charAt(0);
    }
}
