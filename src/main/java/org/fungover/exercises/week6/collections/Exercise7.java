package org.fungover.exercises.week6.collections;

import java.util.List;

public class Exercise7 {
    static void main() {
        List<String> names = List.of("James", "John", "Nicklas", "David", "Greta");
        String name = IO.readln("Enter a name to search for: ");
        if (names.contains(name)) {
            System.out.println(name + " finns i listan");
        } else {
            System.out.println(name + " Finns inte i listan");
        }
    }
}
