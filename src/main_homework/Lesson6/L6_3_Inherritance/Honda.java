package main_homework.Lesson6.L6_3_Inherritance;

public class Honda extends Car {
    public Honda(String name, String size) {
        super(name, size);
    }

    public static void main(String[] args) {
        Honda honda = new Honda("Honda", "size Vagon");
        honda.steer(1);
        honda.move(200, 5);
        honda.changeGears(6);

    }
}
