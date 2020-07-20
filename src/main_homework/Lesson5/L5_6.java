//*Create a new class. Make it impossible to create a new object of this class using a constructor.
// Provide an appropriate public method that will allow clients of your class create a new object.

package main_homework.Lesson5;

class L5_6 {

    private L5_6() {
    }

    public int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }

    public static L5_6 newObject() { // new object, I can refer directly to it without creating new object in another class cause its static method
        return new L5_6();
    }
}





