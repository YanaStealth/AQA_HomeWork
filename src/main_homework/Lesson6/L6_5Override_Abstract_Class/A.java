package main_homework.Lesson6.L6_5Override_Abstract_Class;

public class A {
    int var1, var2;
    String var3;
    public A(){
        System.out.println("Class A. You are inside constructor 1");
    };
    public A(int var1, int var2){
        this.var1=var1;
        this.var2=var2;
        System.out.println("Class A. You are inside constructor 2: int var1, int var2");
    }
    public A(int var1, int var2, String var3){
        this.var1=var1;
        this.var2=var2;
        this.var3=var3;
        System.out.println("Class A. You are inside constructor 3: int var1, int var2, String var3");
    }
    public int add() {
        System.out.println("Class A. Method add. Returns: int var1 + int var2");
        return var1 + var2;
    }
    public int substract(){
        System.out.println("Class A. Method substract. Returns: int var1 - int var2");
        return var1-var2;
    }
    public String dispVal(){
        System.out.println("Class A. Method dispVal. Returns: var3+\"var1:\"+var1+\"var2:\"+var2");
        return var3+"var1:"+var1+"var2:"+var2;
            }
}
