package org.fungover.exercises.week1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        calculateMoms();
    }

    public static void calculateMoms() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hur mycket kostar varan?");
        String priceStr = input.nextLine();
        if (priceStr.contains(",")) {
            priceStr = priceStr.replace(",", ".");
        }
        if (priceStr.contains("kr")) {
            priceStr = priceStr.replace("kr", "");
        }
        priceStr = priceStr.replace(" ", "");
        BigDecimal price = new BigDecimal(priceStr);
        BigDecimal moms006 = new BigDecimal("0.06");
        BigDecimal moms106 = new BigDecimal("1.06");
        BigDecimal moms012 = new BigDecimal("0.12");
        BigDecimal moms112 = new BigDecimal("1.12");
        BigDecimal moms025 = new BigDecimal("0.25");
        BigDecimal moms125 = new BigDecimal("1.25");
        System.out.println("""
                Hur mycket moms ska du betala?
                Ange alternativ 1, 2 eller 3
                1. 6%
                2. 12%
                3. 25%
                """);
        int moms = input.nextInt();
        switch (moms) {
            case 1:
                printWithVat(6, price, moms006, moms106);
                break;
            case 2:
                printWithVat(12, price, moms012, moms112);
                break;
            case 3:
                printWithVat(25, price, moms025, moms125);
                break;
        }
    }

    private static void printWithVat(int vat, BigDecimal price, BigDecimal moms006, BigDecimal moms106) {
        System.out.printf("""
                Brutto summa: %.2f kr
                Moms %d%%    : %.2f kr
                Totalt      : %.0f kr
                """,  price, vat, price.multiply(moms006), price.multiply(moms106));
    }
}
