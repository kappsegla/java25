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

    private static Optional<Cake> getCake(String s) {
        String[] parts = s.split(",");
        try {
            return Optional.of(new Cake(Integer.parseInt(parts[0].trim()), parts[1].trim(), Integer.parseInt(parts[2].trim())));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}

record Cake(int id, String name, int price) {
}
