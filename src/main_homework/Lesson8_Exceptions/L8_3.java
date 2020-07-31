/*3. Finish the program to handle all the possible exceptions:
public class Main {

    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);
        int b = 10 / a;
        int[] c = {1};
        System.out.println(c[1]);
    }
}
Print the cause of the exception to the console.
*/
package main_homework.Lesson8_Exceptions;

public class L8_3 {


    public static void main(String[] args) {
        int a = args.length; //args.length is always = 0; taken from main(String[] args)
        System.out.println(a);
        try {
            int b = 10 / a;
        } catch (ArithmeticException c) {
            System.out.println("Division by zero.");
        }
        try {
            int[] c = {1};  // 0 ячейка в массиве с, в ней содержится 0
            System.out.println(c[1]); //ячейки не существует, объявлен массив который содержит одну ячейку
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of array");
        }
    }

}


