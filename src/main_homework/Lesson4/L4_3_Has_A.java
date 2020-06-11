/*3. Create 3 different classes to demonstate the relationships "has-a" and "uses-a".
They can be anything you want. For example: Car - Engine - Wheels*/
//HAS-A
import java.util.*;
package main_homework.Lesson4;


public class L4_3_Has_A {

    public static void main(String[] args) {


class Parking {
public List<Car> cars= new ArrayList<>();
}
Parking parking = new Parking();
parking.cars.add(new Car("Renault"));
}