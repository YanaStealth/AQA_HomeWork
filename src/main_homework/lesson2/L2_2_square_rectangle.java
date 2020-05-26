//2)Create a simple program that calculates and pr public static void main(String args[])
//    {ints the square of a rectangle and a circle. Import and use Math class.

package main_homework.lesson2;
import java.util.Scanner;

public class L2_2_square_rectangle {
    public static void main(String args[])
    {
    double a1, b1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 1st rectangle side length in cm to calculate the square a1=");
    a1 = sc.nextDouble();
    System.out.println("Enter the 2nd rectangle side length in cm, b1=");
    b1 = sc.nextDouble();
    System.out.println("The rectangle square is: "+(a1*b1) + "cm2.");

} }
