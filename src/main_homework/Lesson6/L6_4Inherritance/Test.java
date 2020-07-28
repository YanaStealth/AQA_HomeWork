package main_homework.Lesson6.L6_4Inherritance;

public class Test {
    A a = new A(2, 3);
    //A a1=new A(1000,222222, "Text");
    B b = new B(a.var1, a.var2);

    //B b1=new B(10,20);
    public static void main(String[] args) {
        Test test = new Test();
        //test.a.add();
        //test.a1.dispVal();
        //test.a.substract();
        System.out.println("Class A add " + test.a.add());
        System.out.println("Class A substract " + test.a.substract());
        System.out.println("Class B add " + test.b.add());
        System.out.println("Class B substract " + test.b.substract());

        //test.b1.substract();
        //test.b.add();
        //test.b1.add();
    }
}
