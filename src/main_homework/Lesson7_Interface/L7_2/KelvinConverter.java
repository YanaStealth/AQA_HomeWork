import main_homework.Lesson7_Interface.L7_2.Converter;
import main_homework.Lesson7_Interface.L7_2.FahrenheitConverter;

public class KelvinConverter implements Converter {

    public double celsius;

    public KelvinConverter(double celsius) {
        super();
        this.celsius = celsius;
    }

    @Override
    public double convert(double celsius) {
        double kelvin = celsius + +273.15;
        System.out.println(celsius + " celsius in Kelvins: " + kelvin);
        return kelvin;
    }

    public static void main(String[] args) {
        Converter result = new KelvinConverter(0);
        Converter result1 = new KelvinConverter(0);
        result.convert(-10);
        result1.convert(20);
    }

}