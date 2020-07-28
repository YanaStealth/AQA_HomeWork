package main_homework.Lesson6.L6_5Override_Abstract_Class;

public class Rectangle extends Figure {


    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double calculateArea() {
        System.out.println(width * height);
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(200, 600000);
        rectangle.calculateArea();
    }
}
//int width, height; полей width и height тут быть не должно они наследуются из Фигуры
// public Rectangle(double width, double height){
//      super(width, height);  //конструктор наследника должен вызвать явно конструктор супер класса, если в супер классе конструктор имеет параметры
//      this.width=width;
//     this.height=height;