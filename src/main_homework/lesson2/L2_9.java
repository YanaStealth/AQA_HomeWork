//Create an array of any length and fill it with random integers. Using loops and conditions sort this array and print it out to the console.
// You can use any sorting algorithm you want. Do not use build-in methods to sort the array.

package main_homework.lesson2;

import static java.lang.System.out;

import java.util.Arrays;

public class L2_9 {
    public static void main(String args[]) {
        int[] array;
        array = new int[10];


        for (int i = 0; i < 10; i++) {
            array[i] = ((int) (Math.random() * 500) - (int) (Math.random() * 700));
        }
        System.out.println(Arrays.toString(array));
        System.out.println("");


        int temp;
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++)
                if (array[j] < array[j - 1]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    //i++;
                    //if (i == 9) {
                    // i = 1;
                }

        }
        System.out.println(Arrays.toString(array));

    }
}




