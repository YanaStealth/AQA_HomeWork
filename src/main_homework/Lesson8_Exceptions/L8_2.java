/*2. Fix the method with try-catch to get the correct result of division:*/

package main_homework.Lesson8_Exceptions;

public class L8_2 {

    public static void main(String[] args) {
        System.out.println(divideByZero());
    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;
        try {

            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("You are trying to divide by zero " + a + "/" + b);
        }
        return 0;
    }
}





