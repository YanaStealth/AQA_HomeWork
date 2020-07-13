//*Create a new class. Make it impossible to create a new object of this class using a constructor.
// Provide an appropriate public method that will allow clients of your class create a new object.

package main_homework.Lesson5;

public class L5_6 {

    private L5_6() {
    }

    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        L5_6 func1 = L5_6.newObject();
        func1.minFunction(a, b);
        L5_6 l5_6 = new L5_6();
        int c = l5_6.minFunction(a, b);
        System.out.println("Минимальное значение = " + c);
    }

    public int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }

    public static L5_6 newObject() {
        return new L5_6();
    }

}


