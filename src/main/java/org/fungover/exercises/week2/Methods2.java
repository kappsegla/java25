package org.fungover.exercises.week2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Methods2 {
    public static void main(String[] args) {
        String date1 = "2017-08-30";
        String date2 = "2017-09-02";
        System.out.println(date1 + " and " + date2 + " is "
                + daysBetween(date1, date2) + " days apart");
    }

    public static int daysBetween(String day1, String day2) {
        LocalDate date1 = LocalDate.parse(day1);
        LocalDate date2 = LocalDate.parse(day2);

        return (int) ChronoUnit.DAYS.between(date1, date2);
    }
}
