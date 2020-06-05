//2. Implement the method fight() depending on weight, strength and age of the boxer:
//You should write dependency by yourself. The method should return true or false if our boxer won or lost.


package main_homework.Lesson4;

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        if (this.age + this.weight+ this.strength < anotherBoxer.age + anotherBoxer.weight+ anotherBoxer.strength)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        Boxer ourBoxer = new Boxer(20, 75, 5);
        Boxer secondBoxer = new Boxer(26, 70, 10000);
        if (ourBoxer.fight(secondBoxer))  {
            System.out.println("your boxer is not looser");
        } else {
            System.out.println("your boxer is looser");
        }
        //еanotherBoxer.fight(ourBoxer);
    }
}


//Requirements:
//a) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;






