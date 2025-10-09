package org.fungover.exercises.week6.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise6 {
    void main() {
        String text = """
                Höger- och vänstertrafik är de konventioner som innebär att fordon ska framföras på en viss sida av vägen, höger eller 
                vänster sida, beroende på i vilket geografiskt område och i vilket trafiksystem man befinner sig. I många trafiksystem 
                är dessa konventioner nödvändiga för att mötande fordon inte ska kollidera med varandra. Räknat per väglängd har 28 
                procent vänstertrafik, medan man håller till höger på 72 procent. Ursprungligen kördes fordonen till största delen på 
                vänster sida. Till sjöss och längs järnvägar finns liknande regler. 
                """;

        Map<String, Integer> wordCount = new HashMap<>();

        text = text.replaceAll("[.,-]|[\\r\\n]+", "")
                .toLowerCase();
        List<String> sentenceList = Arrays.asList(text.split("\\s+"));

        for (String s : sentenceList) {
            //wordCount.merge(s, 1, Integer::sum);
            if (wordCount.containsKey(s)) {
                wordCount.put(s, wordCount.get(s) + 1);
            } else {
                wordCount.put(s, 1);
            }
        }
        for (var entry : wordCount.entrySet())
            System.out.println(entry);
    }

}
