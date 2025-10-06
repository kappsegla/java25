package org.fungover.oop4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo {
    static void main() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(1);
        for (var i : integerList)
            System.out.println(i);

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(1);
        if (integerSet.contains(2))
            System.out.println("Contains 2");

        for (var i : integerSet)
            System.out.println(i);

        System.out.println("========");
        Set<MyType> myTypeSet = new HashSet<>();

        myTypeSet.add(new MyType(1));
        myTypeSet.add(new MyType(2));
        myTypeSet.add(new MyType(3));
        myTypeSet.add(new MyType(1));

        for (var i : myTypeSet)
            System.out.println(i.getValue());


    }

}

class MyType {
    private int value;

    public MyType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof MyType myType)) return false;

        return value == myType.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}