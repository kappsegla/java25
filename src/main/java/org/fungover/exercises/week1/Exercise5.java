package org.fungover.exercises.week1;

import java.util.Arrays;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        int age = Integer.parseInt(System.console().readLine("Din ålder? "));
        if (age >= 18) {
            System.out.println("Du är gammal nog att ta körkort!");
        } else {
            int time = 18 - age;
            System.out.println("Du behöver vänta i " + time + " år till");
        }
    }

    //Example that tries with multiple ages to verify behavior
    public static void licenseQuestion() {
        List<Integer> ages = Arrays.asList(17, 21, 10, 15, 78, 101, 34, 16, 18, 65, 0, -13);
        for  (Integer age : ages) {
            System.out.println("Välkommen! Så du är " + age + " år gammal...");
            if (age >= 18) {
                System.out.println("Du är gammal nog att ta körkort!");
            } else if (age < 17 && age >= 0) {
                System.out.println("Du behöver vänta i " + (18-age) + " år till!");
            } else {
                System.out.println("Hur är detta möjligt!?!?");
            }

        }
    }
}
