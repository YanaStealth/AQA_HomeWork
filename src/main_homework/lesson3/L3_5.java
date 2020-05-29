//5. Given a string "ABCDEFGHIJK". You need to make this string lowercased and remove all vowels.

package main_homework.lesson3;

public class L3_5 {
    public static String lowcase(String qq) {
        return qq.toLowerCase();
    }
    public static void main(String[] args) {
String upper="ABCDEFGHIJK";
        String low = lowcase(upper);
        String withoutVowel= low.replaceAll("[AEIOUYaeiouy]", "");
        System.out.println("Uppercase is replaced by lowercase:" + low);
        System.out.println("Vowels are removed:" + withoutVowel);
    }

}
