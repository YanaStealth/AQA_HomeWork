
//7) Create an array of 10 integers. Calculate and print the sum of all its elements except the first one and the last one.

package main_homework.lesson2;

public class L2_7 {
    public static void main(String[] args){
        int [] array={5,10,20,40,15,30,100,200,300,100000};
        int a=0;
        for (int i=1; i<9; i++){
            a=array[i]+a;}
        System.out.println(a);
            }
}
