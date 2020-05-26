//3) Create an array of 10 integers. Fill this array using for-loop with random numbers.
// Print all the elements of this array to the console. Each element from the new line.

package main_homework.lesson2;

public class L2_3_array_for_loop {
    public static void main(String args[])
    {
        int[] array;
        array = new int[10];
        for (int i=0; i<10; i++) {
           array[i] = ((int)(Math.random()*500) - (int)(Math.random()*600));
            System.out.println(array[i]);
        }
    }
}
