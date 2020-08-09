package Lesson10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Read1 {
    public static void main(String[] args) {
        String fileName = "/Users/YanaPodskrebalina/IdeaProjects/AQA_HomeWork/src/Lesson10/alice.txt";
        try{String content = readUsingBufferedReader(fileName);

        Set<String> uniqueWords = new HashSet<>();
        Collections.addAll(uniqueWords, content.split("\\W+"));
        System.out.println(uniqueWords);
        System.out.println(uniqueWords.size());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static String readUsingBufferedReader(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader( new FileReader(fileName));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while( ( line = reader.readLine() ) != null ) {
            stringBuilder.append( line );
            stringBuilder.append( ls );
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }
}

