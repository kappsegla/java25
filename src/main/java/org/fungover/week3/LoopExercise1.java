package org.fungover.week3;

public class LoopExercise1 {
    public static void main(String[] args) {

        final boolean PRINT_DEBUG_INFO = false;
        if( PRINT_DEBUG_INFO )
            System.out.println("Can this be printed?");

        System.out.println("Wait a second or two...");
        for (int i = 0; i < 5; i++) {
            System.out.print(5 - i + "..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i * 10);
        }
        int j = 1;
        while (j <= 10) {
            System.out.println(j * 10);
            j++;
        }

        String choice;
        do {
            System.out.println("Menu");
            System.out.println("====");
            System.out.println("1. Say hello");
            System.out.println("2. Say goodbye");
            System.out.println("3. Exit");
            choice = System.console().readLine("Choice: ");
            if (choice.equals("1"))
                System.out.println("Hello");
            else if (choice.equals("2"))
                System.out.println("Goodbye");
        } while (!choice.equals("3"));

        for (int i = 10; i <= 100; i += 10) {
            System.out.println(i);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(10 - i);
        }
        for (int i = 97; i <= 122; i++) {
            System.out.println((char) i);
        }

        for (char letter = 'a'; letter <= 'z'; letter++)
            System.out.println(letter);


    }
}
