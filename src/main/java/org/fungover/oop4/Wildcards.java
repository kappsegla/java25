package org.fungover.oop4;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

    static void main() {
        List<String> strings = new ArrayList<>();
        strings.add("First");
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        printList(strings);
        printList(integers);
        System.out.println(getFirst(strings));
        System.out.println(getFirst(integers));
        var s = getFirst(strings);
        var i = getFirst(integers);
    }

    public static void printList(List<?> theList) {
        for (var e : theList)
            System.out.println(e);
    }

    public static <T> T getFirst(List<T> theList) {
        return theList.get(0);
    }



}
