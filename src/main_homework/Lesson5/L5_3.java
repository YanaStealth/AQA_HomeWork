//*Answer the question: What is a package-private access? Create a simple program to demostrate the package-private access.
//Tips:
// - Create two different packages
// - Create 3 classes. 2 classes should be in the first package, 3rd class - in the second package.
// - Create in one of the classes some package-private members(fields or methods).
// - In another two classes create objects of the class with package-private members and try to access its members.


//package-private access means the member can be used only inside the current class. Its impossible to create sample of the class
//package new_package;
//public class A {
////}
//public class B {
//}
//current class, another package

package main_homework.Lesson5;


public class L5_3 {
    public double e;
    String f;
    private boolean z;

    public L5_3(double e, String f, boolean z) {
        this.e = e;
        this.f = f;
        this.z = z;
    }

    public void print3() {
        System.out.println(e);
    }

    void print4() {
        System.out.println(f);
    }

    private void print5() {
        System.out.println(z);
    }
}
