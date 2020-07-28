package main_homework.Lesson6.L6_1_Composition;

public class A {
    C barsik = new C("Barsik", 12, 10);
    String barsikName = barsik.getName();
    int barsikAge = barsik.getAge();
    int barsikWeight = barsik.getWeight();

    B honda = new B("Honda", 4);
    String carName = honda.getCar();
    int wheelsNumber = honda.getWheels();

    public A(String barsikName, int barsikAge, int barsikWeight, String carName, int wheelsNumber) {
        this.barsikName = barsikName;
        this.barsikAge = barsikAge;
        this.barsikWeight = barsikWeight;
        this.carName = carName;
        this.wheelsNumber = wheelsNumber;
    }
}

     /*   public static void main(String[] args) {

            C barsik = new C ("Барсик", 5, 4);
            String barsikName = barsik.getName();
            int barsikAge = barsik.getAge();
            int barsikWeight = barsik.getWeight();

            System.out.println("Имя кота: " + barsikName);
            System.out.println("Возраст кота: " + barsikAge);
            System.out.println("Вес кота: " + barsikWeight);

            B honda = new B("Honda", 4);

      */

