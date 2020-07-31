/*
1. Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0”
if number = 0 throw your own exception.
*/

package main_homework.Lesson8_Exceptions;

public class L8_1 {
    public static void main(String[] args) {
        L8_1 compare1 = new L8_1();
        compare1.compareNumbers(0);
    }

    public void compareNumbers(int a) {
        if (a < 0) {
            System.out.println("Number < 0");
        } else if (a > 0) {
            System.out.println("Number > 0");
        } else {
            try {
                throw new RuntimeException("RE");
            } catch (RuntimeException e) {
            }
        }
    }
}
