// 9. Write your own example of the recursive function. You can find a lot of examples on the Internet.


package main_homework.Lesson4;

public class L4_9 {
    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {
        int number = 4, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}

