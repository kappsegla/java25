package org.fungover.exercises.files;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * When we compile our maven projects a folder named target is created in the project.
 * This folder can be deleted in projects we aren't using to save space since it can
 * be rebuilt whenever we want from the source code.
 * This program will find all target folders under a path and calculate
 * the size of the content.
 */
public class SizeCalculator {
    private static final String TARGET_DIR_NAME = "target";

    static void main() {
        String homeFolder = System.getProperty("user.home");
        Path rootPath = Path.of(homeFolder, "IdeaProjects");

        try (Stream<Path> pathStream = Files.walk(rootPath)) {
            pathStream
                    .filter(Files::isDirectory)
                    .filter(path -> path.getFileName().toString().equals("target"))
                    .map(path -> {
                        return new TargetDirectory(path, calculateSize(path));
                    })
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static long calculateSize(Path path) {
        return 0;
    }
}

/**
 * Record structure for storing path and size of a folder
 *
 * @param path Path to folder
 * @param size Total size of all files in that folder and sub folders
 */
record TargetDirectory(Path path, long size) {
}
