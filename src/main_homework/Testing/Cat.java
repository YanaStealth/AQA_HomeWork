package main_homework.Testing;

public class Cat extends Animal {
    private String s = "Cat";
    private String a = "Dog";

    public String getS() {
        return s;
    }

    public String getA() {
        return a;
    }



    public static void main(String[] args) {

        Cat cat = new Cat();
        System.out.println(cat.getA());
        System.out.println(cat.getS());
        cat.makeSound();
        cat.sleep();

        }

}
