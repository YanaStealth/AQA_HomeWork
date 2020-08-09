/*
package Lesson10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Read {



    public static void main(String[] args) {

        try{File file = new File("/Users/YanaPodskrebalina/IdeaProjects/AQA_HomeWork/src/Lesson10/alice.txt");

            //создаем объект FileReader для объекта File
            FileReader reader = new FileReader(file);

        //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader1 = new BufferedReader(reader);

            // считаем сначала первую строку
            List<String> lines = Files.readAllLines(file);
            ArrayList<String> arrList = new ArrayList<>();


            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
}
*/