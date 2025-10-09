package org.fungover.exercises.week6.collections;

import java.util.*;

public class Exercise9 {
    static void main() {
        String text = """
                Höger- och vänstertrafik är de konventioner som innebär att fordon ska framföras på en viss sida av vägen, höger eller 
                vänster sida, beroende på i vilket geografiskt område och i vilket trafiksystem man befinner sig. I många trafiksystem 
                är dessa konventioner nödvändiga för att mötande fordon inte ska kollidera med varandra. Räknat per väglängd har 28 
                procent vänstertrafik, medan man håller till höger på 72 procent. Ursprungligen kördes fordonen till största delen på 
                vänster sida. Till sjöss och längs järnvägar finns liknande regler. 
                """;

        Map<Integer, Set<String>> wordLength = new HashMap<>();
        text = text.replaceAll("[.,-]|[\\r\\n]+", "")
                .toLowerCase();
        List<String> sentenceList = Arrays.asList(text.split("\\s+"));
        for (String s : sentenceList) {
            int length = s.length();
            wordLength.putIfAbsent(length, new HashSet<>());
            wordLength.get(length).add(s);

//            wordLength.merge(length,
//                    new HashSet<>(Set.of(s)),
//                    (existingSet, newSet) -> {
//                        existingSet.addAll(newSet);
//                        return existingSet;
//                    });
        }

        System.out.println(wordLength.get(3));
    }
}
