/*4. Create a class Calculator. It should have three fields: double firstValue, double secondValue and String operation.
Create all required constructors to properly initialize your object. Consider the case when user does not provide
any parameters when creates a new object. Write a method "calculate" that takes these two values and return
the result of the calculation according to the operation. Write the test class which contains the main method.
In this main method you should create your Calculator object and do some calculation to test your code,
by calling your "calculate" method. Print all results to the console. */


// не выходит без


package main_homework.Lesson4;

public class L4_4 {
    double firstValue, secondValue;
    String operation;

    public L4_4(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }

    public L4_4() {System.out.println("no value");
    }

    public static void main(String[] args) {
        L4_4 calc1 = new L4_4(2, 50, "+");
        L4_4 calc2 = new L4_4(30, 10, "-");
        L4_4 calc3 = new L4_4(100, 100, "/");
        L4_4 calc4 = new L4_4(2, 50, "*");
        L4_4 calc5 = new L4_4();
        calc1.calculate();
        calc2.calculate();
        calc3.calculate();
        calc4.calculate();
        //calc5.calculate();
    }
    //public void calculate() {System.out.println("no value");}

    public void calculate() {
        if (operation.equals("+")) {
            System.out.println(firstValue + secondValue);
        } else {
            if (operation.equals("-")) {
                System.out.println(firstValue - secondValue);
            } else {
                if (operation.equals("/")) {
                    System.out.println(firstValue / secondValue);
                } else {
                    if (operation.equals("*")) {
                        System.out.println(firstValue * secondValue);
                    } else {
                        System.out.println("no value");
                    }
                }
            }
        }
        System.out.println("firstValue: " + firstValue + ", String operation: " + operation + ", secondValue:" + secondValue);
    }
}
