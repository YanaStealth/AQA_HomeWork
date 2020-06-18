// 7. Create a simple class with some fields. Demonstrate in your class how we can use initialization blocks.

package main_homework.Lesson4;

public class L4_7 {
int a;
double b;
String c;
    int x;
    // Initializer block starts..
    {
        // This code is executed before every constructor.
        System.out.println("Common part of constructors invoked !!");
    }
    // Initializer block ends
    public L4_7() {
        System.out.println("Default Constructor invoked");
    }
    public L4_7(int a, double b, String c) {
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("Parametrized 1 Constructor invoked");
        System.out.println("a:"+a+" b:"+b+" c:"+c);
    }

    public L4_7(int x) {
        this.x=x;
        System.out.println("Parametrized 2 constructor invoked"+x);
    }

    public static void main(String arr[]) {
        L4_7 obj1, obj2;
        obj1 = new L4_7(3, 2.09, "DDD");
        obj2 = new L4_7(0);
    }
}



