package org.fungover.oop4;

import java.util.ArrayList;
import java.util.List;

public class FatInterfaces {
    static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        //List<String> strings = List.of("Test");


        pause(10000);


        try {
            strings.add("Test");
            strings.get(1);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Index out of bounds");
        } catch (RuntimeException exception) {
            System.out.println("Can't use add");
        } finally {
            System.out.println("Finally is running");
        }
        System.out.println(strings.getFirst());

        example1(new String[]{"1", "2"});

        example2("1", "2", "3");

    }

    private static void pause(long milliseconds) {
        //Sleep for some time
        long t2 = milliseconds;
        do {
            long t = System.currentTimeMillis();
            try {
                Thread.sleep(t2);
            } catch (InterruptedException e) {
            } finally {
                t2 = t2 - (System.currentTimeMillis() - t);
            }
        } while (t2 > 0);
    }

    public static void example1(String[] values) {
        for (var s : values)
            System.out.println();
    }

    public static void example2(String s1, String... values) {
        System.out.println(values[0]);
    }
}
