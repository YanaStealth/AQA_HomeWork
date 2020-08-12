/*package Lesson10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class L10_2 {
    public static void main(String[] args) throws IOException {
        String fileName = "path-to-file/alice.txt";

        Set<String> uniqueWords = Files.readAllLines(Paths.get(fileName)).stream()
                .map(line -> Arrays.asList(line.split("\\W+")))
                .flatMap(line -> line.stream())
                .collect(Collectors.toSet());

        System.out.println(uniqueWords);
        System.out.println(uniqueWords.size());

    }
}
*/