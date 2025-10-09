package org.fungover.exercises.week6.collections;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
    static void main() {
        Map<String, String> telefonbok = new HashMap<>();
        telefonbok.put("SOS", "112");
        telefonbok.put("Polisen", "11414");
        telefonbok.put("Vårdguiden", "1177");
        var entries = telefonbok.entrySet();
        for (var entry : entries)
            System.out.println(entry);

        //Fråga användaren efter ett namn
        String input = IO.readln("Namn vars telefonnummer önskas: ");
        //Försök hämta telefonnummer med hjälp av namnet från telefonbok
        String number = telefonbok.get(input);
        //Skriv ut nummer
        System.out.println(number);
    }
}
