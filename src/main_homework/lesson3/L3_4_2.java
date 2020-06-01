//4. Given two strings. Check if they start with "The".
//
//   Task: word1 = "The End", word2="End The";

package main_homework.lesson3;

public class L3_4_2 {
    public static void main(String[] args) {
        String word1 = "The End", word2 = "End The";
        if (word1.startsWith("The")) {
            System.out.println("\"word1\" string starts with \"The\" : " + word1);
        }
        else {System.out.println("\"word1\" string does not start with \"The\" : " + word1);}
        if (word2.startsWith("The")) {
            System.out.println("\"word2\" string starts with \"The\"" + word2);
        }
        else {System.out.println("\"word2\" string does not start with \"The\" : " + word2);}

    }
}


