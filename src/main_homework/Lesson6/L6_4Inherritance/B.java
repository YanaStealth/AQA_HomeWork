package main_homework.Lesson6.L6_4Inherritance;

public class B extends A {
    int var4, var5;

    public B(int var4, int var5) {
        super(var4, var5); // calling parent class constructor
        this.var4 = var4;
        this.var5 = var5;
        System.out.println("Class B. You are inside constructor 1");
    }

    @Override
    public int substract() {
        System.out.println("Class B extends A, overriden method substract" + var4 + " " + var5);
        return var4 * var5; //from B class
    }

    @Override
    public int add() {
        int var3 = super.add(); //from A, variables A class add method
        System.out.println("Class B extends A. Method add is overriden, this is added to the method");
        return var3 + var4 + var5; // var4+var5 from B class
    }
}
