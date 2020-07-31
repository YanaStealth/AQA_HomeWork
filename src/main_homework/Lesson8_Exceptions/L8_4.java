/*
 Fix the program to make it work:
public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
}
 */

package main_homework.Lesson8_Exceptions;

public class L8_4 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (ArithmeticException e)  {
            e.printStackTrace();
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

}
