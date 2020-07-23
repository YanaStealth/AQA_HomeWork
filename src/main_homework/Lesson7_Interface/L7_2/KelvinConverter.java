import main_homework.Lesson7_Interface.L7_2.Converter;

public class KelvinConverter implements Converter {

  //  public double celsius;

    //public KelvinConverter(double celsius) {
    //    super();
    //    this.celsius = celsius;
   // }

    @Override
    public double convert(double celsius) {
        double kelvin = celsius + +273.15;
        System.out.println(celsius + " celsius in Kelvins: " + kelvin);
        return kelvin;
    }

    public static void main(String[] args) {
        Converter result = new KelvinConverter();
        //конвертерам не нужно поле для хранение градусов цельсия и конструктор с параметром тоже не нужен,
        //Ты это поле никак не используешь. Ты при вызове метода "конверт" передаешь туда градусы цельсия
        Converter result1 = new KelvinConverter();
        result.convert(-10);
        result1.convert(20);
    }

}