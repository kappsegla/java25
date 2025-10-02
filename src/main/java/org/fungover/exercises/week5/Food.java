package org.fungover.exercises.week5;

public class Food {

    public void checkExpired() {
        System.out.println("Hasn't expired");
    }

    public void consume() {
        System.out.println("Eating some food");
    }


    static void main() {
        Food food = new Food();
        Milk milk = new Milk();
        Food food1 = new Milk();

        food.consume();
        food1.consume();
        milk.consume();
        food1.checkExpired();
        milk.checkExpired();

    }
}
