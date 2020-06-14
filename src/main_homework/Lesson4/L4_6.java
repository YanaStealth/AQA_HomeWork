/*6. Create a simple class with any 3 fields. Demonstrate in your class how we can use "this" keyword to refer to the object,
 from which a constructor or a method was invoked. */

package main_homework.Lesson4;

public class L4_6 {
    String name;
    int i;
    boolean boo;

    public void setName(String name, int i, boolean boo) {
        this.name = name;
        this.i = i;
        this.boo = boo;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.i);
        System.out.println(this.boo);
    }

    public static void main(String[] args) {
        L4_6 lesson4_6 = new L4_6();
        lesson4_6.setName("Box", 200, true);
        lesson4_6.print();
    }
}


