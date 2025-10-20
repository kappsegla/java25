package org.fungover.exercises.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileExample {
    static void main() throws IOException {
        String homeFolder = System.getProperty("user.home");
        System.out.println(homeFolder);
        Path path = Path.of(homeFolder, "java25.txt");

        if (Files.exists(path) == false) {
            try {
                //Files.createDirectories(path.getParent());
                //Files.createFile(path);
                Files.writeString(path, "Hello World åäö", StandardCharsets.UTF_8);

                //Files.delete(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else
            Files.writeString(path, "File apparently already exists",
                    StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);
    }
}
