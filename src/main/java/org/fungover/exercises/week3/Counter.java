package org.fungover.exercises.week3;

public class Counter {
    private int counter;

    private static int objectCount;

    public Counter() {
        objectCount++;
    }

    public void increase() {
        counter++;
    }

    public void decrease() {
        counter--;
    }

    public int value() {
        return counter;
    }

    public int getObjectCount() {
        return objectCount;
    }

    public void print() {
        System.out.println("Count is: " + counter);
        System.out.println("Object count: " + objectCount);
    }

    static void main() {
        Counter counter = new Counter();
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        doSomeCounting(counter);
        System.out.println(counter.value());
        counter2.print();
    }

    static void doSomeCounting(Counter counter) {
        counter.increase();
        counter.increase();
    }
}
