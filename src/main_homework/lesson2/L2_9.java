//Create an array of any length and fill it with random integers. Using loops and conditions sort this array and print it out to the console.
// You can use any sorting algorithm you want. Do not use build-in methods to sort the array.

package main_homework.lesson2;

public class L2_9 {
    public static void main(String args[])
    {
        int[] array;
        array = new int[10];
        for (int i=0; i<10; i++) {
            array[i] = ((int)(Math.random()*500) - (int)(Math.random()*600));
            System.out.println(array[i]);


            for(int indexL=0;indexL<10;indexL++)
            {
                greater=0;
                for(int indexR=0;indexR<10;indexR++)
                {
                    if(tenNums[indexL]>tenNums[indexR])
                    {
                        greater++;
                    }
                }
                orderedNums[greater]=tenNums[indexL];
            }



        }
    }
}
