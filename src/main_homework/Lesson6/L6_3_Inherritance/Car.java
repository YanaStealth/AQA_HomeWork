package main_homework.Lesson6.L6_3_Inherritance;

public class Car extends Vehicle {
    public Car(String name, String size) {
        super(name, size);
    }

    @Override
    public void move(int velocity, int direction) {
        super.move(velocity, direction);   // adding to the move method
        System.out.println("Method move is overriden, this is added to the method");
    }

    /*@Overload
    public void steer(int direction, int velocity) {
        velocity+=direction;
        System.out.println("Method steer is overriden. Velocity: " + velocity + "Direction:" + direction);
    }*/

    @Override
    public void steer(int direction) {
        int velocity = direction;
        System.out.println("Method steer is overriden. Velocity: " + velocity);
    }

    public void changeGears(int transmissionNumber) {
        System.out.println("changeGears Method. Name: " + getName() + "Transmission Number:" + transmissionNumber);

    }
}
