package org.fungover.exercises.week6.collections;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    static void main() {
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Bobby");
        names.add("Bobs");
        names.add("Dobby");
        names.add("Ann");

        names.remove("Bobby");
        //names.remove(1);

        for (String name : names)
            System.out.println(name);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println(names.getFirst());
        System.out.println(names.getLast());
    }

}
