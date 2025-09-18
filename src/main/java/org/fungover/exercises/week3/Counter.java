package org.fungover.exercises.week3;

public class Counter {
    private int counter;

    public void increase() {
        counter++;
    }

    public void decrease() {
        counter--;
    }

    public int value() {
        return counter;
    }

    static void main() {
        Counter counter = new Counter();
        doSomeCounting(counter);
        System.out.println(counter.value());
    }

    static void doSomeCounting(Counter counter) {
        counter.increase();
        counter.increase();
    }
}
