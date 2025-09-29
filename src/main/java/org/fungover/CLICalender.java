package org.fungover;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;

public class CLICalender {
    public static void main(String[] args) throws InterruptedException {
        if (args.length == 0) {
            var dateAndTime = LocalDateTime.now();
            System.out.println(dateAndTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm")));
        }
        for (String arg : args) {

            if (arg.equals("now") || arg.equals("n")) {
                var time = LocalTime.now();
                System.out.println(time.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
            } else if (arg.equals("tomorrow") || arg.equals("t")) {
                var date = LocalDate.now();
                System.out.println(date.plusDays(1));
            } else if (arg.equals("yesterday") || arg.equals("y")) {
                var date = LocalDate.now();
                System.out.println(date.minusDays(1));
            } else if (arg.equals("week") || arg.equals("w")) {
                var date = LocalDate.now();
                System.out.println(date.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));
            }
        }


//        var nextDay = dateAndTime.plusDays(1);
//        System.out.println(nextDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));
    }
}
