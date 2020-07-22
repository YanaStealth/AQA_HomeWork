package main_homework.Lesson6.L6_5Override_Abstract_Class;

public class Triangle extends Figure{
    //int width, height; полей width и height тут быть не должно они наследуются из Фигуры
    public Triangle(int width, int height){
        super(width, height);  //конструктор наследника должен вызвать явно конструктор супер класса, если в супер классе конструктор имеет параметры
        this.width=width;
        this.height=height;
    }
    @Override
    public double calculateArea(){
        System.out.println(0.5*width*height);
        return 0.5*width*height;
    }

    public static void main(String[] args) {
        Triangle triangle= new Triangle(20,60);
        triangle.calculateArea();
    }
}
