package org.fungover.exercises.week6.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise4 {
    static void main() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 5, 3, 2, 7, 9, 0, 4, 8, 6));
        Collections.sort(numbers);

        for (int number : numbers)
            System.out.println(number);
    }
}
