package main_homework.Lesson5;

public class L5_6_2 {

    public static void main(String[] args) throws Exception{
        int a = 11;
        int b = 6;
        L5_6 func1 = L5_6.newObject(); //func 1 is object of L5_6 class
        int c = func1.minFunction(a, b);
        System.out.println("funct1 returns = " + c);


        //if public int minFunction is static:
        /*
        delete:  L5_6 func1 = L5_6.newObject();
        int c = L5_6.minFunction(a, b);
       * */

         //L5_6 func2 = new L5_6();
        //int c = func2.minFunction(a, b);

    }

}