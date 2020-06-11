/*3. Create 3 different classes to demonstate the relationships "has-a" and "uses-a".
They can be anything you want. For example: Car - Engine - Wheels*/
//non-static variable this cannot be referenced from a static context - решение проблемы

//uses-a


package main_homework.Lesson4;

public class L4_3_Uses_A {

    public static void main(String[] args) {
        L4_3_Uses_A prog = new L4_3_Uses_A(); //эта и следующие строчки решили проблему "non-static variable this cannot be referenced from a static context". Вынесла метод и вызвала его из main
        prog.aa();
    }

    public void aa() {
        Spareparts spareparts = new Spareparts(4, "Engine V2.0");
        Car car = new Car(spareparts);
        System.out.println("wheels:" + car.spareparts.wheels);
        System.out.println("engine:" + car.spareparts.engine);
    }

    class Spareparts {
        public int wheels;
        public String engine;

        public Spareparts(int wheels, String engine) {
            this.wheels = wheels;
            this.engine = engine;
        }
    }

    class Car {
        Spareparts spareparts;

        public Car(Spareparts spareparts) {
            this.spareparts = spareparts;
        }
    }
}
