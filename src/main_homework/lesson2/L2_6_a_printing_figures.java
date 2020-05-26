//6) Create a program that print to the console following figures. Use loops, asterisks("*") and spaces (" ").
//import org.apache.commons.lang3.StringUtils;
package main_homework.lesson2;

public class L2_6_a_printing_figures {
    public static void main(String args[]){
        task1();
    }
    public static void task1(){

        for (int x=1; x<=8; x++) {
            for (int y=1; y<=8; y++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}

