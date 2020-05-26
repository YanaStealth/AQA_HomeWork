package main_homework.lesson2;
import java.util.Scanner;

public class L2_2_TriangleSquare {
    public static void main(String args[])
    {
       double a1, b1, c1, s1;

        System.out.println("Enter two triangle sides length in cm and angle value to calculate the triangle square: ");
        Scanner sc = new Scanner(System.in); //System.in An InputStream which is typically connected to keyboard input of console programs.
        System.out.println("Enter triangle side length in cm, a= ");
        a1 = sc.nextDouble(); //scan data for input of value
        System.out.println("Enter triangle side length in cm, b= ");
        b1 = sc.nextDouble();
        System.out.println("Enter angle value c= ");
        c1 = sc.nextDouble();
        double sin1 = Math.sin(c1);
        s1=0.5*a1*b1*sin1;
        System.out.println("The triangle square, cm2 = "+s1);
} }
