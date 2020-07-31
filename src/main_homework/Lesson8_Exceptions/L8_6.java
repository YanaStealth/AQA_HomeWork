/*Write a program that will enter numbers from the keyboard.
The code for reading numbers from the keyboard must be in the readData method.
The code inside the readData is wrapped in a try..catch.
If the user entered some text, instead of entering a number, the method should catch the exception and display
all previously entered numbers as a result.
Numbers output from a new line preserving the order of input.*/

package main_homework.Lesson8_Exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class L8_6 {
    public static void main(String args[]) {
        double[] simpleArray = new double[5];
        System.out.println("Enter 5 digits to calculate the Sum of them");
        Scanner sc = new Scanner(System.in); //System.in An InputStream which is typically connected to keyboard input of console programs.
        for (int i = 0; i < 5; i++) {
            simpleArray[i] = sc.nextDouble(); //scan data for input of integer value
            if(!(sc.hasNextDouble()==true)) { // возвращает истину если с потока ввода можно считать double
                try {
                    throw new InputMismatchException("NFC");
                } catch (InputMismatchException e) {
                    System.out.println("Number format exception: you can enter integers only");
                }
            }
        }
        double totalSum = Arrays.stream(simpleArray).sum();
        System.out.println("Total sum of the array elements is: " + totalSum);

    }
}


// if (!Character.isDigit(simpleArray[i])) {
// throw new NumberFormatException("NFE");