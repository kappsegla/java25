package org.fungover.oop4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MapDemo {

    //Dictionary or as its called in java, Map
    //Stores key, value pairs

    void main() {

        Map<String, String> map = new HashMap<>();

        System.out.println("A".hashCode() % 16);
        System.out.println("B".hashCode() % 16);
        System.out.println("Q".hashCode() % 16);

        map.put("A", "The letter A is the first in the alphabet. Used to form words like ape and advocate.");
        map.put("B", "B comes second but is still a nice letter. Used to form Bapelsin");

        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        if (map.containsKey("C"))
            System.out.println(map.get("C"));

        Optional<String> answer = maybe(10);
        answer.ifPresent(System.out::println);


    }

    //Nothing to return? Use empty List
    public List<String> members() {
        return List.of();
    }

    //Same with array, use array with 0 length
    public int[] numbers() {
        return new int[]{};
    }

    //Single value, Use Optional instead of returning null when nothing to return.
    public static Optional<String> maybe(int i) {
        if (i < 10 && i >= 0)
            return Optional.of("Single digit positive");
        else
            return Optional.empty();
    }
}
