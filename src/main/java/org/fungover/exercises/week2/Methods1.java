package org.fungover.exercises.week2;

import java.time.LocalDate;

public class Methods1 {
    public static void main(String[] args) {
        System.out.println(year("2025-09-11"));
    }

    //    public static int year(String date){
//        return Integer.parseInt(date.substring(0,4));
//    }
    public static int year(String date) {
        return LocalDate.parse(date).getYear();
    }
}
