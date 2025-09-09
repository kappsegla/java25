package org.fungover.week3;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class SortingIntArray {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 1, 3, 2, 6, 4};

//        int temp = numbers[0];
//        numbers[0] = numbers[2];
//        numbers[2] = temp;

        //Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));


        String[] strings = {"One", "Abba", "19", "2", "Ac", "aa", "AA", "Aa", "Å", "Ä", "Ö", "á", "ã"};

        Collator swedishCollator = Collator.getInstance(Locale.of("sv", "SE"));
        //Sort ignoring case
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);
        //Sort with swedish knowledge so åäö comes in the right order
        Arrays.sort(strings, swedishCollator);
        System.out.println(Arrays.toString(strings));

        //Convert to list and sort
        var list = Arrays.asList(strings);
        list.sort(swedishCollator);
        System.out.println(list);


    }
}
