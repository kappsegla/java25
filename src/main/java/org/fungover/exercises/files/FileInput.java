package org.fungover.exercises.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Optional;

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
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .forEach(System.out::println);
        } catch (NoSuchFileException e) {
            System.out.println("File not found: " + path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static Either<CakeException, Cake> getCake(String s) {
        String[] parts = s.split(",");
        try {
            return new Cake(Integer.parseInt(parts[0].trim()), parts[1].trim(), Integer.parseInt(parts[2].trim())));
        } catch (NumberFormatException e) {
            return;
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

class Either<T extends Exception, U> {
    private final T left;
    private final U right;

    public Either(T left) {
        this.left = left;
        this.right = null;
    }

    public Either(U right) {
        this.right = right;
        this.left = null;
    }

    public T getLeft() {
        //Throw exception if not left?
        return left;
    }

    public U getRight() {
        return right;
    }

    public boolean isLeft() {
        return left != null;
    }

    public boolean isRight() {
        return right != null;
    }
}

record Cake(int id, String name, int price) {

}

class CakeException extends RuntimeException {
}
