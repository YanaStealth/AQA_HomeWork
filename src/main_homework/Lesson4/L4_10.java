//10. Create a simple class with overloaded methods. Write another class to demonstrate the concept of methods overloading.

package main_homework.Lesson4;

public class L4_10 {
     public void disp(int num, char c)
        {
            System.out.println(num + " "+c);
        }
        public void disp(char c, int num)
        {
            System.out.println(c + " "+num);
        }
    }
    class Sample
    {
        public static void main(String args[])
        {
            L4_10 obj = new L4_10();
            obj.disp(20,'a');
            obj.disp('a',10);
        }
    }


