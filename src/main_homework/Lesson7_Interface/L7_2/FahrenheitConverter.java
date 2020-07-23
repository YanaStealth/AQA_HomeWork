package main_homework.Lesson7_Interface.L7_2;

public class FahrenheitConverter implements Converter {
    public double celsius;

    public FahrenheitConverter(double celsius) {
        super();
        this.celsius = celsius;
    }

    @Override
    public double convert(double celsius) {
        double farenheit = celsius * 1.8 + 32;
        System.out.println(celsius + " celsius in farenheits: " + farenheit);
        return farenheit;
    }

    public static void main(String[] args) {
        Converter result = new FahrenheitConverter(0);
        Converter result1 = new FahrenheitConverter(0);
        result.convert(-10);
        result1.convert(20);
    }

}
