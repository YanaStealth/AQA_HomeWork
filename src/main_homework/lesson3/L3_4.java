//4. Given two strings. Check if they start with "The".
//
//   Task: word1 = "The End", word2="End The";

package main_homework.lesson3;

public class L3_4 {
    public static void main (String[] args){
        String word1 = "The End", word2="End The", w3="The";
        String w1=word1.substring(0,3);
        String w2=word2.substring(0,3);
        if (w1.equals(w3)){
            System.out.println(" \"word1\" string starts with \"The\" : " + word1);
        }
        if (w2.equals(w3)){
            System.out.println("word1 start with \"The\"" + word2);
    }
} }
