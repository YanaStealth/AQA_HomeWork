/*1. Create a class "Human". A human should have the following attributes: weight, age, first name, last name, height.
        Requirements:
        a) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
        b) Add to the class a constructor with parameters which initialize all the fields.*/

package main_homework.Lesson4;

public class Human {
    int weight, age, height;
    String firstName, lastName;

    public static void main(String[] args) {
        Human human1 = new Human();
        human1.weight = 80;
        human1.age = 25;
        human1.height = 170;
        human1.firstName = "Alex";
        human1.lastName = "Berker";
        System.out.println("weight = " + human1.weight);
        System.out.println("age = " + human1.age);
        System.out.println("height = " + human1.height);
        System.out.println("firstName = " + human1.firstName);
        System.out.println("lastName = " + human1.lastName);
    }

}
