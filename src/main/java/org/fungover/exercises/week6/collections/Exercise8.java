package org.fungover.exercises.week6.collections;

import java.util.HashMap;
import java.util.Map;

public class Exercise8 {
    static void main() {
        Map<String, Integer> linesOfCode = new HashMap<>();
        linesOfCode.put("Exercise1", 31);
        linesOfCode.put("Exercise2", 27);
        linesOfCode.put("Exercise3", 24);

        System.out.println(linesOfCode.getOrDefault("Exercise4", 0));

    }
}
