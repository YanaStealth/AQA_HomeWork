package main_homework.Lesson6.L6_1_Composition;

public class B {
    private String car;
    private int wheels;

    public B (String car, int wheels)    {
this.car =car;
this.wheels=wheels;
    }
    public String getCar() {
        return car;
    }
    public void setCar(String car) {
        this.car = car;
    }
    public int getWheels() {
            return wheels;
        }
        public void setWheels(int wheels) {
            this.wheels = wheels;
        }
    public void carFeatures() {
        System.out.println("Car = " + car + " wheels= " + wheels);
    }
}
