/*1. Create a class "Human". A human should have the following attributes: weight, age, first name, last name, height.
        Requirements:
        a) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
        b) Add to the class a constructor with parameters which initialize all the fields.*/

package main_homework.Lesson4;

public class Human {
    int weight, age, height;
    String firstName, lastName;

    public Human(int weight, int age, int height, String firstName, String lastName) {
        this.weight = weight;
        this.age = age;
        this.height = height;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Human human1 = new Human(88, 25, 170, "Alex", "Berker");
        System.out.println("weight = " + human1.weight);
        System.out.println("age = " + human1.age);
        System.out.println("height = " + human1.height);
        System.out.println("firstName = " + human1.firstName);
        System.out.println("lastName = " + human1.lastName);
    }

}
