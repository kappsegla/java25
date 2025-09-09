package org.fungover.week3;

import java.util.Arrays;
import java.util.Objects;

public class StringArray {
    public static void main(String[] args) {
//        String[] text = new String[3];
//        text[0] = "Some";
//        text[1] = "text";
//        text[2] = "here";
        String[] text = {"Some","text","here"};

        if (text[0] != null)
            System.out.println(text[0].charAt(0));

        if (Objects.nonNull(text[0]))
            System.out.println(text[0].charAt(0));

        for (int i = 0; i < text.length; i++) {
            String s = text[i];
            System.out.println(s);
        }
        for (var s : text) {
            System.out.println(s);
        }

        System.out.println(Arrays.toString(text));
    }
}
