package main_homework.Lesson7_Interface.L7_2;

public class FahrenheitConverter implements Converter {
   // public double celsius;
    //public FahrenheitConverter(double celsius) {
     //   super();
      //  this.celsius = celsius;
    //}
    @Override
    public double convert(double celsius) {
        double farenheit = celsius * 1.8 + 32;
        System.out.println(celsius + " celsius in farenheits: " + farenheit);
        return farenheit;
    }
    public static void main(String[] args) {
        Converter result = new FahrenheitConverter();
        Converter result1 = new FahrenheitConverter(); //конвертерам не нужно поле для хранение градусов цельсия и
        // конструктор с параметром тоже не нужен,
        //Ты это поле никак не используешь. Ты при вызове метода "конверт" передаешь туда градусы цельсия
        result.convert(-10);
        result1.convert(20);
    }
}
