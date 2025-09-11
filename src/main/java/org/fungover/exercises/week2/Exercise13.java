package org.fungover.exercises.week2;

import static java.lang.System.console;

public class Exercise13 {
    public static void main(String[] args) {
        //Skapa string med texten radar
        String word = console().readLine("Enter a word: ");
        //Ta bort alla mellanslag...
        String palindrom = word
                .trim()
                .toLowerCase()
                .replace(" ", "");

        //Skapa en ny string in reverse med StringBuilder
        String reversed = new StringBuilder().append(palindrom).reverse().toString();

        //Jämför original strängen med reverse strängen equals..
        if (palindrom.equals(reversed))
            System.out.println("This is a palindrom");
        else
            System.out.println("Not a palindrom");

        System.out.println("Is palindrom: " + isPalindrome(word));
    }

    /**
     * This method checks a string for palindrom compliance
     *
     * @param word Input string to check
     * @return true if word is palindrome otherwise false
     */
    private static boolean isPalindrome(String word) {
        int startIndex = 0;
        int endIndex = word.length() - 1;

        while (startIndex < endIndex) {

            if (word.charAt(startIndex) == ' ') {
                startIndex++;
                continue;
            }
            if (word.charAt(endIndex) == ' ') {
                endIndex--;
                continue;
            }
            if (word.charAt(startIndex) != word.charAt(endIndex))
                return false;
            startIndex++;
            endIndex--;
        }
        return true;
    }
}
