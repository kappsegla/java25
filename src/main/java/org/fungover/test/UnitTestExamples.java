package org.fungover.test;

import java.time.LocalTime;
import java.util.Objects;

public class UnitTestExamples {


    private String value;

    public static int add(int a, int b) {
        return a + b;
    }

    public static String greeting(LocalTime currentTime) {
        if (currentTime.isBefore(LocalTime.of(12, 0)))
            return "Good Morning";
        else
            return "Good Afternoon";
    }

    public void setValue(String input) {
        value = Objects.requireNonNull(input);
    }

    public String getValue() {
        return value;
    }


}
