package org.fungover.exercises.week3distance;

public class Counter {
    private int value;
    private static int createdCounters;

    //Static Constructor
    static {
        createdCounters = 0;
    }

    public Counter() {
        value = 0;
        createdCounters++;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    public int value() {
        return value;
    }

    public void print() {
        System.out.println("Counter value: " + value +
                " Number of counters created: " + createdCounters);
    }

    static void main() {
        Counter counter = new Counter();

        counter.increase();
        counter.increase();
        counter.decrease();
        System.out.println(counter.value());

        Counter count = new Counter();
        useCounter(count);
        System.out.println(count.value());

        counter.print();

    }

    static void useCounter(Counter counter) {
        counter.increase();
    }
}
