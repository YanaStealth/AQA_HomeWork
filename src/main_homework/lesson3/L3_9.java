//9. Given some random string s. Verify if that string ends with ".". If so, leave this string as is.
// If not - add it. Test strings create on your own.


package main_homework.lesson3;

public class L3_9 {
    public static void main(String[] args) {
        String a = "sfgs.", b = "hn.j", c = "fdg5";
        if (!(a.endsWith("."))) {
            a = a + ".";
        }
        if (!(b.endsWith("."))) {
            b = b + ".";
        }
        if (!(c.endsWith("."))) {
            c = c + ".";
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

