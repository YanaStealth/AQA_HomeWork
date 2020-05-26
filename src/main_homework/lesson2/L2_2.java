
package main_homework.lesson2;
import java.util.Scanner;
public class L2_2 {

    public static void main(String args[])
    {
        double b, h, s;
        System.out.println("Enter two integers(base and height of the rectangle) to calculate the rectangle square,cm2: ");
        Scanner sc = new Scanner(System.in); //System.in An InputStream which is typically connected to keyboard input of console programs.
        b = sc.nextDouble(); //scan data for input of integer value
        h = sc.nextDouble();
        s = 0.5*b*h;
        System.out.println("the rectangle square = "+ s +" cm2");

    }
}