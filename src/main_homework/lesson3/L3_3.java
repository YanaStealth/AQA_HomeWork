//3. The web is built with HTML strings like "<i>Hello</i>" which draws Hello as italic text.
//        In this example, the "i" tag makes <i> and </i> which surround the word "Hello".
//        Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Hello</i>".

//        Task: word = "Welcome to Java World", tag="p"

package main_homework.lesson3;

public class L3_3 {
public static void main (String[] args){
    String welcome="Welcome to Java World", tag="p";
    System.out.println("<" + tag + ">" + welcome + "</" + tag + ">");
}
}
