package Lesson10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L10_1_1 {
    public static void main(String[] args) throws IOException {
        String fileName = "path_to_file/alice.txt";
        Set<String> uniqueWords = new HashSet<>();

        for (String line : Files.readAllLines(Paths.get(fileName))) {
            uniqueWords.addAll(Arrays.asList(line.split("\\W+")));
        }

        System.out.println(uniqueWords);
        System.out.println(uniqueWords.size());

    }
}
