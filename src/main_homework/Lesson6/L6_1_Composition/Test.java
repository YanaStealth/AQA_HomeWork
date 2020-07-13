/*1) Write a simple java program to demonstrate composition of classes.
        Tips:
        a) Create several classes A, B, C;
        b) Add functionality of classes B and C to the class A without using inheritance.
        c) Create a test class and demonstrate how we can use functionality of classes B and C via created object of the
class A;*/

package main_homework.Lesson6.L6_1_Composition;

public class Test {
    A a = new A("Karl", 5, 10, "Honda", 6);

    public static void main(String[] args) {
        Test test = new Test();
        test.a.honda.carFeatures();

        //A a = new A("Karl", 5, 10, "Honda", 6);
        // a.honda.carFeatures();
        test.result();
        test.a.barsik.sayMeow();  //!!!!!!! вызов метода из а экземпляра класса, через barsik экземпляр класса С, в котором находится метод sayMeow()
    }

    public void result() {
        System.out.println("Котяро " + a.barsikName + " " + a.barsikAge + " лет и весом " + a.barsikWeight + " кг едет на авто " + a.carName + " где " + a.wheelsNumber + " колеса и поёт: ");
    }
}
