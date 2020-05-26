//Circle Area

package main_homework.lesson2;
import java.util.Scanner;
public class L2_2_circle {
    public static void main(String args[])
    {
        double a1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the circle radius value, to count the circle area. a1=");
        a1 = sc.nextDouble();
        double area = Math.pow(a1,2) * Math.PI;
        System.out.println("The circle area is:" + area);
    }
}
