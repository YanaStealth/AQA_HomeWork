package Lesson10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class L10_2_Read_Map {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/YanaPodskrebalina/IdeaProjects/AQA_HomeWork/src/Lesson10/alice.txt";
        ArrayList<String> words = new ArrayList<>();
        // Map<Integer, String> words = new HashMap<>();
        for (String line : Files.readAllLines(Paths.get(fileName))) {
            words.addAll(Arrays.asList(line.split("\\W+")));
        }
        Map<String, Integer> mp2 = new HashMap<String, Integer>();
        Set<String> unique = new HashSet<String>(words);
        for (String key : unique) {
            mp2.put(key, Collections.frequency(words, key));
        }
        System.out.println(mp2);

    }
}
