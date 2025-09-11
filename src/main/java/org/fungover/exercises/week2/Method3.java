package org.fungover.exercises.week2;

public class Method3 {
    public static void main(String[] args) {
        for (int temp = -30; temp < 120; temp++)
            System.out.println(temp + "℉  " + String.format("%.1f", fahrenheitToCelsius(temp)) + "℃");
    }

    private static double fahrenheitToCelsius(double farenheit) {
        return (farenheit - 32) * 5 / 9;
    }


}
