//8) Print all the numbers from 1 to 100 that are divisible by 3 or divisible by 5, but not divisible by 2.

package main_homework.lesson2;

public class L2_8 {
            public static void main(String[] args) {
            for (int i = 1; i <=100; i++) {
                if ((i % 3 == 0&& i%2!=0)||(i % 5 == 0&& i%2!=0))
                    System.out.print(i + " ");
            }
        }
    }

