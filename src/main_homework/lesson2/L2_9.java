//Create an array of any length and fill it with random integers. Using loops and conditions sort this array and print it out to the console.
// You can use any sorting algorithm you want. Do not use build-in methods to sort the array.

package main_homework.lesson2;

import static java.lang.System.out;

public class L2_9 {
    public static void main(String args[]) {
        int[] array;
        array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = ((int) (Math.random() * 500) - (int) (Math.random() * 100));
            System.out.println(array[i]);
        }
        System.out.println("");


        int i = 1;
        int temp;
        while (array[i] < array[i - 1]) {
            temp = array[i - 1];
            array[i - 1] = array[i];
            array[i] = temp;
            i++;
            if (i == 9) {
                i = 1;
            }
                    }
        for (int a = 0; a < 10; a++) {
            System.out.println(array[a]);
        }
    }
}
