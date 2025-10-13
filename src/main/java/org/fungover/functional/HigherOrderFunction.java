package org.fungover.functional;

import static org.fungover.functional.HigherOrderFunction.Operation.ADD;
import static org.fungover.functional.HigherOrderFunction.Operation.MUL;

public class HigherOrderFunction {

    static void main(String[] args) {
        int sum = sum(1, 1);
        int product = mul(1, 1);
        System.out.println(operation(2, 2, ADD));
        System.out.println(operation(3, 3, MUL));
        //Alt1: Create a class that implements Action interface
        SumAction action = new SumAction();
        System.out.println(doSomething(2, 2, action));
        //Alt2: Create an implementation using anonymous class
        Action action1 = new Action() {
            @Override
            public int act(int a, int b) {
                System.out.println(this.getClass().getName());
                return a * b;
            }
        };
        System.out.println(doSomething(3, 3, action1));

        //Alt3: Use Lambda implementation for shorter and easier code
        Action action2 = (a, b) -> a * b;
        System.out.println(doSomething(3, 3, action2));

        doSomething(2, 3, (value1, value2) -> value1 / value2);
    }

    //Higher order function in java
    public static int doSomething(int a, int b, Action whatToDo) {
        return whatToDo.act(a, b);
    }

    @FunctionalInterface
    interface Action {
        int act(int a, int b);
    }

    static class SumAction implements Action {
        @Override
        public int act(int a, int b) {
            return a + b;
        }
    }


    private static int mul(int a, int b) {
        return a * b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int operation(int a, int b, Operation op) {
        return switch (op) {
            case ADD -> a + b;
            case MUL -> a * b;
            case SUB -> a - b;
        };
    }

    enum Operation {
        ADD, MUL, SUB
    }
}
