//4) Create an array of 10 integers. Find the square root of each element and put the to result array.
// Print the result array to the console.

package main_homework.lesson2;

public class L2_4_array_square_root {
    public static void main(String args[]){
        int [] array;
        double[] newArray;
        array = new int[10];
        newArray = new double[10];
        for (int i=0; i<10; i++) {
            array[i] = (int) (Math.random() * 555);
            newArray[i] = Math.sqrt(array[i]);
            System.out.println(newArray[i]);
        }
} }


//int[] array={1,4,9,16,25,36,49,81,100,10000};