/*5. Create a simple class with a bunch of constructors. All these constructors should take different
number of parameters. Demonstrate in your class, how we can call one constructor from another.*/

package main_homework.Lesson4;

public class L4_5 {

    int in;
    double dou;
    String str1, str2;

    public L4_5(int in) {
        this.in = in;
    }

    public L4_5(int in, double dou, String str1) {
        this.dou = dou;
        this.str1 = str1;
    }

    public L4_5(int in, double dou, String str1, String str2) {
        this(in, dou, str1);
        this.str2 = str2;
    }

    public static void main(String[] args) {
        L4_5 constr1 = new L4_5(2, 2.33, "WOOOW", "RRR");
        //  L4_5.aa();
    }
    //public void aa() {
    //    System.out.println("in:"+in+", dou:"+dou+", str1:"+str1+", str2:"+str2);  -почему этот метод не может быть static?
}


