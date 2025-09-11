package org.fungover.exercises.week2;

import java.util.Arrays;
import java.util.Comparator;

public class Exercise11 {
    public static void main(String[] args) {
        Book[] books = {
                new Book("for Whom the bell tolls", 416),
                new Book("Dune", 412),
                new Book("Very real book", 9001),
                new Book("The Historical Development of the Heart from Its Formation From the First Cell to the Last Breath of Life", 0)
        };
        Book mostPages = books[0];
        int longestTitle = 0;
        for (var book : books) {
            if (book.pages() > mostPages.pages()) {
                mostPages = book;
            }
            if (book.title().length() > longestTitle) {
                longestTitle = book.title().length();
            }
        }
        System.out.println(mostPages);

        Comparator<Book> comparator = Comparator.comparing(Book::pages).reversed();
        Arrays.sort(books, comparator);

        System.out.printf("%-" + 25 + "s | %-10s%n", "Title", "Pages");
        for (Book book : books) {
            System.out.printf("%-" + 25 + "s | %-1s pages %n", shortenText(book.title(), 22), book.pages());
        }
    }

    static String shortenText(String fullText, int maxLength) {
        if (fullText.length() > maxLength)
            return fullText.substring(0, maxLength) + "...";
        return fullText;
    }
}

record Book(String title, int pages) {
}