/*Write a program that will enter numbers from the keyboard.
The code for reading numbers from the keyboard must be in the readData method.
The code inside the readData is wrapped in a try..catch.
If the user entered some text, instead of entering a number, the method should catch the exception and display
all previously entered numbers as a result.
Numbers output from a new line preserving the order of input.*/

package main_homework.Lesson8_Exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class L8_6 {
    public static void main(String args[]) throws IncorrectFive {
        //double[] simpleArray = new double[5];
        System.out.println("Enter digits:");
        Scanner sc = new Scanner(System.in); //System.in An InputStream which is typically connected to keyboard input of console programs.
        //int i = 0;
        ArrayList<Double> arrayList = new ArrayList<>();
        try {
            do {  //
                arrayList.add(sc.nextDouble()); //scan data for input of integer value
              //  i++; Индекс i можно не использовать. По умолчанию метод add добавляет элементы в конец списка
            }
            while (sc.hasNextDouble()); // пока ввод double типа true
            throw new InputMismatchException("! ");
        } catch (InputMismatchException e) {
            System.out.println("Number format exception: you can enter integers only" + e.getStackTrace());
        }
        for (Double s : arrayList) {
            System.out.println(s);
        }
    }
}
