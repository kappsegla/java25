package org.fungover.exercises.lecture;

public class StarPrinter {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            s.append("*");
            System.out.println(s);
        }

        String s1 = "";
        for (int i = 0; i < 5; i++) {
            s1 += ("*");
            System.out.println(s1);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        for (String text = "*"; text.length() <= 5; text += "*")
            System.out.println(text);

        for (StringBuilder text = new StringBuilder("*");
             text.length() <= 5;
             text.append("*"))
            System.out.println(text);

    }
}
