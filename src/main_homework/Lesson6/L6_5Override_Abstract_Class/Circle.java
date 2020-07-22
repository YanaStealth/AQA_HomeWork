package main_homework.Lesson6.L6_5Override_Abstract_Class;

public class Circle extends Figure{
    //int width, height; полей width и height тут быть не должно они наследуются из Фигуры
    double radius;
    public Circle(double width, double height){
        super(width, height);  //конструктор наследника должен вызвать явно конструктор супер класса, если в супер классе конструктор имеет параметры
        this.width=width;
        this.height=height;
        }

    @Override
    public double calculateArea(){
        radius = height;
        System.out.println(Math.PI*radius*radius);
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        Circle circle= new Circle(100,300);
        circle.calculateArea();
    }
}
