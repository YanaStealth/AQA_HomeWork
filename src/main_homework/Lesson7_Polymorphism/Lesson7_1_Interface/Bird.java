package main_homework.Lesson7_Polymorphism.Lesson7_1_Interface;

public class Bird implements Flyable {
    public boolean fried;

    public Bird(boolean fried) {
        this.fried = fried;
    }

    @Override
    public void fly() {
        if (fried = true) {
            System.out.println("The fried bird cant fly");
        } else {
            System.out.println("Your fried bird can fly");
        }
    }

    public static void main(String[] args) {
        Flyable flyable = new Bird(true);
        flyable.fly();
    }
}
