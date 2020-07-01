//* How can you create a constant in Java, that will be available for everyone outside your class or package?

package main_homework.Lesson5;

public class L5_10 {
    public int a = 500; // or "public final int a = 500;" if I dont want allow to change this variable

    L5_10(int a) {
        this.a = a;
    }
}
