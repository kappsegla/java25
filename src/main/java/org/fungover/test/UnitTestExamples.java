package org.fungover.test;

import java.util.Objects;

public class UnitTestExamples {


    private String value;

    public static int add(int a, int b) {
        return a + b;
    }

    public static String greeting() {
        return "Good Morning";
    }

    public void setValue(String input) {
        value = Objects.requireNonNull(input);
    }

    public String getValue() {
        return value;
    }


}
