package main_homework.Lesson7_3_2Interfaces;

public class MyDevice implements Volume,State{

    @Override
    public void on() {
        System.out.println("its ON");
    }

    @Override
    public void off() {
        System.out.println("its OFF");
    }

    @Override
    public void changeVolume(double value) {
        System.out.println("the Value is: " + value);
        return value;
    }
}
