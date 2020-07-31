/*Throw a NullPointerException from the method iCanThrowException();
Handle it in the main method.
public class Main {

    public static void main(String[] args) {
        iCanThrowException();
    }

    public static void iCanThrowException() {

    }

} */
package main_homework.Lesson8_Exceptions;

public class L8_5 {
    public static void main(String[] args) {
        int[] data = new int[100];
        iCanThrowException();
    }

    public static void iCanThrowException() {

        try {
// Instantiate null object.
            Integer age = null;
// Attempt to call method on object.
            age.toString();
        } catch (NullPointerException e) {
// Catch NullPointerExceptions.
            System.out.println("Attempt to return String for the null object");
        }
    }
}
