package org.fungover.oop4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Wildcards {

    static void main() {
        List<String> strings = new ArrayList<>();
        strings.add("First");
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        printList(strings);
        printList(integers);
        System.out.println(getFirst(strings));
        System.out.println(getFirst(integers));
        System.out.println(sum(integers));
        List<Double> dlist = new ArrayList<>();
        dlist.add(1.1);
        dlist.add(1.2);
        System.out.println(sum(dlist));
        dlist.sort(Comparator.naturalOrder());
    }

    public static <T extends Number> Number sum(List<T> theList) {
        Number t = 0;
        for (var i : theList)
            t = t.doubleValue() + i.doubleValue();
        return t;
    }

    public static void printList(List<?> theList) {
        for (var e : theList)
            System.out.println(e);
    }

    public static <T> T getFirst(List<T> theList) {
        return theList.get(0);
    }


}
