package main_homework.lesson2;

public class L2_6_d_printing_figures {public static void main(String args[])
    {        System.out.println("Равносторонний треугольник");
            for (int i = 1; i < 9; ++i){

            for (int j = 8; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print("*");

            System.out.println();
        }
        }
    }

