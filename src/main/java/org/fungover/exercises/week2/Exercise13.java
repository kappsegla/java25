package org.fungover.exercises.week2;

import static java.lang.System.console;

public class Exercise13 {
    public static void main(String[] args) {
        //Skapa string med texten radar
        String palindrom = console().readLine("Enter a word: ");
        //Ta bort alla mellanslag...
        palindrom = palindrom
                .toLowerCase()
                .replace(" ", "");

        //Skapa en ny string in reverse med StringBuilder
        String reversed = new StringBuilder().append(palindrom).reverse().toString();

        //Jämför original strängen med reverse strängen equals..
        if (palindrom.equals(reversed))
            System.out.println("This is a palindrom");
        else
            System.out.println("Not a palindrom");

        System.out.println("Is palindrom: " + isPalindrome(palindrom));
    }

    /**
     * This method checks a string for palindrom compliance
     *
     * @param word Input string to check
     * @return true if word is palindrome otherwise false
     */
    private static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++)
            if (word.charAt(i) != word.charAt(word.length() - 1 - i))
                return false;
        return true;
    }
}
