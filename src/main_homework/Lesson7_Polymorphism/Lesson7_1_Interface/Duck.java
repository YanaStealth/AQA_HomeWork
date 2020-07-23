package main_homework.Lesson7_Polymorphism.Lesson7_1_Interface;

public class Duck implements Flyable {
    public int speed;

    public Duck(int speed) {
        this.speed = speed;
    }

    @Override
    public void fly() {
        if (speed < 0) {
            System.out.println("The speed is wrong: " + speed);
        } else {
            if (speed == 0) {
                System.out.println("Seems your duck is sleeping, its speed is: " + speed);
            } else {
                System.out.println("Woooow your duck can fly so fast, the speed is: " + speed);
            }
        }
    }

    public static void main(String[] args) {
        Flyable flyable = new Duck(-10);
        Flyable flyable1 = new Duck(0);
        Flyable flyable2 = new Duck(1000);
        flyable.fly();
        flyable1.fly();
        flyable2.fly();
    }
}
