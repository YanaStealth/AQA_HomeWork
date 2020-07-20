/*3) Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
Finally, create another class, a specific type of Car that inherits from the Car class.
You should be able to hand steering, changing gears, and moving(speed in other words).
You will want to decide where to put the appropriate state and behaviours(fields and methods).
As mentioned above, changing gears, increasing/decreasing speed should be included.
For you specific type of vehicle you will want to add something specific for that type of car. */
package main_homework.Lesson6.L6_3_Inherritance;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        currentDirection += direction;
        System.out.println("Method steer is not overriden. Vehicle.steer(): Steering at " + currentDirection + "degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Method move is not overriden. Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop() {
        currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}



