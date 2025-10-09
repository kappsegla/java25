package org.fungover.exercises.week6.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise2 {
    static void main() {
        //Läs in en textsträng
        String sentence = IO.readln("Skriv en text: ").toLowerCase();
        //Dela upp inläst text i ord
        sentence = sentence.replace(".", "");
        sentence = sentence.replace(",", "");
        sentence = sentence.replace("\n", "");
        List<String> sentenceList = Arrays.asList(sentence.split(" "));
        //Skapa ett Set
        Set<String> sentenceSet = new HashSet<>();
        //Lägg till varje ord i setet.
        sentenceSet.addAll(sentenceList);
        //Skriv ut storleken på Set
        System.out.println(sentenceSet.size());


    }
}
