
//6. Given 2 strings, a and b. Create a string c of the form short+long+short,
// with the shorter string on the outside and the longer string on the inside.
//
//   Task: a = "hop", b = "hello"

package main_homework.lesson3;

public class L3_6 {
    public static void main(String[] args) {
        String a = "hop", b = "hello";
        String c = "";
        if (a.length() < b.length()) {
            c = a + b + a;
        } else if (a.length() > b.length()) {
            c = b + a + b;
        } else {
            System.out.println("The lengths of the both Strings are equal");
        }
        System.out.println(c);
    }
}

