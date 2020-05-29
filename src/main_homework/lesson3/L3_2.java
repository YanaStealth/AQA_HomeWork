//2. Given a string. Write a code that will creates a new string made of its first two chars of the initial string,
// so the String "Hello" yields "He".
//   If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string ""
//   yields the empty string "".

package main_homework.lesson3;

import java.util.Arrays;

public class L3_2 {
    public static void main(String[] args) {
        String hello = "Р", he;
        if (hello.equals("")) {
            he = hello;
        } else {
            he = hello.substring(0, 1);
        }
        System.out.println(he);
    }
}
