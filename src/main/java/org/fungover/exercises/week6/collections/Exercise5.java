package org.fungover.exercises.week6.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercise5 {
    static void main() {
        List<String> words = new ArrayList<>(Arrays.asList(
                "Ord",
                "Långt",
                "orchid",
                "lantern",
                "cascade",
                "is",
                "yes",
                "ember",
                "whisper",
                "marble",
                "bit",
                "peak",
                "falcon",
                "harbor",
                "jump",
                "meadow",
                "quartz"));
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.length() < 4)
                iterator.remove();
        }

        for (var w : words)
            System.out.println(w);


    }
}
