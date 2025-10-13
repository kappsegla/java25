package org.fungover.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JavaStreams {
    public static List<Computer> createComputers() {
        return List.of(
                new Computer("server01", 32768, 3.6f),
                new Computer("desktop01", 16384, 4.2f),
                new Computer("laptop01", 8192, 2.8f),
                new Computer("server02", 65536, 3.8f),
                new Computer("desktop02", 32768, 4.4f),
                new Computer("laptop02", 16384, 3.2f),
                new Computer("server03", 131072, 3.9f),
                new Computer("desktop03", 65536, 4.6f),
                new Computer("laptop03", 32768, 3.4f),
                new Computer("server04", 262144, 4.0f),
                new Computer("server04", 262144, 4.0f)
        );
    }

    static void main() {
        var computers = createComputers();

        //Find all computers with more than 32 GB of memory.
        List<Computer> result = new ArrayList<>();
        for (var computer : computers)
            if (computer.memorySize() > 32000)
                result.add(computer);

        //result.forEach(System.out::println);
        var result2 = computers.stream()
                .filter(computer -> computer.hostName().startsWith("s"))
                .filter(computer -> computer.memorySize() > 32000)
                //.sorted(Comparator.comparing(o -> o.hostName()))
                .distinct()
                .toList();

        result2.forEach(System.out::println);

//        var sum = computers.stream()
//                .filter(c -> c.hostName().startsWith("server"))
//                .distinct()
//                .map(computer -> computer.memorySize())
//                .reduce(0, (acc, cur) -> acc += cur);

        var sum = computers.stream()
                .filter(c -> c.hostName().startsWith("server"))
                .distinct()
                .mapToInt(computer -> computer.memorySize())
                .sum();

        System.out.println(sum);

        //Find a laptop with more than 32 GB memory
        Optional<Computer> computer = computers.stream()
                .filter(c -> c.hostName().startsWith("laptop"))
                .filter(c -> c.memorySize() > 32000)
                .findFirst();

        //Optional object, using ifPresent to only run code if not empty
        //Using method reference to tell which method to run as implementation of the functional interface Consumer<T>
        computer.ifPresent(System.out::println);
    }
}

record Computer(String hostName, int memorySize, float cpuSpeed) {
}