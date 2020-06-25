//* Create 2 classes with the same name, but put them in different packages. For example, com.domainname.modulename.
// Create a third class with the main method. In the main method create two different objects of your classes specifying
// the full name of the classes (including packages).

package main_homework.Lesson5;

public class L5_1_1 {

    public static void main(String[] args) {
        new_package.L5_1 lesson1 = new new_package.L5_1(2, "Wuuu");
        com.domainname.modulename.L5_1 lesson2 = new com.domainname.modulename.L5_1(500, true);
    }}
