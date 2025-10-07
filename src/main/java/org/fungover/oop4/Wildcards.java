package org.fungover.oop4;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

    static void main() {
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        printList(strings);
        printList(integers);
    }

    public static void printList(List<?> theList) {
        for (var e : theList)
            System.out.println(e);
    }

}
