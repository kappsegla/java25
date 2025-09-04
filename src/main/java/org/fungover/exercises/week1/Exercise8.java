package org.fungover.exercises.week1;

public class Exercise8 {
    public static void main(String[] args) {
        double grade = 70.5;
        double attendance = 83;
        if (grade >= 70.0 && attendance >= 80.0) {
            System.out.println("Du har klarat kursen!");
        } else {
            System.out.println("Du måste tyvärr göra om kursen.");
        }
    }

    public static void alternativeSolution() {
        double grade = 70.5;
        double attendance = 83;

        record StudentResult(double grade, double attendance) {
        }

        StudentResult studentResult = new StudentResult(grade, attendance);

        switch (studentResult) {
            case StudentResult result when result.grade() >= 70.0 && result.attendance() >= 80.0 ->
                    System.out.println("Du har klarat kursen!");
            default -> System.out.println("Tyvärr du måste göra om kursen");
        }
    }
}
