package org.fungover.exercises.files;

import org.fungover.functional.Either;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class FileInput {
    static void main() {

        String homeFolder = System.getProperty("user.home");
        System.out.println(homeFolder);
        Path path = Path.of(homeFolder, "cakes.csv");
        try {
//            String input = Files.readString(path);
//            System.out.println(input);
            Files.lines(path)
                    .map(FileInput::getCake)
                    .filter(Either::isRight)
                    .map(e -> switch (e) {
                        case Either.Right<CakeException, Cake> r -> r.right();
                        case Either.Left<CakeException, Cake> l ->
                                throw new IllegalStateException("Unexpected Left after filter");
                    })
                    .forEach(System.out::println);

            var result = Files.lines(path)
                    .map(FileInput::getCake)
                    .collect(Collectors.partitioningBy(Either::isRight));

            System.out.println("Cakes");
            result.get(true).forEach(e -> {
                switch (e) {
                    case Either.Right<CakeException, Cake>(Cake cake) when cake.id() == 2 -> System.out.println(cake);
                    case Either.Right<CakeException, Cake>(Cake _) -> System.out.println("Not number 1 cake");
                    case Either.Left<CakeException, Cake> l -> { /* no-op */ }
                }
            });
            System.out.println("Errors");
            result.get(false).forEach(e -> {
                switch (e) {
                    case Either.Left<CakeException, Cake> l -> System.out.println(l.left());
                    case Either.Right<CakeException, Cake> r -> { /* no-op */ }
                }
            });

        } catch (NoSuchFileException e) {
            System.out.println("File not found: " + path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static org.fungover.functional.Either<CakeException, Cake> getCake(String s) {
        String[] parts = s.split(",");
        try {
            return new Either.Right<>(new Cake(Integer.parseInt(parts[0].trim()), parts[1].trim(), Integer.parseInt(parts[2].trim())));
        } catch (NumberFormatException e) {
            return new Either.Left<>(new CakeException("Number parsing exception: " + e.getMessage()));
        }
    }

//    private static Optional<Cake> getCake(String s) {
//        String[] parts = s.split(",");
//        try {
//            return Optional.of(new Cake(Integer.parseInt(parts[0].trim()), parts[1].trim(), Integer.parseInt(parts[2].trim())));
//        } catch (NumberFormatException e) {
//            return Optional.empty();
//        }
//    }
}

//class Either<T extends Exception, U> {
//    private final T left;
//    private final U right;
//
//    public Either(T left) {
//        this.left = left;
//        this.right = null;
//    }
//
//    public Either(U right) {
//        this.right = right;
//        this.left = null;
//    }
//
//    public T getLeft() {
//        //Throw exception if not left?
//        return left;
//    }
//
//    public U getRight() {
//        return right;
//    }
//
//    public boolean isLeft() {
//        return left != null;
//    }
//
//    public boolean isRight() {
//        return right != null;
//    }
//}

record Cake(int id, String name, int price) {

}

class CakeException extends RuntimeException {

    public CakeException(String message) {
        super(message);
    }

}
