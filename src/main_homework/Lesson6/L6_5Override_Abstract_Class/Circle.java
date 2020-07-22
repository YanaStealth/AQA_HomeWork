package main_homework.Lesson6.L6_5Override_Abstract_Class;

public class Circle extends Figure {
    //int width, height; полей width и height тут быть не должно они наследуются из Фигуры
    double radius;

    public Circle(double radius) {
        super(0, 0);  //конструктор наследника должен вызвать явно конструктор супер класса, если в супер классе конструктор имеет параметры
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        //radius = height;
        System.out.println(Math.PI * radius * radius);
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(300);
        circle.calculateArea();
    }
}
