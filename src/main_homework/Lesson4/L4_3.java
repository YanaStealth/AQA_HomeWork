/*3. Create 3 different classes to demonstate the relationships "has-a" and "uses-a".
They can be anything you want. For example: Car - Engine - Wheels*/

//Inheritance  Relation IS-A
package main_homework.Lesson4;

public class L4_3 {
    public int wheels;
    public String engine = "Huge engine V5";
}
class Car extends L4_3 {  // extends - это is a,

    public static void main(String[] args) {
        String carModel = "Ferrari";
        L4_3 equipment = new L4_3();
        equipment.wheels = 4;
        System.out.println("Car Model:" + carModel);
        System.out.println("Wheels:" + equipment.wheels);
        System.out.println("Engine:" + equipment.engine);

    }
}

