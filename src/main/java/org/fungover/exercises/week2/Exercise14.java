package org.fungover.exercises.week2;

import java.util.Arrays;

import static java.lang.System.console;

public class Exercise14 {
    public static void main(String[] args) {
        //Läs in två ord i String
        String word1 = console().readLine("Enter a word: ").toLowerCase().trim();
        String word2 = console().readLine("Another word: ").toLowerCase().trim();

        //Testa för anagram?
        if (word1.length() != word2.length())
            System.out.println("Can't be an anagram");

        //Sortera bokstäverna i orden och jämför
        var charArrayForWord1 = word1.toCharArray();
        var charArrayForWord2 = word2.toCharArray();
        Arrays.sort(charArrayForWord1);
        Arrays.sort(charArrayForWord2);
        if (Arrays.equals(charArrayForWord1, charArrayForWord2))
            System.out.println("The words " + word1 + " and " + word2 + " are anagrams");
    }
}
