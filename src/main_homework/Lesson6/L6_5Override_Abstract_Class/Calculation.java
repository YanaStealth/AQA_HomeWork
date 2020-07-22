package main_homework.Lesson6.L6_5Override_Abstract_Class;

public class Calculation extends Figure{
    int width, height;
    public Calculation(int width, int height){
        super();
        this.width=width;
        this.height=height;
    }
    @Override
    public int calculateArea(){
        System.out.println(width*height);
        return width*height;
    }

    public static void main(String[] args) {
        Calculation calc= new Calculation(200,600000);
        calc.calculateArea();
    }
}
